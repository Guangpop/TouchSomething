package com.shoi.ts.object;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Animation;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.math.MathUtils;
import com.badlogic.gdx.scenes.scene2d.actions.Actions;
import com.badlogic.gdx.scenes.scene2d.actions.MoveToAction;
import com.badlogic.gdx.scenes.scene2d.actions.SequenceAction;

public class Dango extends GameObject {
	
	float stateTime;
	Animation animation;
	Direct direct;
	
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
		
		int maxwidth = Gdx.graphics.getWidth() - front1.getWidth(); 
		int maxheight = Gdx.graphics.getHeight() - front1.getHeight();
		
		this.addAction(Actions.moveTo(200, 300));
		this.setTexture(front1);
		
	}
	
	@Override
	public void draw(Batch batch, float parentAlpha) {
		stateTime += Gdx.graphics.getDeltaTime();
		//TextureRegion currentFrame = animation.getKeyFrame(stateTime, true);
		//this.setTexture(currentFrame.getTexture());
		//batch.draw(sprite,this.getX(),getY());
		super.draw(batch, parentAlpha);
	}
	
	
	enum Direct {
		STOP,
		UP,
		DOWN,
		LEFT,
		RIGHT
	}
}
