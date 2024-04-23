package d0411_30page;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonTest  {
	
	public void buttonTest() {
			Frame f = new Frame("Login");
		f.setSize(300,300);
		f.setLayout(null);
		Button b = new Button("»Æ¿Œ");
		b.setSize(100,50);
		b.setLocation(100,75);
		String aaa = "AnSangHwan";
		f.add(b);
		f.setVisible(true);	
		b.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0) {
				f.setTitle(aaa);
			}
		});	
	}

	
	public static void main(String[] args) {
		ButtonTest g = new ButtonTest();
		g.buttonTest();
	}
}
