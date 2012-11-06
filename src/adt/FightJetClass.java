package adt;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public abstract class FightJetClass implements KeyListener{
	
	public abstract void noseUp();
	public abstract void noseDown();
	public abstract void tiltLeft();
	public abstract void tiltRight();
	public abstract void dropBomb();
	public abstract void fireGun();
	
	public int getRoundCount(){
		return roundCount;
	}
	
	public int getBombCount(){
		return bombCount;
	}
	
	@Override
	public void keyPressed(KeyEvent e) {
		switch(e.getKeyCode())
		{
		case KeyEvent.VK_LEFT: tiltLeft(); break;
		case KeyEvent.VK_RIGHT: tiltRight(); break;
		case KeyEvent.VK_UP: noseUp(); break;
		case KeyEvent.VK_DOWN: noseDown(); break;
		case KeyEvent.VK_SPACE: fireGun(); break;
		}
	}
	
	public int roundCount;
	public int bombCount;

}
