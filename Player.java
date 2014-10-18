package doctord;
import org.newdawn.slick.Animation;
import org.newdawn.slick.geom.Vector2f;


public class Player extends Actor {
	private static int health = 0;
	private static float fuel = 0;
	private int effectDuration;
	private enum currentEffect;
	private ControlHandler controls;
	private boolean isShielded = false;
	
	public Player(Animation sprites, Vector2F location, ControlHandler i, int h, float f) {
		super(sprites, location);
		this.health = h;
		this.fuel = f;
		this.controls = i;
	}
	public static int getHealth() {
		return health;
	}
	public static float getFuel() {
		return fuel;
	}
	public void setControls(ControlHandler ch) {
		this.controls = ch;
	}
	public void shield() {
		this.isShielded = true;
	}
	}
