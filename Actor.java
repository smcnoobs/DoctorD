package doctord;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.geom.Vector2f;
import org.newdawn.slick.Animation;

public class Actor implements Actable {
	private Animation sprites;
	private Vector2f location;
	
	public Actor() {
		// TODO Auto-generated constructor stub
	}
	
	public Actor ( Animation spirtes, Vector2f location)
	{
		this.sprites = sprites;
		this.location = location;
	}


	public void move(Vector2f delta) {
		// TODO Auto-generated method stub
		
	}

	public void moveTo(Vector2f location) {
		// TODO Auto-generated method stub
		
	}

	public void update() {
		// TODO Auto-generated method stub
		
	}

	public void render(Graphics g) {
		// TODO Auto-generated method stub
		
	}

	public void die(int time) {
		// TODO Auto-generated method stub
		
	}

	public boolean isDead() {
		// TODO Auto-generated method stub
		return false;
	}

	public void collide(Actable a) {
		// TODO Auto-generated method stub
		
	}

	public Vector2f getLocation() {
		// TODO Auto-generated method stub
		return null;
	}
}
