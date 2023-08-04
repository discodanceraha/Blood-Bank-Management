import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import java.awt.Color;
import javax.swing.border.EtchedBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.AbstractAction;
import javax.swing.Action;

public class appointment {

    JFrame appointmentFrame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private final Action action = new SwingAction();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					appointment window = new appointment();
					window.appointmentFrame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public appointment() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		appointmentFrame = new JFrame();
		appointmentFrame.setBounds(100, 100, 1145, 611);
		appointmentFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		appointmentFrame.getContentPane().setLayout(null);
		
		JLabel appointment = new JLabel("APPOINTMENT");
		appointment.setFont(new Font("Tahoma", Font.BOLD, 25));
		appointment.setBounds(442, 10, 186, 31);
		appointmentFrame.getContentPane().add(appointment);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Registration", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBounds(10, 43, 525, 373);
		appointmentFrame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblAppointmentId = new JLabel("Appointment Id :");
		lblAppointmentId.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblAppointmentId.setBounds(10, 22, 158, 22);
		panel.add(lblAppointmentId);
		
		JLabel lblId = new JLabel("Receiver Id :");
		lblId.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblId.setBounds(10, 59, 134, 22);
		panel.add(lblId);
		
		JLabel lblStorageId = new JLabel("Storage Id :");
		lblStorageId.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblStorageId.setBounds(10, 95, 134, 22);
		panel.add(lblStorageId);
		
		JLabel lblBranchName = new JLabel("Branch Name :");
		lblBranchName.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblBranchName.setBounds(10, 133, 158, 22);
		panel.add(lblBranchName);
		
		JLabel lblQuantity = new JLabel("Quantity :");
		lblQuantity.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblQuantity.setBounds(10, 175, 134, 22);
		panel.add(lblQuantity);
		
		JLabel lblAppDate = new JLabel("App Date :");
		lblAppDate.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblAppDate.setBounds(10, 219, 134, 22);
		panel.add(lblAppDate);
		
		JLabel lblAppSlot = new JLabel("App Slot :");
		lblAppSlot.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblAppSlot.setBounds(10, 259, 134, 22);
		panel.add(lblAppSlot);
		
		JButton addbtn = new JButton("ADD");
		addbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		addbtn.setFont(new Font("Tahoma", Font.BOLD, 15));
		addbtn.setBounds(44, 314, 85, 38);
		panel.add(addbtn);
		
		JButton btnUpdate = new JButton("UPDATE");
		btnUpdate.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnUpdate.setBounds(207, 314, 102, 38);
		panel.add(btnUpdate);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(223, 22, 269, 22);
		panel.add(textField);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(223, 59, 269, 22);
		panel.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(223, 95, 269, 22);
		panel.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(223, 133, 269, 22);
		panel.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(223, 179, 269, 22);
		panel.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(223, 219, 269, 22);
		panel.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(223, 259, 269, 22);
		panel.add(textField_6);
		
		JButton btnUpdate_1 = new JButton("CLEAR");
		btnUpdate_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
				textField_1.setText("");
				textField_2.setText("");
				textField_3.setText("");
				textField_4.setText("");
				textField_5.setText("");
				textField_6.setText("");
				textField_7.setText("");
			}
		});
		btnUpdate_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnUpdate_1.setBounds(368, 314, 102, 38);
		panel.add(btnUpdate_1);
		
		JTextArea rta = new JTextArea();
		rta.setBounds(545, 51, 576, 365);
		appointmentFrame.getContentPane().add(rta);
		
		JPanel search = new JPanel();
		search.setLayout(null);
		search.setBorder(new TitledBorder(null, "Search", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		search.setBounds(10, 438, 422, 100);
		appointmentFrame.getContentPane().add(search);
		
		JLabel lblAppointmentId_1 = new JLabel("Appointment Id :");
		lblAppointmentId_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblAppointmentId_1.setBounds(10, 42, 158, 22);
		search.add(lblAppointmentId_1);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(189, 42, 223, 29);
		search.add(textField_7);
		
		JButton delbtn = new JButton("DELETE");
		delbtn.setFont(new Font("Tahoma", Font.BOLD, 15));
		delbtn.setBounds(582, 469, 163, 38);
		appointmentFrame.getContentPane().add(delbtn);
	}

	public void setVisible(boolean b) {
		// TODO Auto-generated method stub
		
	}

	

	private class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "SwingAction");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
		}
	}
}
