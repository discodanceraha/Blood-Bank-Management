import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;

public class blood_storage {

	JFrame bsFrame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					blood_storage window = new blood_storage();
					window.bsFrame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public blood_storage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		bsFrame = new JFrame();
		bsFrame.setBounds(100, 100, 1138, 523);
		bsFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		bsFrame.getContentPane().setLayout(null);
		
		JLabel lblBloodStorage = new JLabel("Blood Storage");
		lblBloodStorage.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblBloodStorage.setBounds(409, 10, 180, 31);
		bsFrame.getContentPane().add(lblBloodStorage);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "Storing", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBounds(10, 40, 500, 310);
		bsFrame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblStorageId = new JLabel("Storage Id :");
		lblStorageId.setBounds(10, 24, 158, 22);
		lblStorageId.setFont(new Font("Tahoma", Font.BOLD, 18));
		panel.add(lblStorageId);
		
		JLabel lblDonarId = new JLabel("Donar Id :");
		lblDonarId.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblDonarId.setBounds(10, 67, 158, 22);
		panel.add(lblDonarId);
		
		JLabel lblBranchName = new JLabel("Branch Name :");
		lblBranchName.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblBranchName.setBounds(10, 113, 158, 22);
		panel.add(lblBranchName);
		
		JLabel lblPincode = new JLabel("Pincode :");
		lblPincode.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblPincode.setBounds(10, 157, 158, 22);
		panel.add(lblPincode);
		
		JLabel lblDonationDate = new JLabel("Donation Date :");
		lblDonationDate.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblDonationDate.setBounds(10, 203, 158, 22);
		panel.add(lblDonationDate);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(208, 24, 269, 22);
		panel.add(textField);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(208, 67, 269, 22);
		panel.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(208, 113, 269, 22);
		panel.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(208, 157, 269, 22);
		panel.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(208, 203, 269, 22);
		panel.add(textField_4);
		
		JButton addbtn = new JButton("ADD");
		addbtn.setFont(new Font("Tahoma", Font.BOLD, 15));
		addbtn.setBounds(27, 247, 85, 38);
		panel.add(addbtn);
		
		JButton btnUpdate = new JButton("UPDATE");
		btnUpdate.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnUpdate.setBounds(199, 247, 101, 38);
		panel.add(btnUpdate);
		
		JButton btnDelete = new JButton("CLEAR");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
				textField_1.setText("");
				textField_2.setText("");
				textField_3.setText("");
				textField_4.setText("");
			}
		});
		btnDelete.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnDelete.setBounds(362, 247, 101, 38);
		panel.add(btnDelete);
		
		JTextArea rta = new JTextArea();
		rta.setBounds(520, 51, 594, 337);
		bsFrame.getContentPane().add(rta);
		
		JPanel search = new JPanel();
		search.setLayout(null);
		search.setBorder(new TitledBorder(null, "Search", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		search.setBounds(10, 360, 422, 100);
		bsFrame.getContentPane().add(search);
		
		JLabel lblAppointmentId_1 = new JLabel("Storage Id :");
		lblAppointmentId_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblAppointmentId_1.setBounds(10, 42, 158, 22);
		search.add(lblAppointmentId_1);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(189, 42, 223, 29);
		search.add(textField_5);
		
		JButton delbtn = new JButton("DELETE");
		delbtn.setFont(new Font("Tahoma", Font.BOLD, 15));
		delbtn.setBounds(624, 414, 163, 38);
		bsFrame.getContentPane().add(delbtn);
	}

}
