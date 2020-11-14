import java.awt.GridLayout;

public class CustomGridLayout extends GridLayout{


	public CustomGridLayout()
	{
		super(1, 0, 0, 0);
	}
	
	public CustomGridLayout(int rows, int cols) 
	{
		this (rows, cols, 0, 0);
	}
	
	public CustomGridLayout(int rows, int cols, int hgap, int vgap)
	{
		super(rows, cols, hgap, vgap);
	}
	
	
	
	
}
