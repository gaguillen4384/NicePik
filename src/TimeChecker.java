
public class TimeChecker implements Runnable {
	
	private CamraReady rdy;
	
	public TimeChecker(CamraReady ready) {
		rdy = ready;
	}
	@Override
	public void run() {
		synchronized(rdy) {
			try {
				rdy.wait();
				for(int j = 0; j < PicTakerRunner.interval; j++){
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
								
				}
			}catch(Exception e) {
				System.out.println("rip");
			}
		}
		
	}

}
