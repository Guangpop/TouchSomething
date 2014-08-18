package com.shoi.ts;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.shoi.ts.game.Game;

public class ThouchSomethingGame extends ApplicationAdapter {
	SpriteBatch batch;
	Game game;

	@Override
	public void create () {
		batch = new SpriteBatch();
		game = new Game();
		
		game.create();
		
	}

	@Override
	public void render () {
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT); // clear screen
		
		game.act(Gdx.graphics.getDeltaTime()); 
		game.draw(); 
	}
}
