import javax.swing.*;
import java.awt.*;

public class Prog613
{
	public static void main (String[] args)
	{
		Frame613 f=new Frame613();
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
	}
}

class Frame613 extends JFrame
{
	public Frame613 ()
	{
		setTitle("613 rocks!");
		setSize(300,200);
		setLocation(500,200);
		
		Panel613 panel = new Panel613();
		Container cp = getContentPane();
		cp.add(panel);
		
	}
}

class Panel613 extends JPanel
{
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		g.drawString("Hi", 75, 100);
	}
}

/*
public class BoringWindow extends JFrame 
{
	public static void main (String[] args)
	{
		/*String name = JOptionPane.showInputDialog("What is your name?");
		String input= JOptionPane.showInputDialog("How old are you?");
		int age= Integer.parseInt(input);
		
		System.out.print("Hello," +name+ ".");
		System.out.println("Next year, you'll be " + (age+1));
		System.exit(0);
		
		JFrame f= new BoringWindow();
		//f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(300, 200);
		f.setVisible(true);
		//f.setBackground(100);
	}

}
*/
