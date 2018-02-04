import org.bytedeco.javacpp.opencv_core.IplImage;
import org.bytedeco.javacv.CanvasFrame;
import org.bytedeco.javacv.Frame;
import org.bytedeco.javacv.FrameGrabber;
import org.bytedeco.javacv.OpenCVFrameConverter;
import org.bytedeco.javacv.VideoInputFrameGrabber;

import static org.bytedeco.javacpp.opencv_imgcodecs.*;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class PicTakerRunner implements Runnable {

	static int interval = 3;
	static Timer timer;
	CanvasFrame canvas = new CanvasFrame("'Take Pik!' PoS");
	static IplImage img;
	private CamraReady rdy;
	boolean didPikTake = false;
	int pllleeeaassee = 4;
	static boolean matchFlag;

	public PicTakerRunner(CamraReady ready) {
		rdy = ready;
		canvas.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
	}

	public void run() {
		canvas.setVisible(true);
		FrameGrabber grabber = new VideoInputFrameGrabber(0); // 1 for next camera
		OpenCVFrameConverter.ToIplImage converter = new OpenCVFrameConverter.ToIplImage();
		TimeChecker gp = new TimeChecker(rdy);

		try {
			grabber.start();
			while (!didPikTake) {
				Frame frame = grabber.grab();

				img = converter.convert(frame);

				synchronized (rdy) {
					canvas.showImage(converter.convert(img));
					rdy.setMsg(true);
					rdy.notifyAll();

					if (interval == 1) {
						System.out.println("in if");
						String timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
						PicTaker.uploadFileName = timeStamp + ".jpg";
						PicTaker.uploadFilePath = PicTaker.uploadFileDir + "\\" + PicTaker.uploadFileName;
						cvSaveImage(PicTaker.uploadFilePath, img);
						System.out.println(PicTaker.uploadFileName);
						System.out.println(PicTaker.uploadFilePath);
						ToastMessage message3 = new ToastMessage("Nice Pik!", 750);
						message3.setVisible(true);
						File file = new File(PicTaker.uploadFileDir);
						
						if (file.listFiles().length > 0) {
							System.out.println("File Found");
							FindFace obj = new FindFace();
							matchFlag = obj.searchMatchingFaces(PicTaker.uploadFilePath);
							didPikTake = true;
						} else {
							System.out.println("File not Found");
							didPikTake = false;
						}
					}
				}
			}
			if (matchFlag == true) {
				Thankyou thank = new Thankyou();
				thank.getFrame().setVisible(true);
			} else if (matchFlag == false) {
				AccountError error = new AccountError();
				error.getFrame().setVisible(true);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		// If yes, change to thank you and checkout

	}

}
