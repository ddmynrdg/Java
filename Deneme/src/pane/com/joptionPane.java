package pane.com;

import javax.swing.JOptionPane;

public class joptionPane {

	public static void main(String[] args) {
		String vize = JOptionPane.showInputDialog(null, "Vize notunuzu girin : ");
		int sayi1 = Integer.parseInt(vize);
		while (sayi1 < 0 || sayi1 > 100 ) {
			vize = JOptionPane.showInputDialog(null, "Vize notunuzu tekrar girin: ");
			sayi1 = Integer.parseInt(vize);
		}
		
		String fnal = JOptionPane.showInputDialog(null, "Final notunuzu girin: ");
		int sayi2 = Integer.parseInt(fnal);
		while (sayi2 <0 || sayi2 >100) {
			fnal = JOptionPane.showInputDialog(null, "Final notunuzu tekrar girin: ");
			sayi2 = Integer.parseInt(fnal);
		}
	    int ort = (int) (sayi1 * 0.4 + sayi2 * 0.6);
	    String sonuc = "Notunuz : " + ort ;
	    JOptionPane.showMessageDialog(null, sonuc, "Not acýklama", JOptionPane.INFORMATION_MESSAGE );
		
	}

}
