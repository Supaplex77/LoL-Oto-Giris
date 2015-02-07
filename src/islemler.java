import static java.awt.event.KeyEvent.VK_0;
import static java.awt.event.KeyEvent.VK_1;
import static java.awt.event.KeyEvent.VK_2;
import static java.awt.event.KeyEvent.VK_3;
import static java.awt.event.KeyEvent.VK_4;
import static java.awt.event.KeyEvent.VK_5;
import static java.awt.event.KeyEvent.VK_6;
import static java.awt.event.KeyEvent.VK_7;
import static java.awt.event.KeyEvent.VK_8;
import static java.awt.event.KeyEvent.VK_9;
import static java.awt.event.KeyEvent.VK_A;
import static java.awt.event.KeyEvent.VK_AMPERSAND;
import static java.awt.event.KeyEvent.VK_ASTERISK;
import static java.awt.event.KeyEvent.VK_AT;
import static java.awt.event.KeyEvent.VK_B;
import static java.awt.event.KeyEvent.VK_BACK_QUOTE;
import static java.awt.event.KeyEvent.VK_BACK_SLASH;
import static java.awt.event.KeyEvent.VK_C;
import static java.awt.event.KeyEvent.VK_CIRCUMFLEX;
import static java.awt.event.KeyEvent.VK_CLOSE_BRACKET;
import static java.awt.event.KeyEvent.VK_COLON;
import static java.awt.event.KeyEvent.VK_COMMA;
import static java.awt.event.KeyEvent.VK_D;
import static java.awt.event.KeyEvent.VK_DOLLAR;
import static java.awt.event.KeyEvent.VK_E;
import static java.awt.event.KeyEvent.VK_ENTER;
import static java.awt.event.KeyEvent.VK_EQUALS;
import static java.awt.event.KeyEvent.VK_EXCLAMATION_MARK;
import static java.awt.event.KeyEvent.VK_F;
import static java.awt.event.KeyEvent.VK_G;
import static java.awt.event.KeyEvent.VK_H;
import static java.awt.event.KeyEvent.VK_I;
import static java.awt.event.KeyEvent.VK_J;
import static java.awt.event.KeyEvent.VK_K;
import static java.awt.event.KeyEvent.VK_L;
import static java.awt.event.KeyEvent.VK_LEFT_PARENTHESIS;
import static java.awt.event.KeyEvent.VK_M;
import static java.awt.event.KeyEvent.VK_MINUS;
import static java.awt.event.KeyEvent.VK_N;
import static java.awt.event.KeyEvent.VK_NUMBER_SIGN;
import static java.awt.event.KeyEvent.VK_NUMPAD0;
import static java.awt.event.KeyEvent.VK_NUMPAD1;
import static java.awt.event.KeyEvent.VK_NUMPAD2;
import static java.awt.event.KeyEvent.VK_NUMPAD3;
import static java.awt.event.KeyEvent.VK_NUMPAD4;
import static java.awt.event.KeyEvent.VK_NUMPAD5;
import static java.awt.event.KeyEvent.VK_NUMPAD6;
import static java.awt.event.KeyEvent.VK_NUMPAD7;
import static java.awt.event.KeyEvent.VK_NUMPAD8;
import static java.awt.event.KeyEvent.VK_NUMPAD9;
import static java.awt.event.KeyEvent.VK_O;
import static java.awt.event.KeyEvent.VK_OPEN_BRACKET;
import static java.awt.event.KeyEvent.VK_P;
import static java.awt.event.KeyEvent.VK_PERIOD;
import static java.awt.event.KeyEvent.VK_PLUS;
import static java.awt.event.KeyEvent.VK_Q;
import static java.awt.event.KeyEvent.VK_QUOTE;
import static java.awt.event.KeyEvent.VK_QUOTEDBL;
import static java.awt.event.KeyEvent.VK_R;
import static java.awt.event.KeyEvent.VK_RIGHT_PARENTHESIS;
import static java.awt.event.KeyEvent.VK_S;
import static java.awt.event.KeyEvent.VK_SEMICOLON;
import static java.awt.event.KeyEvent.VK_SHIFT;
import static java.awt.event.KeyEvent.VK_SLASH;
import static java.awt.event.KeyEvent.VK_SPACE;
import static java.awt.event.KeyEvent.VK_T;
import static java.awt.event.KeyEvent.VK_TAB;
import static java.awt.event.KeyEvent.VK_U;
import static java.awt.event.KeyEvent.VK_UNDERSCORE;
import static java.awt.event.KeyEvent.VK_V;
import static java.awt.event.KeyEvent.VK_W;
import static java.awt.event.KeyEvent.VK_X;
import static java.awt.event.KeyEvent.VK_Y;
import static java.awt.event.KeyEvent.VK_Z;
import static java.awt.event.KeyEvent.VK_ALT;

