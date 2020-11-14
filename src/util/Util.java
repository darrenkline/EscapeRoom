package util;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;

import javax.swing.ImageIcon;

public class Util {

	public static final Image loadImage(String imageUrl) {
		Toolkit tk = Toolkit.getDefaultToolkit();
		return tk.createImage(Util.class.getClassLoader().getResource(imageUrl));
	}

	/* Converts a normal Image into a BufferedImage */
	public static BufferedImage toBufferedImage(Image img) {
		if (img instanceof BufferedImage) {
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

	public static Image scaleImage(Image img, int width, int height) {
		return img.getScaledInstance(width, height, Image.SCALE_DEFAULT);
	}

}
