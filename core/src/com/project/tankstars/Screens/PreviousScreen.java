package com.project.tankstars.Screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.Texture;
import com.project.tankstars.TankStars;

public class PreviousScreen implements Screen {
    private TankStars game;
    Texture previousscreen;
    public PreviousScreen(TankStars game){
        this.game= game;
        previousscreen = new Texture("previousscreen.jpg");

    }

    @Override
    public void show() {

    }

    @Override
    public void render(float delta) {
        Gdx.gl.glClearColor(1,0,0,1);
        game.batch.begin();
        game.batch.draw(previousscreen,0,0);
        game.batch.end();
    }

    @Override
    public void resize(int width, int height) {

    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void hide() {

    }

    @Override
    public void dispose() {

    }
}
