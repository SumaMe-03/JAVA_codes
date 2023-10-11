import java.awt.*;
import java.awt.geom.*;
import javax.swing.*;


public class exp11 extends JPanel{
	
	public static void main(String[] args) {
		JFrame f = new JFrame("Exp 11");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.getContentPane().add(new exp11());
		f.setSize(500,500);
		f.setLocation(550,25);
		f.setVisible(true);
		Font font1 = new Font("Arial", Font.BOLD, 14);
		f.setBackground(Color.WHITE);
		f.setFont(font1);
	}
	
	public void paint(Graphics g) {
		g.setColor(Color.RED);
		g.drawLine(150,50,90,50);
		
		Graphics2D g2 = (Graphics2D) g;
		g2.setColor(Color.BLACK);
		g2.drawRect(60,100,180,60);
		
		Graphics2D g3  = (Graphics2D) g;
		g3.setColor(Color.BLUE);
		g3.drawOval(60,200,180,60);
		
		g3.drawString("These are shapes",80,300);
	}

}
