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

public class PauseScreen implements Screen {
    private TankStars gameps;
    Texture pausescreen;
    Stage st;
    public PauseScreen(final TankStars game){
        this.gameps= game;
        pausescreen= new Texture("PAUSEscreen.jpg");
        st=new Stage(new ScreenViewport());
        final Image ips=new Image(pausescreen);
        ips.setPosition(0,0);

        final Image ips1=new Image(new Texture("resume.png"));
        ips1.setPosition(600,450);
        ips1.addListener(new ClickListener(){
            @Override
            public void clicked(InputEvent event, float x, float y) {
                gameps.setScreen(new GameScreen(game));
            }
        });

        Image ips2=new Image(new Texture("RESUMESCREEN-1.png"));
        ips2.setBounds(600,300,406,82);
//        ips2.addListener(new ClickListener(){
//            @Override
//            public void clicked(InputEvent event, float x, float y) {
////                gameps.setScreen(new GameScreen(game));
//            }
//        });

        Image ips3=new Image(new Texture("exit.png"));
        ips3.setPosition(600,150);
        ips3.addListener(new ClickListener(){
            @Override
            public void clicked(InputEvent event, float x, float y) {
                gameps.setScreen(new HomePage(game));
            }
        });

        st.addActor(ips);
        st.addActor(ips1);
        st.addActor(ips2);
        st.addActor(ips3);
    }
    @Override
    public void show() {
        Gdx.input.setInputProcessor(st);
    }

    @Override
    public void render(float delta) {
        Gdx.gl.glClearColor(1,0,0,1);
        st.act(delta);
        st.draw();
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
