package doctord;
import org.newdawn.slick.Animation;
import org.newdawn.slick.geom.Vector2f;


public class Projectile extends Item {
	private int damage;
	
	public Projectile ( int d, Animation sprites, Vector2F location) {
		this.damage = d;
		super (sprites, location);
	}
	
	public int getDamage() {
		return this.damage;
	}
	
	}
