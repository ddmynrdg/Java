package pane.com;

import javax.swing.JOptionPane;

public class JOption1 {


	public static void main(String[] args) {
		String girilen = JOptionPane.showInputDialog("bir ddeger gir:");
		int sayi = Integer.parseInt(girilen);
		sayi *= 5;
		JOptionPane.showMessageDialog(null, sayi, "sonuc", JOptionPane.ERROR_MESSAGE);

	}

}
