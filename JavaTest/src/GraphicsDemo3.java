import java.awt.*;
import java.math.*;
import javax.swing.JFrame;

public class GraphicsDemo3 extends Canvas
{
	public void paint( Graphics g )
	{
		g.setColor(Color.yellow);
		g.fillOval(115, 0, 400, 400);
		g.setColor(Color.blue);
		g.fillOval(200, 100, 30, 30);
		g.fillOval(400, 100, 30, 30);
		g.setColor(Color.red);
		
		g.drawArc(280, 200, 70, 70, 240, 60);
		// labels
		g.setColor(Color.black);
		g.setFont(new Font(null));
		for ( int X=0; X<800; X += 50 )
		    g.drawString( String.valueOf(X), X, 50 );
		for ( int Y=100; Y<600; Y += 50 )
		    g.drawString( String.valueOf(Y), 28, Y );
		
		// lines
		g.setColor(Color.lightGray);
		for ( int X=0; X<800; X += 50 )
		    g.drawLine(X,0,X,599);    // horizontal
		for ( int Y=0; Y<600; Y += 50 )
		    g.drawLine(0,Y,799,Y);    // vertical
		
		g.fillOval(595, 395, 10, 10);
		g.setColor(Color.BLACK);
		g.drawOval(500, 300, 200, 200);
		double degrees;
		double radian;
		int locX,locY;
		for (int x=1; x<=12; x++)	
		{
			degrees=90-x*30;
			radian=Math.toRadians(degrees);
			System.out.println("x="+x+" "+String.valueOf(Math.floor(450+100*Math.cos(radian))));
			//g.drawString(String.valueOf(x), 500,500);
			locX=(int) Math.floor(600+80*Math.cos(radian));
			locY=(int) Math.floor(400-80*Math.sin(radian));
			g.drawString(String.valueOf(x),locX , locY);
			
			//g.drawString(String.valueOf(x), Math.floor(450+100*Math.sin(radian)), Math.floor(450+100*Math.cos(radian)));
			

		}
		
		
		/*
		// lines
		g.setColor(Color.green);
		
		g.drawLine(10,100,400,100);
		
		g.setColor(Color.blue);
		g.drawLine(50,150,100,180);
		g.setColor(Color.magenta);
		g.drawLine(100,350,300,230);

		g.setColor(Color.black);

		// fonts
		g.drawString("Graphics are pretty neat.", 500, 100);
		g.setFont(new Font("Consolas", Font.PLAIN, 36)); // 36-pt plain
		g.drawString("Yes, they are.", 400, 200);

		g.setColor(Color.white);
		g.setFont(new Font("Calibri", Font.BOLD+Font.ITALIC, 60)); // 60-pt italic bold
		g.drawString("Leander Lions", 300, 350);

		g.setColor(Color.blue);
		g.setFont(Font.decode("Calibri-BOLDITALIC-60")); // a different way to specify the same font
		g.drawString("Leander Lions", 290, 360);
		
		g.setColor(Color.black);
		g.setFont(new Font(null)); // restore default font

		int x=400, y=490;
		g.drawRect(x,y,150,20);
		g.drawString("Where is the starting point?", x,y);
		g.setColor(Color.red);
		g.drawLine(x,y,x,y);	// drawing a line from a point to itself makes a 1px-by-1px dot
		*/

	}

	public static void main( String[] args )
	{
		JFrame win = new JFrame("GraphicsDemo3: Fonts and Lines");
		win.setSize(800,600);
		win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GraphicsDemo3 canvas = new GraphicsDemo3();
		win.add( canvas );
		win.setVisible(true);
	}
}
