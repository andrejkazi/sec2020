import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MapPanel extends JPanel {
	private ArrayList<ArrayList<Integer>> map;
	private ArrayList<Robot> robots;
	private GridBagConstraints gc;
	private static int robotX = 0;
	private static int robotY = 0;
	public MapPanel(ArrayList<ArrayList<Integer>> map) {
		this.robots = new ArrayList<>();
		this.robots.add(new Robot("o"));
		this.robots.add(new Robot("x"));
		this.map = map;
		this.setLayout(new GridBagLayout());
		gc = new GridBagConstraints();
		gc.fill = GridBagConstraints.NONE;
		gc.insets = new Insets(10, 10, 10, 10);
		for (int i = 0; i < map.size(); i++) {
			gc.gridx = i;
			for (int j = 0; j < map.get(i).size(); j++) {
				gc.gridy = j;
				JLabel label = new JLabel(" ");
				label.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createLineBorder(new Color(0)), BorderFactory.createEmptyBorder(3, 3, 3, 3)));
				this.add(label, gc);
			}
		}
		
		JButton moveBtn = new JButton("Move");
		moveBtn.addActionListener((ActionEvent e) -> {
			this.move(0, 1, 2);
		}); 
		this.add(moveBtn);
		
		gc.gridx = 0;
		gc.gridy = 0;
		
		this.add(this.robots.get(0), gc);

		this.setBackground(new Color(255, 255, 255));
	}
	
	public void move(int robotNumber, int row, int col) {
		this.remove(this.robots.get(robotNumber));
		this.repaint();
//		this.gc.gridx = row;
//		this.gc.gridy = col;
//		this.add(this.robots.get(robotNumber), gc);
//		this.repaint();
	}
}