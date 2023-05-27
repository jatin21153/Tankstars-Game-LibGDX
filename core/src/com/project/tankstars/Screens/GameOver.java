package com.project.tankstars.Screens;


import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Image;
import com.badlogic.gdx.scenes.scene2d.utils.ClickListener;
import com.badlogic.gdx.utils.viewport.ScreenViewport;
import com.project.tankstars.TankStars;

public class GameOver  implements Screen {
    private final TankStars gameov;
    Texture gameover;

    Stage stagego;

    public GameOver(final TankStars game,int winner){
        this.gameov=game;
        if(winner==1) {
            gameover = new Texture("Go1.jpg");
        }
        else if (winner==2) {
            gameover= new Texture("Go2.jpg");
        }
        stagego=new Stage(new ScreenViewport());
        Image ii=new Image(gameover);
        ii.setPosition(0,0);

        Image ii1=new Image(new Texture("exit.png"));
        ii1.setPosition(600,200);
        ii1.addListener(new ClickListener(){
           @Override
           public void clicked(InputEvent event, float x, float y){
               gameov.setScreen(new HomePage(game));
           }
        });
        stagego.addActor(ii);
        stagego.addActor(ii1);


    }
    @Override
    public void show() {
        Gdx.input.setInputProcessor(stagego);
    }

    @Override
    public void render(float delta) {
        Gdx.gl.glClearColor(1,0,0,1);

        stagego.draw();
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
