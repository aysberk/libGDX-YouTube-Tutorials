package de.derSchotte.tutorials;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;

public class Main {
	
	/*
	 * MainTutorials.TITLE / .VERSION / .windowWidth / .windowHeight
	 * Diese werden in der MainTutorials.java bereitgestellt und können hier verwendet werden.
	 * cfg.fullscreen und ccfg.resizeable sind auf false gesetzt damit das Fenster nicht in Fullscreen gesetzt werden kann.
	 * resizeable auf false damit das Fenster in seiner größe nicht verändert werden kann.
	 * 
	 *  cfg.use20 = true um Texturen zu verwenden welche nicht PowerOf2 verwenden ( z.b. 8x8, 16x16, 32x32 usw. )
	 */
	public static void main(String[] args) {
		LwjglApplicationConfiguration cfg = new LwjglApplicationConfiguration();
		cfg.title = MainTutorials.TITLE + MainTutorials.VERSION;
		cfg.useGL20 = true;
		cfg.width = MainTutorials.windowWidth;
		cfg.height = MainTutorials.windowHeight;
		cfg.fullscreen = false;
		cfg.resizable = false;
		
		new LwjglApplication(new MainTutorials(), cfg);
	}
}
