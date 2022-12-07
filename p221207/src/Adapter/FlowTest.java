package Adapter;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class FlowTest implements WindowListener {
	private Frame frame;

	public FlowTest() {
		frame = new Frame("adapter example");
		Frame f = new Frame("Login");
		f.setSize(300, 200);
		f.setLayout(null);
		Button b1 = new Button("확인");
		b1.setSize(100, 50);
		b1.setLocation(100, 75);

		f.add(b1);
		f.setVisible(true);
	}

	public void windowClosing(WindowEvent e) {
		System.exit(0);
	}

	public void windowClosed(WindowEvent e) {
	}

	public void windowActivated(WindowEvent e) {
	}

	public void windowDeactivated(WindowEvent e) {
	}

	public void windowDeiconified(WindowEvent e) {
	}

	public void windowIconified(WindowEvent e) {
	}

	public void windowOpened(WindowEvent e) {
	}

	public void startFrame() {
		frame.addWindowListener(this);
		frame.setLayout(new FlowLayout());
	}

	public static void main(String[] args) {
		FlowTest g = new FlowTest();
		g.startFrame();
	}

}
