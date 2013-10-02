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
import javax.swing.JTable;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Sales extends JFrame {

	private JPanel contentPane;
	final JFrame frameSale = this;
	final JFrame frameAddSale = new AddSale();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Sales frame = new Sales();
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
	public Sales() {
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
		
		JLabel lblHome = new JLabel("Managing sales");
		lblHome.setFont(new Font("Arial", Font.BOLD, 20));
		lblHome.setBounds(12, 5, 200, 25);
		contentPane.add(lblHome);
		
		JButton btnAdd = new JButton("Add");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frameSale.setVisible(false);
				frameAddSale.setVisible(true);
			}
		});
		btnAdd.setFont(new Font("Arial", Font.BOLD, 12));
		btnAdd.setBounds(360, 5, 70, 25);
		contentPane.add(btnAdd);

		JButton btnBack = new JButton("Back");
		btnBack.setFont(new Font("Arial", Font.BOLD, 12));
		btnBack.setBounds(285, 5, 70, 25);
		contentPane.add(btnBack);
	}

}
