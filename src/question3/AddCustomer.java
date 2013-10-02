package question3;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class AddCustomer extends JFrame {

	private JPanel contentPane;
	private JTextField txtName;
	private JTextField textAddressLine1;
	private JTextField textAddressLine2;
	private JTextField txtCreditCardNo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddCustomer frame = new AddCustomer();
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
	public AddCustomer() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JSeparator separator = new JSeparator();
		separator.setForeground(Color.BLACK);
		separator.setBounds(12, 35, 426, 1);
		contentPane.add(separator);
		
		JLabel lbladdCustomer = new JLabel("Add customer");
		lbladdCustomer.setFont(new Font("Arial", Font.BOLD, 20));
		lbladdCustomer.setBounds(12, 5, 200, 25);
		contentPane.add(lbladdCustomer);
	
		JLabel lblName = new JLabel("Name:");
		lblName.setFont(new Font("Arial", Font.PLAIN, 18));
		lblName.setBounds(12, 70, 137, 15);
		contentPane.add(lblName);
		
		txtName = new JTextField();
		txtName.setFont(new Font("Arial", Font.PLAIN, 18));
		txtName.setText("");
		txtName.setBounds(90, 67, 114, 24);
		contentPane.add(txtName);
		txtName.setColumns(10);
		
		JLabel lblAddress = new JLabel("Address:");
		lblAddress.setFont(new Font("Arial", Font.PLAIN, 18));
		lblAddress.setBounds(12, 105, 136, 15);
		contentPane.add(lblAddress);
		
		textAddressLine2 = new JTextField();
		textAddressLine2.setFont(new Font("Arial", Font.PLAIN, 18));
		textAddressLine2.setText("");
		textAddressLine2.setColumns(10);
		textAddressLine2.setBounds(90, 130, 150, 24);
		contentPane.add(textAddressLine2);
		
		textAddressLine1 = new JTextField();
		textAddressLine1.setFont(new Font("Arial", Font.PLAIN, 18));
		textAddressLine1.setText("");
		textAddressLine1.setColumns(10);
		textAddressLine1.setBounds(90, 102, 150, 24);
		contentPane.add(textAddressLine1);
		
		JLabel lblCreditCardNo = new JLabel("Credit Card No:");
		lblCreditCardNo.setFont(new Font("Arial", Font.PLAIN, 18));
		lblCreditCardNo.setBounds(12, 165, 136, 15);
		contentPane.add(lblCreditCardNo);
		
		txtCreditCardNo = new JTextField();
		txtCreditCardNo.setFont(new Font("Arial", Font.PLAIN, 18));
		txtCreditCardNo.setBounds(147, 162, 200, 24);
		contentPane.add(txtCreditCardNo);
		
		JButton btnSave = new JButton("Save");
		btnSave.setFont(new Font("Arial", Font.BOLD, 12));
		btnSave.setBounds(46, 200, 117, 25);
		contentPane.add(btnSave);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.setFont(new Font("Arial", Font.BOLD, 12));
		btnCancel.setBounds(170, 200, 117, 25);
		contentPane.add(btnCancel);
	}

}
