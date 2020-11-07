import java.awt.Color;
import java.util.ArrayList;
import java.util.HashMap;

import javax.swing.BorderFactory;
import javax.swing.JPanel;

public class RobotStatusPanel extends JPanel {
	ArrayList<RobotStatus> robotStatus;
	public RobotStatusPanel() {
		this.setBorder(BorderFactory.createTitledBorder("Status Panel"));
		this.robotStatus = new ArrayList<>(2);
		this.robotStatus.add(new RobotStatus());
		this.robotStatus.add(new RobotStatus());
		for (int i = 0; i < this.robotStatus.size(); i++) {
			this.robotStatus.get(i).setBorder(BorderFactory.createTitledBorder("Robot " + String.valueOf(i + 1) + "Status"));
			this.add(this.robotStatus.get(i));
		}
		this.setBackground(new Color(255, 255, 255));
	}
	
	public void updateStatus(int robotID, HashMap<String, String> newStatus) {
		this.robotStatus.get(robotID).updateStatus(newStatus);
	}
}