package fascfighter;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.RenderingHints;
import java.awt.geom.GeneralPath;
import java.util.LinkedList;

import javax.swing.SwingUtilities;

import fascfighter.nodes.combat.Attack;
import fascfighter.nodes.health.Eat;
import fascfighter.Methods;
import fascfighter.Variables;

import org.hexbot.api.input.Mouse;
import org.hexbot.api.listeners.Paintable;
import org.hexbot.script.Manifest;
import org.hexbot.script.Script;




/*
 * Author: Fascination
 */

@Manifest(name = "[v0.1] Fascinating AIO Fighter", description = "If you can kill it, it supports it.", author = "Fascination", version = 0.1)
public class FascinatingFighter extends Script implements Paintable {

	@Override
	public int loop() {
		
		//Attack.attackNode();
	if(!Methods.lootNow()){
		Attack.attack();
	}
	
	Eat.EatFood();
		//LootMethod.looting();

		return 50;
	}

	@Override
	public void onEnd() {
		log("Thanks for using Fascinating AIO Fighter");

	}

	@Override
	public void onStart() {
		log("Welcome to Fascinating Fighter"
				+ " - Please choose your options in the GUI");
		initiateGUI();
	}

	public void initiateGUI() {
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				final GUI gui = new GUI();
				gui.setVisible(true);
				gui.setResizable(false);
			}
		});

	}

	final LinkedList<MousePathPoint> mousePath = new LinkedList<MousePathPoint>();

	@SuppressWarnings("serial")
	public class MousePathPoint extends Point {
		private long finishTime;
		@SuppressWarnings("unused")
		private double lastingTime;

		@SuppressWarnings("unused")
		private int toColor(double d) {
			return Math.min(255, Math.max(0, (int) d));
		}

		public MousePathPoint(int x, int y, int lastingTime) {
			super(x, y);
			this.lastingTime = lastingTime;
			finishTime = System.currentTimeMillis() + lastingTime;
		}

		public boolean isUp() {
			return System.currentTimeMillis() > finishTime;
		}
	}

	@SuppressWarnings("unused")
	private GeneralPath pathFrom(int[] xs, int[] ys) {
		GeneralPath gp = new GeneralPath();
		gp.moveTo(xs[0], ys[0]);
		for (int i = 1; i < xs.length; i++)
			gp.lineTo(xs[i], ys[i]);
		gp.closePath();
		return gp;
	}

	private final Color color1 = new Color(0, 0, 0);
    private final Color color2 = new Color(255, 255, 255);
    private final Color color3 = new Color(204, 204, 204);
    private final Color color4 = new Color(0, 204, 204);
    

    private final Font font1 = new Font("Cambria Math", 0, 13);
    private final Font font2 = new Font("Cambria Math", 0, 11);

	
	@Override
	public void paint(Graphics g) {
		
		Graphics2D g1 = (Graphics2D)g;
        g1.setColor(color1);
        //g1.fillRect(11, 16, 131, 168);
        g1.fillRect(11, 16, 131, 168);
        
        g1.setFont(font1);
        g1.setColor(color2);
        g1.drawString("Fascinating AIO Fighter", 12, 33);
        g1.setFont(font2);
        g1.setColor(color3);
        g1.drawString("Attack exp:", 14, 57);
        g1.drawString("Strength exp:", 14, 72);
        g1.drawString("Defence exp:", 14, 85);
        g1.drawString("HP:", 14, 116);
        g1.drawString("Foods eaten:", 14, 129);
        g1.drawString("Kills:", 14, 145);
        g1.setColor(color4);
        g1.drawString("Status: " + Variables.Status, 14, 179);

		//g.drawString("Status: " + Variables.Status, 20, 30);

		final RenderingHints antialiasing = new RenderingHints(
				RenderingHints.KEY_ANTIALIASING,
				RenderingHints.VALUE_ANTIALIAS_ON);

		((Graphics2D) g).setRenderingHints(antialiasing);
		Graphics2D spinner = (Graphics2D) g.create();
		spinner.setColor(Color.BLUE); // you can change ur color (e.g.
										// CYAN, WHITE)
		spinner.rotate(System.currentTimeMillis() % 2000d / 2000d * (-360d) * 2
				* Math.PI / 180.0, Mouse.getX(), Mouse.getY());
		spinner.drawLine(Mouse.getX() - 8, Mouse.getY(), Mouse.getX() + 8,
				Mouse.getY());
		spinner.drawLine(Mouse.getX(), Mouse.getY() - 8, Mouse.getX(),
				Mouse.getY() + 8);
		while (!mousePath.isEmpty() && mousePath.peek().isUp())
			mousePath.remove();
		Point clientCursor = Mouse.getLocation();
		MousePathPoint mpp = new MousePathPoint(clientCursor.x, clientCursor.y,
				300);
		if (mousePath.isEmpty() || !mousePath.getLast().equals(mpp))
			mousePath.add(mpp);
		MousePathPoint lastPoint = null;
		for (MousePathPoint a : mousePath) {
			if (lastPoint != null) {
				g.drawLine(a.x, a.y, lastPoint.x, lastPoint.y);
			}
			lastPoint = a;
		}

	}

}