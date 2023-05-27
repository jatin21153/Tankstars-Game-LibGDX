package com.project.tankstars.Screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Image;
import com.badlogic.gdx.scenes.scene2d.utils.ClickListener;
import com.badlogic.gdx.utils.viewport.ScreenViewport;
import com.project.tankstars.TankStars;

public class ChooseTank2 implements Screen {
    Stage stage;
    private final TankStars gamect2;
    Texture choosetank2;

    Stage stagect2;
    public ChooseTank2(final TankStars game){

        this.gamect2 = game;
        choosetank2 = new Texture("ct2.jpg");
        stagect2=new Stage(new ScreenViewport());
        Image Im=new Image(choosetank2);
        Im.setPosition(0,0);
        Im.setSize(1600,720);

        Image Im1=new Image(new Texture("t1.png"));
        Im1.setPosition(325,350);
        Im1.setSize(550,230);

        Image Im2=new Image(new Texture("t2.png"));
        Im2.setPosition(890,350);
        Im2.setSize(550,230);

        Image Im3=new Image(new Texture("t3.png"));
        Im3.setPosition(330,100);
        Im3.setSize(550,230);

        Image Im4=new Image(new Texture("t4.png"));
        Im4.setPosition(900,100);
        Im4.setSize(540,230);

        Image Im5=new Image(new Texture("back.png"));
        Im5.setPosition(1200,10);

        Im1.addListener(new ClickListener(){
            @Override
            public void clicked(InputEvent event, float x, float y) {
                gamect2.setScreen(new GameScreen(game));
            }
        });
        Im2.addListener(new ClickListener(){
            @Override
            public void clicked(InputEvent event, float x, float y) {
                gamect2.setScreen(new GameScreen(game));
            }
        });
        Im3.addListener(new ClickListener(){
            @Override
            public void clicked(InputEvent event, float x, float y) {
                gamect2.setScreen(new GameScreen(game));
            }
        });
        Im4.addListener(new ClickListener(){
            @Override
            public void clicked(InputEvent event, float x, float y) {
                gamect2.setScreen(new GameScreen(game));
            }
        });
        Im5.addListener(new ClickListener(){
            @Override
            public void clicked(InputEvent event, float x, float y) {
                gamect2.setScreen(new ChooseTank1(game));
            }
        });
        stagect2.addActor(Im);
        stagect2.addActor(Im1);
        stagect2.addActor(Im2);
        stagect2.addActor(Im3);
        stagect2.addActor(Im4);
        stagect2.addActor(Im5);

    }
    @Override
    public void show() {
        Gdx.input.setInputProcessor(stagect2);
    }

    @Override
    public void render(float delta) {
        Gdx.gl.glClearColor(1,0,0,1);
        stagect2.draw();
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
