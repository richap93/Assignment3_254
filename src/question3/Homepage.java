package question3;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JSeparator;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Homepage extends JFrame {

	private JPanel contentPane;
	final JFrame frameHome = this;
	final JFrame frameSales = new Sales();
	final JFrame frameCustomers = new Customers();


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Homepage frame = new Homepage();
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
	public Homepage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblHome = new JLabel("Home");
		lblHome.setFont(new Font("Arial", Font.BOLD, 20));
		lblHome.setBounds(12, 12, 70, 15);
		contentPane.add(lblHome);
		
		JSeparator separator = new JSeparator();
		separator.setForeground(Color.BLACK);
		separator.setBounds(12, 35, 426, 1);
		contentPane.add(separator);
		
		JButton btnSales = new JButton("> Managing sales");
		btnSales.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frameHome.setVisible(false);
				frameSales.setVisible(true);
			}
		});
		btnSales.setHorizontalAlignment(SwingConstants.LEFT);
		btnSales.setFont(new Font("Arial", Font.BOLD, 14));
		btnSales.setBounds(12, 70, 200, 40);
		contentPane.add(btnSales);
		
		JButton btnNewButton = new JButton("> Managing customers");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frameHome.setVisible(false);
				frameCustomers.setVisible(true);
			}
		});
		
		btnNewButton.setHorizontalAlignment(SwingConstants.LEFT);
		btnNewButton.setFont(new Font("Arial", Font.BOLD, 14));
		btnNewButton.setBounds(12, 115, 200, 40);
		contentPane.add(btnNewButton);
		
		JButton btnProduct = new JButton("> Managing product");
		btnProduct.setHorizontalAlignment(SwingConstants.LEFT);
		btnProduct.setFont(new Font("Arial", Font.BOLD, 14));
		btnProduct.setBounds(12, 160, 200, 40);
		contentPane.add(btnProduct);
	}
}
