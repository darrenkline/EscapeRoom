import java.applet.Applet;
import java.awt.*; 
import javax.swing.*;
import images.*;

public class OldEscapeRoom extends javax.swing.JApplet{

	private JFrame mainFrame;
	private int mainWidth = 800;
	private int mainHeight = 800;
	
	/*Creates Main JFrame that will host entirety of escape room*/
	public OldEscapeRoom() {
		mainFrame = new JFrame("Escape Room!");
		this.mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.mainFrame.setLayout(new GridBagLayout());
		JLabel textLabel = new JLabel("I'm a label in the window", SwingConstants.CENTER);
		textLabel.setPreferredSize(new Dimension(mainWidth, mainHeight));
		//this.mainFrame.getContentPane().add(textLabel, BorderLayout.CENTER);
		//Display the window frame.setLocationRelativeTo(null);
		this.mainFrame.pack();
		this.mainFrame.setVisible(true);
		
		Toolkit tk = Toolkit.getDefaultToolkit();
		Class<? extends JFrame> j = mainFrame.getClass();
		Image image = tk.createImage(j.getResource("/images/Cafeteria.png"));
		Image newImage = image.getScaledInstance(mainWidth, mainHeight, Image.SCALE_DEFAULT);
		mainFrame.add(new JLabel(new ImageIcon(newImage)));
		this.mainFrame.pack();
		this.mainFrame.setVisible(true);
	
		
		ImagePanel ip = new ImagePanel("/images/Cafeteria.png");
		//ip.paint(null);
		ip.setVisible(true);
	}
	
	
	
	
	public void paint(Graphics g) {
		//g
	}
	
	public void createWindow() { 
		//Create and set up the window. 
		//JFrame frame = new JFrame("Simple GUI");
		this.mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JLabel textLabel = new JLabel("I'm a label in the window",SwingConstants.CENTER);
		textLabel.setPreferredSize(new Dimension(600, 600));
		this.mainFrame.getContentPane().add(textLabel, BorderLayout.CENTER);
		//Display the window frame.setLocationRelativeTo(null);
		this.mainFrame.pack();
		this.mainFrame.setVisible(true);
	}
	
	
}
