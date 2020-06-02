package volleyball;

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.sound.sampled.*;
import javax.swing.*;
//import java.util.Timer;

import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.TimeUnit;
import java.math.*;

public class Launcher extends JFrame implements ActionListener, KeyListener{

	public boolean  enter; 
	StartScreen start;
	Game2PMode game2P;
	GameComputerMode gameComputer;
	GameServer gameServer;
	GameClient gameClient;
	AePlayWave apw;
	public static final int START = 0;
	public static final int NOTSTART = 1;
	public int check=START;
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Launcher volleyball_frame = new Launcher();
		volleyball_frame.setVisible(true);
	}
	
	public Launcher() {
		setSize(1000, 540);
		setLocation(360, 50);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);
		addKeyListener(this);
		setFocusable(true);
		requestFocusInWindow();

		start = new StartScreen(this,1000,500);
		start.check_type();	
		apw = new AePlayWave("src/music/bgm.wav");
		apw.start();
//		Scanner scan = new Scanner(System.in);
//		String mode = scan.next();
//		
//		if (mode.toLowerCase().equals("2p")) {
//			Game2PMode game2P = new Game2PMode(this, 1000, 500);
//			game2P.start();
//		} else if (mode.toLowerCase().equals("internet1p")) {
//			GameServer gameServer = new GameServer(this, 1000, 500);
//			//GameClient gameClient = new GameClient(this, 1000, 500);
//			gameServer.start();
//			// gameClient.start();
//		} else if (mode.toLowerCase().equals("internet2p")) {
//			// GameServer gameServer = new GameServer(this, 1000, 500);
//			GameClient gameClient = new GameClient(this, 1000, 500);
//			// gameServer.start();
//			gameClient.start();
//		} else if(mode.toLowerCase().equals("computer")) {
//			// GameServer gameServer = new GameServer(this, 1000, 500);
//			GameComputerMode gameComputer = new GameComputerMode(this, 1000, 500);
//			// gameServer.start();
//			gameComputer.start();
//		}
		
	}
	
	@Override
	public void keyPressed(KeyEvent e) {
		if (e.getKeyCode() == KeyEvent.VK_ENTER) {
			if (start.choose==StartScreen.PLAYER1) {
				if (check == START) {
					apw.stop();
					start.stop();
					System.out.println("in");
					gameComputer = new GameComputerMode(this, 1000, 500);
					gameComputer.start();
					apw = new AePlayWave("src/music/bgm.wav");
					apw.start();
					check = NOTSTART;
				}
				
			}
			else if (start.choose==StartScreen.PLAYER2) {
				if (check == START) {
					apw.stop();
					start.stop();	
					game2P = new Game2PMode(this, 1000, 500);
					game2P.start();
					apw = new AePlayWave("src/music/bgm.wav");
					apw.start();
					check = NOTSTART;
				}
				
			}
			
			else if (start.choose==StartScreen.PLAYER3) {
				if (check == START) {
					apw.stop();
					start.stop();	
//					gameServer = new GameServer(this, 1000, 500);
//					gameClient = new GameClient(this, 1000, 500);
//					gameServer.start();
//					gameClient.start();
					apw = new AePlayWave("src/music/bgm.wav");
					apw.start();
					check = NOTSTART;
				}
			}
		}
		
		if(e.getKeyCode() == KeyEvent.VK_ESCAPE) {
			if (check == NOTSTART) {
				if (start.choose==StartScreen.PLAYER1) {
					gameComputer.stop();
					start = new StartScreen(this,1000,500);
					start.check_type();	
					apw.stop();
					apw = new AePlayWave("src/music/bgm.wav");
					apw.start();
					check=START;
				}
				else if (start.choose==StartScreen.PLAYER2) {
					game2P.stop();
					start = new StartScreen(this,1000,500);
					start.check_type();	
					apw.stop();
					apw = new AePlayWave("src/music/bgm.wav");
					apw.start();
					check=START;
				}
				else if (start.choose==StartScreen.PLAYER3) {
					gameServer.stop();
//					gameClient.stop();
					start = new StartScreen(this,1000,500);
					start.check_type();
					apw.stop();
					apw = new AePlayWave("src/music/bgm.wav");
					apw.start();
					check=START;
				}
			}
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
	}

	@Override
	public void keyTyped(KeyEvent e) {
		
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}
