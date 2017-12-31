
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

import javax.swing.JOptionPane;

public class HappyPet {
	// 2. Create a happinessLevel variable to store the pet's happiness number.
	// Initialize to zero.
	static int happiness = 0;

	public static void main(String[] args) {
		// 1. Ask the user what kind of pet they want to buy, and store in variable
		String pet = JOptionPane.showInputDialog("What kind of pet do you want to buy?");

		// 7. REPEAT steps 3 - 6 enough times to make your pet happy!

		// 3. Use showOptionDialog to ask the user what they want to do to make their
		// pet happy
		// (eg: cuddle, food, water, take a walk, groom, clean up poop).
		// Make sure to customize the title and question too.
		for (int i = 0; i < 5; i++) {
			
		
		int task = JOptionPane.showOptionDialog(null, "What do you want to do to make your pet happy?", "Happiness Options", 0,
				JOptionPane.INFORMATION_MESSAGE, null, new String[] { "Groom", "Take a walk", "Cuddle" }, null);

		// 5. Use user input to call the appropriate method created in step 4.

		// 6. If you determine the happiness level is large enough, tell the
		// user that he loves his pet and use break; to exit for loop.
		if (task == 0){
			Groom(pet);
		}
		if (task == 1) {
			Walk(pet);
		}
		if (task == 2) {
			Cuddle(pet);
		}
		if (happiness >= 35) {
			JOptionPane.showMessageDialog(null, "Your " + pet + " is very happy. You are a great pet owner.");
			break;
		}
		}
		if(happiness < 35) {
			JOptionPane.showMessageDialog(null, "Your " + pet + " hates you. You are a bad pet owner.");
		}
	}

	// 4. Create methods to handle each of your user selections.
	static void Groom(String pet) {
		JOptionPane.showMessageDialog(null, "Your " + pet + " might bite you for cutting his/her hair.");
		happiness = happiness + 0;
		JOptionPane.showMessageDialog(null, "Happiness Level = " + happiness);
		
	}
	static void Walk(String pet) {
		JOptionPane.showMessageDialog(null, "Your " + pet + " will like you a lot.");
		happiness = happiness + 5;
		JOptionPane.showMessageDialog(null, "Happiness Level = " + happiness);
		
	}
	static void Cuddle(String pet) {
		JOptionPane.showMessageDialog(null, "Your " + pet + " will absolutely LOVE you.");
		happiness = happiness + 10;
		JOptionPane.showMessageDialog(null, "Happiness Level = " + happiness);
	}
	
	// Each method should create a pop-up with the pet's response (eg. cat might
	// purr when pet),
	// and INCREMENT the pet's happiness Level.
}