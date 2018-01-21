//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0


import java.applet.AudioClip;

import javax.swing.JApplet;
import javax.swing.JOptionPane;

public class DontForgetTheLyrics {
	/*
	 * For this game, we'll play the start of a song, and the player has to guess the rest of the lyrics.
	 * 
	 * 1. To record a sound clip, open Audacity and record your song.
	 * 
	 * 2. Click File -> Export Audio, and save your file on the Desktop.
	 * 
	 * 3. Drag your file from the Desktop into the "default package" under "src".
	 */
	
	public static void main(String[] args) {
		// 4. Make a pop-up to explain the game.
		JOptionPane.showMessageDialog(null, "A song will play and then it will stop and then you have to guess the next line.");
		// 5. Use the playSound method to play your song.
		playSound("EyeOfTheTiger.wav");
		// 6. Make a pop-up for the player to type their answer.
		String ans = JOptionPane.showInputDialog("What comes after It's the eye of the tiger?");
		// 7. If they answered correctly, tell them that they were right.
		if(ans.equalsIgnoreCase("It's the thrill of the fight")){
		JOptionPane.showMessageDialog(null, "You are right!");
		}
		else {
			JOptionPane.showMessageDialog(null, "Incorrect, the correct answer is it's the thrill of the fight.");
		}
		// 8. Otherwise, tell them they are wrong, and give them the answer.
		
		// 9. Record another sound and repeat steps 5-8.

		// 10. [optional] Add a points variable that will calculate their final score.
	}

	public static void playSound(String fileName) {
		AudioClip audioClip = JApplet.newAudioClip(new DontForgetTheLyrics().getClass().getResource(fileName));
		audioClip.play();
	}
}


