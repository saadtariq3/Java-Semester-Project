package final_project;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class message {

	public static void main(String[] args) {
	
		JFrame message = new JFrame("Warning");
		JLabel label_01 = new JLabel("Wrong / Empty Credentials");
		JButton but_01 = new JButton("OK");
		message.getContentPane().setBackground(new Color(112, 128, 144));
		
		
		label_01.setBounds(92, 11, 244, 26);
		but_01.setBounds(142, 48, 89, 23);
		
		label_01.setForeground(Color.WHITE);
		but_01.setBackground(Color.LIGHT_GRAY);
		label_01.setFont(new Font("Segoe UI", Font.BOLD, 15));
		but_01.setFont(new Font("Segoe UI Symbol", Font.BOLD, 16));
		
		message.setVisible(true);
		message.setSize(400, 130);
		message.setLocation(450, 250);
		message.getContentPane().setLayout(null);
		message.getContentPane().add(label_01);
		message.getContentPane().add(but_01);

		but_01.setForeground(Color.BLACK);
		but_01.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				message.dispose();
			}
		
		});
	}
	void Display() {
		main(null);
	}

}
