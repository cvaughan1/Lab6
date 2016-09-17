package latin;

public class English {

	public static String translateToPigLatin(String word) {

		char c = word.charAt(0);// analyze the first letter
		// if the word starts with a vowel, add way to the end of the word
		if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
			word = word + "way";

			// if the word starts with a 'y'
		} else { 
			if (c == 'y') {
				word = word.substring(1); // 1 - the position of the substring:
											// takes the 'y' off, leave the rest
											// yellow is now ellow
				word = word + c; // yellow is now ellowy
				c = word.charAt(0); // variable c is now 'e'
			}
			while (c != 'a' && c != 'e' && c != 'i' && c != 'o' && c != 'u' && c != 'y') {
				word = word.substring(1);
				// word += c;
				word = word + c;
				c = word.charAt(0);
			}
			word = word + "ay";// now add 'ay' to whatever you have

		}
		return word;
	}
}