import java.awt.AWTException;
import java.awt.Color;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

import javax.swing.JCheckBox;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.filechooser.FileNameExtensionFilter;


public class islemler {
	
	public void type(Robot rb, char character){
		switch (character) {
        case 'a': doType(rb, VK_A); break;
        case 'b': doType(rb, VK_B); break;
        case 'c': doType(rb, VK_C); break;
        case 'ç': doType(rb, VK_ALT, VK_NUMPAD1, VK_NUMPAD3, VK_NUMPAD5);break;
        case 'd': doType(rb, VK_D); break;
        case 'e': doType(rb, VK_E); break;
        case 'f': doType(rb, VK_F); break;
        case 'g': doType(rb, VK_G); break;
        case 'ð': doType(rb, VK_ALT, VK_NUMPAD1, VK_NUMPAD6, VK_NUMPAD7); break;
        case 'h': doType(rb, VK_H); break;
        case 'ý': doType(rb, VK_ALT, VK_NUMPAD1, VK_NUMPAD4, VK_NUMPAD1); break;
        case 'i': doType(rb, VK_ALT, VK_NUMPAD1, VK_NUMPAD0, VK_NUMPAD5); break;
        case 'j': doType(rb, VK_J); break;
        case 'k': doType(rb, VK_K); break;
        case 'l': doType(rb, VK_L); break;
        case 'm': doType(rb, VK_M); break;
        case 'n': doType(rb, VK_N); break;
        case 'o': doType(rb, VK_O); break;
        case 'ö': doType(rb, VK_ALT, VK_NUMPAD1, VK_NUMPAD4, VK_NUMPAD8); break;
        case 'p': doType(rb, VK_P); break;
        case 'q': doType(rb, VK_Q); break;
        case 'r': doType(rb, VK_R); break;
        case 's': doType(rb, VK_S); break;
        case 'þ': doType(rb, VK_ALT, VK_NUMPAD1, VK_NUMPAD5, VK_NUMPAD9); break;
        case 't': doType(rb, VK_T); break;
        case 'u': doType(rb, VK_U); break;
        case 'ü': doType(rb, VK_ALT, VK_NUMPAD1, VK_NUMPAD2, VK_NUMPAD9); break;
        case 'v': doType(rb, VK_V); break;
        case 'w': doType(rb, VK_W); break;
        case 'x': doType(rb, VK_X); break;
        case 'y': doType(rb, VK_Y); break;
        case 'z': doType(rb, VK_Z); break;
        case 'A': doType(rb, VK_SHIFT, VK_A); break;
        case 'B': doType(rb, VK_SHIFT, VK_B); break;
        case 'C': doType(rb, VK_SHIFT, VK_C); break;
        case 'Ç': doType(rb, VK_ALT, VK_NUMPAD1, VK_NUMPAD2, VK_NUMPAD8); break;
        case 'D': doType(rb, VK_SHIFT, VK_D); break;
        case 'E': doType(rb, VK_SHIFT, VK_E); break;
        case 'F': doType(rb, VK_SHIFT, VK_F); break;
        case 'G': doType(rb, VK_SHIFT, VK_G); break;
        case 'Ð': doType(rb, VK_ALT, VK_NUMPAD1, VK_NUMPAD6, VK_NUMPAD6); break;
        case 'H': doType(rb, VK_SHIFT, VK_H); break;
        case 'I': doType(rb, VK_SHIFT, VK_I); break;
        case 'Ý': doType(rb, VK_ALT, VK_NUMPAD1, VK_NUMPAD5, VK_NUMPAD2); break;
        case 'J': doType(rb, VK_SHIFT, VK_J); break;
        case 'K': doType(rb, VK_SHIFT, VK_K); break;
        case 'L': doType(rb, VK_SHIFT, VK_L); break;
        case 'M': doType(rb, VK_SHIFT, VK_M); break;
        case 'N': doType(rb, VK_SHIFT, VK_N); break;
        case 'O': doType(rb, VK_SHIFT, VK_O); break;
        case 'Ö': doType(rb, VK_ALT, VK_NUMPAD1, VK_NUMPAD5, VK_NUMPAD3); break;
        case 'P': doType(rb, VK_SHIFT, VK_P); break;
        case 'Q': doType(rb, VK_SHIFT, VK_Q); break;
        case 'R': doType(rb, VK_SHIFT, VK_R); break;
        case 'S': doType(rb, VK_SHIFT, VK_S); break;
        case 'Þ': doType(rb, VK_ALT, VK_NUMPAD1, VK_NUMPAD5, VK_NUMPAD8); break;
        case 'T': doType(rb, VK_SHIFT, VK_T); break;
        case 'U': doType(rb, VK_SHIFT, VK_U); break;
        case 'Ü': doType(rb, VK_ALT, VK_NUMPAD1, VK_NUMPAD5, VK_NUMPAD4); break;
        case 'V': doType(rb, VK_SHIFT, VK_V); break;
        case 'W': doType(rb, VK_SHIFT, VK_W); break;
        case 'X': doType(rb, VK_SHIFT, VK_X); break;
        case 'Y': doType(rb, VK_SHIFT, VK_Y); break;
        case 'Z': doType(rb, VK_SHIFT, VK_Z); break;
        case '`': doType(rb, VK_BACK_QUOTE); break;
        case '0': doType(rb, VK_0); break;
        case '1': doType(rb, VK_1); break;
        case '2': doType(rb, VK_2); break;
        case '3': doType(rb, VK_3); break;
        case '4': doType(rb, VK_4); break;
        case '5': doType(rb, VK_5); break;
        case '6': doType(rb, VK_6); break;
        case '7': doType(rb, VK_7); break;
        case '8': doType(rb, VK_8); break;
        case '9': doType(rb, VK_9); break;
        case '-': doType(rb, VK_MINUS); break;
        case '=': doType(rb, VK_EQUALS); break;
        case '~': doType(rb, VK_SHIFT, VK_BACK_QUOTE); break;
        case '!': doType(rb, VK_EXCLAMATION_MARK); break;
        case '@': doType(rb, VK_AT); break;
        case '#': doType(rb, VK_NUMBER_SIGN); break;
        case '$': doType(rb, VK_DOLLAR); break;
        case '%': doType(rb, VK_SHIFT, VK_5); break;
        case '^': doType(rb, VK_CIRCUMFLEX); break;
        case '&': doType(rb, VK_AMPERSAND); break;
        case '*': doType(rb, VK_ASTERISK); break;
        case '(': doType(rb, VK_LEFT_PARENTHESIS); break;
        case ')': doType(rb, VK_RIGHT_PARENTHESIS); break;
        case '_': doType(rb, VK_SHIFT, VK_MINUS); break;
        case '+': doType(rb, VK_PLUS); break;
        case '\t': doType(rb, VK_TAB); break;
        case '\n': doType(rb, VK_ENTER); break;
        case '[': doType(rb, VK_OPEN_BRACKET); break;
        case ']': doType(rb, VK_CLOSE_BRACKET); break;
        case '\\': doType(rb, VK_BACK_SLASH); break;
        case '{': doType(rb, VK_SHIFT, VK_OPEN_BRACKET); break;
        case '}': doType(rb, VK_SHIFT, VK_CLOSE_BRACKET); break;
        case '|': doType(rb, VK_SHIFT, VK_BACK_SLASH); break;
        case ';': doType(rb, VK_SEMICOLON); break;
        case ':': doType(rb, VK_COLON); break;
        case '\'': doType(rb, VK_QUOTE); break;
        case '"': doType(rb, VK_QUOTEDBL); break;
        case ',': doType(rb, VK_COMMA); break;
        case '<': doType(rb, VK_SHIFT, VK_COMMA); break;
        case '.': doType(rb, VK_PERIOD); break;
        case '>': doType(rb, VK_SHIFT, VK_PERIOD); break;
        case '/': doType(rb, VK_SLASH); break;
        case '?': doType(rb, VK_SHIFT, VK_SLASH); break;
        case ' ': doType(rb, VK_SPACE); break;
        default:
            throw new IllegalArgumentException("Cannot type character " + character);
        }
    }
	
