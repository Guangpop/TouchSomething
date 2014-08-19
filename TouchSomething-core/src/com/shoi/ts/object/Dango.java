package com.shoi.ts.object;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Animation;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.math.MathUtils;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.scenes.scene2d.Touchable;
import com.badlogic.gdx.scenes.scene2d.actions.Actions;

public class Dango extends GameObject {
	
	float stateTime;
	Animation animation;
	Direct direct;
	
	int maxwidth; 
	int maxheight;
	
	public Dango() {
		
		TextureRegion [] walksFrameFront = new TextureRegion[4];
		Texture front1 = new Texture("Dango1.png");
		Texture front2 = new Texture("Dango2.png");
		Texture front3 = new Texture("Dango3.png");
		Texture front4 = new Texture("Dango4.png");
		
		walksFrameFront[0] = new TextureRegion(front1);
		walksFrameFront[1] = new TextureRegion(front2);
		walksFrameFront[2] = new TextureRegion(front3);
		walksFrameFront[3] = new TextureRegion(front4);
		
		animation = new Animation(0.25f, walksFrameFront);
		
		direct = Direct.STOP;
		
		maxwidth = Gdx.graphics.getWidth() - front1.getWidth(); 
		maxheight = Gdx.graphics.getHeight() - front1.getHeight();
		
		this.setTouchable(Touchable.enabled);
	}
	
	@Override
	public void draw(Batch batch, float parentAlpha) {
		stateTime += Gdx.graphics.getDeltaTime();
		TextureRegion currentFrame = animation.getKeyFrame(stateTime, true);
		this.setTexture(currentFrame.getTexture());

		if(this.getActions() == null || this.getActions().size == 0) {
			this.addAction(Actions.moveTo(MathUtils.random(0, maxwidth), MathUtils.random(0, 
                    maxheight), 4f));
		}
		
		super.draw(batch, parentAlpha);
	}
	
	@Override
	public Actor hit(float x, float y, boolean touchable) {
		Actor hit = super.hit(x, y, touchable);
		
		if(hit != null) {
			this.remove();
			return null;
		}
		
		return hit;
	}



	enum Direct {
		STOP,
		UP,
		DOWN,
		LEFT,
		RIGHT
	}
}
