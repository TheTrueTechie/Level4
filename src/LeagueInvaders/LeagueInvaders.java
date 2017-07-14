package LeagueInvaders;

import javax.swing.JFrame;

public class LeagueInvaders {
	JFrame mainFrame;

	final static int WIDTH = 500;
	final int HEIGHT = 800;
	
	GamePanel b; 
	
	public static void main(String[] args) {
		LeagueInvaders a = new LeagueInvaders(); 
		a.setup();
	}

	LeagueInvaders() {
		b = new GamePanel(); 
		
		b.startGame(); 
	}

	private void setup() {
		mainFrame = new JFrame();
		mainFrame.add(b);
		mainFrame.addKeyListener(b);
		
		mainFrame.setTitle("League Invaders");

		mainFrame.setSize(WIDTH, HEIGHT);
		mainFrame.setVisible(true);
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
