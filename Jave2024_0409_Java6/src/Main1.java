import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.util.Scanner;

public class Main1 {
	public Button btn1,btn2,btn3,btn_puls,btn4,btn5,btn6,btn_min,btn7,btn8,btn9,btn_x,btn_,btn0,btn_na,btn_nun;
	public Main1() {
		Scanner sc = new Scanner(System.in);
		sc.close();
		Frame f = new Frame("계산기");
		f.setSize(400,700);
		f.setLayout(null);
		Label pyo = new Label("표준",Label.LEFT);
		pyo.setSize(30,30);
		pyo.setLocation(10,40);
		TextField screen = new TextField(50);
		screen.setSize(360,40);
		screen.setLocation(20,70);
		TextField input = new TextField(30);
		input.setSize(360,80);
		input.setLocation(20,120);
	
		for(int i = 0 ; i < 4; i++) {
			for(int o = 0; o < 4; o++) {
				Button btn1 = new Button("1");
				btn1.setSize(80,80);
				btn1.setLocation(25,210);
			}
		}
	
	
	
	
	
	
		f.add(input);
		f.add(pyo);
		f.add(screen);
		
		f.setVisible(true);
	}
	public static void main(String[] args) {
		new Main1();
	}

}
