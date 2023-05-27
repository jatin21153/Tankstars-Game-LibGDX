package com.project.tankstars.Screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.Pixmap;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Image;
import com.badlogic.gdx.scenes.scene2d.ui.ProgressBar;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;
import com.badlogic.gdx.scenes.scene2d.utils.ClickListener;
import com.badlogic.gdx.utils.viewport.ScreenViewport;
import com.project.tankstars.TankStars;

public class GameScreen implements Screen {
    private Skin skin,skin1;
    private TankStars gamegs;
    Stage stagegs;
    Integer POWER=0;
    Integer ANGLE=0;
    BitmapFont font=new BitmapFont();

    ProgressBar hb1,hb2;
    Texture gamescreen,fuel,bar1,bar2;
    public GameScreen(final TankStars game){
        this.gamegs=game;
        this.skin = new Skin(Gdx.files.internal("uiskin.json"));
        this.skin1 = new Skin(Gdx.files.internal("uiskin.json"));

        gamescreen = new Texture("gs1.jpg");
        stagegs=new Stage(new ScreenViewport());

//        hb2 = new Texture("hb.png");

        hb1 = new ProgressBar(0f, 10f, 0.5f, false, skin);
        hb1.setValue(9.0f);
        hb1.setBounds(170, 610, 400, 100);

        hb2 = new ProgressBar(0f, 10f, 0.5f, false, skin1);
        hb2.setValue(9.0f);
        hb2.setBounds(1020, 610, 400, 100);

        Image imgs=new Image(new Texture("menubutton.png"));
        imgs.setBounds(30,641,50,50);
        imgs.addListener(new ClickListener(){
            @Override
            public void clicked(InputEvent event, float x, float y) {
                gamegs.setScreen(new PauseScreen(game));
            }
        });

        Image ima1=new Image(gamescreen);
        ima1.setPosition(0,0);

        Pixmap pixmap1 = new Pixmap(90, 20, Pixmap.Format.RGBA8888);
        pixmap1.setColor(Color.YELLOW);
        pixmap1.fill();

        Pixmap pixmap = new Pixmap(100, 20, Pixmap.Format.RGBA8888);
        pixmap.setColor(Color.BLACK);
        pixmap.fill();

        Image ima3=new Image(new Texture(pixmap1));
        ima3.setPosition(100,100);

        Image ima2=new Image(new Texture(pixmap));
        ima2.setPosition(100,100);


        stagegs.addActor(ima1);
        stagegs.addActor(hb1);
        stagegs.addActor(hb2);
        stagegs.addActor(imgs);
        stagegs.addActor(ima2);
        stagegs.addActor(ima3);


    }

    @Override
    public void show() {
        Gdx.input.setInputProcessor(stagegs);
    }

    @Override
    public void render(float delta) {
        Gdx.gl.glClearColor(1,0,0,1);
        stagegs.act(delta);
        stagegs.draw();

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
