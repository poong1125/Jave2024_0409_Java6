package d0409;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;

public class FlowTest_10page {
	private Frame frame;
	private Button button1, button2, button3, button4, button5, button6, button7, button8, button9;
	
	public FlowTest_10page() {
		frame = new Frame("FlowLayout example");
		button1 = new Button("Ȯ��");
		button2 = new Button("����");
		button3 = new Button("�ݱ�");
		button4 = new Button("Ȯ��");
		button5 = new Button("����");
		button6 = new Button("�ݱ�");
		button7 = new Button("Ȯ��");
		button8 = new Button("����");
		button9 = new Button("�ݱ�");
		
		
	}
	
	public void startFrame() {
		frame.setLayout(new FlowLayout());
		frame.add(button1);
		frame.add(button2);
		frame.add(button3);
		frame.add(button4);
		frame.add(button5);
		frame.add(button6);
		frame.add(button7);
		frame.add(button8);
		frame.add(button9);
		
		
		frame.setSize(300,300);
		frame.setVisible(true);
	}
	public static void main(String[] args) {
		FlowTest_10page flow = new FlowTest_10page();
		flow.startFrame();

	}

}
