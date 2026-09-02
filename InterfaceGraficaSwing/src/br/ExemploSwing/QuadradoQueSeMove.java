package br.ExemploSwing;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class QuadradoQueSeMove extends JPanel implements KeyListener{
	private int x,y;
	
	public QuadradoQueSeMove() {
		setBackground(Color.DARK_GRAY);
		setFocusable(true);
		addKeyListener(this);
	}

	public static void main(String[] args) {
		JFrame frame =new JFrame("Quadrado Que Se Move");
		frame.add(new QuadradoQueSeMove());
		frame.setSize(640,480);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		int tecla=e.getKeyCode();
		if(tecla==KeyEvent.VK_UP){y-=10;}
		if(tecla==KeyEvent.VK_DOWN){y+=10;}
		if(tecla==KeyEvent.VK_LEFT){x-=10;}
		if(tecla==KeyEvent.VK_RIGHT){x+=10;}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setColor(Color.blue);
		g.fillRect(x, y, 20, 30);
		
		repaint();
	}

}
