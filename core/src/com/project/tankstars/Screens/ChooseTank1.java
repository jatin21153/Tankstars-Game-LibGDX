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

public class ChooseTank1 implements Screen {
    Stage stage;
    private final TankStars gamect;
    Texture choosetank1;

    Stage stagect;
    public ChooseTank1(final TankStars game){

        this.gamect = game;
        choosetank1 = new Texture("ct1.jpg");
        stagect=new Stage(new ScreenViewport());
        Image I=new Image(choosetank1);
        I.setPosition(0,0);
        I.setSize(1600,720);

        Image I1=new Image(new Texture("t1.png"));
        I1.setPosition(325,350);
        I1.setSize(550,230);

        Image I2=new Image(new Texture("t2.png"));
        I2.setPosition(890,350);
        I2.setSize(550,230);

        Image I3=new Image(new Texture("t3.png"));
        I3.setPosition(330,100);
        I3.setSize(550,230);

        Image I4=new Image(new Texture("t4.png"));
        I4.setPosition(900,100);
        I4.setSize(540,230);

        Image I5=new Image(new Texture("back.png"));
        I5.setPosition(1200,10);
//        I5.setSize(1600,720);

        I1.addListener(new ClickListener(){
            @Override
            public void clicked(InputEvent event, float x, float y) {
                gamect.setScreen(new ChooseTank2(game));
            }
        });
        I2.addListener(new ClickListener(){
            @Override
            public void clicked(InputEvent event, float x, float y) {
                gamect.setScreen(new ChooseTank2(game));
            }
        });
        I3.addListener(new ClickListener(){
            @Override
            public void clicked(InputEvent event, float x, float y) {
                gamect.setScreen(new ChooseTank2(game));
            }
        });
        I4.addListener(new ClickListener(){
            @Override
            public void clicked(InputEvent event, float x, float y) {
                gamect.setScreen(new ChooseTank2(game));
            }
        });
        I5.addListener(new ClickListener(){
            @Override
            public void clicked(InputEvent event, float x, float y) {
                gamect.setScreen(new HomePage(game));
            }
        });
        stagect.addActor(I);
        stagect.addActor(I1);
        stagect.addActor(I2);
        stagect.addActor(I3);
        stagect.addActor(I4);
        stagect.addActor(I5);

    }

    @Override
    public void show() {
        Gdx.input.setInputProcessor(stagect);
    }

    @Override
    public void render(float delta) {
        Gdx.gl.glClearColor(1,0,0,1);
        stagect.draw();
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
