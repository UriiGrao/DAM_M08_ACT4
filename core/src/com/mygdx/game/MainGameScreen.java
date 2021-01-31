package com.mygdx.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.mygdx.game.actors.ActorJugador;

public class MainGameScreen extends BaseScreen {

    public MainGameScreen(MainGame game) {
        super(game);
    }

    private Stage stage;

    private ActorJugador jugador;

    @Override
    public void show() {
        stage = new Stage();
        jugador = new ActorJugador();

        stage.addActor(jugador);
        jugador.setPosition(0,0);
    }

    @Override
    public void hide() {
        stage.dispose();
    }

    @Override
    public void render(float delta) {
        Gdx.gl.glClearColor(1,1,1,1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

        stage.act();
        stage.draw();
    }
}
