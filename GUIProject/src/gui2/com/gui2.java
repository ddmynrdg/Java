package gui2.com;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

import java.util.Random;

public class gui2 extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JTextField Tah2;
	private JTextField Tah1;
	private JLabel lblYak;
	static int a;
	int k;
	String m = "";

	private JLabel lblYak2;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Random r = new Random();
					a = r.nextInt(100);
					gui2 frame = new gui2();
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
	public gui2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.activeCaption);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		lblYak = new JLabel("Yaklasim ");
		contentPane.add(lblYak);
		
		lblYak2 = new JLabel("Yaklasim2");
		contentPane.add(lblYak2);
		
		Tah1 = new JTextField("");
		Tah1.setBackground(Color.ORANGE);
		contentPane.add(Tah1);
		Tah1.setColumns(10);
		
		Tah2 = new JTextField("");
		Tah2.setBackground(Color.ORANGE);
		contentPane.add(Tah2);
		Tah2.setColumns(10);
		
		JButton btnTah = new JButton("Tahmin");
		btnTah.setActionCommand("terar deneyin");
		btnTah.setBackground(Color.WHITE);
		btnTah.addActionListener(this);
		contentPane.add(btnTah);  
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		
			int i, j;
			k++;
			m = e.getActionCommand();
			
			
			i = Integer.valueOf(Tah1.getText());
			j = Integer.valueOf(Tah2.getText());
			if (i == a) {
				lblYak.setText("ilk deðeri buldun tebrikler.Tahmin sayýsý :" + k);
				System.out.println("yaklaþým 1 de tamininiz doðru.Tebrikler ^-^");
			}
			else if (i < a) {
				lblYak.setText("Tanmininiz daha küçük. Tahmin sayýsý : " + k);
				System.out.println(m);
			}
			else if (i > a) {
				lblYak.setText("Tanmininiz daha büyük. Tahmin sayýsý : " + k);
				System.out.println(m);
			}
			
			
			if (j == a) {
				lblYak2.setText("ilk deðeri buldun tebrikler.Tahmin sayýsý :" + k);
				System.out.println("yaklaþým 2 de tamininiz doðru.Tebrikler ^-^");
			}
			else if (j < a) {
				lblYak2.setText("Tanmininiz daha küçük. Tahmin sayýsý : " + k);
				System.out.println(m);
			}
			else if (j > a) {
				lblYak2.setText("Tanmininiz daha büyük. Tahmin sayýsý : " + k);
				System.out.println(m);
			}
			
	}
	

	}


