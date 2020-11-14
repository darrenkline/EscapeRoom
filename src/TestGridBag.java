import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class TestGridBag extends JFrame
{
	TestGridBag()
	{
		setTitle("TestGridBag");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GridBagLayout layout = new GridBagLayout();
		getContentPane().setLayout(layout);
		
		GridBagConstraints cons = new GridBagConstraints();
		/*cons.gridx = 0; cons.gridy = 0;
		cons.gridwidth = 1; cons.gridheight = 2;
		cons.fill = GridBagConstraints.NONE;
		cons.anchor = GridBagConstraints.CENTER;
		cons.weightx = 1; cons.weighty = 2;
		addButton("One", cons, layout);*/
		
		
		cons.gridx = 0; cons.gridy = 0;
		cons.gridwidth = 1; cons.gridheight = 1;
		cons.fill = GridBagConstraints.NONE;
		cons.anchor = GridBagConstraints.CENTER;
		cons.weightx = 1; cons.weighty = 2;
		
		cons.fill = GridBagConstraints.VERTICAL;
		
		JLabel l = new JLabel("shreep");
		l.setBackground(Color.CYAN);
		l.setOpaque(true);
		layout.setConstraints(l, cons);
		getContentPane().add(l);
		
	//	addButton("One", cons, layout);
		
		cons.gridx = 1; cons.gridy = 0;
		cons.gridwidth = 1; cons.gridheight = 2;
		cons.fill = GridBagConstraints.VERTICAL;
		cons.anchor = GridBagConstraints.EAST;
		cons.weightx = 1; cons.weighty = 2;
		addButton("Two", cons, layout);
		
		cons.gridx = 2; cons.gridy = 0;
		cons.gridwidth = 2; cons.gridheight = 2;
		cons.fill = GridBagConstraints.HORIZONTAL;
		cons.anchor = GridBagConstraints.NORTH;
		cons.weightx = 2; cons.weighty = 2;
		addButton("Three", cons, layout);
		
		cons.gridx = 0; cons.gridy = 2;
		cons.gridwidth = 1; cons.gridheight = 1;
		cons.fill = GridBagConstraints.BOTH;
		cons.anchor = GridBagConstraints.CENTER;
		cons.weightx = cons.weighty = 1;
		addButton("Four", cons, layout);
		
		cons.gridx = 1; cons.gridy = 2;
		cons.gridwidth = 1; cons.gridheight = 1;
		cons.fill = GridBagConstraints.NONE;
		cons.anchor = GridBagConstraints.SOUTHWEST;
		cons.weightx = cons.weighty = 1;
		addButton("Five", cons, layout);
		
		cons.gridx = 2; cons.gridy = 2;
		cons.gridwidth = 1; cons.gridheight = 1;
		cons.fill = GridBagConstraints.BOTH;
		cons.anchor = GridBagConstraints.CENTER;
		cons.weightx = 2; cons.weighty = 1;
		addButton("Six", cons, layout);
	}
	public static void main(String [] args)
	{
		JFrame f = new TestGridBag();
		Toolkit theKit = f.getToolkit();
		Dimension wndSize = theKit.getScreenSize();
		f.setBounds(wndSize.width/4, wndSize.height/4,
				wndSize.width/2, wndSize.height/2);
		f.setVisible(true);
	}
	void addButton(String label, GridBagConstraints constraints, GridBagLayout layout)
	{
		JButton button = new JButton(label);
		layout.setConstraints(button, constraints);
		getContentPane().add(button);
	}
}