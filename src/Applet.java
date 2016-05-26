package JavaPP.src;

import processing.core.*;

/**
 * A simple program that shows an orange screen.
 */
public class Applet extends PApplet { 
	Monster bob;
	Person larry;
	Player jim;

	public void settings() {
		fullScreen();
		size(640, 480);
		bob = new Monster(this);
		larry = new Person(this);
		jim = new Player(this);
	}

	public void draw() {
		background(0,256,256);
		bob.loop(jim);
		larry.loop();
		jim.loop();
	}

	public void keyPressed() {
		if (key == CODED) {
			if (keyCode == UP)
				jim.y -= 20;
			if (keyCode == DOWN)
				jim.y +=20;
			if (keyCode == LEFT)
				jim.x -=20;
			if(keyCode == RIGHT)
				jim.x +=20;
		}
	}

}
