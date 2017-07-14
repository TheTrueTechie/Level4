package LeagueInvaders;

import java.awt.Color;
import java.awt.Graphics;

public class Rocketship extends GameObject {
	int xspeed = 0; 
	int yspeed = 0; 
Rocketship(int x, int y, int width, int height) { 
	this.x=x; 
	this.y=y;
	this.width=width;
	this.height=height; 
	

}

public void update() {
	x+=xspeed; 
	y+=yspeed; 
	
}

public void draw(Graphics g) {
	g.setColor(Color.BLUE);
	g.fillRect(x, y, width, height);

}
}
