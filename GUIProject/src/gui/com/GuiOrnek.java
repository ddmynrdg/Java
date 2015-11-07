package gui.com;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class GuiOrnek extends JFrame
{
	public static  void  main(String[] args) {
		GuiOrnek g = new GuiOrnek();
	}

	GuiOrnek(){
		super("GUI projemiz 1 ");
		this.setSize(300, 400);
		this.setAlwaysOnTop(true);
		this.setVisible(true);
		this.setResizable(false);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout(FlowLayout.CENTER));
		c.add(new JLabel("merhaba gui"));
		c.add(new JLabel("bu benim ilk gui projem"));
		c.add(new JLabel("bu satýrý alt satýrda yazacak."));
	
	}


}
