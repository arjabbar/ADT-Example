package adt;

import java.awt.event.KeyEvent;

public class POSJet extends FightJetClass{
	
	public String tailNumber, pilotName;

	public POSJet(String tailNumber, String pilotName) {
		this.bombCount = 0;
		this.roundCount = 0;
		this.tailNumber = tailNumber;
		this.pilotName = pilotName;
	}

	@Override
	public void noseUp() {
		System.out.println("Crashed");
	}

	@Override
	public void noseDown() {
		System.out.println("Crashed");
	}

	@Override
	public void tiltLeft() {
		System.out.println("Crashed");
	}

	@Override
	public void tiltRight() {
		System.out.println("Crash");
	}

	@Override
	public void dropBomb() {
		System.out.println("Hung bomb");
	}

	@Override
	public void fireGun() {
		System.out.println("Gun jam");
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
