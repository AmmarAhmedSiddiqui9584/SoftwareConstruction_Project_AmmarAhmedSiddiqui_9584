package Resturant_S;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JTabbedPane;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JSeparator;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class Resturants {

	private JFrame frame;
	private JTextField textFieldzinger;
	private JTextField textFieldbeefcheeseburger;
	private JTextField txtChicMayooSub;
	private JTextField textFieldbroast;
	private JTextField textFieldmayoobroast;
	private JTextField textFieldTotal;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Resturants window = new Resturants();
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
	public Resturants() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setForeground(new Color(250, 250, 210));
		frame.getContentPane().setBackground(new Color(0, 0, 0));
		frame.setBounds(0, 0, 1350, 557);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 0, 0));
		panel.setForeground(new Color(30, 144, 255));
		panel.setBorder(new LineBorder(new Color(255, 255, 255), 3, true));
		panel.setBounds(10, 101, 885, 364);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		 
		JLabel lblChickenBurger = new JLabel("ZINGER BURGER");
		lblChickenBurger.setForeground(new Color(255, 255, 255));
		lblChickenBurger.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblChickenBurger.setBounds(10, 12, 216, 33);
		panel.add(lblChickenBurger);
		
		JLabel lblBeefBurger = new JLabel("BEEF CHEESE BURGER");
		lblBeefBurger.setForeground(new Color(255, 255, 255));
		lblBeefBurger.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblBeefBurger.setBounds(406, 12, 260, 33);
		panel.add(lblBeefBurger);
		
		JLabel lblChicmayoosub = new JLabel("CHIC MAYOO SUB");
		lblChicmayoosub.setForeground(new Color(255, 255, 240));
		lblChicmayoosub .setFont(new Font("Tahoma", Font.BOLD, 22));
		lblChicmayoosub .setBounds(10, 69, 216, 33);
		panel.add(lblChicmayoosub );
		
		textFieldzinger = new JTextField();
		textFieldzinger.setFont(new Font("Tahoma", Font.BOLD, 24));
		textFieldzinger.setBounds(236, 11, 160, 33);
		panel.add(textFieldzinger);
		textFieldzinger.setColumns(10);
		
		textFieldbeefcheeseburger = new JTextField();
		textFieldbeefcheeseburger.setFont(new Font("Tahoma", Font.BOLD, 24));
		textFieldbeefcheeseburger.setColumns(10);
		textFieldbeefcheeseburger.setBounds(714, 11, 160, 33);
		panel.add(textFieldbeefcheeseburger);
		
		txtChicMayooSub = new JTextField();
		txtChicMayooSub.setFont(new Font("Tahoma", Font.BOLD, 24));
		txtChicMayooSub.setColumns(10);
		txtChicMayooSub.setBounds(236, 68, 160, 33);
		panel.add(txtChicMayooSub);
		
		JComboBox comboBoxDrink = new JComboBox();
		comboBoxDrink.setFont(new Font("Tahoma", Font.ITALIC, 15));
		comboBoxDrink.setModel(new DefaultComboBoxModel(new String[] {"SELECT A DRINK:", "COCACOLA", "PEPSI", "PAKOLA", "FANTA", "MIRANDA", "SPRIT", "7UP", "", "SELECT TEA:", "DOOD PATTI", "COLD COFFE", "ELACHI TEA", "LONG TEA", "PESHAWARI TEA", "COFFEE", "HOT CHOCOLATE", "CAPPACINO"}));
		comboBoxDrink.setBounds(714, 72, 160, 33);
		panel.add(comboBoxDrink);
		
		JLabel lblDrink = new JLabel("DRINKS");
		lblDrink.setForeground(new Color(255, 255, 255));
		lblDrink.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblDrink.setBounds(402, 69, 103, 33);
		panel.add(lblDrink);
		
		JLabel lblChickenBroast = new JLabel("CHICKEN BROAST");
		lblChickenBroast.setForeground(new Color(255, 255, 240));
		lblChickenBroast.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblChickenBroast.setBounds(10, 128, 216, 33);
		panel.add(lblChickenBroast);
		
		textFieldbroast = new JTextField();
		textFieldbroast.setFont(new Font("Tahoma", Font.BOLD, 24));
		textFieldbroast.setColumns(10);
		textFieldbroast.setBounds(236, 127, 160, 33);
		panel.add(textFieldbroast); 
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(10, 248, 864, 12);
		panel.add(separator_1);
		
		JLabel lblMayooBroast = new JLabel("MAYOO BROAST");
		lblMayooBroast.setForeground(new Color(255, 255, 255));
		lblMayooBroast.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblMayooBroast.setBounds(10, 186, 203, 33);
		panel.add(lblMayooBroast);
		
		textFieldmayoobroast = new JTextField();
		textFieldmayoobroast.setFont(new Font("Tahoma", Font.BOLD, 24));
		textFieldmayoobroast.setColumns(10);
		textFieldmayoobroast.setBounds(236, 185, 160, 33);
		panel.add(textFieldmayoobroast);
		
		textFieldTotal = new JTextField();
		textFieldTotal.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldTotal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
			}
		});
		textFieldTotal.setFont(new Font("Tahoma", Font.BOLD, 24));
		textFieldTotal.setColumns(10);
		textFieldTotal.setBounds(328, 316, 236, 33);
		panel.add(textFieldTotal);
		
		JButton btnTotal = new JButton("TOTAL");
		btnTotal.setBounds(390, 267, 115, 38);
		panel.add(btnTotal);
		btnTotal.setBackground(new Color(255, 255, 255));
		btnTotal.setForeground(Color.BLUE);
		btnTotal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				//for Zinger Burger//
				double ZingerBurger = Double.parseDouble(textFieldzinger.getText());
				double iZingerBurger = 250;
				double Burger;
				
				Burger = (ZingerBurger * iZingerBurger);
				String zBurger = String.format("% 2f", Burger);
				textFieldTotal.setText(zBurger);
				
				//for Beef Cheese Burger//
				double BeefCheeseBurger = Double.parseDouble(textFieldbeefcheeseburger.getText());
				double iBeefCheeseBurger = 200;
				double BeefBurger;
				
				BeefBurger = (BeefCheeseBurger * iBeefCheeseBurger);
				String bcBurger = String.format("% 2f", BeefBurger + Burger);
				textFieldTotal.setText(bcBurger);
				
				//for Chic Mayoo Sub//
				double ChicMayooSub = Double.parseDouble(txtChicMayooSub.getText());
				double iChicMayooSub = 200;
				double MayooSub;
				
				MayooSub = (ChicMayooSub * iChicMayooSub);
				String cmSub = String.format("% 2f",MayooSub + BeefBurger + Burger);
				textFieldTotal.setText(cmSub);
				
				//for Chicken Broast//
				double ChickenBroast = Double.parseDouble(textFieldbroast.getText());
				double iChickenBroast = 200;
				double Broast;
				
				Broast = (ChickenBroast * iChickenBroast);
				String cBroast = String.format("% 2f",Broast + MayooSub + BeefBurger + Burger);
				textFieldTotal.setText(cBroast);
				
				//for Mayoo Broast//
				double MayooBroast = Double.parseDouble(textFieldmayoobroast.getText());
				double iMayooBroast = 200;
				double MBroast;
				
				MBroast = (MayooBroast * iMayooBroast);
				String mBroast = String.format("% 2f",MBroast + Broast + MayooSub + BeefBurger + Burger);
				textFieldTotal.setText(mBroast);
				
			
	
			}
		});
		btnTotal.setFont(new Font("Tahoma", Font.BOLD, 20));
		
		JLabel lblThankyouForYour = new JLabel("ThankYou For Your Order.");
		lblThankyouForYour.setForeground(new Color(255, 255, 255));
		lblThankyouForYour.setFont(new Font("Malgun Gothic Semilight", Font.ITALIC, 18));
		lblThankyouForYour.setBounds(10, 308, 272, 45);
		panel.add(lblThankyouForYour);
		
		JLabel lblNewLabel = new JLabel("THE FLAVOR RESTAURANT");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Copperplate Gothic Light", Font.BOLD, 52));
		lblNewLabel.setBounds(263, 10, 818, 43);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_2 = new JLabel("We Serve You The Best.");
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setFont(new Font("Tahoma", Font.ITALIC, 28));
		lblNewLabel_2.setBounds(476, 57, 329, 33);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblContactUs = new JLabel("Contact Us: 03362605818 ");
		lblContactUs.setForeground(new Color(255, 255, 240));
		lblContactUs.setBounds(1118, 474, 216, 33);
		frame.getContentPane().add(lblContactUs);
		lblContactUs.setFont(new Font("Malgun Gothic Semilight", Font.ITALIC, 18));
		
		JLabel lblEmailTheflavourrestgmailcom = new JLabel("Email@: TheFlavourRest123@gmail.com ");
		lblEmailTheflavourrestgmailcom.setForeground(new Color(255, 255, 240));
		lblEmailTheflavourrestgmailcom.setBounds(10, 474, 319, 33);
		frame.getContentPane().add(lblEmailTheflavourrestgmailcom);
		lblEmailTheflavourrestgmailcom.setFont(new Font("Malgun Gothic Semilight", Font.ITALIC, 18));
		
		JLabel label = new JLabel("20 - 30 Minutes for Home Delivery");
		label.setBounds(491, 468, 286, 45);
		frame.getContentPane().add(label);
		label.setForeground(new Color(255, 255, 255));
		label.setFont(new Font("Malgun Gothic Semilight", Font.ITALIC, 18));
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(1148, 10, 176, 120);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setBounds(0, 0, 176, 120);
		panel_1.add(lblNewLabel_1);
		lblNewLabel_1.setIcon(new ImageIcon(Resturants.class.getResource("/Resturant_S/MB.jpg")));
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(905, 141, 419, 324);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JLabel label_1 = new JLabel("New label");
		label_1.setIcon(new ImageIcon(Resturants.class.getResource("/Resturant_S/CS.jpg")));
		label_1.setBounds(0, 0, 419, 324);
		panel_2.add(label_1);
	}
}
 