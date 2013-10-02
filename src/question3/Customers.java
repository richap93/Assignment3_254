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
import javax.swing.border.EmptyBorder;
import javax.swing.JTextPane;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Customers extends JFrame {

	private JPanel contentPane;
	private JTextField txtName;
	private JTextField textAddressLine1;
	private JTextField textAddressLine2;
	private JTextField txtCreditCardNo;
	final JFrame frameCustomer = this;
	final JFrame frameAddCustomer = new AddCustomer();
	final JFrame frameHome = new Homepage();


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Customers frame = new Customers();
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
	public Customers() {
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
		
		JLabel lblCustomer = new JLabel("Managing customers");
		lblCustomer.setFont(new Font("Arial", Font.BOLD, 20));
		lblCustomer.setBounds(12, 5, 200, 25);
		contentPane.add(lblCustomer);
		
		JButton btnAdd = new JButton("Add");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frameCustomer.setVisible(false);
				frameAddCustomer.setVisible(true);
			}
		});
		
		btnAdd.setFont(new Font("Arial", Font.BOLD, 12));
		btnAdd.setBounds(360, 5, 70, 25);
		contentPane.add(btnAdd);

		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frameCustomer.setVisible(false);
				frameHome.setVisible(true);
			}
		});
		btnBack.setFont(new Font("Arial", Font.BOLD, 12));
		btnBack.setBounds(285, 5, 70, 25);
		contentPane.add(btnBack);		
				
	}
}
