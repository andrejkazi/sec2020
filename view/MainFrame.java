import javax.swing.JFrame;
import javax.swing.SwingUtilities;

import java.awt.BorderLayout;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class MainFrame extends JFrame {
	private RobotStatusPanel robotStatusPanel;
	private MapPanel mapPanel;
	public MainFrame() {
		super("Main Screen");
		
		// Status Panel Setup
		this.robotStatusPanel = new RobotStatusPanel();
		this.setLayout(new BorderLayout());
		this.add(this.robotStatusPanel, BorderLayout.SOUTH);
		
		// Map Panel setup
		ArrayList<ArrayList<Integer>> map = new ArrayList<>(8);
		for (int i = 0; i < 8; i++) {
			map.add(new ArrayList<Integer>(8));
			for (int j = 0; j < 8; j++) {
				map.get(i).add(j);
			}
		}
		
		this.mapPanel = new MapPanel(map);
		this.add(this.mapPanel, BorderLayout.CENTER);
		
		this.setSize(1200, 800);
		this.setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		SwingUtilities.invokeLater(() -> {
			MainFrame mf = new MainFrame();
		});
	}
}