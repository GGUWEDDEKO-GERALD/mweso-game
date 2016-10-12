package com.mygdx.game.desktop;

import com.badlogic.gdx.Application;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.mygdx.game.MyGdxGame;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.title="MyGameGdx";
		config.useGL30=true;
		config.width=1280;
		config.height=720;

		new LwjglApplication(new MyGdxGame(), config);
		Gdx.app.setLogLevel(Application.LOG_DEBUG);
	}
}
