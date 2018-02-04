import java.io.File;

public class PicTaker {
	static String uploadFileName;
	static String uploadFilePath;
	static String uploadFileDir;
	static boolean cameraThere = false;
	static CamraReady rdy = new CamraReady(false);
	public static void main(String[] args) {
        PicTakerRunner gs = new PicTakerRunner(rdy);
        TimeChecker gp = new TimeChecker(rdy);
        uploadFileDir = "C:\\NicePik";
        File file = new File(uploadFileDir);
        if (!file.exists()) {
            if (file.mkdir()) {
                System.out.println("Directory is created!");
            } else {
                System.out.println("Failed to create directory!");
            }
        }
        Thread th = new Thread(gs);
        th.start();
        Thread thr = new Thread(gp);
        thr.start();
        
    }
}
