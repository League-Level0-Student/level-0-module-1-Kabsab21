package _04_int._1_riddler;
//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0

import javax.swing.JOptionPane;

public class TheRiddler {

	public static void main(String[] args) {

		// 1. Make a variable to hold the score
int score = 0;
		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles
String answer = JOptionPane.showInputDialog(null,"what do you call fake noodles?");
		// 4. If they got the answer right, pop up "correct!" and increase the score by one
if(answer.equals("an impasta")) {
	JOptionPane.showMessageDialog(null,"good job"); 
	score = score + 1000000;
	JOptionPane.showMessageDialog(null,"now score is "+ score);
	
	}
		// 5. Otherwise, say "wrong" and tell them the answer
	else{ JOptionPane.showMessageDialog(null,"wrong, now you cant cross the bridge (hehe)");
		// 6. Add some more riddles
	score = score - 10000000;
	JOptionPane.showMessageDialog(null,"now score is " +score);
}
	}
		// 2. Make a pop up to show the score.
	String answer = JOptionPane.showInputDialog(null,"why do we tell actors to breack a leg?");
	if(answer.equals("cause every play needs a cast")) {
		JOptionPane.showMessageDialog(null,"good job"); 
		score = score + 1000000;
		JOptionPane.showMessageDialog(null,"now score is "+ score);
	
}



