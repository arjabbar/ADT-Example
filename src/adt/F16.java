package adt;

import java.awt.event.KeyEvent;

public class F16 extends FightJetClass{
	
	public String tailNumber, pilotName;
	
	public F16(String tailNumber, String pilotName) {
		this.bombCount = 2;
		this.roundCount = 500;
		this.tailNumber = tailNumber;
		this.pilotName = pilotName;
	}

	@Override
	public void noseUp() {
		System.out.println("Nose Up");
	}

	@Override
	public void noseDown() {
		System.out.println("Nose Down");
	}

	@Override
	public void tiltLeft() {
		System.out.println("Tilt Left");
	}

	@Override
	public void tiltRight() {
		System.out.println("Tilt Right");
	}

	@Override
	public void dropBomb() {
		System.out.println("Bomb Drop");
		this.bombCount--;
	}

	@Override
	public void fireGun() {
		System.out.println("Spitting Lead");
	}
	
	public void addBombs(int bombs){
		this.bombCount += bombs;
	}
	
	public void addBullets(int bullets)
	{
		this.roundCount += bullets;
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

}
