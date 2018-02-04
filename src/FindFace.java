import java.awt.image.RenderedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.List;

import javax.imageio.ImageIO;

import com.amazonaws.AmazonClientException;
import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.auth.profile.ProfileCredentialsProvider;
import com.amazonaws.regions.Regions;
import com.amazonaws.services.rekognition.AmazonRekognition;
import com.amazonaws.services.rekognition.AmazonRekognitionClientBuilder;
import com.amazonaws.services.rekognition.model.CreateCollectionRequest;
import com.amazonaws.services.rekognition.model.CreateCollectionResult;
import com.amazonaws.services.rekognition.model.Face;
import com.amazonaws.services.rekognition.model.FaceMatch;
import com.amazonaws.services.rekognition.model.ResourceAlreadyExistsException;
import com.amazonaws.services.rekognition.model.FaceRecord;
import com.amazonaws.services.rekognition.model.Image;
import com.amazonaws.services.rekognition.model.IndexFacesRequest;
import com.amazonaws.services.rekognition.model.IndexFacesResult;
import com.amazonaws.services.rekognition.model.ListFacesRequest;
import com.amazonaws.services.rekognition.model.ListFacesResult;
import com.amazonaws.services.rekognition.model.S3Object;
import com.amazonaws.services.rekognition.model.SearchFacesByImageRequest;
import com.amazonaws.services.rekognition.model.SearchFacesByImageResult;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper; 

public class FindFace {
	
	static AWSCredentials credentials;
	static AmazonRekognition amazonRekognition;
	
	 public static final String collectionId = "HackathonCollection";
	 public static final String bucket = "hackathonb";
	 public static String mFileName; //used when adding it to the collection

	public static void main(String[] args) throws Exception {
		
		try {
			credentials = new ProfileCredentialsProvider("default").getCredentials();
		} catch (Exception e) {
			throw new AmazonClientException(
					"Cannot load the credentials from the credential profiles file. " +
							"Please make sure that your credentials file is at the correct " +
							"location (/Users/userid/.aws/credentials), and is in valid format.",
							e);
		}
		amazonRekognition = AmazonRekognitionClientBuilder
				.standard()
				.withRegion(Regions.US_EAST_1)
				.withCredentials(new AWSStaticCredentialsProvider(credentials))
				.build();
		
		//If the collection doesn't exists is going to create it, otherwise wont do anything
		try{
			createCollection();
		} catch (ResourceAlreadyExistsException e){
			System.err.println("Collection already exists");
		}
		
		//addFaces("two_faces.jpg");
		
		//listFaces();
		
		searchMatchingFaces("My_Face2.jpg");
		

	}
	
	public static void createCollection (){
		System.out.println("Creating collection: " + collectionId );

		CreateCollectionRequest request = new CreateCollectionRequest()
				.withCollectionId(collectionId);

		CreateCollectionResult createCollectionResult =
				amazonRekognition.createCollection(request);
		System.out.println("CollectionArn : " +
				createCollectionResult.getCollectionArn());
		System.out.println("Status code : " +
				createCollectionResult.getStatusCode().toString());
	}
	
	public static void addFaces(String fileName) {
		mFileName = fileName;
		Image image=new Image()
				.withS3Object(new S3Object()
				.withBucket(bucket)
				.withName(fileName));

		IndexFacesRequest indexFacesRequest = new IndexFacesRequest()
				.withImage(image)
				.withCollectionId(collectionId)
				.withExternalImageId(fileName)
				.withDetectionAttributes("ALL");

		IndexFacesResult
		indexFacesResult=amazonRekognition.indexFaces(indexFacesRequest);
		
		System.out.println(fileName + " added");
		 List < FaceRecord > faceRecords = indexFacesResult.getFaceRecords();
		 for (FaceRecord faceRecord: faceRecords) {
		 System.out.println("Face detected: Faceid is " +
		 faceRecord.getFace().getFaceId());
		 } 
		
	}
	
	/**
	 * List faces in a collection
	 * It specifies the bounding box, faceId, filename (s3), imageId (in collection)
	 */
	public static void listFaces()  throws Exception{
		ObjectMapper objectMapper = new ObjectMapper();
		
		 ListFacesResult listFacesResult = null;
		 System.out.println("Faces in collection " + collectionId);
		 String paginationToken = null;
		 do {
			 if (listFacesResult != null) {
				 paginationToken = listFacesResult.getNextToken();
			 }

		 ListFacesRequest listFacesRequest = new ListFacesRequest()
		 .withCollectionId(collectionId)
		 .withMaxResults(1)
		 .withNextToken(paginationToken);

		 listFacesResult = amazonRekognition.listFaces(listFacesRequest);
		 List < Face > faces = listFacesResult.getFaces();
		 for (Face face: faces) {
			 System.out.println(objectMapper.writerWithDefaultPrettyPrinter()
					 .writeValueAsString(face));
		 }
		 } while (listFacesResult != null && listFacesResult.getNextToken() !=
		 null); 
		
	}
	
	public static boolean searchMatchingFaces(String fileName) throws Exception{
		ObjectMapper objectMapper = new ObjectMapper();
		Image image = null; //this is an image from amazon type
/*
		// Get an image object from S3 bucket.
		Image image=new Image()
				.withS3Object(new S3Object()
						.withBucket(bucket)
						.withName(fileName));
 //OR
*/		
		//Get the picture from a file
		try {
			//Convert file to java.awt.Image
			File file = new File(fileName);
		    java.awt.Image i = ImageIO.read(file);	
		    
		    //Convert java.awt.Image to aws image
		    ByteArrayOutputStream baos = new ByteArrayOutputStream();
		    ImageIO.write((RenderedImage) i, "jpg", baos);
		    ByteBuffer byteBuffer = ByteBuffer.wrap(baos.toByteArray());
		    image = new Image().withBytes(byteBuffer);
		} catch (IOException ex) {
			ex.printStackTrace();
		}
		
		// Search collection for faces similar to the largest face in the image.
		SearchFacesByImageRequest searchFacesByImageRequest = new
				SearchFacesByImageRequest()
				.withCollectionId(collectionId)
				.withImage(image)
				.withFaceMatchThreshold(80F)
				.withMaxFaces(2);

		SearchFacesByImageResult searchFacesByImageResult =
				amazonRekognition.searchFacesByImage(searchFacesByImageRequest);
		System.out.println("Faces matching largest face in image from" + fileName);
		List < FaceMatch > faceImageMatches =
				searchFacesByImageResult.getFaceMatches();
		
		for (FaceMatch face: faceImageMatches) {
			System.out.println(objectMapper.writerWithDefaultPrettyPrinter()
					.writeValueAsString(face));
			System.out.println();
		}
		
		if(faceImageMatches != null){
			return true;
		}else{
			return false;
		}	
	}
}