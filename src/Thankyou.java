import java.awt.EventQueue;

import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.awt.Color;

public class Thankyou {

	private JFrame frame;
	String actualTotal = Double.toString(cashSystem.paidAmount);
	String total = actualTotal;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Thankyou window = new Thankyou();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public JFrame getFrame(){
		return this.frame;
	}

	/**
	 * Create the application.
	 * @throws IOException 
	 */
	public Thankyou() throws IOException {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 * @throws IOException 
	 */
	private void initialize() throws IOException {
		frame = new JFrame();
		frame.setBounds(100, 100, 500, 700);
		//frame.setContentPane(new JLabel((Icon) new ImageIcon(ImageIO.read(new File("back.jpg")))));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		
		//background image
		ImageIcon myBackground = new ImageIcon("back.jpg");
		Image imgBackground = myBackground.getImage();
		Image newImg = imgBackground.getScaledInstance(494, 
				780, Image.SCALE_SMOOTH);
		ImageIcon backImage = new ImageIcon(newImg);
		
		//Labels
		
		JLabel txtTotal = new JLabel("$"+Double.toString(cashSystem.paidAmount));
		txtTotal.setFont(new Font("Tahoma", Font.PLAIN, 40));
		txtTotal.setHorizontalAlignment(SwingConstants.CENTER);
		txtTotal.setBounds(168, 313, 155, 92);
		frame.getContentPane().add(txtTotal);
		
		//These rest of labels do nothing
		JLabel lblNewLabel = new JLabel("Thank you");
		lblNewLabel.setBounds(126, 95, 248, 52);
		lblNewLabel.setForeground(new Color(255, 99, 71));
		lblNewLabel.setFont(new Font("HP Simplified Light", Font.BOLD, 40));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Your account was charged");
		lblNewLabel_1.setForeground(new Color(0, 0, 0));
		lblNewLabel_1.setBackground(new Color(255, 255, 255));
		lblNewLabel_1.setBounds(60, 198, 376, 79);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 28));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(lblNewLabel_1);
			
		JLabel lblNewLabel_2 = new JLabel("for your bill.");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 28));
		lblNewLabel_2.setBounds(168, 446, 155, 39);
		frame.getContentPane().add(lblNewLabel_2);
		JLabel labelcruise1 = new JLabel(backImage);
		labelcruise1.setBackground(new Color(102, 205, 170));
		labelcruise1.setBounds(0, 0, 494, 665);
		frame.getContentPane().add(labelcruise1);
	}
}
