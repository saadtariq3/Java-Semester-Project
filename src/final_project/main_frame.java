package final_project;
import javax.swing.*;   
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import final_project.table;
import javax.swing.border.LineBorder;
public class main_frame {
	public static void main(String[] args) 
	{
		JFrame frame = new JFrame("Employee Record");
		JLabel label1 = new JLabel("Employee Management System");
		JLabel label3 = new JLabel("Address:");
		JLabel label4 = new JLabel("Name:");
		JLabel label5 = new JLabel("Skills:");
		JLabel label6 = new JLabel("Designition:");
		JLabel label7 = new JLabel("");
		JLabel label8 = new JLabel("Add Employee:");
		JLabel label9 = new JLabel();
		JLabel label10 = new JLabel("");
		JLabel label12 = new JLabel("Employee Age:");
		JLabel label11 = new JLabel("Employee Status:");
		JLabel label13 = new JLabel("Employee ID:");
		JLabel label14 = new JLabel("Service Years:");
		JLabel label15 = new JLabel("Salary:");
		JLabel label16 = new JLabel("Contact:");
			
		JTextField text1 = new JTextField();
		JTextField text2 = new JTextField();
		JTextField text3 = new JTextField();
		JTextField text5 = new JTextField();
		JTextField text6 = new JTextField();
		JTextField text8 = new JTextField();
		
		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();
		
		JTextPane textpane1 = new JTextPane();
		JRadioButton radio1 = new JRadioButton("Regular");
		JRadioButton radio2 = new JRadioButton("Contract");
		
		label1.setIcon(new ImageIcon(main_frame.class.getResource("/res/Preppy-icon.png")));
		label7.setIcon(new ImageIcon(main_frame.class.getResource("/res/2.png")));
		label9.setIcon(new ImageIcon(main_frame.class.getResource("/res/wp3589870.jpg")));
		label10.setIcon(new ImageIcon("C:\\Users\\saad tariq\\Downloads\\2131.jpg"));
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\saad tariq\\Desktop\\shortcut\\toolbar.png"));

		JButton button1 = new JButton("Save");
		button1.setIcon(new ImageIcon(main_frame.class.getResource("/res/Save-icon (1).png")));
		JButton button4 = new JButton("Reset");
		button4.setIcon(new ImageIcon(main_frame.class.getResource("/res/icons8-reset-19.png")));

		button1.setForeground(Color.WHITE);
		button1.setBackground(Color.BLUE);
		frame.getContentPane().setBackground(Color.WHITE);
		button1.setFont(new Font("Tahoma", Font.BOLD, 14));
		button4.setForeground(Color.WHITE);
		button4.setBackground(Color.BLUE);
		button4.setFont(new Font("Tahoma", Font.BOLD, 14));
		label7.setBorder(new LineBorder(Color.BLACK, 2));
		label9.setBackground(Color.LIGHT_GRAY);

		textpane1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		radio1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		radio2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		
	    ButtonGroup G1 = new ButtonGroup();
	    
	    G1.add(radio1);
	    G1.add(radio2);
		
		label1.setBounds(256, 11, 382, 32);
		label3.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		label4.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		label5.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		label6.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		label8.setFont(new Font("Times New Roman", Font.BOLD, 20));
		label11.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		label12.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		label13.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		label14.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		label15.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		label16.setFont(new Font("Times New Roman", Font.PLAIN, 15));

		frame.getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 15));

		String a[]= {"...","Manager","Develpor","CEO","StakeHolder","Clerk"};
		String b []= {"CNIC","Passport"};
		String c []= {"...","20-27","28-34","35-40","Retired"};
		String d[]= {"...","+92","+966","+366"};
		
		JComboBox comboBox1 = new JComboBox(a);
		JComboBox comboBox2 = new JComboBox(b);
		JComboBox comboBox3 = new JComboBox(c);
		JComboBox comboBox4 = new JComboBox(d);

		JCheckBox cbox1 = new JCheckBox("Coding");
		JCheckBox cbox2 = new JCheckBox("Marketing");
		JCheckBox cbox3 = new JCheckBox("MS Office");
		JCheckBox cbox4 = new JCheckBox("FreeLancing");

		cbox1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		cbox2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		cbox3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		cbox4.setFont(new Font("Tahoma", Font.PLAIN, 13));
		comboBox2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		comboBox3.setFont(new Font("Tahoma", Font.PLAIN, 13));

		JSpinner spinner = new JSpinner();

		radio1.setBounds(682, 258, 76, 23);
		radio2.setBounds(767, 258, 76, 23);

		label3.setBounds(193, 324, 76, 28);
		label4.setBounds(193, 255, 76, 28);
		label5.setBounds(560, 363, 89, 28);
		label6.setBounds(193, 363, 76, 28);
		label7.setBounds(137, 64, 765, 143);
		label8.setBounds(154, 216, 129, 28);
		label9.setBounds(0, 64, 67, 497);
		label10.setBounds(137, 207, 765, 1);
		label11.setBounds(560, 255, 111, 28);
		label12.setBounds(560, 288, 111, 28);
		label13.setBounds(560, 324, 111, 28);
		label14.setBounds(193, 395, 105, 28);
		label15.setBounds(193, 428, 76, 28);
		label16.setBounds(193, 458, 76, 28);

		panel1.setBounds(0, 0, 884, 64);
		panel2.setBounds(65, 64, 79, 497);
		
		comboBox1.setBounds(304, 366, 111, 22);
		comboBox2.setBounds(193, 291, 90, 22);
		comboBox3.setBounds(682, 291, 111, 22);
		comboBox4.setBounds(248, 461, 59, 22);

		panel1.setBackground(Color.BLUE);
		panel2.setBackground(Color.BLUE);

		button1.setBounds(712, 432, 105, 29);
		button4.setBounds(592, 432, 99, 29);

		text1.setBounds(277, 259, 138, 20);
		text2.setBounds(304, 292, 111, 20);
		text3.setBounds(304, 328, 111, 20);
		text5.setBounds(682, 328, 135, 20);
		text6.setBounds(304, 432, 111, 20);
		text8.setBounds(314, 462, 101, 20);

		frame.getContentPane().add(panel1);
		panel1.setLayout(null);
		panel1.add(label1);
		
		cbox1.setBounds(673, 366, 80, 23);
		cbox2.setBounds(754, 366, 89, 23);
		cbox3.setBounds(673, 392, 80, 23);
		cbox4.setBounds(754, 392, 99, 23);

		spinner.setBounds(304, 399, 59, 20);

		textpane1.setBounds(560, 218, 283, 28);

		textpane1.setForeground(Color.BLACK);
		textpane1.setBackground(Color.LIGHT_GRAY);
		textpane1.setText("Important Notice: \"WEAR MASK\"");
		label7.setBackground(Color.WHITE);
		label1.setFont(new Font("Tahoma", Font.BOLD, 22));
		
		label1.setHorizontalAlignment(SwingConstants.CENTER);
		label1.setForeground(Color.WHITE);

		frame.setSize(900, 600);
		frame.setLocation(180, 50);
		frame.getContentPane().setLayout(null);
		frame.setVisible(true);
		
		frame.getContentPane().add(label3);
		frame.getContentPane().add(label4);
		frame.getContentPane().add(label5);
		frame.getContentPane().add(label6);		
		frame.getContentPane().add(button1);
		frame.getContentPane().add(button4);
		frame.getContentPane().add(text1);
		frame.getContentPane().add(text2);
		frame.getContentPane().add(text3);
		frame.getContentPane().add(text5);
		frame.getContentPane().add(panel2);
		frame.getContentPane().add(label7);
		frame.getContentPane().add(label8);
		frame.getContentPane().add(label9);
		frame.getContentPane().add(label10);
		frame.getContentPane().add(label11);
		frame.getContentPane().add(label12);
		frame.getContentPane().add(label13);
		frame.getContentPane().add(comboBox1);
		frame.getContentPane().add(comboBox2);
		frame.getContentPane().add(comboBox3);
		frame.getContentPane().add(comboBox4);
		frame.getContentPane().add(cbox1);
		frame.getContentPane().add(cbox2);
		frame.getContentPane().add(cbox3);
		frame.getContentPane().add(cbox4);
		frame.getContentPane().add(radio1);
		frame.getContentPane().add(radio2);
		frame.getContentPane().add(textpane1);
		frame.getContentPane().add(spinner);
		frame.getContentPane().add(label14);
		frame.getContentPane().add(label15);
		frame.getContentPane().add(text6);
		frame.getContentPane().add(label16);
		frame.getContentPane().add(text8);
		
		button1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Connection con;
				String empStatus="";
				String skills="";
		
				try {
					Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
					con = DriverManager.getConnection("jdbc:ucanaccess://C:\\Users\\saad tariq\\eclipse-workspace\\GUI PROJECT FINAL\\Employee_DB.accdb");
					System.out.println("Connected Successfully");
					
					PreparedStatement st = con.prepareStatement("Insert into emp_managment (emp_cnic,emp_name,address,designation,service,salary,contact,emp_status, emp_age,emp_id,skill) values(?,?,?,?,?,?,?,?,?,?,?) ");
					st.setString(1, text2.getText());
					st.setString(2, text1.getText());
					st.setString(3, text3.getText());
					
					st.setString(4, comboBox1.getSelectedItem().toString());
					st.setString(5,spinner.getValue().toString());
					
					st.setString(6, text6.getText());
					String pNum = comboBox4.getSelectedItem().toString();
					pNum += " "+text8.getText();
					st.setString(7, pNum);
				
					if(radio1.isSelected())
				    {
						empStatus = "Regular";
				    }
				    else if(radio2.isSelected())
				    {
				    	empStatus = "Contract";
				    }
				   
			        st.setString(8, empStatus);
			        
					st.setString(9, comboBox3.getSelectedItem().toString());

					st.setString(10, text5.getText());                  
					if(cbox1.isSelected()) {
						skills += "Coding ";
					}
					if(cbox2.isSelected()) {
						skills +="Marketing ";
					}
					if(cbox3.isSelected()) {
						skills +="MS Office ";
					}
					if(cbox4.isSelected()) {
						skills +="FreeLancing ";
					
                   }
					st.setString(11, skills);
					int a = st.executeUpdate();
					
					if(a>0) {
						System.out.println("Record Inserted");
						
					}
					else {
						System.out.println("Record fail");
					}
					table info = new table();
        			info.main(null);
    			    frame.dispose();
				}
				catch(Exception e1) {
					System.out.println(e1);

				}	
			}
		});
		button4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				text1.setText(null);
				text2.setText(null);
				text3.setText(null);
				text5.setText(null);
				text6.setText(null);
				text8.setText(null);
				comboBox1.setSelectedItem("...");
				comboBox3.setSelectedItem("...");
				comboBox4.setSelectedItem("...");

				spinner.setValue(0);
				cbox1.setSelected(false);
				cbox2.setSelected(false);
				cbox3.setSelected(false);
				cbox4.setSelected(false);

			}
		});
		
			}
		}

