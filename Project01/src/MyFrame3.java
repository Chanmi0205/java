import java.awt.*;
import javax.swing.*;

public class MyFrame3 extends JFrame {
	
	public MyFrame3() {
		
		setTitle("BorderLayoutTest");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// �������� ����Ʈ�� BorderLayout �̹Ƿ� ����� ���ʿ�
		setLayout(new BorderLayout());
		
		// ��ư �߰�
		add(new JButton("Center"), BorderLayout.CENTER);
		add(new JButton("Line Start"), BorderLayout.LINE_START);
		add(new JButton("Line End"), BorderLayout.LINE_END);
		add(new JButton("Page Start"), BorderLayout.PAGE_START);
		add(new JButton("Page End"), BorderLayout.PAGE_END);

		pack();
		setVisible(true);
	}
	
	
	public static void main(String[] args) {
		MyFrame3 j = new MyFrame3();
	}

}