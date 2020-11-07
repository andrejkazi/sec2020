import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.JLabel;

public class Robot extends JLabel {
	public Robot(String robot) {
		super(robot);
		if (robot.compareTo("o") == 0) {
			this.setForeground(Color.red);
		} else {
			this.setForeground(Color.blue);
		}
		this.setBackground(new Color(255, 0, 0));
	}
}