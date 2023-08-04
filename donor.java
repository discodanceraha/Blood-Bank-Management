import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class donor {

	JFrame donorFrame;
	private JTextField ditfield;
	private JTextField dntfield;
	private JTextField bgtfield;
	private JTextField dstfield;
	private JTextField datfield;
	private JTextField dptfield;
	private JTextField dsearchtfield;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					donor window = new donor();
					window.donorFrame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public donor() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		donorFrame = new JFrame();
		donorFrame.setBounds(100, 100, 1138, 541);
		donorFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		donorFrame.getContentPane().setLayout(null);
		
		JLabel dn = new JLabel("Donar Name : ");
		dn.setFont(new Font("Tahoma", Font.BOLD, 18));
		dn.setBounds(10, 89, 137, 32);
		donorFrame.getContentPane().add(dn);
		
		JLabel bg = new JLabel("B_Group : ");
		bg.setFont(new Font("Tahoma", Font.BOLD, 18));
		bg.setBounds(10, 131, 116, 32);
		donorFrame.getContentPane().add(bg);
		
		JLabel ds = new JLabel("D_Sex : ");
		ds.setFont(new Font("Tahoma", Font.BOLD, 18));
		ds.setBounds(10, 173, 116, 32);
		donorFrame.getContentPane().add(ds);
		
		JLabel da = new JLabel("D_Age : ");
		da.setFont(new Font("Tahoma", Font.BOLD, 18));
		da.setBounds(10, 215, 116, 32);
		donorFrame.getContentPane().add(da);
		
		JLabel dp = new JLabel("D_Phno : ");
		dp.setFont(new Font("Tahoma", Font.BOLD, 18));
		dp.setBounds(10, 257, 116, 32);
		donorFrame.getContentPane().add(dp);
		
		dntfield = new JTextField();
		dntfield.setColumns(10);
		dntfield.setBounds(157, 89, 223, 29);
		donorFrame.getContentPane().add(dntfield);
		
		bgtfield = new JTextField();
		bgtfield.setColumns(10);
		bgtfield.setBounds(157, 131, 223, 29);
		donorFrame.getContentPane().add(bgtfield);
		
		dstfield = new JTextField();
		dstfield.setColumns(10);
		dstfield.setBounds(157, 173, 223, 29);
		donorFrame.getContentPane().add(dstfield);
		
		datfield = new JTextField();
		datfield.setColumns(10);
		datfield.setBounds(157, 215, 223, 29);
		donorFrame.getContentPane().add(datfield);
		
		dptfield = new JTextField();
		dptfield.setColumns(10);
		dptfield.setBounds(157, 257, 223, 29);
		donorFrame.getContentPane().add(dptfield);
		
		JTextArea dta = new JTextArea();
		dta.setBounds(428, 57, 686, 296);
		donorFrame.getContentPane().add(dta);
		
		JLabel donor = new JLabel("DONAR");
		donor.setFont(new Font("Tahoma", Font.BOLD, 25));
		donor.setBounds(445, 10, 101, 29);
		donorFrame.getContentPane().add(donor);
		
		JPanel donorregpanel = new JPanel();
		donorregpanel.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Registration", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		donorregpanel.setBounds(0, 36, 397, 320);
		donorFrame.getContentPane().add(donorregpanel);
		donorregpanel.setLayout(null);
		
		JLabel di = new JLabel("Donar Id : ");
		di.setBounds(10, 18, 134, 22);
		di.setFont(new Font("Tahoma", Font.BOLD, 18));
		donorregpanel.add(di);
		
		ditfield = new JTextField();
		ditfield.setBounds(154, 18, 222, 22);
		donorregpanel.add(ditfield);
		ditfield.setColumns(10);
		
		JButton clearbtn = new JButton("CLEAR");
		clearbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dntfield.setText("");
				bgtfield.setText("");
				dstfield.setText("");
				datfield.setText("");
				dptfield.setText("");
				ditfield.setText("");
			}
		});
		clearbtn.setFont(new Font("Tahoma", Font.BOLD, 15));
		clearbtn.setBounds(269, 282, 95, 28);
		donorregpanel.add(clearbtn);
		
		JButton updatebtn = new JButton("UPDATE");
		updatebtn.setBounds(139, 277, 95, 38);
		donorregpanel.add(updatebtn);
		updatebtn.setFont(new Font("Tahoma", Font.BOLD, 15));
		
		JButton addbtn = new JButton("ADD");
		addbtn.setBounds(26, 277, 85, 38);
		donorregpanel.add(addbtn);
		addbtn.setFont(new Font("Tahoma", Font.BOLD, 15));
		
		JPanel search = new JPanel();
		search.setBorder(new TitledBorder(null, "Search", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		search.setBounds(10, 378, 422, 100);
		donorFrame.getContentPane().add(search);
		search.setLayout(null);
		
		JLabel searchdi = new JLabel("Donar Id : ");
		searchdi.setBounds(10, 42, 99, 22);
		searchdi.setFont(new Font("Tahoma", Font.BOLD, 18));
		search.add(searchdi);
		
		dsearchtfield = new JTextField();
		dsearchtfield.setColumns(10);
		dsearchtfield.setBounds(162, 42, 223, 29);
		search.add(dsearchtfield);
		
		JButton delbtn = new JButton("DELETE");
		delbtn.setBounds(505, 411, 163, 38);
		donorFrame.getContentPane().add(delbtn);
		delbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		delbtn.setFont(new Font("Tahoma", Font.BOLD, 15));
	}
}
