/*
 * Copyright (c) 1995, 2008, Oracle and/or its affiliates. All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions
 * are met:
 *
 *   - Redistributions of source code must retain the above copyright
 *     notice, this list of conditions and the following disclaimer.
 *
 *   - Redistributions in binary form must reproduce the above copyright
 *     notice, this list of conditions and the following disclaimer in the
 *     documentation and/or other materials provided with the distribution.
 *
 *   - Neither the name of Oracle or the names of its
 *     contributors may be used to endorse or promote products derived
 *     from this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS
 * IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO,
 * THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR
 * PURPOSE ARE DISCLAIMED.  IN NO EVENT SHALL THE COPYRIGHT OWNER OR
 * CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL,
 * EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO,
 * PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR
 * PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF
 * LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING
 * NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */ 

/*
 * GridBagLayoutDemo.java requires no other files.
 */

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class GridBagLayoutTest {
    final static boolean shouldFill = false;
    final static boolean shouldWeightX = true;
    final static boolean RIGHT_TO_LEFT = false;
    private static JLabel headerLabel;
    private static JFrame frame;

    public static void addComponentsToPane(Container pane) {
        if (RIGHT_TO_LEFT) {
            pane.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        }

        GridBagLayout layout = new GridBagLayout();
		layout.columnWeights = new double[] { 1.0, 1.0, 1.0, 1.0 };
		layout.rowWeights = new double[] { 1.0, 1.0, 1.0, 1.0 };
        
	pane.setLayout(layout);
	GridBagConstraints c = new GridBagConstraints();
	
	Toolkit tk = Toolkit.getDefaultToolkit();
	Class<? extends JFrame> j = frame.getClass();
	/*Image image = tk.createImage(j.getResource("/images/Cafeteria.png"));
	Image newImage = image.getScaledInstance(600, 600, Image.SCALE_DEFAULT);
//	frame.add(new JLabel(new ImageIcon(newImage)));
	ImageIcon backgroundPic = new ImageIcon(); 
	backgroundPic.setImage(newImage);
	JLabel backgroundLabel = new JLabel(backgroundPic);*/
	
	
	
	c.gridwidth = 50;
	c.gridheight = 50;
	//pane.add(backgroundLabel, c);
	
	//pane.add(comp);

	/*headerLabel = new JLabel("header", JLabel.CENTER);
	headerLabel.setText("header");
	headerLabel.setSize(300,100);*/
	//c.fill = GridBagConstraints.HORIZONTAL;
/*	c.weightx = 0.5;
	c.gridx = 2;
	c.gridy = 4;
	pane.add(headerLabel,c);*/
	
	//Background
	JLabel background = new JLabel("hi");
	background.setBackground(Color.CYAN);
	background.setOpaque(true);
	GridBagConstraints backgroundConstraints = new GridBagConstraints();
	backgroundConstraints.gridx = 3;
	backgroundConstraints.gridy = 2;
	backgroundConstraints.weightx = 1;
	backgroundConstraints.weighty = 1;
	backgroundConstraints.gridwidth = 3;
	backgroundConstraints.gridheight = 3;
	//backgroundConstraints.ipadx = 3;
	//backgroundConstraints.ipady = 3;
	//backgroundConstraints.fill = GridBagConstraints.HORIZONTAL;
	backgroundConstraints.fill = GridBagConstraints.BOTH;
	//backgroundConstraints.se
	pane.add(background, backgroundConstraints);
	
	//button BUTTON 1
	
	JButton b1 = new JButton("BUTTON 1");
	GridBagConstraints b1Constraints = new GridBagConstraints();
	b1.setSize(70,10);
	b1Constraints.ipadx = -20;
	b1Constraints.ipady = 30;
	b1Constraints.gridx = 2;
	b1Constraints.gridy = 2;
	pane.add(b1, b1Constraints);
	//pane.setSize(600,600);
	
	
	
	JButton button = new JButton("Button 1");
	if (shouldWeightX) {
	c.weightx = 0.5;
	}
	//c.fill = GridBagConstraints.HORIZONTAL;
	c.gridx = 0;
	c.gridy = 0;
	c.gridwidth = 100;
	c.gridheight = 100;
	button.setSize(1000, 1000);
	button.setBackground(Color.BLACK);
	pane.add(button, c);

	button = new JButton("Button 2");
	//c.fill = GridBagConstraints.HORIZONTAL;
	c.weightx = 0.5;
	c.gridx = 1;
	c.gridy = 0;
	button.setBackground(Color.RED);
	button.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            headerLabel.setText("Ok Button is clicked here");
         }
      });
//	pane.add(button, c);

	button = new JButton("            ");
	//c.fill = GridBagConstraints.HORIZONTAL;
	c.weightx = 0.5;
	c.gridx = 3;
	c.gridy = 0;
	button.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
           headerLabel.setText("sneaky");
        }
     });
	button.setOpaque(false);
	button.setContentAreaFilled(false);
	button.setBorderPainted(false);
	//button.tex
	/*button.setVisible(true);
	button.setOpaque(false);*/
	//pane.add(button, c);

	button = new JButton("Long-Named Button 4");
	//c.fill = GridBagConstraints.HORIZONTAL;
	//c.ipady = 40;      //make this component tall
	c.weightx = 0.0;
	c.gridwidth = 3;
	c.gridx = 0;
	c.gridy = 20;
	//pane.add(button, c);

	button = new JButton("5");
	//c.fill = GridBagConstraints.HORIZONTAL;
	c.ipady = 0;       //reset to default
	c.weighty = 1.0;   //request any extra vertical space
	c.anchor = GridBagConstraints.PAGE_END; //bottom of space
	c.insets = new Insets(10,0,0,0);  //top padding
	c.gridx = 1;       //aligned with button 2
	c.gridwidth = 2;   //2 columns wide
	c.gridy = 2;       //third row
	//pane.add(button, c);
    }

    /**
     * Create the GUI and show it.  For thread safety,
     * this method should be invoked from the
     * event-dispatching thread.
     */
    private static void createAndShowGUI() {
        //Create and set up the window.
        frame = new JFrame("GridBagLayoutDemo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setPreferredSize(new Dimension(600, 600));
        //Set up the content pane.
        addComponentsToPane(frame.getContentPane());

        //Display the window.
        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        //Schedule a job for the event-dispatching thread:
        //creating and showing this application's GUI.
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
}