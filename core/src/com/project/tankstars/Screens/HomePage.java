package com.project.tankstars.Screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.utils.ClickListener;
import com.badlogic.gdx.utils.viewport.ScreenViewport;
import com.project.tankstars.TankStars;
import com.badlogic.gdx.scenes.scene2d.ui.Image;




public class HomePage implements Screen {
    private TankStars game1;
    Texture homepage;
    Stage stage;
    BitmapFont font = new BitmapFont();
    public HomePage(final TankStars game){
        this.game1=game;
        stage= new Stage(new ScreenViewport());

        homepage = new Texture("ms1.jpg");
        Image i=new Image(homepage);
        i.setPosition(0,0);
        i.setSize(1600,720);

        Image i2=new Image(new Texture("new.png"));
        i2.setPosition(1080,450);

        Image i3=new Image(new Texture("resume.png"));
        i3.setPosition(1080,300);

        Image i4=new Image(new Texture("exit.png"));
        i4.setPosition(1080,150);

        i2.addListener(new ClickListener(){
            @Override
            public void clicked(InputEvent event, float x, float y) {
                game1.setScreen(new ChooseTank1(game));
            }
        });
        i3.addListener(new ClickListener(){
            @Override
            public void clicked(InputEvent event, float x, float y) {
                game1.setScreen(new ResumeScreen(game));
            }
        });
        i4.addListener(new ClickListener(){
            @Override
            public void clicked(InputEvent event, float x, float y) {
                Gdx.app.exit();
            }
        });
        stage.addActor(i);
        stage.addActor(i2);
        stage.addActor(i3);
        stage.addActor(i4);

    }
    @Override
    public void show() {
        Gdx.input.setInputProcessor(stage);
    }

    @Override
    public void render(float delta) {
        Gdx.gl.glClearColor(1,0,0,1);
        stage.draw();
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
