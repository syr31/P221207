package CheckBoxTest;

import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;

public class CheckBoxTest {
	public static void main(String[] args) {
		Frame f = new Frame("Questions");
		f.setSize(305, 250);
		f.setLayout(new FlowLayout());

		Label q1 = new Label("1. 당신의 관심 분야는?(여러개 선택가능)");
		Checkbox news = new Checkbox("news", true);
		Checkbox sports = new Checkbox("sports");
		Checkbox movie = new Checkbox("movie");
		Checkbox music = new Checkbox("music");

		f.add(q1);
		f.add(news);
		f.add(sports);
		f.add(movie);
		f.add(music);

		Label q2 = new Label("2. 얼마나 자주 극장에 가십니까?");
		CheckboxGroup group1 = new CheckboxGroup();
		Checkbox movie1 = new Checkbox("한 달에 한 번 갑니다.", group1, true);
		Checkbox movie2 = new Checkbox("일주일에 한 번 갑니다.", group1, true);
		Checkbox movie3 = new Checkbox("일주일에 두 번 갑니다.", group1, true);

		f.add(q2);
		f.add(movie1);
		f.add(movie2);
		f.add(movie3);

		Label q3 = new Label("3. 하루에 얼마나 컴퓨터를 사용하십니까?");
		CheckboxGroup group2 = new CheckboxGroup();
		Checkbox com1 = new Checkbox("5시간 이하", group2, true);
		Checkbox com2 = new Checkbox("10시간 이하", group2, false);
		Checkbox com3 = new Checkbox("15시간 이상", group2, false);

		f.add(q3);
		f.add(com1);
		f.add(com2);
		f.add(com3);

		f.setVisible(true);
	}

}
