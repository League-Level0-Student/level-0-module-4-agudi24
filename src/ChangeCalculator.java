//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0


import java.text.DecimalFormat;

import javax.swing.JOptionPane;

/*
 * I have a pocket full of change. I hate doing math. Make me a program that
 * will calculate how much money I have without me having to use my brain. Then
 * make me a sandwich.
 */
public class ChangeCalculator {

	public static void main(String[] args) {
		//DecimalFormat df = new DecimalFormat("0.00");
        int n = 0; 
        int d = 0;
        int q = 0;
		// Ask the user how many nickels they have
		String nickels = JOptionPane.showInputDialog("How many nickels do you have?");
        n = Integer.parseInt(nickels);
		// Convert their answer to an int using Integer.parseInt()
        String dimes = JOptionPane.showInputDialog("How many dimes do you have?");
        d = Integer.parseInt(dimes);
		// Ask the user how many dimes they have, and convert their answer
        String quarters = JOptionPane.showInputDialog("How many quarters do you have?");
        q = Integer.parseInt(quarters);
		// Ask the user how many quarters they have, and convert their answer
        
		// Calculate how much money the user has and save it in a double variable 
      double money = 0.05 * n + 0.10 * d + 0.25 * q;
		// Tell the user how much money they have
      JOptionPane.showMessageDialog(null, "You have $" + money + "0");
      //df.format(money);
	}
}

