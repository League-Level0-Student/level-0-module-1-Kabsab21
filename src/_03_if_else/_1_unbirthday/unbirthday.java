package _03_if_else._1_unbirthday;

import javax.swing.JOptionPane;

public class unbirthday {
	
	public static void main(String[] args) {
		String bob = JOptionPane.showInputDialog(null, "whats your birthday ;)");
		if(bob.contentEquals("02/25")) {
			
			JOptionPane.showMessageDialog(null, "happy birthday i guess...");
			
		}else{ 
			JOptionPane.showMessageDialog(null, "happy unbirthday...");
	}
	}
}
