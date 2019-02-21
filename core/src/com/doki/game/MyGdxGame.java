package com.doki.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import java.awt.event.KeyEvent;

public class MyGdxGame extends ApplicationAdapter {
	SpriteBatch b;
	Texture t[];
	int movPlX = 0;
	int movPlY = 150;
	float varAniPlayer = 0;
	boolean ver;
	KeyboardController controller = new KeyboardController();

	@Override
	public void create() {
		b = new SpriteBatch();
		t = new Texture[3];
		t[0] = new Texture("01.png");
		t[1] = new Texture("02.png");
		t[2] = new Texture("03.png");
		Gdx.input.setInputProcessor(controller);

	}

	@Override
	public void render() {
		boolean isPressedA = Gdx.input.isKeyPressed(Input.Keys.A);
		boolean isPressedD = Gdx.input.isKeyPressed(Input.Keys.D);
		boolean isPressedW = Gdx.input.isKeyPressed(Input.Keys.W);


		// movPlX += Gdx.graphics.getDeltaTime() * 10;


		b.begin();

		b.draw(new Texture("abc.png"), 0, 0, Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
		b.draw(t[(int) varAniPlayer], movPlX, movPlY, 100, 100);


		b.end();
		varAniPlayer += Gdx.graphics.getDeltaTime() * 5;


		if (isPressedA)
			movPlX--;
		if (isPressedD)
			movPlX++;
		if (varAniPlayer >= 3)
			varAniPlayer = 0;
		/*
        if(!(movPlX==560)&&!ver)
		    movPlX++;
        else if(movPlX==0)
            ver=false;
        else if(ver){
            movPlX--;
        }
        else{
            ver=true;
        }
        */
		Gdx.app.log("versiok", "extamente: " + ver + " e verdade:" + movPlY);





	}
}