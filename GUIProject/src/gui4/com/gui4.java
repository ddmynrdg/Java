package gui4.com;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTree;
import javax.swing.ListSelectionModel;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.event.TreeExpansionEvent;
import javax.swing.event.TreeExpansionListener;

import java.awt.FlowLayout;
import javax.swing.JTabbedPane;

public class gui4 extends JFrame {

	private JPanel contentPane;
	private JTable tabloY;
	private JList listeY;
	private JTree agac;
	private JLabel lbl = new JLabel();
	private JLabel lbl2 = new JLabel();
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					gui4 frame = new gui4();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public gui4() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.addTab("Tablo", new tablo());
		tabbedPane.addTab("Liste", new liste());
		tabbedPane.addTab("JTree", new Jagac());
		contentPane.add(tabbedPane);
	}
	public class tablo extends JPanel implements ListSelectionListener {
		tablo() {
			String[] sutun = {"il", "plaka", "bölge"};
			String[][] veri = {
					{"Edirne"," 22", "marmara"},
					{"Kýrýkale", "71", "içAndolu"},
					{"Bursa", "18", "marmara"},
					{"izmir", "35", "ege"},
					{"adana", "01", "akdeniz"},
					{"ankara", "06", "Ýç Anadolu"},
					{"samsun", "55", "karadeniz"}
					};
 			tabloY = new JTable(veri, sutun);
			add(tabloY);
			JScrollPane j = new JScrollPane(tabloY);
			add(j);
		
			ListSelectionModel lm = tabloY.getSelectionModel();
			lm.setSelectionMode(lm.SINGLE_SELECTION);
			lm.addListSelectionListener(this);
		}

		@Override
		public void valueChanged(ListSelectionEvent arg0) {
			
			int indisX = tabloY.getSelectedColumn();
			int indisY = tabloY.getSelectedRow();
			
			String s = "";
			s =(String) tabloY.getValueAt(indisY, indisX);
		    System.out.println(s);
		}
	}

	public class liste extends JPanel {
	
		liste() {
			 String[] il = {"kýrýkkale", "istanbul", "ankara", " izmir", "adana",
					 "bursa", "sinop", "samsun", "deizli", "hatay"};
			 listeY = new JList(il);
			 add(listeY);
			 JScrollPane j2 = new JScrollPane(listeY);
			 add(j2);	 
		}
	}

	public class Jagac extends JPanel implements TreeExpansionListener {
	// dosya yolunu belirtir
		Jagac() {
			agac = new JTree();
			add(agac);
			
			JScrollPane j3 = new JScrollPane(agac);
			add(j3); 
			
			add(lbl);
			add(lbl2);
			agac.addTreeExpansionListener(this); 
			agac.addTreeExpansionListener(this);
			//even kullanlým þimdi
		}

		@Override
		public void treeCollapsed(TreeExpansionEvent arg0) {
			lbl.setText(arg0.getPath().toString()+ "alan daraldý");
			
		}

		@Override
		public void treeExpanded(TreeExpansionEvent arg0) {
			// TODO Auto-generated method stub
			lbl.setText(arg0.getPath().toString() + "alan geniþledi");
			lbl2.setText(arg0.getPath().toString() + "alan sçildi");
		}
	}

}
