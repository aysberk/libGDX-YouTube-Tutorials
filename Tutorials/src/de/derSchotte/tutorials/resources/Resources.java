package de.derSchotte.tutorials.resources;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Preferences;
import com.badlogic.gdx.graphics.g2d.Animation;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;

public class Resources {

	public TextureAtlas atlas = new TextureAtlas(
			Gdx.files.internal("data/spritepack/spriteHD.pack"));

	// Texturen werden hier reingeschrieben
	public Animation walkUp = new Animation(0.2f, atlas.findRegions("WalkUp"));
	public Animation walkLeft = new Animation(0.2f, atlas.findRegions("WalkLeft"));
	public Animation walkDown = new Animation(0.2f, atlas.findRegions("WalkDown"));
	public Animation walkRight = new Animation(0.2f, atlas.findRegions("WalkRight"));
	
	public Sprite Background = atlas.createSprite("Background");
	public Sprite Logo = atlas.createSprite("Logo");
	
	// ENDE

	public static Resources instance;

	public static Resources getInstance() {
		if (instance == null) {
			instance = new Resources();
		}
		return instance;
	}
	
	public Resources() {
		reInit();
	}
	
	public void reInit() {
		dispose();
		
		Preferences prefs = Gdx.app.getPreferences("Tutorials");
		if(prefs.getInteger("antiAliasConfig",1) == 0) {
			atlas = new TextureAtlas(Gdx.files.internal("data/spritepack/sprite.pack"));
		} else {
			atlas = new TextureAtlas(Gdx.files.internal("data/spritepack/spriteHD.pack"));
		}
		
		// Texturen kommen hier hin.
		walkUp = new Animation(0.2f, atlas.findRegions("WalkUp"));
		walkLeft = new Animation(0.2f, atlas.findRegions("WalkLeft"));
		walkDown = new Animation(0.2f, atlas.findRegions("WalkDown"));
		walkRight = new Animation(0.2f, atlas.findRegions("WalkRight"));
		
		Background = atlas.createSprite("Background");
		Logo = atlas.createSprite("Logo");
		// ende
	}
	
	public void dispose() {
		atlas.dispose();
	}
}
