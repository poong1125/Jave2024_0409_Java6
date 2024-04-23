package d0412_pdf76page;

import java.awt.BorderLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JButton;
import javax.swing.JFrame;

public class AppSwing extends JFrame {
	public AppSwing() {
		setTitle("SWing App");
		setSize(300,100);
		getContentPane().add(new JButton("OK"),BorderLayout.SOUTH);
		addWindowListener(new WindowAdapter() {
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
