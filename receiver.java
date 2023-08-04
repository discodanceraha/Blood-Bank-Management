import java.awt.EventQueue;
import java.sql.*;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class receiver {

	JFrame receiverFrame;
	private JTextField ritfield;
	private JTextField rntfield;
	private JTextField rbgtfield;
	private JTextField rstfield;
	private JTextField ratfield;
	private JTextField rptfield;
	private JTextField sridtfield;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					receiver window = new receiver();
					window.receiverFrame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public receiver() {
		initialize();
	}
	Connection con;
	PreparedStatement pat;

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		receiverFrame = new JFrame();
		receiverFrame.setBounds(100, 100, 1118, 581);
		receiverFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		receiverFrame.getContentPane().setLayout(null);
		
		JLabel Receiver = new JLabel("RECEIVER");
		Receiver.setBounds(419, 10, 137, 31);
		Receiver.setFont(new Font("Tahoma", Font.BOLD, 25));
		receiverFrame.getContentPane().add(Receiver);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "Registration", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBounds(10, 44, 493, 352);
		receiverFrame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel ri = new JLabel("Receiver Id : ");
		ri.setFont(new Font("Tahoma", Font.BOLD, 18));
		ri.setBounds(10, 27, 134, 22);
		panel.add(ri);
		
		JLabel rn = new JLabel("Receiver Name :");
		rn.setFont(new Font("Tahoma", Font.BOLD, 18));
		rn.setBounds(10, 71, 153, 22);
		panel.add(rn);
		
		JLabel rbg = new JLabel("B_Group :");
		rbg.setFont(new Font("Tahoma", Font.BOLD, 18));
		rbg.setBounds(10, 114, 134, 22);
		panel.add(rbg);
		
		JLabel rs = new JLabel("R_Sex :");
		rs.setFont(new Font("Tahoma", Font.BOLD, 18));
		rs.setBounds(10, 157, 134, 22);
		panel.add(rs);
		
		JLabel ra = new JLabel("R_Age :");
		ra.setFont(new Font("Tahoma", Font.BOLD, 18));
		ra.setBounds(10, 202, 134, 22);
		panel.add(ra);
		
		JLabel rph = new JLabel("R_Phno :");
		rph.setFont(new Font("Tahoma", Font.BOLD, 18));
		rph.setBounds(10, 245, 134, 22);
		panel.add(rph);
		
		ritfield = new JTextField();
		ritfield.setColumns(10);
		ritfield.setBounds(195, 27, 269, 22);
		panel.add(ritfield);
		
		rntfield = new JTextField();
		rntfield.setColumns(10);
		rntfield.setBounds(195, 71, 269, 29);
		panel.add(rntfield);
		
		rbgtfield = new JTextField();
		rbgtfield.setColumns(10);
		rbgtfield.setBounds(195, 114, 269, 22);
		panel.add(rbgtfield);
		
		rstfield = new JTextField();
		rstfield.setColumns(10);
		rstfield.setBounds(195, 157, 269, 22);
		panel.add(rstfield);
		
		ratfield = new JTextField();
		ratfield.setColumns(10);
		ratfield.setBounds(195, 202, 269, 22);
		panel.add(ratfield);
		
		rptfield = new JTextField();
		rptfield.setColumns(10);
		rptfield.setBounds(195, 245, 269, 22);
		panel.add(rptfield);
		
		JButton addbtn = new JButton("ADD");
		addbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s1,s2,s3,s4,s5,s6,s7;
				s1=ritfield.getText();
				s2=rntfield.getText();
				s3=rbgtfield.getText();
				s4=rstfield.getText();
				s5=ratfield.getText();
				s6=rptfield.getText();
				s7=sridtfield.getText();
			}
		});
		addbtn.setFont(new Font("Tahoma", Font.BOLD, 15));
		addbtn.setBounds(39, 304, 85, 38);
		panel.add(addbtn);
		
		JButton btnUpdate = new JButton("UPDATE");
		btnUpdate.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnUpdate.setBounds(189, 304, 103, 38);
		panel.add(btnUpdate);
		
		JButton btnClear = new JButton("CLEAR");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ritfield.setText("");
				rntfield.setText("");
				rbgtfield.setText("");
				rstfield.setText("");
				ratfield.setText("");
				rptfield.setText("");
				sridtfield.setText("");
				
			}
		});
		btnClear.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnClear.setBounds(347, 304, 85, 38);
		panel.add(btnClear);
		
		JTextArea rta = new JTextArea();
		rta.setBounds(513, 51, 581, 337);
		receiverFrame.getContentPane().add(rta);
		
		JPanel search = new JPanel();
		search.setLayout(null);
		search.setBorder(new TitledBorder(null, "Search", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		search.setBounds(10, 413, 422, 100);
		receiverFrame.getContentPane().add(search);
		
		JLabel srid = new JLabel("Receiver Id : ");
		srid.setFont(new Font("Tahoma", Font.BOLD, 18));
		srid.setBounds(10, 42, 124, 22);
		search.add(srid);
		
		sridtfield = new JTextField();
		sridtfield.setColumns(10);
		sridtfield.setBounds(162, 42, 223, 29);
		search.add(sridtfield);
		
		JButton delbtn = new JButton("DELETE");
		delbtn.setFont(new Font("Tahoma", Font.BOLD, 15));
		delbtn.setBounds(595, 447, 163, 38);
		receiverFrame.getContentPane().add(delbtn);
		
		JButton btnCheck_1 = new JButton("CHECK");
		btnCheck_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnCheck_1.setBounds(462, 447, 85, 38);
		receiverFrame.getContentPane().add(btnCheck_1);
	}

}
