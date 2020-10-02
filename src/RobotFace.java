import java.awt.Color;
import acm.program.*;
import acm.graphics.*;

public class RobotFace extends GraphicsProgram {
	
	private static final int HEAD_WIDTH = 200;
	private static final int HEAD_HEIGHT = 250;
	private static final int EYE_RADIUS = 15;
	private static final int MOUTH_WIDTH = 150;
	private static final int MOUTH_HEIGHT = 30;
	
	public void run () {
		getFace(getWidth () / 2, getHeight () / 2);
	}
	private void getFace (double cx, double cy) {
		addHead(cx, cy);
		addEye(cx - HEAD_HEIGHT / 1.7 + 90, cy - HEAD_HEIGHT + 40);
		addEye(cx - HEAD_HEIGHT / 1.7 - 4, cy - HEAD_HEIGHT + 40);
		addMouth(cx - 27, cy - 20);
	}
	private void addHead(double cx, double cy) {
		double x = cx - HEAD_WIDTH - 2;
		double y = cy - HEAD_HEIGHT - 2;
		GRect head = new GRect(x, y, HEAD_WIDTH, HEAD_HEIGHT);
		head.setFilled (true);
		head.setFillColor(Color.GRAY);
		add(head);
	}
	private void addEye(double cx, double cy) {
		double x = cx - EYE_RADIUS;
		double y = cy - EYE_RADIUS;
		GOval eye = new GOval(x, y, 2 * EYE_RADIUS, 2 * EYE_RADIUS);
		eye.setFilled (true);
		eye.setFillColor(Color.YELLOW);
		add(eye);
	}
	private void addMouth(double cx, double cy) {
		double x = cx - MOUTH_WIDTH;
		double y = cy - MOUTH_HEIGHT;
		GRect mouth = new GRect(x, y, MOUTH_WIDTH, MOUTH_HEIGHT);
		mouth.setFilled(true);
		mouth.setFillColor(Color.WHITE);
		add(mouth);
	
	}
	
	}
