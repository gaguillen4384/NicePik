import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JComboBox;

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
import javax.swing.JFormattedTextField;

public class NewUser {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	
	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					NewUser window = new NewUser();
//					window.frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}


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
		btnSignIn.setBackground(UIManager.getColor("Button.background"));
		btnSignIn.setForeground(Color.BLUE);
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
		
		JLabel lblFirstName = new JLabel("Company Name");
		lblFirstName.setForeground(new Color(255, 255, 255));
		lblFirstName.setHorizontalAlignment(SwingConstants.CENTER);
		lblFirstName.setFont(new Font("HP Simplified Light", Font.BOLD, 20));
		lblFirstName.setBounds(158, 76, 166, 35);
		frame.getContentPane().add(lblFirstName);
		
		JLabel lblLastName = new JLabel("Company ID");
		lblLastName.setForeground(new Color(255, 255, 255));
		lblLastName.setHorizontalAlignment(SwingConstants.CENTER);
		lblLastName.setFont(new Font("HP Simplified Light", Font.BOLD, 20));
		lblLastName.setBounds(189, 163, 116, 35);
		frame.getContentPane().add(lblLastName);
		
		JLabel lblEmail = new JLabel("Employee Contact");
		lblEmail.setForeground(new Color(255, 255, 255));
		lblEmail.setHorizontalAlignment(SwingConstants.CENTER);
		lblEmail.setFont(new Font("HP Simplified Light", Font.BOLD, 20));
		lblEmail.setBounds(158, 253, 181, 35);
		frame.getContentPane().add(lblEmail);
		
		JLabel lblConfirmEmail = new JLabel("Employee Position");
		lblConfirmEmail.setForeground(new Color(255, 255, 255));
		lblConfirmEmail.setHorizontalAlignment(SwingConstants.CENTER);
		lblConfirmEmail.setFont(new Font("HP Simplified Light", Font.BOLD, 20));
		lblConfirmEmail.setBounds(169, 339, 175, 35);
		frame.getContentPane().add(lblConfirmEmail);
		
		JLabel lblPassword = new JLabel("Employee Phone Number");
		lblPassword.setForeground(new Color(255, 255, 255));
		lblPassword.setHorizontalAlignment(SwingConstants.CENTER);
		lblPassword.setFont(new Font("HP Simplified Light", Font.BOLD, 20));
		lblPassword.setBounds(126, 430, 244, 35);
		frame.getContentPane().add(lblPassword);
		
		JLabel lblConfirmPassword = new JLabel("Package");
		lblConfirmPassword.setForeground(new Color(255, 255, 255));
		lblConfirmPassword.setHorizontalAlignment(SwingConstants.CENTER);
		lblConfirmPassword.setFont(new Font("HP Simplified Light", Font.BOLD, 20));
		lblConfirmPassword.setBounds(164, 510, 175, 35);
		frame.getContentPane().add(lblConfirmPassword);
		
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
		
		
		JLabel lblNewUser = new JLabel("New Employee Sign Up");
		lblNewUser.setBackground(new Color(255, 105, 180));
		lblNewUser.setForeground(new Color(255, 99, 71));
		lblNewUser.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewUser.setFont(new Font("HP Simplified", Font.BOLD, 40));
		lblNewUser.setBounds(54, 13, 397, 50);
		frame.getContentPane().add(lblNewUser);
		
		JSeparator separator = new JSeparator();
		separator.setBackground(new Color(255, 99, 71));
		separator.setForeground(new Color(255, 99, 71));
		separator.setBounds(54, 64, 397, 7);
		frame.getContentPane().add(separator);
		
		textField_4 = new JTextField();
		textField_4.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField_4.setColumns(10);
		textField_4.setBounds(116, 467, 268, 35);
		frame.getContentPane().add(textField_4);
		
		String[] packageStrings = { " ", "0-2000 Pictures", "2000-10000 Pictures", 
				"10000-1000000 Pictures", "100000+ Pictures"};

		//Create the combo box, select item at index 0.
		JComboBox pacList = new JComboBox(packageStrings);
		pacList.setFont(new Font("HP Simplified", Font.PLAIN, 20));
		pacList.setBounds(116, 551, 268, 35);
		pacList.setSelectedIndex(0);
		frame.getContentPane().add(pacList);
		
	}
	
	public JFrame getFrame() {
		return this.frame;
	}
}
