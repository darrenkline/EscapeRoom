import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashSet;

import javax.imageio.ImageIO;
import javax.swing.*;

@SuppressWarnings("serial")
public class CustomJPanel extends JPanel {
	public static final String BACKGROUND_URL = "/images/Cafeteria.png";//"http://duke.kenai.com/misc/Bullfight.jpg";
	public static final String CELL_URL = "/images/Cafeteria.png";//"http://duke.kenai.com/iconSized/penduke-transparent.gif";
	private static int defaultRows = 30;
	private static int defaultCols = 30;
	private static boolean defaultButtonInvisibility = true;
	private static boolean testing = false;
	private static  int ROWS;// = 3;
	private static int COLS;// = 4;
	private BufferedImage backgroundImage;
	//private Image backgroundImage;
	private BufferedImage cellImage;
	private HashSet<Item> items;
	
	private JButton[][] buttonGrid;

	public CustomJPanel(int rows, int cols, Image img, HashSet<Item> it, boolean invisibleButtons,boolean testing) throws MalformedURLException, IOException 
	{
		JFrame parentFrame = (JFrame) SwingUtilities.getWindowAncestor(this); 
		//this.items = (HashSet<Item>) (parentFrame.getRoomItems());
		//above comment line of code is NOT going to work
		
		Toolkit tk = Toolkit.getDefaultToolkit();
		Class<? extends CustomJPanel> j = this.getClass();
		//Image image = tk.createImage(j.getResource("/images/cafeteriaNewspaper.jpg"));
		Image image = img.getScaledInstance(800, 800, Image.SCALE_DEFAULT);
		backgroundImage = toBufferedImage(image);

		this.testing = testing;
		this.items = it;
		ROWS = rows;
		COLS = cols;
		buttonGrid = new JButton[ROWS][COLS];
		//backgroundImage = ImageIO.read(new URL(BACKGROUND_URL));
		//cellImage = ImageIO.read(new URL(CELL_URL));
		//ImageIcon cellIcon = new ImageIcon(cellImage);
		setBackground(Color.white);

		setPreferredSize(new Dimension(backgroundImage.getWidth(), backgroundImage.getHeight()));

		setLayout(new GridLayout(ROWS, COLS));
		
		JFrame testWindow = new JFrame();
		JLabel buttonIDLabel = new JLabel();
		if (testing) {
			testWindow.setLayout(new FlowLayout());
			testWindow.setSize(300,300);
			testWindow.setVisible(true);
		}
		
		/*Create and initialize buttons*/
		for (int i = 0; i < ROWS; i++) {
			for (int k = 0; k < COLS; k++) {
				JButton button = new JButton();
				button.setText("");
				if (invisibleButtons) {
					button.setOpaque(false);
					button.setContentAreaFilled(false);
					//button.setBorderPainted(false);
				}
				
				if (testing) {
					String buttonNum ="Row: " + i +", Col: " + k; 			
					button.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							buttonIDLabel.setText(buttonNum);
							testWindow.add(buttonIDLabel);	
						}
					});
				}
				
				buttonGrid[i][k] = button;
				add(button);
				System.out.println("i:" + i + " k:" + k);
			}
		}

		/*add action listeners for when buttons covering items*/
		for (Item i : items ) {
			
			/*Iterate through each individual items coordinates, and update them with the listeners*/
			for (Coordinates c : i.getCoordinatesSet()) {
				JButton b = buttonGrid[c.getRow()][c.getCol()];
				b.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						/*TODO
						 * 
						 * Create popup window
						 * 
						 * */
						
						//create popup windows outside of loop. Cause them to pop up when the button is clicked.
						//createNewTaskFrame(i.getImage());
						
						//buttonIDLabel.setText(buttonNum);
						//testWindow.add(buttonIDLabel);	
					}
				});
			}
			
			
		}
		
	}

	
	
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		if (backgroundImage != null) {
			g.drawImage(backgroundImage, 0, 0, null);
		}
	}

	/*Converts a normal Image into a BufferedImage*/
	public static BufferedImage toBufferedImage(Image img)
	{
		if (img instanceof BufferedImage)
		{
			return (BufferedImage) img;
		}
		//obtain dimensions of image
		ImageIcon icon = new ImageIcon(img);
		// Create a buffered image with transparency
		BufferedImage bimage = new BufferedImage(icon.getIconWidth(), icon.getIconHeight(), BufferedImage.TYPE_INT_ARGB);

		// Draw the image on to the buffered image
		Graphics2D bGr = bimage.createGraphics();
		bGr.drawImage(img, 0, 0, null);
		bGr.dispose();

		// Return the buffered image
		return bimage;
	}


	private static void createAndShowUI() {
		JFrame frame = new JFrame("OverLayImages");
		try {
			frame.getContentPane().add(new CustomJPanel(defaultRows, defaultCols, null, null, defaultButtonInvisibility, testing));
		} catch (MalformedURLException e) {
			e.printStackTrace();
			System.exit(1);
		} catch (IOException e) {
			e.printStackTrace();
			System.exit(1);
		}
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}

	public static void main(String[] args) {
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				createAndShowUI();
			}
		});
	}
}


/*for (int i = 0; i < ROWS; i++) {
for (int k = 0; k < COLS; k++) {
	//JLabel label = new JLabel(cellIcon);
	JLabel label = new JLabel();
	add(label);
}
}*/
