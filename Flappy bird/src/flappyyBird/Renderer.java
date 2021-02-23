/**
 * 
 */
package flappyyBird;

import java.awt.Graphics;

import javax.swing.JPanel;

/**
 * @author elscrappo
 *
 */
public class Renderer extends JPanel
{
	
	private static final long serialVersionVID = 11;
	
	@Override
	protected void  paintComponent(Graphics g)
	{
		super.paintComponent(g);
		
		flappyBird.flappybird.repaint(g);
	}

}
