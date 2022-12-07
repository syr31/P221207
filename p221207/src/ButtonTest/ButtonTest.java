package ButtonTest;

import java.awt.Button;
import java.awt.Frame;

public class ButtonTest {

	public static void main(String[] args) {
		Frame f = new Frame("Login");
		f.setSize(300, 200);
		f.setLayout(null);
		Button b1 = new Button("확인");
		b1.setSize(100, 50);
		b1.setLocation(100, 75);

		f.add(b1);
		f.setVisible(true);

	}

}
