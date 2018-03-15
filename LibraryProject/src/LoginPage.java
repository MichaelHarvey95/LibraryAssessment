import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;

public class LoginPage extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginPage frame = new LoginPage();
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
	public LoginPage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Username: ");
		lblNewLabel.setBounds(60, 79, 82, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblPassword = new JLabel("Password: ");
		lblPassword.setBounds(60, 141, 82, 14);
		contentPane.add(lblPassword);
		
		textField = new JTextField();
		textField.setBounds(152, 76, 149, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(152, 138, 149, 20);
		contentPane.add(textField_1);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.setBounds(152, 202, 89, 23);
		contentPane.add(btnLogin);
		btnLogin.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				try{
					
				
					Class.forName("com.mysql.jdbc.Driver");
					Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/librarytest","root","password");
					PreparedStatement ps = con.prepareStatement("SELECT * FROM login WHERE username = ? AND password = ?");
					ps.setString(1, textField.getText());
					ps.setString(2, textField_1.getText());
					ResultSet result = ps.executeQuery();
					
					if(result.next())
					{
						JOptionPane.showMessageDialog(null, "Username and password correct");
						dispose();
						MainPage admn = new MainPage();
						admn.setVisible(true);
						
					}
					else 
					{
						JOptionPane.showMessageDialog(null, "Invalid login details");
						
					}
					
				}
				catch(Exception e1){
					JOptionPane.showMessageDialog(null, ("Incorrect login details!!"),
							"An error has occurred!!", JOptionPane.INFORMATION_MESSAGE);

				}
			}
		});

		JButton btnNewUser = new JButton("New user");
		btnNewUser.setBounds(271, 202, 89, 23);
		contentPane.add(btnNewUser);

		
	}
		
	

}


