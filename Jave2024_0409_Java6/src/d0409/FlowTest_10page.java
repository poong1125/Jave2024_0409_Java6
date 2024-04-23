package d0409;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;

public class FlowTest_10page {
	private Frame frame;
	private Button button1, button2, button3, button4, button5, button6, button7, button8, button9;
	
	public FlowTest_10page() {
		frame = new Frame("FlowLayout example");
		button1 = new Button("확인");
		button2 = new Button("열기");
		button3 = new Button("닫기");
		button4 = new Button("확인");
		button5 = new Button("열기");
		button6 = new Button("닫기");
		button7 = new Button("확인");
		button8 = new Button("열기");
		button9 = new Button("닫기");
		
		
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
