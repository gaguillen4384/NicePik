
public class TimeChecker implements Runnable {
	
	private CamraReady rdy;
	
	public TimeChecker(CamraReady ready) {
		rdy = ready;
	}
	
	public void run() {
		
		synchronized(rdy) {
			try {
				rdy.wait();
					ToastMessage message = new ToastMessage("Taking Picture in 3!", 750);
					message.setVisible(true);
					Thread.sleep(1000);
					ToastMessage message1 = new ToastMessage("2!", 750);
					message1.setVisible(true);
					Thread.sleep(1000);
					ToastMessage message2 = new ToastMessage("1!", 750);
					message2.setVisible(true);
					Thread.sleep(1000);
					PicTakerRunner.interval = 1;
						
			}catch(Exception e) {
				System.out.println("rip");
			}
		}
		
	}

}
