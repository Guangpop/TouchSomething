package com.shoi.ts.object;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.scenes.scene2d.Actor;

public abstract class GameObject extends Actor implements IGameObject {

	/////////////////////////////////////////////////////////////////
	// Fields
	/////////////////////////////////////////////////////////////////
	
	Texture image;
	Sprite sprite;
	/////////////////////////////////////////////////////////////////
	// Methods
	/////////////////////////////////////////////////////////////////
	public GameObject() {
		initObject();
	}
	
	public boolean initObject() {
		
		image = new Texture("holder.png");
		sprite = new Sprite(image);
		return true;
	}
	
	public boolean setTexture(String fileString) {
		image = new Texture(fileString);
		setSprite(image);
		return true;
	}
	
	public boolean setTexture(Texture texture) {
		image = texture;
		setSprite(image);
		return true;
	}

	public void setColor(float r, float g, float b, float a) {
		sprite.setColor(r, g, b, a);
	}
	
//	public void setSize(int width, int height) {
//		sprite.setSize(width, height);
//		this.setWidth(width);
//		this.setHeight(height);
//	}
	
	/** Called when the actor's position has been changed. */
	@Override
	protected void positionChanged () {
		sprite.setPosition(this.getX(), this.getY());
	}

	/** Called when the actor's size has been changed. */
	@Override
	protected void sizeChanged () {
		sprite.setSize(this.getWidth(), this.getHeight());
	}
	
	private void setSprite(Texture texture) {
		sprite.setTexture(image);
		setSize(image.getWidth(), image.getHeight());
	}

	@Override
	public void draw(Batch batch, float parentAlpha) {
		//batch.draw(sprite, this.getX(), getY());
		sprite.draw(batch);
	}

}
