package LeagueInvaders;

import java.awt.Color;
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

	final int MENU_STATE = 0;
	final int GAME_STATE = 1;
	final int END_STATE = 2;
	int currentState = MENU_STATE;

	GamePanel() {
		a = new GameObject();

		timer = new Timer(100 / 60, this);
	}

	public void startGame() {
		timer.start();

	}

	public void updateEndState() {

	}

	public void updateMenuState() {

	}

	public void updateGameState() {

	}

	public void drawMenuState(Graphics g) {
		g.setColor(Color.BLUE);
		g.fillRect(0, 0, 500, 800);

	}

	public void drawGameState(Graphics g) {
		a.draw(g);
		g.setColor(Color.BLACK);
		g.fillRect(0, 0, 500, 800);
	}

	public void drawEndState(Graphics g) {
		g.setColor(Color.RED);
		g.fillRect(0, 0, 500, 800);
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
		repaint();
		a.update();
		if (currentState == MENU_STATE) {
			updateMenuState();
		} else if (currentState == GAME_STATE) {
			updateGameState();
		} else if (currentState == END_STATE) {
			updateEndState();
		}

	}

	@Override
	public void keyTyped(KeyEvent e) {
		System.out.println("a");
	}

	@Override
	public void keyPressed(KeyEvent e) {
		boolean a = false;
		System.out.println("b");
		if (e.VK_ENTER == e.getKeyCode()) {
			System.out.println("bb");
			if (currentState == 0) {
				currentState = GAME_STATE;
			}
			if (currentState == 1) {
				currentState = END_STATE;
			}
			if (currentState == 2) {
				currentState = MENU_STATE;
			}

		}

	}

	@Override
	public void keyReleased(KeyEvent e) {
		System.out.println("c");

	}
}
