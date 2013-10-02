package question3;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextArea;
import javax.swing.JButton;

public class AddSale extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddSale frame = new AddSale();
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
	public AddSale() {
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
		
		JLabel lblAddSale = new JLabel("Add sale");
		lblAddSale.setFont(new Font("Arial", Font.BOLD, 20));
		lblAddSale.setBounds(12, 5, 200, 25);
		contentPane.add(lblAddSale);
		
		JLabel lblProduct = new JLabel("Product:");
		lblProduct.setFont(new Font("Arial", Font.PLAIN, 18));
		lblProduct.setBounds(12, 80, 137, 15);
		contentPane.add(lblProduct);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Arial", Font.PLAIN, 12));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Hotel deal", "Flights", "Package deal"}));
		comboBox.setBounds(120, 75, 160, 25);
		contentPane.add(comboBox);
		
		JLabel lblCustomer = new JLabel("Customer:");
		lblCustomer.setFont(new Font("Arial", Font.PLAIN, 18));
		lblCustomer.setBounds(12, 120, 100, 15);
		contentPane.add(lblCustomer);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setEditable(true);
		comboBox_1.setToolTipText("");
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Alison Nelson", "Bob Smith", "John Andrew", "Katy Perry", "Mark Simmons"}));
		comboBox_1.setFont(new Font("Arial", Font.PLAIN, 12));
		comboBox_1.setBounds(120, 115, 160, 25);
		contentPane.add(comboBox_1);
		
		JLabel lblPrice = new JLabel("Price:\t             $");
		lblPrice.setFont(new Font("Arial", Font.PLAIN, 18));
		lblPrice.setBounds(12, 160, 130, 15);
		contentPane.add(lblPrice);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(150, 155, 130, 25);
		contentPane.add(textArea);
		
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
