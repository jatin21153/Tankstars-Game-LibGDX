package com.project.tankstars.Screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Image;
import com.badlogic.gdx.scenes.scene2d.utils.ClickListener;
import com.badlogic.gdx.utils.viewport.ScreenViewport;
import com.project.tankstars.TankStars;

public class ResumeScreen implements Screen {
    private TankStars gamers;
    Texture resumescreen;
    Stage stagers;
    public ResumeScreen(final TankStars game){
        this.gamers=game;
        resumescreen = new Texture("ms1.jpg");
        stagers=new Stage(new ScreenViewport());
        Image image=new Image(resumescreen);
        image.setPosition(0,0);

        Image Image1=new Image(new Texture("game1.png"));
        Image1.setPosition(1000,450);


        Image Image2=new Image(new Texture("game2.png"));
        Image2.setPosition(1000,300);


        Image Image3=new Image(new Texture("game3.png"));
        Image3.setPosition(1000,150);


        Image Image4=new Image(new Texture("back.png"));
        Image4.setPosition(1080,30);


        Image4.addListener(new ClickListener(){
            @Override
            public void clicked(InputEvent event, float x, float y){
                gamers.setScreen(new HomePage(game));
            }
        });
        stagers.addActor(image);
        stagers.addActor(Image1);
        stagers.addActor(Image2);
        stagers.addActor(Image3);
        stagers.addActor(Image4);



    }
    @Override
    public void show() {
        Gdx.input.setInputProcessor(stagers);
    }

    @Override
    public void render(float delta) {
        Gdx.gl.glClearColor(1,0,0,1);
        stagers.draw();
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
