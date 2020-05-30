package volleyball;

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.sound.sampled.*;
import javax.swing.*;
//import java.util.Timer;

import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.TimeUnit;
import java.math.*;

public class Main extends JFrame implements ActionListener, KeyListener{

	JLabel background = new JLabel(new ImageIcon("src/image/background3.png"));
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main volleyball_frame = new Main();
		volleyball_frame.setVisible(true);
	}
	
	public Main() {
		setSize(1000, 540);
		setLocation(360, 50);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);
		addKeyListener(this);
		setFocusable(true);
		requestFocusInWindow();
	
		
		Game2PMode game2P = new Game2PMode(this, 1000, 500);
		game2P.start();
		
		
		
		
		background.setSize(1000, 500);
		background.setLocation(0, 0);
		background.setVisible(true);
		add(background);
	}
	

	
	
	@Override
	public void keyPressed(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}
