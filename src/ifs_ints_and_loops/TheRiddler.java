package ifs_ints_and_loops;

import javax.swing.JOptionPane;

//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

public class TheRiddler {

	public static void main(String[] args) {

		// 1. Make a variable to hold the score
		
int score = 0;

		//2. Make a pop up to show the score.

JOptionPane.showMessageDialog(null, "Score 0");

		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles
		
String purple = JOptionPane.showInputDialog("If roses are red and violets are blue, than wtf is the color violet?");

		// 4. If they got the answer right, pop up "correct!" and increase the score by one

if(purple.equalsIgnoreCase("violet")){
	JOptionPane.showMessageDialog(null, "Nice!");
	score+=1;
}
		// 5. Otherwise, say "wrong" and tell them the answer
else {
	JOptionPane.showMessageDialog(null, "WWWRRRROOOONNNNNGGGGGG");
}
		// 6. Add some more riddles

String puroke = JOptionPane.showInputDialog(null, "Why did the honey badger cross the road?");
		
if(puroke.equalsIgnoreCase("to tear the dudes face off")) {
	JOptionPane.showMessageDialog(null, "Ping Pong");
}
else {
	JOptionPane.showMessageDialog(null, "no");
}
}
}

