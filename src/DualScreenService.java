import java.awt.Canvas;
import java.awt.GraphicsConfiguration;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.awt.Rectangle;

import javax.swing.JFrame;


//This class is to set the dual screen in the app


public class DualScreenService {

	public void dual() {
	GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
	
	GraphicsDevice[] gs = ge.getScreenDevices();
	


	// initiates which screen is currently on
	for(int j = 0;j<2;j++){
		GraphicsDevice gd = gs[j];
		GraphicsConfiguration[] gc = gd.getConfigurations();
		
		//THis is the code that needs to change
//		for (int i = 0; i < ; i++) {
			if(j==1) {
				LoginPage loginFrame = new LoginPage();
				Rectangle gcBounds = gc[j].getBounds();
				int xoffs = gcBounds.x;
				int yoffs = gcBounds.y;

				loginFrame.getFrame().setLocation((j * 450) + xoffs, (j * 460) + yoffs);
				
			
				
				loginFrame.getFrame().setVisible(true);
				
			}
			//Here we would put the logic for the customer
//			else if( j== 0) {
//				NewUser userFrame = new NewUser();
//				userFrame.getFrame().setVisible(false);
//			}
//			JFrame f = new JFrame(gs[j].getDefaultConfiguration());
//			Rectangle gcBounds = gc[j].getBounds();
//			int xoffs = gcBounds.x;
//			int yoffs = gcBounds.y;
//
//			f.setLocation((j * 450) + xoffs, (j * 460) + yoffs);
//			f.setVisible(true);
		}
	
//	}
	}

}
