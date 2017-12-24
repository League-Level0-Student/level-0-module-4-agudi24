
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

import javax.swing.JOptionPane;

public class HappyPet {
	// 2. Create a happinessLevel variable to store the pet's happiness number.
	// Initialize to zero.
	int happinessLevel = 0;

	public static void main(String[] args) {
		// 1. Ask the user what kind of pet they want to buy, and store in variable
		String pet = JOptionPane.showInputDialog("What kind of pet do you want to buy?");

		// 7. REPEAT steps 3 - 6 enough times to make your pet happy!

		// 3. Use showOptionDialog to ask the user what they want to do to make their
		// pet happy
		// (eg: cuddle, food, water, take a walk, groom, clean up poop).
		// Make sure to customize the title and question too.
		int task = JOptionPane.showOptionDialog(null, "What doy want to do to make your pet happy?", "Title", 0,
				JOptionPane.INFORMATION_MESSAGE, null, new String[] { "Groom", "Take a walk", "Cuddle" }, null);

		// 5. Use user input to call the appropriate method created in step 4.

		// 6. If you determine the happiness level is large enough, tell the
		// user that he loves his pet and use break; to exit for loop.

	}

	// 4. Create methods to handle each of your user selections.
	static void Groom() {
		JOptionPane.showMessageDialog(null, pet + " might bite you for cutting of his/her hair.");
		JOptionPane.showMessageDialog(null, "Happiness Level = 0");
	}
	// Each method should create a pop-up with the pet's response (eg. cat might
	// purr when pet),
	// and INCREMENT the pet's happiness Level.
}