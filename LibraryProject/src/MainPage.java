import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class MainPage extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainPage frame = new MainPage();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MainPage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 723, 385);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblFirstName = new JLabel("First Name: ");
		lblFirstName.setBounds(112, 42, 93, 14);
		contentPane.add(lblFirstName);
		
		JLabel lblLastName = new JLabel("Last Name: ");
		lblLastName.setBounds(112, 82, 93, 14);
		contentPane.add(lblLastName);
		
		JLabel lblAge = new JLabel("Age");
		lblAge.setBounds(112, 129, 93, 14);
		contentPane.add(lblAge);
		
		JLabel lblLibraryNumber = new JLabel("Library Number: ");
		lblLibraryNumber.setBounds(112, 172, 93, 14);
		contentPane.add(lblLibraryNumber);
		
		textField = new JTextField();
		textField.setBounds(259, 39, 156, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(259, 79, 156, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(259, 129, 156, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(259, 169, 156, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblNoOfOrders = new JLabel("No. of orders");
		lblNoOfOrders.setBounds(112, 228, 93, 14);
		contentPane.add(lblNoOfOrders);
		
		textField_4 = new JTextField();
		textField_4.setBounds(259, 225, 156, 20);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		JButton btnRentABook = new JButton("Rent a book");
		btnRentABook.setBounds(259, 283, 123, 23);
		contentPane.add(btnRentABook);
		
		JButton btnLogout = new JButton("Logout");
		btnLogout.setBounds(449, 283, 123, 23);
		contentPane.add(btnLogout);
		btnLogout.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				LoginPage lgpge = new LoginPage();
				dispose();
				lgpge.setVisible(true);
			}
		});
		
	}

}
