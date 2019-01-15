package com.sheinhtike.flappybird.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.sheinhtike.flappybird.FlappyGame;

public class DesktopLauncher {
    public static void main(String[] arg) {
        LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
        config.width = FlappyGame.WIDTH;
        config.height = FlappyGame.HEIGHT;
        new LwjglApplication(new FlappyGame(), config);
    }
}
