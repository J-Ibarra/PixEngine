package com.majoolwip.core.components;

import com.majoolwip.core.GameContainer;
import com.majoolwip.core.Renderer;

public class Collider extends Component
{
	private GameObject object;
	private float x, y, hW, hH;
	
	public Collider()
	{
		setTag("collider");
	}

	@Override
	public void update(GameContainer gc, GameObject object, float dt)
	{
		if(this.object == null) this.object = object;
		hW = object.getW() / 2;
		hH = object.getH() / 2;
		x = object.getX() + hW;
		y = object.getY() + hH;
		gc.getPhysics().addCollider(this);
	}

	@Override
	public void render(GameContainer gc, Renderer r)
	{

	}

	public void collision(GameObject object)
	{
		this.object.componentEvent(tag, object);
	}
	
	public float getX()
	{
		return x;
	}

	public void setX(float x)
	{
		this.x = x;
	}

	public float getY()
	{
		return y;
	}

	public void setY(float y)
	{
		this.y = y;
	}

	public float gethW()
	{
		return hW;
	}

	public void sethW(float hW)
	{
		this.hW = hW;
	}

	public float gethH()
	{
		return hH;
	}

	public void sethH(float hH)
	{
		this.hH = hH;
	}

	public GameObject getObject()
	{
		return object;
	}

	public void setObject(GameObject object)
	{
		this.object = object;
	}

}
