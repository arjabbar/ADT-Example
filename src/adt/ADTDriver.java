/**
 * 
 */
package adt;

import java.util.ArrayList;
import java.util.Stack;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 * @author Abdur
 *
 */
public class ADTDriver{

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		FightJetClass jet1;
		FightJetClass jet2;
		
		jet1 = new F16("A1005", "Henry");
		jet2 = new POSJet("A0001", "Bob");
		
		JFrame jf1 = new JFrame();
		jf1.add(new JLabel(new ImageIcon("f16.jpg")));
		jf1.addKeyListener(jet1);
		jf1.pack();
		jf1.setFocusable(true);
		jf1.setVisible(true);
		jf1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JFrame jf2 = new JFrame();
		jf2.add(new JLabel(new ImageIcon("pos.jpg")));
		jf2.addKeyListener(jet2);
		jf2.pack();
		jf2.setFocusable(true);
		jf2.setVisible(true);
		jf2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
