package olaylar.com;
import java.awt.Container;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.event.*;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class OlaylarOrnek extends JFrame implements MouseListener,MouseMotionListener,KeyListener,WindowListener

{/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
// JFrame nesnesini miras almal�y�z.

	JLabel e1 = new JLabel();
	JLabel e2 = new JLabel();
	JLabel e3 = new JLabel();
	
	
	public static void main(String[] args) throws Exception, Exception {
		
		EventQueue.invokeAndWait(new Runnable() {
			
			@Override
			public void run() {
				OlaylarOrnek o = new OlaylarOrnek();
				o.setVisible(true);
				
			}
		});
	}

	public OlaylarOrnek() {
		// TODO Auto-generated constructor stub
		super("Mouse ve Klavye ");
		Container c = getContentPane();
		setLayout(new FlowLayout());
		c.add(e1);
		c.add(e2);
		c.add(e3);
		
		addMouseListener(this);
		addMouseMotionListener(this);
		addKeyListener(this);
		addWindowListener(this);
		setSize(300, 400);
	}
	
String metin = "";
@Override
public void keyPressed(KeyEvent e) {
	//bir tusa bas�ld���nda
	metin = "bir tu�a basm��lar.�al��! \n";
	e1.setText(metin);
	
	
}

@Override
public void keyReleased(KeyEvent e) {
	// bir tu�a bast�m serbest b�rakt���mda
	metin += "bir tu�a bas�l�p- serbest b�rakm��lar, �al��!\n";
	e2.setText(metin);
	
}

@Override
public void keyTyped(KeyEvent e) {
	// �imdi hangi tu�a basm��lar onu ��renelim
	
	char c = e.getKeyChar();
	metin += "Klavyeden bas�lan tu� : " + c + "\n";
	e1.setText(metin);
	
}

@Override
public void mouseDragged(MouseEvent arg0) {
	// mousas bas�l� durumda s�r�kleniyor �imdi
	
	e2.setText("mouse bas�l�p s�r�kl�yorlar �al��!! \n");
}

@Override
public void mouseMoved(MouseEvent e) {
	// TODO Auto-generated method stub
	int x = e.getX();
	int y = e.getY();
	e2.setText("mouse ta��n�yor.�al��!! \n");
	e3.setText("X : " + x + " Y : " + y);	
}

@Override
public void mouseClicked(MouseEvent e) {
	// TODO Auto-generated method stub
	
	int x = e.getX();
	int y = e.getY();
	e2.setText("mouse t�klam��lar.�al��!! \n");
	e3.setText("X : " + x + " Y : " + y);	
}

@Override
public void mouseEntered(MouseEvent e) {
	// TODO Auto-generated method stub
	e2.setText("mouse etki alan�nda girmi�.�al��!! \n");
	int x = e.getX();
	int y = e.getY();
	e3.setText("X : " + x + " Y : " + y);	
	
}

@Override
public void mouseExited(MouseEvent e) {
	// TODO Auto-generated method stub
	e2.setText("mouse etki alan�nda ��km��. �al��!! \n");
	int x = e.getX();
	int y = e.getY();
	e3.setText("X : " + x + " Y : " + y);	
}

@Override
public void mousePressed(MouseEvent e) {
	// TODO Auto-generated method stub
	e2.setText("bir tu�u serbest b�rakm��lar devreye gir hemen! \n");
	int x = e.getX();
	int y = e.getY();
	e3.setText("X : " + x + " Y : " + y);	
}

@Override
public void mouseReleased(MouseEvent e) {
	// TODO Auto-generated method stub
	e2.setText("mouse tu�u serbest �imdi devreye gir!!");
	int x = e.getX();
	int y = e.getY();
	
	e3.setText("X : " + x + " Y : " + y);	
}

@Override
public void windowActivated(WindowEvent arg0) {
	// TODO Auto-generated method stub
	System.out.println("Pencere �imdi aktif durumda " );
}

@Override
public void windowDeactivated(WindowEvent arg0) {
	// TODO Auto-generated method stub
	System.out.println("pencere aktif de�il. ");
}

@Override
public void windowDeiconified(WindowEvent arg0) {
	// TODO Auto-generated method stub
	System.out.println("pencere simge durumuna getirildi");
}

@Override
public void windowIconified(WindowEvent arg0) {
	// TODO Auto-generated method stub
	System.out.println("pencere simge durumunda. ");
	
}

@Override
public void windowOpened(WindowEvent arg0) {
	// TODO Auto-generated method stub
	System.out.println("pencere a��ld�");
}

@Override
public void windowClosed(WindowEvent arg0) {
	// TODO Auto-generated method stub
	System.out.println("pencere kapand�");
}

@Override
public void windowClosing(WindowEvent arg0) {
	// TODO Auto-generated method stub
	System.out.println("pencere kapan�yor.");
}

}
