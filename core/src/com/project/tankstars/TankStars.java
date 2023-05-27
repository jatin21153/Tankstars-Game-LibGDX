package com.project.tankstars;

import com.badlogic.gdx.*;
import com.badlogic.gdx.assets.AssetManager;
import com.badlogic.gdx.audio.Music;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.ScreenUtils;
import com.project.tankstars.Screens.GameScreen;
import com.project.tankstars.Screens.LoadingScreen;

public class TankStars extends Game {
	public SpriteBatch batch;
	public BitmapFont font;
	public OrthographicCamera gamecam;
	public AssetManager assets;
	private Music mainmusic;
	private Music gamesong;




	@Override
	public void create () {
		assets = new AssetManager();
		gamecam = new OrthographicCamera();
		gamecam.setToOrtho(false,1600,720);
		batch = new SpriteBatch();
		setScreen(new LoadingScreen(this));
		font = new BitmapFont();
		mainmusic = Gdx.audio.newMusic(Gdx.files.internal("mainmusic.mp3"));
		gamesong = Gdx.audio.newMusic(Gdx.files.internal("themesong.mp3"));
		mainmusic.setLooping(true);
		mainmusic.play();

	}

	@Override
	public void resize(int width, int height) {

	}

	@Override
	public void render () {
		super.render();
		if(Gdx.input.isKeyJustPressed(Input.Keys.ESCAPE)){
			Gdx.app.exit();
		}
	}

	@Override
	public void pause() {

	}

	@Override
	public void resume() {

	}

	@Override
	public void dispose () {
		batch.dispose();
		font.dispose();
		assets.dispose();
	}
}