	private void doType(Robot rb, int keycode){
		rb.keyPress(keycode);
		rb.keyRelease(keycode);
	}
	private void doType(Robot rb, int key1, int key2){
		rb.keyPress(key1);
		rb.keyPress(key2);
		rb.keyRelease(key2);
		rb.keyRelease(key1);
	}
	private void doType(Robot rb, int alt, int key1, int key2, int key3){
		rb.keyPress(alt);
		rb.keyPress(key1);rb.keyRelease(key1);
		rb.keyPress(key2);rb.keyRelease(key2);
		rb.keyPress(key3);rb.keyRelease(key3);
		rb.keyRelease(alt);
	}
	
	public String getpath(JTextField pathtext) {
		try {UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());} 
	    catch (UnsupportedLookAndFeelException e) {}
	    catch (ClassNotFoundException e) {}
	    catch (InstantiationException e) {}
	    catch (IllegalAccessException e) {}
		
        JFileChooser fileChooser = new JFileChooser(System.getProperty("user.home")+ "/../../../../..");
        FileNameExtensionFilter filter = new FileNameExtensionFilter("LOL Launcher File: "+"lol.launcher.exe", "exe");
        fileChooser.setFileFilter(filter);
        fileChooser.setDialogTitle("lol.launcher.exe " + " dosyasýný seçin");
        int returnValue = fileChooser.showOpenDialog(null);
        if (returnValue == JFileChooser.APPROVE_OPTION) {
          File selectedFile = fileChooser.getSelectedFile();
          if(selectedFile.getName().equals("lol.launcher.exe")){
        	  pathtext.setText(selectedFile.getAbsolutePath());
        	  return selectedFile.getAbsolutePath();
          }
          else{
        	  pathtext.setText("Yanlýþ Dosya!");
        	  return "Yanlýþ Dosya!";
          }
        }
        pathtext.setText("");
        return "";
	}
	
	public int clickOyna(Data userdata){
		Color ic1 = null, ic2 = null, ic3=null, ic4=null, dis1=null, dis2=null, l1=null, l2 = null, l3 = null, l4 = null;
		Robot rbt;
		int i, x1 = 0,x2 = 0,x3 = 0, x4=0 ,xd1 = 0,xd2 = 0, y = 0;
		int a=0, b1 = 0, b2=0, b3=0, b4=0;
		int mp = 1;
		if(userdata.yavasmod) mp = 10;
		
		try {
			rbt = new Robot();
			if(userdata.resolution.equals("1366 x 768")){
				x1 = 670; x2 = 680; x3 = 690; x4 = 1070; xd1 = 600; xd2 = 760; y = 95;
				a = 450; b1 = 300; b2 = 350; b3 = 520; b4 = 390; 
			}
			else if(userdata.resolution.equals("1920 x 1080")){
				x1 =950; x2 = 960; x3 =970; x4 =1480; xd1 = 870; xd2 = 1050; y = 163;
				a = 700; b1 =450; b2 = 510; b3 = 690; b4 = 547; 
			}
			else if(userdata.resolution.equals("1024 x 768")){
				x1 = 500; x2 = 510; x3 = 520; x4 = 915; xd1 = 450; xd2 = 575; y = 90;
				a = 306; b1 = 305; b2 = 355; b3 = 505; b4 = 383; 
			}
			else if(userdata.resolution.equals("1440 x 900")){
				x1 = 710; x2 = 720; x3 = 730; x4 = 1240; xd1 = 640; xd2 = 800; y = 70;
				a = 462; b1 = 360; b2 = 420; b3 = 605; b4 = 453;
			}
			else if(userdata.resolution.equals("1280 x 1024")){
				x1 = 630; x2 = 640; x3 = 650; x4 = 1035; xd1 = 570; xd2 = 705; y = 220;
				a = 382; b1 = 415; b2 = 480; b3 = 665; b4 = 515;
			}
			else
				return -3;
			rbt.delay(1000);
			for(i = 0; i < 120; i++){
				rbt.delay(250);
				ic1 = rbt.getPixelColor(x1, y);
				ic2 = rbt.getPixelColor(x2, y);
				ic3 = rbt.getPixelColor(x3, y);
				ic4 = rbt.getPixelColor(x4, y);
				dis1 = rbt.getPixelColor(xd1, y);
				dis2 = rbt.getPixelColor(xd2, y);
				if(ic1.getBlue() < 25 && ic1.getBlue() > 7 && ic2.getBlue() < 25 && ic2.getBlue() > 7 && ic3.getBlue() < 25 && ic3.getBlue() > 7 && dis1.getRed() < 4 && dis1.getBlue() + dis1.getGreen() < 100 && dis2.getRed() < 4 && dis2.getBlue() + dis2.getGreen() < 100 && ic4.getBlue()+ic4.getGreen()+ic4.getRed() < 10)
					break;
			}
			if(i >=119)
				return -2;
			
			rbt.mouseMove(x2, y);
			rbt.delay(50*mp);
			rbt.mousePress(InputEvent.BUTTON1_MASK);
			rbt.delay(25);
			rbt.mouseRelease(InputEvent.BUTTON1_MASK);
			rbt.delay(500);
			for(i = 0; i < 80; i++){
				l1 = rbt.getPixelColor(a, b1);
				l2 = rbt.getPixelColor(a, b2);
				l3 = rbt.getPixelColor(a, b3);
				l4 = rbt.getPixelColor(a, b4);
				if(l1.getBlue()+l1.getGreen()+l1.getRed() > 705 && l2.getBlue()+l2.getGreen()+l2.getRed() > 705 && l3.getBlue()+l3.getGreen()+l3.getRed() < 60 && l4.getBlue() == l4.getGreen() && l4.getGreen() == l4.getRed() && l4.getRed() + l4.getBlue() + l4.getGreen() > 180)
					break;
				rbt.delay(230 + 20*mp);
			}
			if(i >=79)
				return -1;
			Toolkit.getDefaultToolkit().setLockingKeyState(KeyEvent.VK_CAPS_LOCK, false);
			if(!userdata.hatirla){
				rbt.delay(230 + 20*mp);
				rbt.mouseMove(a, b1);
				rbt.delay(50*mp);
				rbt.mousePress(InputEvent.BUTTON1_MASK);
				rbt.delay(10*mp);
				rbt.mouseRelease(InputEvent.BUTTON1_MASK);
				rbt.delay(50);
				char isim[] = userdata.id.toCharArray();
				for(int j = 0; j < isim.length; j++){
					type(rbt, isim[j]);
					rbt.delay(20*mp);
				}
			}
			rbt.delay(100);
			rbt.mouseMove(a, b2);
			rbt.mousePress(InputEvent.BUTTON1_MASK);
			rbt.delay(10*mp);
			rbt.mouseRelease(InputEvent.BUTTON1_MASK);
			rbt.delay(10+10*mp);
			char [] pass = userdata.pass.toCharArray();
			for(int j = 0; j < pass.length; j++){
				type(rbt, pass[j]);
				rbt.delay(30*mp);
			}
			rbt.delay(200+20*mp);
			rbt.keyPress(KeyEvent.VK_ENTER);
			rbt.keyRelease(KeyEvent.VK_ENTER);
			rbt.delay(250);
			return 1;
		} 
		catch (AWTException e) {
			e.printStackTrace();
			return 0;
		}
	}

	protected String crypt(String pword){
		Random r = new Random();
		int multip = 17;
	    String alphabet = "abcdefghijklmnopqrstuwxyzABCDEFGHIJKLMNOPQRSTUWXYZ";
	    
		char arr[] = pword.toCharArray();
		String a = "";
		for(int i=0; i< arr.length; i++){
			a += (((int)arr[i]*multip) + 32);
			a+= alphabet.charAt(r.nextInt(alphabet.length()));
			multip++;
		}
		return a;
	}
	protected String decrypt(String crypted){
		String a = "";
		int multip = 17;
		String[] arr = crypted.split("[a-zA-Z]");
		for(int i=0; i < arr.length; i++)
		{
			try{
				a+=(char)((Integer.parseInt(arr[i])-32)/multip);
				multip++;
			}catch(RuntimeException e3){return "";}
		}	
		return a;
	}

	protected boolean writetofile(Data userdata){
		try{
			File file = new File(System.getProperty("user.home")+"\\.lollog\\prpts.dat");
			file.getParentFile().mkdirs();
			if(file.exists())
				file.delete();
			FileWriter writer = new FileWriter(file);
			PrintWriter pw = new PrintWriter(writer);
			if(userdata.dizin == " " || userdata.dizin == null || userdata.dizin == "Yanlýþ Dosya!" || userdata.dizin == "")
				pw.println();
			else
				pw.println(crypt(userdata.dizin));
			pw.println(crypt(userdata.id));
			pw.println(crypt(userdata.pass));
			if(userdata.hatirla)
				pw.println(crypt("true"));
			else
				pw.println(crypt("false"));
			pw.println(crypt(userdata.resolution));
			if(userdata.yavasmod)
				pw.println(crypt("true"));
			else
				pw.println(crypt("false"));
			for(int i = 0; i < 30; i++)
				pw.println();
			pw.close();	
			return true;
		}catch(IOException e21){
			return false;
		}	
	}
	
	protected boolean readfromfile(Data userdata){
		File file = new File(System.getProperty("user.home")+"\\.lollog\\prpts.dat");
		if(!file.exists())
			return false;
		try{
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
			userdata.dizin = decrypt(br.readLine());
			userdata.id = decrypt(br.readLine());
			userdata.pass = decrypt(br.readLine());
			String chck = decrypt(br.readLine());
			if(chck.equals("true"))
				userdata.hatirla = true;
			else
				userdata.hatirla = false;
			userdata.resolution = decrypt(br.readLine());
			chck = decrypt(br.readLine());
			if(chck.equals("true"))
				userdata.yavasmod = true;
			else
				userdata.yavasmod = false;
			br.close();
		}catch(Exception e342){
			return false;
		}
		return true;
	}
	
	protected int rundirect(Data userdata){
		if(!openexe(userdata))
			return -4;
		return clickOyna(userdata);
	}//end of rundirect
	
	protected boolean openexe(Data data){
		
		try {
			String[] cmdArray = new String[]{data.dizin, "cmd.exe"};
			Runtime.getRuntime().exec(cmdArray);
			return true;
            //Process p = Runtime.getRuntime().exec(userdata.dizin);
        } catch (IOException e1) {
            return false;
        }
	}
	protected void getprops(Data userdata, String path, String id, String pass, boolean hatirla, String resolution, boolean yavasmod){
		userdata.dizin = path;
		userdata.id = id;
		userdata.pass = pass;
		userdata.hatirla = hatirla;
		userdata.resolution = resolution;
		userdata.yavasmod = yavasmod;
	}
	
	protected void guiprint(Data userdata, JTextField path, JTextField id, JPasswordField pass, JCheckBox hatirla, JComboBox resolution, JCheckBoxMenuItem yavasmod){
		path.setText(userdata.dizin);
		id.setText(userdata.id);
		pass.setText(userdata.pass);
		hatirla.setSelected(userdata.hatirla);
		resolution.setSelectedItem(userdata.resolution);
		yavasmod.setSelected(userdata.yavasmod);
	}
}//end class
