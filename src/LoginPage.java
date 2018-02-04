

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.SpringLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Font;
import java.awt.Image;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JPasswordField;
import javax.swing.JSeparator;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComponent;

import java.awt.Color;
import javax.swing.UIManager;

public class LoginPage{

	private JFrame frame;
	private JTextField textField;
	private JLabel lblUsername;
	private JLabel lblPassword;
	private JLabel lblMotto;
	private JSeparator separator; 
	private JLabel lblNewLabel;
	private JLabel label1;
	private JButton btnCheckIn; 
	private JLabel label;
	private JButton btnNewUser;
	private JPasswordField passwordField;
	private JLabel lblYou;
	private JButton btnNewButton;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
				try {
				/*	DualScreenService dSS= new DualScreenService();
					dSS.dual();*/
					
					LoginPage window = new LoginPage();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
//		});
//	}
	
	public LoginPage() {
		
		
		//setting up the frames sizes and orientation
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(105, 105, 105));
		frame.getContentPane().setForeground(new Color(255, 255, 255));
		frame.setTitle("NICE PIK");
		frame.setBounds(100, 100, 500, 700);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
	
		
		
		//username label and insert field
		lblUsername = new JLabel("Username :");
		lblUsername.setForeground(Color.YELLOW);
		lblUsername.setHorizontalAlignment(SwingConstants.CENTER);
		lblUsername.setFont(new Font("HP Simplified Light", Font.BOLD, 20));
		lblUsername.setBounds(24, 335, 110, 20);
		frame.getContentPane().add(lblUsername);
		
		//password label and insert field
		lblPassword = new JLabel("Password :");
		lblPassword.setForeground(Color.YELLOW);
		lblPassword.setHorizontalAlignment(SwingConstants.CENTER);
		lblPassword.setFont(new Font("HP Simplified Light", Font.BOLD, 20));
		lblPassword.setBounds(24, 423, 100, 20);
		frame.getContentPane().add(lblPassword);
		
		//password textbox
		passwordField = new JPasswordField();
		passwordField.setFont(new Font("Tahoma", Font.PLAIN, 16));
		passwordField.setBounds(160, 417, 299, 34);
		frame.getContentPane().add(passwordField);
		
	
				
		//Logo
		label1 = new JLabel();
		label1.setBounds(66, 40, 348, 131);
		frame.getContentPane().add(label1);
		ImageIcon mylogo = new ImageIcon("C:\\Users\\Deyrel\\git\\NicePik\\src\\Images\\letscruise.png");
		Image imglogo = mylogo.getImage();
		Image newlogoImg = imglogo.getScaledInstance(label1.getWidth(), 
				label1.getHeight(), Image.SCALE_SMOOTH);
		ImageIcon logoimage = new ImageIcon(newlogoImg);
		
		JLabel btnlogo = new JLabel(logoimage);
		btnlogo.setBounds(66, 40, 348, 131);
		frame.getContentPane().add(btnlogo);
		
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField.setBounds(160, 329, 299, 34);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		/******************************************************/
		//motto w/ the underline under you
		lblMotto = new JLabel("We Value");
		lblMotto.setForeground(Color.YELLOW);
		lblMotto.setFont(new Font("HP Simplified Light", Font.BOLD, 30));
		lblMotto.setHorizontalAlignment(SwingConstants.CENTER);
		lblMotto.setBounds(22, 208, 152, 35);
		frame.getContentPane().add(lblMotto);
		
		//Underline
		separator = new JSeparator();
		separator.setForeground(Color.YELLOW);
		separator.setBackground(Color.YELLOW);
		separator.setBounds(32, 245, 410, 2);
		frame.getContentPane().add(separator);
		/******************************************************/
		
		
		//check in button w/ plane image
		
		lblNewLabel = new JLabel();
		lblNewLabel.setBounds(75, 567, 35, 35);
		frame.getContentPane().add(lblNewLabel);
		ImageIcon myPlane = new ImageIcon("C:\\Users\\Deyrel\\git\\NicePik\\src\\Images\\ship.png");
		Image imgPlane = myPlane.getImage();
		Image newPlaneImg = imgPlane.getScaledInstance(lblNewLabel.getWidth(), 
				lblNewLabel.getHeight(), Image.SCALE_SMOOTH);
		ImageIcon imagePlane = new ImageIcon(newPlaneImg);
		
		btnCheckIn = new JButton("   Sign in",imagePlane);
		btnCheckIn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new cashSystem().setVisible(true);
			}
		});
		btnCheckIn.setForeground(new Color(0, 0, 255));
		btnCheckIn.setHorizontalAlignment(SwingConstants.RIGHT);
		btnCheckIn.setFont(new Font("HP Simplified", Font.BOLD, 20));
		btnCheckIn.setBounds(60, 562, 152, 44);
		frame.getContentPane().add(btnCheckIn);
		
		//new user button with person image
		
		label = new JLabel();
		label.setBounds(296, 567, 35, 35);
		frame.getContentPane().add(label);
		ImageIcon myImg = new ImageIcon("C:\\Users\\Deyrel\\git\\NicePik\\src\\Images\\newuser.png");
		Image img = myImg.getImage();
		Image newImg = img.getScaledInstance(label.getWidth(), label.getHeight(), Image.SCALE_SMOOTH);
		ImageIcon image = new ImageIcon(newImg);
		
		btnNewUser = new JButton("   New User", image);
		btnNewUser.setForeground(new Color(0, 128, 0));
		btnNewUser.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent event) {
				if(event.getActionCommand().equals("   New User")) {
					NewUser userFrame = new NewUser();
					userFrame.getFrame().setVisible(true);
					frame.setVisible(false);
				}
				
			}
		});
		
		btnNewUser.setHorizontalAlignment(SwingConstants.RIGHT);
		btnNewUser.setFont(new Font("HP Simplified", Font.BOLD, 20));
		btnNewUser.setBounds(273, 562, 169, 44);
		frame.getContentPane().add(btnNewUser);
		
		lblYou = new JLabel("YOU!");
		lblYou.setForeground(Color.YELLOW);
		lblYou.setHorizontalAlignment(SwingConstants.CENTER);
		lblYou.setFont(new Font("HP Simplified Light", Font.BOLD, 30));
		lblYou.setBounds(349, 212, 93, 35);
		frame.getContentPane().add(lblYou);
		
		//grey thing behind the carnival lettering
		btnNewButton = new JButton("");
		btnNewButton.setForeground(Color.LIGHT_GRAY);
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.setEnabled(false);
		btnNewButton.setBounds(152, 96, 255, 68);
		frame.getContentPane().add(btnNewButton);	
		
		//background 
		JLabel labelcruise = new JLabel();
		labelcruise.setBounds(0, 0, frame.getWidth(), frame.getHeight());
		frame.getContentPane().add(labelcruise);
		ImageIcon mycruise = new ImageIcon("C:\\Users\\Deyrel\\git\\NicePik\\src\\Images\\cruisetop.jpg");
		Image imgcruise = mycruise.getImage();
		Image newcruiseImg = imgcruise.getScaledInstance(labelcruise.getWidth(), 
				labelcruise.getHeight(), Image.SCALE_SMOOTH);
		ImageIcon cruiseimage = new ImageIcon(newcruiseImg);
		
		
		JLabel btncruise = new JLabel(cruiseimage);
		btncruise.setBounds(0, 0, frame.getWidth(), frame.getHeight());
		frame.getContentPane().add(btncruise);
		
		
		
	}
	
	public JFrame getFrame() {
		return this.frame;
	}

}
