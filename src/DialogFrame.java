

import java.awt.EventQueue;
import java.awt.Window;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;

public class DialogFrame {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DialogFrame window = new DialogFrame();
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
	public DialogFrame() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 255, 255));
		frame.setTitle("Dialog");
		frame.setBounds(100, 100, 500, 100);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.getContentPane().setLayout(null);
		
		JLabel lblSeeYouSoon = new JLabel("Thank You! See You Soon!");
		lblSeeYouSoon.setForeground(new Color(255, 0, 0));
		lblSeeYouSoon.setHorizontalAlignment(SwingConstants.CENTER);
		lblSeeYouSoon.setFont(new Font("HP Simplified Light", Font.BOLD, 20));
		lblSeeYouSoon.setBounds(54, 13, 397, 39);
		frame.getContentPane().add(lblSeeYouSoon);
		
		
	}

	public JFrame getFrame() {
		return this.frame;
	}

}