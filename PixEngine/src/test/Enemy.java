package test;

import com.majoolwip.core.GameContainer;
import com.majoolwip.core.Renderer;
import com.majoolwip.core.components.Collider;
import com.majoolwip.core.components.GameObject;

public class Enemy extends GameObject
{
	private GameObject target = null;
	
	public Enemy(int x, int y)
	{
		this.x = x;
		this.y = y;
		w = 16;
		h = 64;
		addComponent(new Collider());
	}

	@Override
	public void update(GameContainer gc, float dt)
	{
		if(target == null)
			target = gc.getGame().peek().getManager().findObject("ball");
		
		if(target.getY() + target.getH() / 2 > y - 2)
		{
			y += dt * 75;
		}
		
		if(target.getY() + target.getH() / 2 < y + 2)
		{
			y -= dt * 75;
		}
			
		updateComponents(gc, dt);
	}

	@Override
	public void render(GameContainer gc, Renderer r)
	{
		r.drawFillRect((int)x, (int)y, (int)w, (int)h, 0xffff0000);
	}

	@Override
	public void componentEvent(String name, GameObject object)
	{
	
	}

	@Override
	public void dispose()
	{

	}

}
