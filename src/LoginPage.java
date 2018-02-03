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
	private JLabel lblNewLabel;
	private JLabel label1;
	private JButton btnCheckIn; 
	private JLabel label;
	private JButton btnNewUser;
	private JPasswordField passwordField;
	private JLabel lblNewLabel_1;
	private JLabel lblOfYou;
	private JLabel label_2;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginPage window = new LoginPage();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
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
		
		label_2 = new JLabel();
		label_2.setIcon(new ImageIcon("shade.jpg"));
		ImageIcon myshade = new ImageIcon("letscruise.png");
		Image imgshade = myshade.getImage();
		Image newshadeImg = imgshade.getScaledInstance(177, 75, Image.SCALE_SMOOTH);
		ImageIcon shadeimage = new ImageIcon(newshadeImg);
		label_2.setBounds(177, 75, 234, 51);
	
		
		//username label and insert field
		lblUsername = new JLabel("Username :");
		lblUsername.setForeground(Color.YELLOW);
		lblUsername.setHorizontalAlignment(SwingConstants.CENTER);
		lblUsername.setFont(new Font("HP Simplified Light", Font.BOLD, 20));
		lblUsername.setBounds(45, 330, 107, 20);
		frame.getContentPane().add(lblUsername);
		
		//password label and insert field
		lblPassword = new JLabel("Password :");
		lblPassword.setForeground(Color.YELLOW);
		lblPassword.setHorizontalAlignment(SwingConstants.CENTER);
		lblPassword.setFont(new Font("HP Simplified Light", Font.BOLD, 20));
		lblPassword.setBounds(45, 426, 107, 20);
		frame.getContentPane().add(lblPassword);
		
		passwordField = new JPasswordField();
		passwordField.setFont(new Font("Tahoma", Font.PLAIN, 16));
		passwordField.setBounds(177, 420, 265, 34);
		frame.getContentPane().add(passwordField);
		
		
		//Logo
		label1 = new JLabel();
		label1.setBounds(75, 40, 353, 112);
		frame.getContentPane().add(label1);
		ImageIcon mylogo = new ImageIcon("letscruise.png");
		Image imglogo = mylogo.getImage();
		Image newlogoImg = imglogo.getScaledInstance(label1.getWidth(), label1.getHeight(), Image.SCALE_SMOOTH);
		ImageIcon logoimage = new ImageIcon(newlogoImg);
		JLabel btnlogo = new JLabel(logoimage);
		btnlogo.setBounds(75, 40, 353, 112);
		frame.getContentPane().add(btnlogo);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setEnabled(false);
		btnNewButton.setBackground(Color.LIGHT_GRAY);
		btnNewButton.setBounds(163, 82, 265, 70);
		frame.getContentPane().add(btnNewButton);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField.setBounds(177, 324, 265, 34);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		/******************************************************/
		
		//motto w/ the underline under you
		lblMotto = new JLabel("We Value");
		lblMotto.setForeground(Color.YELLOW);
		lblMotto.setFont(new Font("HP Simplified Light", Font.BOLD, 35));
		lblMotto.setHorizontalAlignment(SwingConstants.CENTER);
		lblMotto.setBounds(12, 185, 175, 29);
		frame.getContentPane().add(lblMotto);
		/******************************************************/
		
		
		//check in button w/ plane image
		
		lblNewLabel = new JLabel();
		lblNewLabel.setBounds(75, 567, 35, 35);
		frame.getContentPane().add(lblNewLabel);
		ImageIcon myPlane = new ImageIcon("paperplane.png");
		Image imgPlane = myPlane.getImage();
		Image newPlaneImg = imgPlane.getScaledInstance(lblNewLabel.getWidth(), lblNewLabel.getHeight(), Image.SCALE_SMOOTH);
		ImageIcon imagePlane = new ImageIcon(newPlaneImg);
		
		btnCheckIn = new JButton("   Sign in",imagePlane);
		btnCheckIn.setForeground(Color.BLUE);
		btnCheckIn.setHorizontalAlignment(SwingConstants.RIGHT);
		btnCheckIn.setFont(new Font("HP Simplified", Font.BOLD, 20));
		btnCheckIn.setBounds(60, 562, 152, 44);
		frame.getContentPane().add(btnCheckIn);
		
		//new user button with person image
		
		label = new JLabel();
		label.setBounds(296, 567, 35, 35);
		frame.getContentPane().add(label);
		ImageIcon myImg = new ImageIcon("newuser.png");
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
		
		lblOfYou = new JLabel("YOU");
		lblOfYou.setHorizontalAlignment(SwingConstants.CENTER);
		lblOfYou.setForeground(Color.YELLOW);
		lblOfYou.setFont(new Font("HP Simplified Light", Font.BOLD, 35));
		lblOfYou.setBounds(314, 185, 78, 29);
		frame.getContentPane().add(lblOfYou);
		
		JLabel label_1 = new JLabel();
		label_1.setIcon(new ImageIcon("cruisetop.jpg"));
		label_1.setBounds(0, 0, 8, 2);
		frame.getContentPane().add(label_1);
		
			
		//background image
		ImageIcon mycruise = new ImageIcon("cruisetop.jpg");
		Image imgcruise = mycruise.getImage();
		Image newcruiseImg = imgcruise.getScaledInstance(494, 
				780, Image.SCALE_SMOOTH);
		ImageIcon cruiseimage = new ImageIcon(newcruiseImg);
		JLabel labelcruise1 = new JLabel(cruiseimage);
		labelcruise1.setBounds(0, 0, 494, 665);
		frame.getContentPane().add(labelcruise1);
		
		
	}
	
	public JFrame getFrame() {
		return this.frame;
	}
}
