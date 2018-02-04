

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JSeparator;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.UIManager;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AccountError {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AccountError window = new AccountError();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public AccountError() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("Error");
		frame.setBounds(100, 100, 600, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.getContentPane().setLayout(null);
		
		
		
		JLabel lblSorryTryAgain = new JLabel("Sorry Try Again!");
		lblSorryTryAgain.setHorizontalAlignment(SwingConstants.CENTER);
		lblSorryTryAgain.setForeground(Color.RED);
		lblSorryTryAgain.setFont(new Font("HP Simplified", Font.BOLD, 40));
		lblSorryTryAgain.setBounds(142, 27, 321, 55);
		frame.getContentPane().add(lblSorryTryAgain);
		
		JSeparator separator = new JSeparator();
		separator.setForeground(Color.RED);
		separator.setBackground(Color.RED);
		separator.setBounds(65, 77, 464, 16);
		frame.getContentPane().add(separator);
		
		JLabel lblThereSeemsTo = new JLabel("There seems to be a problem with the payment!");
		lblThereSeemsTo.setHorizontalAlignment(SwingConstants.CENTER);
		lblThereSeemsTo.setFont(new Font("HP Simplified Light", Font.BOLD, 20));
		lblThereSeemsTo.setForeground(Color.BLACK);
		lblThereSeemsTo.setBounds(75, 92, 436, 39);
		frame.getContentPane().add(lblThereSeemsTo);
		
		JLabel lblInsufficientFundsOr = new JLabel("Either insufficient funds or");
		lblInsufficientFundsOr.setHorizontalAlignment(SwingConstants.CENTER);
		lblInsufficientFundsOr.setForeground(Color.BLACK);
		lblInsufficientFundsOr.setFont(new Font("HP Simplified Light", Font.BOLD, 20));
		lblInsufficientFundsOr.setBounds(44, 119, 485, 39);
		frame.getContentPane().add(lblInsufficientFundsOr);
		
		JLabel lblWithTheFace = new JLabel("error with the face recogniction!");
		lblWithTheFace.setHorizontalAlignment(SwingConstants.CENTER);
		lblWithTheFace.setForeground(Color.BLACK);
		lblWithTheFace.setFont(new Font("HP Simplified Light", Font.BOLD, 20));
		lblWithTheFace.setBounds(54, 144, 485, 39);
		frame.getContentPane().add(lblWithTheFace);
		
		//camera image and button
		JLabel lblNewLabel = new JLabel();
		lblNewLabel.setBounds(75, 567, 35, 35);
		frame.getContentPane().add(lblNewLabel);
		ImageIcon myPlane = new ImageIcon("C:\\Users\\Deyrel\\git\\NicePik\\src\\Images\\camera.png");
		Image imgPlane = myPlane.getImage();
		Image newPlaneImg = imgPlane.getScaledInstance(lblNewLabel.getWidth(), 
				lblNewLabel.getHeight(), Image.SCALE_SMOOTH);
		ImageIcon imagePlane = new ImageIcon(newPlaneImg);
		
		JButton btnRetakePhoto = new JButton("Retake Photo", imagePlane);
		btnRetakePhoto.setForeground(new Color(0, 0, 255));
		btnRetakePhoto.setHorizontalAlignment(SwingConstants.RIGHT);
		btnRetakePhoto.setFont(new Font("HP Simplified", Font.BOLD, 20));
		btnRetakePhoto.setBounds(199, 208, 216, 58);
		frame.getContentPane().add(btnRetakePhoto);
		
		//money image and button
		JLabel lblNewLabel1 = new JLabel();
		lblNewLabel1.setBounds(75, 567, 35, 35);
		frame.getContentPane().add(lblNewLabel1);
		ImageIcon myMon = new ImageIcon("C:\\Users\\Deyrel\\git\\NicePik\\src\\Images\\money.png");
		Image imgMon = myMon.getImage();
		Image newMonImg = imgMon.getScaledInstance(lblNewLabel1.getWidth(), 
				lblNewLabel1.getHeight(), Image.SCALE_SMOOTH);
		ImageIcon imageMon = new ImageIcon(newMonImg);
		
		JButton btnMoneyNeeded = new JButton("Money Needed", imageMon);
		btnMoneyNeeded.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DialogFrame frameDig = new DialogFrame();
				frameDig.getFrame().setVisible(true);
				frame.setVisible(false);
			}
		});
		btnMoneyNeeded.setForeground(new Color(0, 128, 0));
		btnMoneyNeeded.setHorizontalAlignment(SwingConstants.RIGHT);
		btnMoneyNeeded.setFont(new Font("HP Simplified", Font.BOLD, 20));
		btnMoneyNeeded.setBounds(199, 294, 216, 58);
		frame.getContentPane().add(btnMoneyNeeded);
		

		//background 
		JLabel labelbeach = new JLabel();
		labelbeach.setEnabled(false);
		labelbeach.setBounds(0, -25, 600, 390);
		frame.getContentPane().add(labelbeach);
		ImageIcon mybeach = new ImageIcon("C:\\Users\\Deyrel\\git\\NicePik\\src\\Images\\beach.jpg");
		Image imgbeach = mybeach.getImage();
		Image newbeachImg = imgbeach.getScaledInstance(labelbeach.getWidth(), 
				labelbeach.getHeight(), Image.SCALE_SMOOTH);
		ImageIcon beachimage = new ImageIcon(newbeachImg);
		
		JLabel btnbeach = new JLabel(beachimage);
		btnbeach.setBounds(0, 0, frame.getWidth(), frame.getHeight());
		frame.getContentPane().add(btnbeach);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setEnabled(false);
		btnNewButton.setForeground(UIManager.getColor("Button.background"));
		btnNewButton.setBounds(64, 27, 464, 157);
		frame.getContentPane().add(btnNewButton);
		
		
		
	}

}
