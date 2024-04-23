package d0412_pdf76page;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class App extends Frame{
	private Button btn1;
	
	public App() {
		setTitle("AWT App");
		setSize(300,100);
		
		
		btn1 = new Button("OK");
		
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("OKOKK");
			}
		});
		
		
		add(btn1,BorderLayout.SOUTH);
		
		addWindowListener((WindowListener) new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}
	public static void main(String[] args) {
		App app = new App();
		app.setVisible(true);
	}
}
