import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JSeparator;
import java.awt.Color;
import javax.swing.UIManager;

public class NewUser {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JPasswordField passwordField;
	private JPasswordField passwordField1;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NewUser window = new NewUser();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


	public NewUser() {
		
		//setting up the frames sizes and orientation
		frame = new JFrame();
		frame.getContentPane().setForeground(new Color(255, 255, 255));
		frame.getContentPane().setBackground(new Color(105, 105, 105));
		frame.setTitle("New Employee Sign Up");
		frame.setBounds(100, 100, 500, 700);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		

		
		JButton btnSignIn = new JButton("Sign In");
		btnSignIn.setBackground(new Color(0, 0, 0));
		btnSignIn.setForeground(new Color(34, 139, 34));
		btnSignIn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				if(event.getActionCommand().equals("Sign In")) {
					LoginPage userFrame = new LoginPage();
					
					userFrame.getFrame().setVisible(true);
					frame.setVisible(false);
				}
			}
		});
		btnSignIn.setFont(new Font("HP Simplified", Font.BOLD, 20));
		btnSignIn.setBounds(176, 617, 156, 35);
		frame.getContentPane().add(btnSignIn);
		
		JLabel lblFirstName = new JLabel("First Name");
		lblFirstName.setForeground(new Color(255, 255, 255));
		lblFirstName.setHorizontalAlignment(SwingConstants.CENTER);
		lblFirstName.setFont(new Font("HP Simplified Light", Font.BOLD, 20));
		lblFirstName.setBounds(189, 76, 116, 35);
		frame.getContentPane().add(lblFirstName);
		
		JLabel lblLastName = new JLabel("Last Name");
		lblLastName.setForeground(new Color(255, 255, 255));
		lblLastName.setHorizontalAlignment(SwingConstants.CENTER);
		lblLastName.setFont(new Font("HP Simplified Light", Font.BOLD, 20));
		lblLastName.setBounds(189, 163, 116, 35);
		frame.getContentPane().add(lblLastName);
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setForeground(new Color(255, 255, 255));
		lblEmail.setHorizontalAlignment(SwingConstants.CENTER);
		lblEmail.setFont(new Font("HP Simplified Light", Font.BOLD, 20));
		lblEmail.setBounds(189, 252, 116, 35);
		frame.getContentPane().add(lblEmail);
		
		JLabel lblConfirmEmail = new JLabel("Confirm Email");
		lblConfirmEmail.setForeground(new Color(255, 255, 255));
		lblConfirmEmail.setHorizontalAlignment(SwingConstants.CENTER);
		lblConfirmEmail.setFont(new Font("HP Simplified Light", Font.BOLD, 20));
		lblConfirmEmail.setBounds(169, 339, 175, 35);
		frame.getContentPane().add(lblConfirmEmail);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setForeground(new Color(255, 255, 255));
		lblPassword.setHorizontalAlignment(SwingConstants.CENTER);
		lblPassword.setFont(new Font("HP Simplified Light", Font.BOLD, 20));
		lblPassword.setBounds(199, 430, 116, 35);
		frame.getContentPane().add(lblPassword);
		
		JLabel lblConfirmPassword = new JLabel("Confirm Password");
		lblConfirmPassword.setForeground(new Color(255, 255, 255));
		lblConfirmPassword.setHorizontalAlignment(SwingConstants.CENTER);
		lblConfirmPassword.setFont(new Font("HP Simplified Light", Font.BOLD, 20));
		lblConfirmPassword.setBounds(169, 506, 175, 35);
		frame.getContentPane().add(lblConfirmPassword);
		
		JLabel lblCheck = new JLabel("Check");
		lblCheck.setBounds(407, 386, 41, 28);
		frame.getContentPane().add(lblCheck);
		
		JLabel label = new JLabel("Check");
		label.setBounds(407, 550, 41, 28);
		frame.getContentPane().add(label);
		
		textField = new JTextField();
		textField.setForeground(new Color(0, 0, 0));
		textField.setBackground(new Color(255, 255, 255));
		textField.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField.setBounds(116, 110, 268, 35);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField_1.setColumns(10);
		textField_1.setBounds(116, 204, 268, 35);
		frame.getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField_2.setColumns(10);
		textField_2.setBounds(116, 291, 268, 35);
		frame.getContentPane().add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField_3.setColumns(10);
		textField_3.setBounds(116, 382, 268, 35);
		frame.getContentPane().add(textField_3);
		
		passwordField = new JPasswordField();
		passwordField.setFont(new Font("Tahoma", Font.PLAIN, 16));
		passwordField.setColumns(10);
		passwordField.setBounds(116, 468, 268, 35);
		frame.getContentPane().add(passwordField);
		
		passwordField1 = new JPasswordField();
		passwordField1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		passwordField1.setColumns(10);
		passwordField1.setBounds(116, 546, 268, 35);
		frame.getContentPane().add(passwordField1);
		
		
		JLabel lblNewUser = new JLabel("New User Sign Up");
		lblNewUser.setBackground(new Color(255, 105, 180));
		lblNewUser.setForeground(new Color(255, 99, 71));
		lblNewUser.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewUser.setFont(new Font("HP Simplified", Font.BOLD, 40));
		lblNewUser.setBounds(79, 13, 352, 50);
		frame.getContentPane().add(lblNewUser);
		
		JSeparator separator = new JSeparator();
		separator.setBackground(new Color(255, 99, 71));
		separator.setForeground(new Color(255, 99, 71));
		separator.setBounds(54, 64, 397, 7);
		frame.getContentPane().add(separator);
	}
	
	public JFrame getFrame() {
		return this.frame;
	}

}
