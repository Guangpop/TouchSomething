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
	
	/////////////////////////////////////////////////////////////////
	// Methods
	/////////////////////////////////////////////////////////////////
	public boolean create() {
		
		Gdx.input.setInputProcessor(this); 
		
		background = new Background();
		this.addActor(background);
		
		for (int i = 0 ; i < 50 ; ++i) {
			this.addActor(new Dango());
		}

		
		return true;
	}
	
}
