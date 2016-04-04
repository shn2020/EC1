import javax.swing.JApplet;
import java.awt.Graphics;

public class SnowMan extends JApplet {
	public void paint(Graphics canvas) {
		
		// Draw 3 circle smaller from bottom to top
		canvas.drawOval(100, 25, 200, 200);
		canvas.drawOval(75, 225, 250, 250);
		canvas.drawOval(50, 475, 300, 300);
		
		// Draw happy face on the top circle
		canvas.fillOval(155, 100, 10, 20);
		canvas.fillOval(230, 100, 10, 20);
		canvas.drawArc(150, 160, 100, 50, 180, 180);
		
		
	}
}
