package com.heon.light.desktop;

import com.badlogic.gdx.backends.lwjgl3.Lwjgl3Application;
import com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration;
import com.heon.light.LightGame;

public class DesktopLauncher {
    public static void main(String[] args) {
        Lwjgl3ApplicationConfiguration config = new Lwjgl3ApplicationConfiguration();
        config.setTitle("My Light Game");
        config.setWindowedMode(1024, 600);
        new Lwjgl3Application(new LightGame(), config);
    }
}
