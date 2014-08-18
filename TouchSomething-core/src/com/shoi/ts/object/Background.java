package com.shoi.ts.object;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.g2d.Batch;

public class Background extends GameObject {

	public Background() {
		setTexture("background.png");
		setScale(Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
		
	}
	
	@Override
	public void draw(Batch batch, float parentAlpha) {
		batch.disableBlending();
		super.draw(batch, parentAlpha);
		batch.enableBlending();
	}
	
	
}
