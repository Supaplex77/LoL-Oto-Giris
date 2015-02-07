import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.swing.JButton;
import javax.swing.JFrame;


import javax.swing.JTextField;

import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.SwingConstants;

import java.awt.SystemColor;
import java.awt.Color;

import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JComboBox;
import javax.swing.JCheckBox;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JCheckBoxMenuItem;


public class LOL_Enter {
	Data userdata = new Data();
	private islemler islem = new islemler();
	private JFrame frame;
	private JTextField pathTextField;
	protected JTextField userTextField;
	private JPasswordField passwordTextField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LOL_Enter window = new LOL_Enter();
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
	public LOL_Enter() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		boolean readtxt = islem.readfromfile(userdata);
		int ago = 111;//aninda giris ozelligi
		File file = new File("OtoGir.dat");
		if(file.exists() && readtxt){
			ago = islem.rundirect(userdata);
			if(ago == 1)
				System.exit(1);
		}
		frame = new JFrame();
		frame.getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 11));
		frame.setTitle("Fdr - LOL Auto Enter v 0.9.7 Beta");
		frame.setResizable(false);
		frame.setBounds(100, 100, 550, 430);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		pathTextField = new JTextField();
		pathTextField.setFont(new Font("Comic Sans MS", Font.PLAIN, 12));
		pathTextField.setEditable(false);
		pathTextField.setBounds(150, 21, 384, 24);
		frame.getContentPane().add(pathTextField);
		pathTextField.setColumns(10);
		pathTextField.setText("<- L\u00FCtfen lol.launcher.exe dizinini se\u00E7in.");
		
		JButton pathbutton = new JButton("Path Se\u00E7");
		pathbutton.setBackground(new Color(143, 188, 143));
		pathbutton.setFont(new Font("Comic Sans MS", Font.BOLD, 13));
		pathbutton.setBounds(10, 21, 120, 23);
		frame.getContentPane().add(pathbutton);
		
		JLabel UserLabel = new JLabel("Kullan\u0131c\u0131 Ad\u0131");
		UserLabel.setForeground(SystemColor.textHighlight);
		UserLabel.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		UserLabel.setHorizontalAlignment(SwingConstants.CENTER);
		UserLabel.setBounds(10, 65, 120, 24);
		frame.getContentPane().add(UserLabel);
		
		JLabel PassLabel = new JLabel("\u015Eifre");
		PassLabel.setForeground(SystemColor.textHighlight);
		PassLabel.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		PassLabel.setHorizontalAlignment(SwingConstants.CENTER);
		PassLabel.setBounds(10, 100, 120, 24);
		frame.getContentPane().add(PassLabel);
		
		userTextField = new JTextField();
		userTextField.setBounds(150, 67, 170, 22);
		frame.getContentPane().add(userTextField);
		userTextField.setColumns(10);
		
		passwordTextField = new JPasswordField();
		passwordTextField.setBounds(150, 100, 170, 24);
		frame.getContentPane().add(passwordTextField);
		
		final JCheckBox chckbxHatir = new JCheckBox("Kullan\u0131c\u0131 Ad\u0131m Launcher'da hat\u0131rlan\u0131yor. (Bu durumda Kullan\u0131c\u0131 Ad\u0131 b\u00F6l\u00FCm\u00FCn\u00FC bo\u015F b\u0131rakabilirsiniz)");
		chckbxHatir.setFont(new Font("Tahoma", Font.PLAIN, 10));
		chckbxHatir.setBounds(20, 131, 514, 24);
		frame.getContentPane().add(chckbxHatir);
		
		JButton oynaButton = new JButton("OYNA");
		oynaButton.setBackground(new Color(210, 105, 30));
		oynaButton.setForeground(new Color(240, 230, 140));
		oynaButton.setFont(new Font("Times New Roman", Font.BOLD, 38));
		oynaButton.setBounds(10, 240, 310, 74);
		frame.getContentPane().add(oynaButton);
		
		final JComboBox resolComboBox = new JComboBox();
		resolComboBox.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		resolComboBox.setBounds(150, 162, 170, 24);
		frame.getContentPane().add(resolComboBox);
		resolComboBox.addItem("1024 x 768");
		resolComboBox.addItem("1280 x 1024");
		resolComboBox.addItem("1366 x 768");
		resolComboBox.addItem("1440 x 900");
		resolComboBox.addItem("1920 x 1080");
		
		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("Genel");
		menuBar.add(mnNewMenu);
		
		final JCheckBoxMenuItem menuYavasMod = new JCheckBoxMenuItem("Yava\u015F Modu A\u00E7");
		mnNewMenu.add(menuYavasMod);
		
		final JButton ayarbutton = new JButton("Ayarlar\u0131 Kaydet");
		ayarbutton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseExited(MouseEvent e) {
				ayarbutton.setText("Ayarlar\u0131 Kaydet");
			}
		});
		ayarbutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				islem.getprops(userdata, pathTextField.getText(), userTextField.getText(), passwordTextField.getText(), chckbxHatir.isSelected(), resolComboBox.getSelectedItem().toString(), menuYavasMod.isSelected());
				if(islem.writetofile(userdata))
					ayarbutton.setText("Kaydedildi!");
				else{
					JOptionPane.showMessageDialog(frame, "Hata! Ayarlar kaydedilemedi.");
				}
			}
		});
		ayarbutton.setBackground(new Color(143, 188, 143));
		ayarbutton.setFont(new Font("Comic Sans MS", Font.BOLD, 13));
		ayarbutton.setBounds(376, 240, 158, 74);
		frame.getContentPane().add(ayarbutton);
		
		JLabel lblNewLabel = new JLabel("Ekran \u00C7\u00F6z\u00FCn\u00FCrl\u00FC\u011F\u00FC");
		lblNewLabel.setForeground(SystemColor.textHighlight);
		lblNewLabel.setFont(new Font("Comic Sans MS", Font.BOLD, 13));
		lblNewLabel.setBounds(10, 162, 120, 23);
		frame.getContentPane().add(lblNewLabel);
		

		

		
		if(readtxt){
			islem.guiprint(userdata, pathTextField, userTextField, passwordTextField, chckbxHatir, resolComboBox, menuYavasMod);
		}
		
		JButton otogirisButton = new JButton("Bu Pencere A\u00E7\u0131lmadan LOL'e Anýnda Giri\u015F Yap (T\u0131klay\u0131p A\u00E7\u0131klamay\u0131 Okuyun!)");
		otogirisButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int cevap = JOptionPane.showConfirmDialog(frame, "Dikkat !\n--- Öncelikle Ayarlarýnýzý Düzgün Yapýnýz ---\nAnýnda Giriþ Özelliði'ni açarsanýz, ayarlar penceresinin açýlmasýna gerek kalmadan League of Legends oyununa otomatik giriþ yapabileceksiniz.\n--- Program, kendi exe dosyasý ile ayný dizinde \"OtoGiris.dat\" adlý dosya oluþturacak.\nFakat olur da bir aksilik olursa, ya da ayarlarý tekrar deðiþtirmek isterseniz:\n--- \"OtoGiris.dat\" dosyasýný bilgisayarýnýzdan silin ---\nDosyayý sildikten sonra ayarlarýnýzý tekrar yapabilir, Anýnda Giriþ Özelliði'ni yeniden aktif edebilirsiniz.\nDEVAM ETMEK ÝSTÝYOR MUSUNUZ ?", "Anýnda Giriþ Özelliði", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
				if(cevap == JOptionPane.NO_OPTION)
					return;
				File file = new File("OtoGir.dat");
				FileWriter writer;
				try {
					writer = new FileWriter(file);
					PrintWriter pw = new PrintWriter(writer);
					pw.println();
					pw.close();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					JOptionPane.showMessageDialog(frame, "OtoGir.dat dosyasý oluþturulamadý");
					return;
				}
				JOptionPane.showMessageDialog(frame, "Anýnda Giriþ Baþarýyla Aktif Edildi! Özelliði kullanmak için programý yeniden açýn.");
			}
		});
		otogirisButton.setBackground(new Color(173, 216, 230));
		otogirisButton.setFont(new Font("Comic Sans MS", Font.BOLD, 13));
		otogirisButton.setBounds(10, 325, 524, 39);
		frame.getContentPane().add(otogirisButton);
		
		pathbutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				userdata.dizin = islem.getpath(pathTextField);
			}
		});
		
		oynaButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(userdata.dizin.equals("Yanlýþ Dosya!") || userdata.dizin.equals("")){
					JOptionPane.showMessageDialog(frame, "Dosya yolu düzgün girilmedi!");
					return;
				}
				if(userdata.pass.equals("") || passwordTextField.getText().equals("")){
					JOptionPane.showMessageDialog(frame, "Þifre kýsmý boþ!");
					return;
				}
				
				islem.openexe(userdata);
				islem.getprops(userdata, pathTextField.getText(), userTextField.getText(), passwordTextField.getText(), chckbxHatir.isSelected(), resolComboBox.getSelectedItem().toString(), menuYavasMod.isSelected());
				int a = islem.clickOyna(userdata);
				if( a == -1){
					JOptionPane.showMessageDialog(frame, "Seçtiðiniz Çözünürlük Ýçin Program Çalýþtýrýlamýyor.");
					return;
				}
				else if(a == -2){
					JOptionPane.showMessageDialog(frame, "LOL Launcher güncelleme yapýyor ya da yanýt vermiyor. Lütfen daha sonra tekrar deneyin.");
					return;
				}
				else if(a == -3){
					JOptionPane.showMessageDialog(frame, "Login ekranýna ulaþýlamýyor, daha sonra tekrar deneyin.");
					return;
				}
				System.exit(1);
			}
		});
		
		if(-5 <= ago && ago <=0 )
			JOptionPane.showMessageDialog(frame, "Hata No ("+ ago +") .");
		
	}
}
