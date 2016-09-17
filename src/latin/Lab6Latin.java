package latin;

import java.util.Scanner;

public class Lab6Latin {

	public static void main(String[] args) {

		System.out.println("Welcome to the Pig Latin Translator\n");

		while (true) {
			
			Scanner sc = new Scanner(System.in);

			System.out.println("Enter a word to be translated into Pig Latin:");
			String line = sc.nextLine();

			// parse the input into words and translate each word
			
			if (line.equals("")) {
				System.out.println("You didn't enter anything.");
			} else {
				// Find the spaces
				String[] words = line.split(" ");
				// Initialize pigLatin variable
				String pigLatin = "";
				// Enhanced for
				for (String word : words) {
					pigLatin += English.translateToPigLatin(word.toLowerCase()) + " ";
				}
				System.out.println();
				System.out.println(pigLatin);
			}
			System.out.println();
			
			// Continue block
			System.out.print("Translate another line? (y/n): ");
			String choice = sc.nextLine();
			System.out.println();
			// if choice is anything other than "y", quit
			if (!choice.equalsIgnoreCase("y")) {
				break;	
			}		
		}// while
	}// pvsm
}// class
