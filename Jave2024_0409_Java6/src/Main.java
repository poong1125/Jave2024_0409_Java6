
import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.util.Scanner;

public class Main {
		
	public static void main(String[] args) {
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
			
			Button btn1 = new Button("1");
			btn1.setSize(80,80);
			btn1.setLocation(25,210);
			Button btn2 = new Button("2");
			btn2.setSize(80,80);
			btn2.setLocation(115,210);
			Button btn3 = new Button("3");
			btn3.setSize(80,80);
			btn3.setLocation(205,210);
			Button btn_x = new Button("x");
			btn_x.setSize(80,80);
			btn_x.setLocation(295,210);
			Button btn4 = new Button("4");
			btn4.setSize(80,80);
			btn4.setLocation(25,320);
			Button btn5 = new Button("5");
			btn5.setSize(80,80);
			btn5.setLocation(115,320);
			Button btn6 = new Button("6");
			btn6.setSize(80,80);
			btn6.setLocation(205,320);
			Button btn_min = new Button("-");
			btn_min.setSize(80,80);
			btn_min.setLocation(295,320);
			Button btn7 = new Button("7");
			btn7.setSize(80,80);
			btn7.setLocation(25,430);
			Button btn8 = new Button("8");
			btn8.setSize(80,80);
			btn8.setLocation(115,430);
			Button btn9 = new Button("9");
			btn9.setSize(80,80);
			btn9.setLocation(205,430);
			Button btn_plus = new Button("+");
			btn_plus.setSize(80,80);
			btn_plus.setLocation(295,430);
			Button btn_jum = new Button(".");
			btn_jum.setSize(80,80);
			btn_jum.setLocation(25,540);
			Button btn0 = new Button("0");
			btn0.setSize(80,80);
			btn0.setLocation(115,540);
			Button btn_nun = new Button("%");
			btn_nun.setSize(80,80);
			btn_nun.setLocation(205,540);
			Button btn_na = new Button("=");
			btn_na.setSize(80,80);
			btn_na.setLocation(295,540);
			Button btn_Nuclear = new Button("지우개");
			btn_Nuclear.setSize(300,40);
			btn_Nuclear.setLocation(50,630);
			
			
			
			
			
			
			f.add(input);
			f.add(pyo);
			f.add(screen);
			f.add(btn1);
			f.add(btn2);
			f.add(btn3);
			f.add(btn_x);
			f.add(btn4);
			f.add(btn5);
			f.add(btn6);
			f.add(btn_min);
			f.add(btn7);
			f.add(btn8);
			f.add(btn9);
			f.add(btn_plus);
			f.add(btn_jum);
			f.add(btn0);
			f.add(btn_na);
			f.add(btn_nun);
			f.add(btn_Nuclear);
			
			
			f.setVisible(true);
	}

}
