package d0411_42page;



import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextArea;
import java.awt.event.WindowAdapter;

public class TextAreaTest extends WindowAdapter {

	public static void main(String[] args) {
		Frame f = new Frame("Comments");
		f.setSize(400,220);
		f.setLayout(new FlowLayout());
		
		TextArea comments = new TextArea("�ϰ� ���� ���� ��������! " , 10 ,50);
		
		
		
		f.add(comments);
		comments.selectAll();
		f.setVisible(true);
		
		

	}

}
