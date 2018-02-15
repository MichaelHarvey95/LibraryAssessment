import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class BookRental extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BookRental frame = new BookRental();
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
	public BookRental() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblBookName = new JLabel("Book Name");
		lblBookName.setBounds(48, 31, 91, 14);
		contentPane.add(lblBookName);
		
		JLabel lblIsbn = new JLabel("Category");
		lblIsbn.setBounds(48, 73, 46, 14);
		contentPane.add(lblIsbn);
		
		textField = new JTextField();
		textField.setBounds(197, 28, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(197, 73, 86, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblIsbn_1 = new JLabel("ISBN");
		lblIsbn_1.setBounds(48, 126, 46, 14);
		contentPane.add(lblIsbn_1);
		
		textField_2 = new JTextField();
		textField_2.setBounds(197, 123, 86, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblAvailability = new JLabel("Availability");
		lblAvailability.setBounds(48, 172, 70, 14);
		contentPane.add(lblAvailability);
		
		textField_3 = new JTextField();
		textField_3.setBounds(197, 169, 86, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		textField_3.setEditable(false);
		
		JButton btnSearch = new JButton("Search");
		btnSearch.setBounds(194, 209, 89, 23);
		contentPane.add(btnSearch);
		
		JButton btnGoBack = new JButton("Go Back");
		btnGoBack.setBounds(303, 209, 89, 23);
		contentPane.add(btnGoBack);
	}
}
