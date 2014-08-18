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
	
	/////////////////////////////////////////////////////////////////
	// Methods
	/////////////////////////////////////////////////////////////////
	public GameObject() {
		initObject();
	}
	
	public boolean initObject() {
		setTexture("holder.png");
		return true;
	}
	
	public boolean setTexture(String fileString) {
		image = new Texture(fileString);
		setBounds();
		return true;
	}
	
	public boolean setTexture(Texture texture) {
		image = texture;
		setBounds();
		return true;
	}

	private void setBounds() {
		setBounds(getX(), getY(), image.getWidth(), image.getHeight());
	}
	
	@Override
	public void setSize(float width, float height) {
		// TODO Auto-generated method stub
		super.setSize(width, height);
	}

	@Override
	public void draw(Batch batch, float parentAlpha) {
		batch.draw(image, this.getX(), getY());
	}

}
