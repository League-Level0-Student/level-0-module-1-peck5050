package ifs_ints_and_loops;

import javax.swing.JOptionPane;

public class Renarkable {
public static void main(String[] args) {
	String josh = "Your Gert *-*"; 
	String brad = "Wowsers, yous is cool -3-";
	String chad = "How come you gotted so cool?";
	String lad = "Absolute mad lad!!!";
	String name = JOptionPane.showInputDialog("What is your name?");
	if(name.equals("josh")) {
	JOptionPane.showMessageDialog(null, josh);
	}
	if (name.equals("brad")) {
	JOptionPane.showMessageDialog(null, brad);	
	}
	if(name.equals("chad")) {
	JOptionPane.showMessageDialog(null, chad);
	}
	if(name.equals("lad")) {
	JOptionPane.showMessageDialog(null, lad);
	}
}
}
