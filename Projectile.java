package doctord;
import org.newdawn.slick.Animation;
import org.newdawn.slick.geom.Vector2f;


public class Projectile extends Item {
	private int damage;
	
	public int getDamage() {
		return this.damage;
	}
	
	public Projectile () {
		this.damage = 0;
	}
	
	}
