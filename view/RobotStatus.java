import java.awt.Dimension;
import java.util.HashMap;
import java.util.Iterator;

import javax.swing.JTextArea;

public class RobotStatus extends JTextArea {
	HashMap<String, String> status;
	public RobotStatus() {
		this.setEditable(false);
		this.status = new HashMap<>();
		this.status.put("Battery", "");
		this.status.put("Position", "");
		this.status.put("Destination", "");
		this.updatePanel();
		Dimension d = this.getPreferredSize();
		d.width = 500;
		d.height = 300;
		this.setPreferredSize(d);
		this.getInsets().set(0, 10, 0, 10);
	}
	
	public void updateStatus(HashMap<String, String> newStatus) {
		this.status = newStatus;
		this.updatePanel();
	}
	
	private void updatePanel() {
		Iterator<String> valueIter = this.status.values().iterator();
		Iterator<String> keyIter = this.status.keySet().iterator();
		this.setText("");
		while(keyIter.hasNext()) {
			this.append(keyIter.next() + ": " + valueIter.next() + "\n");
		}
	}
}