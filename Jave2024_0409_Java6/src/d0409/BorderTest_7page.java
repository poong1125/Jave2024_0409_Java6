package d0409;

import java.awt.Button;
import java.awt.Frame;
import java.awt.TextField;

public class BorderTest_7page {
	private Frame frame;
	private Button center,west,east,south;
	private TextField tf1;
	
	public BorderTest_7page() {
		frame = new Frame("BorderLayout example");
		south = new Button("button 1");
		west = new Button("button 2");
		east = new Button("button 3");
		center = new Button("button 4");
		tf1 = new TextField();
		tf1.setText("�Է�â �Դϴ�.");
	}
	public void starFrame() {
		frame.add(tf1,"North");
		frame.add(south,"South");
		frame.add(west,"West");
		frame.add(east,"East");
		frame.add(center,"Center");
		
		frame.setSize(400,400);
		frame.setVisible(true);
	}
	public static void main(String[] args) {
		BorderTest_7page border = new BorderTest_7page();
		border.starFrame();
	}

}
