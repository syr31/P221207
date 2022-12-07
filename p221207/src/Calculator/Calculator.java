package Calculator;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Calculator extends Frame implements ActionListener {
	TextField tf = new TextField(); // TextField 컨트롤은 텍스트을 입력할수 있는 컨트롤입니다.
	Button bt[] = new Button[16]; // 계산기 버튼 16개
	String str[] = new String[] { "7", "8", "9", "+", "4", "5", "6", "-", "1", "2", "3", "*", "0", "=", "%", "/" };

	BorderLayout bl = new BorderLayout(); // BorderLayout은 컨테이너를 North, South, East, West, Center 모두 5개의 영역으로 나누고, 각 영역에
											// 하나의 컴포넌트만을 배치할 수 있도록 한다.
	Panel p = new Panel();
	GridLayout gl = new GridLayout(4, 4, 5, 5); // 행과 열을 나눠줌
	String result = "";
	String yunres = "";
	char yun = '0';
	int res = 0;

	public void init() {
		this.setLayout(bl);
		tf.setEditable(false);
		tf.setFont(new Font("", Font.BOLD, 20));
		this.add("North", tf);
		this.add("Center", p);
		p.setLayout(gl);
		for (int i = 0; i < 16; ++i) {
			bt[i] = new Button(str[i]);
			p.add(bt[i]);
		}
	}

	public void start() {
		for (int i = 0; i < 16; ++i) {
			bt[i].addActionListener(this);
		}
		WindowAdapter wa = new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		};
		this.addWindowListener(wa);
	}

	Calculator(String title) {
		super(title);
		this.init();
		this.start();
		super.setSize(300, 200);
		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		int xpos = (int) (screen.getWidth() / 2 - super.getWidth() / 2);
		int ypos = (int) (screen.getHeight() / 2 - super.getHeight() / 2);
		super.setLocation(xpos, ypos);
		super.setResizable(false);
		super.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==bt[3]) {
			yun = '+';
			yunButton();
			return;
		}else if(e.getSource()==bt[7]) {
	}

	public class Calculator_01 {
		public static void main(String[] args) {

		}
	}
}
