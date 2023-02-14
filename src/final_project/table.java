package final_project;
import final_project.main_frame;
import java.awt.*; 
import javax.swing.*;
import javax.swing.table.TableColumnModel;

import net.proteanit.sql.DbUtils;

import java.sql.*;
import java.awt.event.*;
import javax.swing.border.LineBorder;
public class table {
	
	public static void main(String[] args) {
		JFrame f11 = new JFrame("Employees Record");
		f11.setIconImage(Toolkit.getDefaultToolkit().getImage(table.class.getResource("/res/1414516.png")));
		JButton button = new JButton("Search");
		JLabel label1 = new JLabel("Employee Record");
		JTextField textField = new JTextField();
		JButton button1 = new JButton("Display Data");
		JButton button2 = new JButton("Add New Record");
		JTable table = new JTable();
		JPanel panel = new JPanel();
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(176, 196, 222));
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setViewportBorder(new LineBorder(new Color(0, 0, 0)));
		
		button.setFont(new Font("Tahoma", Font.PLAIN, 13));
		button1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		button2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		label1.setFont(new Font("Tahoma", Font.BOLD, 17));

		label1.setHorizontalAlignment(SwingConstants.CENTER);

		label1.setBounds(415, 11, 161, 37);		
		button1.setBounds(42, 49, 109, 23);
		button.setBounds(866, 49, 89, 23);
		button2.setBounds(160, 49, 138, 23);
		textField.setBounds(722, 52, 138, 20);		
		scrollPane.setBounds(30, 83, 925, 184);
		
		panel.setBounds(0, 0, 1041, 82);
		panel.setLayout(new BorderLayout(5, 5));
		panel.add(label1, BorderLayout.CENTER);
		panel_1.setLayout(new GridLayout(1, 5, 5, 5));
		panel_1.setBounds(0, 83, 984, 195);
		
		f11.setVisible(true);
		f11.setSize(1000, 317);
		f11.setLocation(230, 180);
		f11.getContentPane().setLayout(null);
		
		f11.getContentPane().add(scrollPane);
		f11.getContentPane().add(button1);
		f11.getContentPane().add(button);
		f11.getContentPane().add(button2);

		f11.getContentPane().add(textField);
		f11.getContentPane().add(panel);
		f11.getContentPane().add(panel_1);



		button1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

                Connection con = null;
                PreparedStatement pst = null;
                ResultSet rs = null;
                
                try {
                		Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
	                    con = DriverManager.getConnection("jdbc:ucanaccess://C:\\Users\\saad tariq\\eclipse-workspace\\GUI PROJECT FINAL\\Employee_DB.accdb");

	                    String query = "select * from emp_managment";
	                    pst = con.prepareStatement(query);
	                    rs = pst.executeQuery();
	                    table.setModel(DbUtils.resultSetToTableModel(rs));
                }   
                catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, ex.getMessage());
                }
			
			}
		});
		
		scrollPane.setViewportView(table);
		button2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				main_frame frame = new main_frame();
				frame.main(null);
				f11.dispose();
			}
		});

		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				  Connection con = null;
	                PreparedStatement pst = null;
	                ResultSet rs = null;
	                Boolean data = false;
	                try {
	                		Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
		                    con = DriverManager.getConnection("jdbc:ucanaccess://C:\\Users\\saad tariq\\eclipse-workspace\\GUI PROJECT FINAL\\Employee_DB.accdb");

		                    String query = "select * from emp_managment where emp_cnic=?";
		                    pst = con.prepareStatement(query);
		                    pst.setString(1,textField.getText() );
		                    rs = pst.executeQuery();
		                    if (!rs.isBeforeFirst() ) {    
		                    	JOptionPane.showMessageDialog(null, "No Record Found");
		                    	textField.setText("");
		                    }
		                    else {
	                    	table.setModel(DbUtils.resultSetToTableModel(rs));
	                    	   textField.setText("");
		                         }
		                    }
 
	                catch (Exception ex) {
	                    JOptionPane.showMessageDialog(null, ex.getMessage());
	                }
			}
		});
	}
}

