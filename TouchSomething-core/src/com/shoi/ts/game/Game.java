package com.shoi.ts.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.shoi.ts.object.Background;
import com.shoi.ts.object.Dango;

public class Game extends Stage {

	/////////////////////////////////////////////////////////////////
	// Fields
	/////////////////////////////////////////////////////////////////
	Background background;
	Dango dango;
	
	/////////////////////////////////////////////////////////////////
	// Methods
	/////////////////////////////////////////////////////////////////
	public boolean create() {
		
		Gdx.input.setInputProcessor(this); 
		
		background = new Background();
		dango = new Dango();
		
		this.addActor(background);
		this.addActor(dango);
		
		return true;
	}
	

}
