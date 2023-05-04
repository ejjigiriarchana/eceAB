package Restro_bill;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Bill {

	private JFrame frame;
	private JTextField t1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Bill window = new Bill();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Bill() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setForeground(Color.BLACK);
		frame.getContentPane().setBackground(Color.CYAN);
		frame.setBounds(100, 100, 517, 442);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Restro Bill");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 28));
		lblNewLabel.setBounds(156, 48, 169, 29);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Menu");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_1.setBounds(61, 127, 83, 29);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Quantity");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_2.setBounds(61, 190, 83, 22);
		frame.getContentPane().add(lblNewLabel_2);
		
		JComboBox c1 = new JComboBox();
		c1.setModel(new DefaultComboBoxModel(new String[] {"select", "coffee-40", "tea-20", "chiken biryani-300", "egg masala-150", "gulab jamun-100"}));
		c1.setBounds(214, 133, 145, 22);
		frame.getContentPane().add(c1);
		
		t1 = new JTextField();
		t1.setBounds(214, 194, 145, 20);
		frame.getContentPane().add(t1);
		t1.setColumns(10);
		
		JButton btnNewButton = new JButton("ORDER");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String item=(String) c1.getSelectedItem();
				String quantity=t1.getText();
				int q=Integer.parseInt(quantity);
				int bill=0;
				if(item.equals("coffee-40"))
				{
					bill=q*40;
					JOptionPane.showMessageDialog(btnNewButton, "Hello \n Selected Item:"+item+"\n quantity:"+q+"\n Your bill:"+bill);
				}
				else if(item.equals("tea-20"))
				{
					bill=q*20;
					JOptionPane.showMessageDialog(btnNewButton, "Hello \n Selected Item:"+item+"\n quantity:"+q+"\n Your bill:"+bill);
				}
				else if(item.equals("chiken biryani-300"))
				{
					bill=q*300;
					JOptionPane.showMessageDialog(btnNewButton, "Hello \n Selected Item:"+item+"\n quantity:"+q+"\n Your bill:"+bill);
				}
				else if(item.equals("egg masal-150"))
				{
					bill=q*150;
					JOptionPane.showMessageDialog(btnNewButton, "Hello \n Selected Item:"+item+"\n quantity:"+q+"\n Your bill:"+bill);
				}
				else if(item.equals("gulab jamun-100"))
				{
					bill=q*100;
					JOptionPane.showMessageDialog(btnNewButton, "Hello \n Selected Item:"+item+"\n quantity:"+q+"\n Your bill:"+bill);
				}
				
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 21));
		btnNewButton.setBounds(143, 274, 126, 23);
		frame.getContentPane().add(btnNewButton);
	}
}
