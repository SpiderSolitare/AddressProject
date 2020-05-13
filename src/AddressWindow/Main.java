package AddressWindow;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import org.bukkit.configuration.file.YamlConfiguration;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.File;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Main extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	static File file = new File("config.yml");
	static YamlConfiguration cfg = YamlConfiguration.loadConfiguration(file);
	
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
					Main frame = new Main();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public Main() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 368, 310);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Vorname :");
		lblNewLabel.setBounds(60, 46, 76, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_2 = new JLabel("PLZ :");
		lblNewLabel_2.setBounds(60, 102, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Ort :");
		lblNewLabel_3.setBounds(60, 127, 76, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Stra\u00DFe :");
		lblNewLabel_4.setBounds(60, 152, 46, 14);
		contentPane.add(lblNewLabel_4);
		
		textField = new JTextField();
		textField.setBounds(146, 43, 140, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(146, 71, 140, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(146, 99, 140, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(146, 124, 140, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(146, 149, 140, 20);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Nachname :");
		lblNewLabel_1.setBounds(60, 77, 76, 14);
		contentPane.add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("Speichern");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				getVorname().setText("");
				getNachname().setText("");
				getPLZ().setText("");
				getOrt().setText("");
				getStraﬂe().setText("");
				
			}
		});
		btnNewButton.setBounds(104, 194, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Laden...");
		btnNewButton_1.setBounds(197, 194, 89, 23);
		contentPane.add(btnNewButton_1);
	}
	public JTextField getVorname() {
		return textField;
	}
	public JTextField getNachname() {
		return textField_1;
	}
	public JTextField getPLZ() {
		return textField_2;
	}
	public JTextField getOrt() {
		return textField_3;
	}
	public JTextField getStraﬂe() {
		return textField_4;
	}
}
