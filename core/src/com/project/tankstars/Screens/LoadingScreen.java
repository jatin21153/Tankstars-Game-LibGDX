package com.project.tankstars.Screens;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import static com.badlogic.gdx.scenes.scene2d.actions.Actions.*;

import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Image;
import com.badlogic.gdx.utils.viewport.FitViewport;
import com.project.tankstars.TankStars;

import javax.swing.plaf.basic.BasicDesktopIconUI;

public class LoadingScreen implements Screen {
    private TankStars game;
    BitmapFont font= new BitmapFont();
    Texture loadingscreen;
    private ShapeRenderer bar;




    public LoadingScreen(TankStars game){
        this.game=game;
        loadingscreen= new Texture("loadingscreen.png");
    }
    @Override
    public void show() {

    }

    @Override
    public void render(float delta) {
        Gdx.gl.glClearColor(1,0,0,1);
        game.batch.begin();
        game.batch.draw(loadingscreen,0,0);
        font.draw(game.batch, "PRESS ENTER TO CONTINUE. PRESS ESCAPE TO EXIT",20,20);
        game.batch.end();
        if (Gdx.input.isKeyJustPressed(Input.Keys.ENTER)){
            game.setScreen(new HomePage(game));
        }

    }
    public void update(float delta){

//        progress= game.assets.getProgress();

    }
    private void queueAssets(){
        game.assets.load("loadingscreen.png",Texture.class);
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
