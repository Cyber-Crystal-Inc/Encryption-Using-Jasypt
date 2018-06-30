import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;import java.net.URL;
import java.awt.Color;
import java.awt.Desktop;

import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GUI {

	private JFrame frmCci;
	private Button_Largener BL = new Button_Largener();
	private GUI_Settings Colors = new GUI_Settings();
	private JTextField textFieldKey;
	private JTextField textFieldText;
	private Encryption en = new Encryption();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI window = new GUI();
					window.frmCci.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public GUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCci = new JFrame();
		frmCci.setTitle("CCI ");
		frmCci.setResizable(false);
		frmCci.getContentPane().setBackground(Colors.Backround);
		frmCci.setBounds(100, 100, 450, 300);
		frmCci.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCci.getContentPane().setLayout(null);
		
		
		JLabel icon = new JLabel("");
		icon.setBounds(344, 6, 100, 100);
		
		ImageIcon myimage = new ImageIcon (getClass().getResource("Cyber Crystal Square.jpg"));
		Image img = myimage.getImage();
		Image newImg = img.getScaledInstance(icon.getWidth(), icon.getHeight(), Image.SCALE_SMOOTH);
		ImageIcon image = new ImageIcon(newImg);
		icon.setIcon(image);
		frmCci.getContentPane().add(icon);
		
		JLabel lblKey = new JLabel("Key:");
		lblKey.setForeground(Colors.Info_Text);
		lblKey.setBounds(6, 6, 61, 16);
		frmCci.getContentPane().add(lblKey);
		
		JLabel lblText = new JLabel("Text:");
		lblText.setForeground(Colors.Info_Text);
		lblText.setBounds(6, 34, 61, 16);
		frmCci.getContentPane().add(lblText);
		
		textFieldKey = new JTextField();
		textFieldKey.setBackground(Colors.Text_Backround);
		textFieldKey.setForeground(Colors.Info_Text);
		textFieldKey.setBounds(80, 6, 250, 26);
		frmCci.getContentPane().add(textFieldKey);
		textFieldKey.setColumns(10);
		
		textFieldText = new JTextField();
		textFieldText.setBackground(Colors.Text_Backround);
		textFieldText.setForeground(Colors.Info_Text);
		textFieldText.setBounds(80, 34, 250, 26);
		frmCci.getContentPane().add(textFieldText);
		textFieldText.setColumns(10);
		
		JButton btnEncrypt = new JButton("Encrypt");
		btnEncrypt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					textFieldText.setText(en.encrypt(textFieldKey.getText(), textFieldText.getText()));
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnEncrypt.setOpaque(true);
		btnEncrypt.setBorderPainted(false);
		btnEncrypt.setBackground(Colors.Button_Backround);
		btnEncrypt.setForeground(Colors.Info_Text);
		btnEncrypt.setBounds(80, 72, 117, 29);
		frmCci.getContentPane().add(btnEncrypt);
		btnEncrypt.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				Button_Largener BL = new Button_Largener();
				btnEncrypt.setBounds(BL.Bigger(btnEncrypt.getX(), btnEncrypt.getY(), btnEncrypt.getWidth(), btnEncrypt.getHeight()));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				Button_Largener BL = new Button_Largener();
				btnEncrypt.setBounds(BL.Smaller(btnEncrypt.getX(), btnEncrypt.getY(), btnEncrypt.getWidth(), btnEncrypt.getHeight()));
			}
		});
		
		JButton btnDecrypt = new JButton("Decrypt");
		btnDecrypt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					textFieldText.setText(en.decrypt(textFieldKey.getText(), textFieldText.getText()));
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnDecrypt.setOpaque(true);
		btnDecrypt.setBorderPainted(false);
		btnDecrypt.setBackground(Colors.Button_Backround);
		btnDecrypt.setForeground(Colors.Info_Text);
		btnDecrypt.setBounds(215, 72, 117, 29);
		btnDecrypt.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				Button_Largener BL = new Button_Largener();
				btnDecrypt.setBounds(BL.Bigger(btnDecrypt.getX(), btnDecrypt.getY(), btnDecrypt.getWidth(), btnDecrypt.getHeight()));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				Button_Largener BL = new Button_Largener();
				btnDecrypt.setBounds(BL.Smaller(btnDecrypt.getX(), btnDecrypt.getY(), btnDecrypt.getWidth(), btnDecrypt.getHeight()));
			}
		});
		frmCci.getContentPane().add(btnDecrypt);
		frmCci.setBackground(Colors.Backround);
		
		icon.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				icon.setBounds(BL.Bigger(icon.getX(), icon.getY(), icon.getWidth(),icon.getHeight()));
				
				ImageIcon myimage = new ImageIcon (getClass().getResource("Cyber Crystal Square.jpg"));
				Image img = myimage.getImage();
				Image newImg = img.getScaledInstance(icon.getWidth(), icon.getHeight(), Image.SCALE_SMOOTH);
				ImageIcon image = new ImageIcon(newImg);
				icon.setIcon(image);
				frmCci.getContentPane().add(icon);
				
			}
			@Override
			public void mouseExited(MouseEvent e) {
				Button_Largener BL = new Button_Largener();
				icon.setBounds(BL.Smaller(icon.getX(), icon.getY(), icon.getWidth(), icon.getHeight()));
				
				ImageIcon myimage = new ImageIcon (getClass().getResource("Cyber Crystal Square.jpg"));
				Image img = myimage.getImage();
				Image newImg = img.getScaledInstance(icon.getWidth(), icon.getHeight(), Image.SCALE_SMOOTH);
				ImageIcon image = new ImageIcon(newImg);
				icon.setIcon(image);
				frmCci.getContentPane().add(icon);
				
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				WebpageOpener.open("https://github.com/Cyber-Crystal-Inc");
			}
		});
	}
}