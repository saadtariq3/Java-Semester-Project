package final_project;
import final_project.message; 
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
public class login {
	public static void main(String[] args) {
		JFrame frame = new JFrame("Employee Management System");
		JPanel panel = new JPanel();
		JTextField text1 = new JTextField();
		
		JButton button1 = new JButton("Submit");
		JLabel label1 = new JLabel("Login Here");
		JLabel label2 = new JLabel("Username:");
		JLabel label3 = new JLabel("Password:");

		JPasswordField password = new JPasswordField();
		label1.setForeground(Color.WHITE);
		button1.setBackground(Color.BLUE);
		button1.setForeground(Color.WHITE);
		panel.setBackground(Color.BLUE);

		label1.setHorizontalAlignment(SwingConstants.CENTER);
		text1.setHorizontalAlignment(SwingConstants.LEFT);

		button1.setFont(new Font("Tahoma", Font.BOLD, 15));
		label1.setFont(new Font("Tahoma", Font.BOLD, 17));
		label2.setFont(new Font("Tahoma", Font.PLAIN, 12));	
		label3.setFont(new Font("Tahoma", Font.PLAIN, 12));

		frame.setIconImage(Toolkit.getDefaultToolkit().getImage(login.class.getResource("/res/employee1.png")));
		button1.setIcon(new ImageIcon(login.class.getResource("/res/symbol-check-icon (1).png")));
		label1.setIcon(new ImageIcon(login.class.getResource("/res/Preppy-icon.png")));

		label1.setBounds(0, 0, 384, 64);
		label2.setBounds(95, 76, 72, 26);

		button1.setBounds(132, 196, 121, 35);
		text1.setBounds(95, 99, 201, 20);
		password.setBounds(95, 152, 201, 22);
		label3.setBounds(95, 130, 72, 26);
		panel.setBounds(0, 0, 384, 64);
		
		button1.addActionListener(new ActionListener() {

	            @Override
	            public void actionPerformed(ActionEvent e) {
	            	message m = new message();
	                Connection con = null;
	                PreparedStatement pst = null;
	                ResultSet rs = null;
	                try {
	                	if(text1.getText().isEmpty() && password.getText().isEmpty()) {
	                    m.Display();
	                	}
	                	else {
	                		Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
		                    con = DriverManager.getConnection("jdbc:ucanaccess://C:\\Users\\saad tariq\\eclipse-workspace\\GUI PROJECT FINAL\\Employee_DB.accdb");

		                    String query = "select * from userlogin where username='" + text1.getText() + "' and password='" + password.getText() + "'";
		                    pst = con.prepareStatement(query);
		                    rs = pst.executeQuery();
		                    if (rs.next()) {	
		                    	main_frame info = new main_frame();
		            			info.main(null);
	            			    frame.dispose();
		                        
		                    } else {
		            			m.Display();
		            			text1.setText(null);
		            			password.setText(null);		                    }
	                	}
	                } catch (Exception ex) {
	                    JOptionPane.showMessageDialog(null, ex.getMessage());
	                }
	                
	            }

	        });
	        	
		frame.setVisible(true);
		frame.setSize(400, 300);
		frame.setLocation(400, 200);
		frame.getContentPane().setLayout(null);
				
		frame.getContentPane().add(label1); 
		frame.getContentPane().add(label2); 
		frame.getContentPane().add(label3);
		frame.getContentPane().add(button1);
		frame.getContentPane().add(text1);	
		frame.getContentPane().add(panel);
		frame.getContentPane().add(password);
				
			}
		}


