package d0411_27page;

import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Toolkit;

public class FrameClasTest {

	public static void main(String[] args) {
		Frame f= new Frame("login");
		f.setSize(300,200);
		
		Toolkit tk = Toolkit.getDefaultToolkit();
		Dimension screenSize = tk.getScreenSize();
		f.setLocation(screenSize.width/2-150, screenSize.height/2-100);
		f.setVisible(true);
	}

}
