import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class StartFrame extends JFrame {
	private JTextField filePath;
	
	public StartFrame() {
		super("Launch");
		this.filePath = new JTextField(10);
		this.setLayout(new GridBagLayout());
		GridBagConstraints gc = new GridBagConstraints();
		
		gc.fill = GridBagConstraints.NONE;
		gc.anchor = GridBagConstraints.LINE_START;
		gc.insets = new Insets (0, 4, 0, 4);
		
		// Row 1
		gc.gridx = 0;
		gc.gridy = 0;
		this.add(new JLabel("File Path"), gc);
		
		gc.gridx = 1;
		this.add(this.filePath, gc);
		
		gc.gridx = 2;
		this.add(new JButton("Launch"), gc);
		
		
		
		this.setSize(300, 300);
		this.setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		SwingUtilities.invokeLater(() -> {
			StartFrame sf = new StartFrame();
		});
	}
}