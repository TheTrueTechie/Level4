package LeagueInvaders;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JPanel;
import javax.swing.Timer;

public class GamePanel extends JPanel implements ActionListener, KeyListener {
	Timer timer;
	GameObject a;
	Rocketship c; 
	ObjectManager d; 

	final int MENU_STATE = 0;
	final int GAME_STATE = 1;
	final int END_STATE = 2;
	int currentState = MENU_STATE;
	
	Font mainFont; 

	GamePanel() {
		a = new GameObject();
		c = new Rocketship(250,700,50,50);
		d = new ObjectManager(); 

		timer = new Timer(1000 / 60, this);
		
		mainFont = new Font("Arial", Font.PLAIN, 48);
		
		d.addObject(c); 

	}

	public void startGame() {
		timer.start();

	}

	public void updateEndState() {

	}

	public void updateMenuState() {

	}

	public void updateGameState() {
		d.manageEnemies();
		d.update();
	}

	public void drawMenuState(Graphics g) {
		g.setColor(Color.BLUE);
		g.fillRect(0, 0, 500, 800);
		g.setFont(mainFont);
		g.setColor(Color.BLACK);
		g.drawString("League Invaders", 50, 50);
		

	}

	public void drawGameState(Graphics g) {
		a.draw(g);
		g.setColor(Color.BLACK);
		g.fillRect(0, 0, 500, 800);

		d.draw(g);
	}

	public void drawEndState(Graphics g) {
		g.setColor(Color.RED);
		g.fillRect(0, 0, 500, 800);
		g.setFont(mainFont);
		g.setColor(Color.BLACK);
		g.drawString("GAME OVER", 50, 50);
	}

	public void paintComponent(Graphics g) {
		
		if (currentState == MENU_STATE) {
			drawMenuState(g);
		} else if (currentState == GAME_STATE) {
			drawGameState(g);
		} else if (currentState == END_STATE) {
			drawEndState(g);
		}

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		//repaint();
		a.update();
		if (currentState == MENU_STATE) {
			//System.out.println("bbbb");
			updateMenuState();
		} else if (currentState == GAME_STATE) {
			updateGameState();
		} else if (currentState == END_STATE) {
			updateEndState();
		}
		repaint(); 
	}

	@Override
	public void keyTyped(KeyEvent e) {
	}

	@Override
	public void keyPressed(KeyEvent e) {
		boolean a = false;
		System.out.println("b");
		if (e.VK_ENTER == e.getKeyCode()) {
			if (currentState == 0) {
				currentState = GAME_STATE;
			}
			else if (currentState == 1) {
				currentState = END_STATE;
			}
			else if (currentState == 2) {
				currentState = MENU_STATE;
			}

		}

		if(e.VK_UP == e.getKeyCode()) {
			c.yspeed = -7; 
		}
		if(e.VK_DOWN == e.getKeyCode()) {
			c.yspeed = 7; 
		}
		if(e.VK_LEFT == e.getKeyCode()) {
			c.xspeed = -10; 
		}
		if(e.VK_RIGHT == e.getKeyCode()) {
			c.xspeed = 10; 
		}
		
		if (e.VK_SPACE==e.getKeyCode()) {
			d.addObject(new Projectile(c.x+c.width/2, c.y, 10, 10));
		}
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		if(e.VK_UP == e.getKeyCode()) {
			c.yspeed = 0; 
		}
		if(e.VK_DOWN == e.getKeyCode()) {
			c.yspeed = 0; 
		}
		if(e.VK_LEFT == e.getKeyCode()) {
			c.xspeed = 0; 
		}
		if(e.VK_RIGHT == e.getKeyCode()) {
			c.xspeed = 0; 
		}
	}
}
