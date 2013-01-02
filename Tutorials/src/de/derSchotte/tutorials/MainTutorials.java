package de.derSchotte.tutorials;

import com.badlogic.gdx.Game;


public class MainTutorials extends Game {

	// Allgemeine Einstellungen für TITLE und Festergröße
	protected static final String TITLE = "YouTube-Tutorials";
	protected static final String VERSION = " 0.0.0.01 pre-alpha";
	
	public static final int windowWidth = 800;
	public static final int windowHeight = windowWidth / 16 * 9;
	
	public void create() {
		// Erste Ausgabe im Fenster ist SplashScreen.
//		setScreen(new SplashScreen(this));
	}

}
