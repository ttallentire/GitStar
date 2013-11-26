import java.util.Scanner;
public class Count {
	public static void main (String[] args) {
		String phrase; // a string of characters
		char ch; // an individual character in the string
		Scanner scan = new Scanner(System.in);
		System.out.println ();
		System.out.println ("Character Counter");
		System.out.println ();
		
		System.out.print ("Enter a sentence or phrase, type quit to quit: ");
		phrase = scan.nextLine();
		do{
			int countBlank = 0; // the number of blanks (spaces) in the phrase
			int countA = 0;
			int countE = 0;
			int countS = 0;
			int countT = 0;
			int counta = 0;
			int counte = 0;
			int counts = 0;
			int countt = 0;
			int length; // the length of the phrase
			
			
			
			length = phrase.length();
			// Initialize counts
			countBlank = 0;
			for (int num1 = 0; num1 < length; num1++) {
				ch = phrase.charAt(num1);
				switch (ch)
				{
				case 'a':
					counta++;
					break;
				case 'A':
					countA++;
					break;
				case 'e':
					counte++;
					break;
				case 'E':
					countE++;
					break;
				case 's':
					counts++;
					break;
				case 'S':
					countS++;
					break;
				case 't':
					countt++;
					break;
				case 'T':
					countT++;
					break;
				case ' ':
					countBlank++;
				}
			}
			// a for loop to go through the string character by character
			// and count the blank spaces
			// Print the results
			System.out.println ();
			System.out.println ("Number of blank spaces: " + countBlank);
			System.out.println ("Number of a's: " + counta);
			System.out.println ("Number of A's: " + countA);
			System.out.println ("Number of e's: " + counte);
			System.out.println ("Number of E's: " + countE);
			System.out.println ("Number of s': " + counts);
			System.out.println ("Number of S': " + countS);
			System.out.println ("Number of t's: " + countt);
			System.out.println ("Number of T's: " + countT);
			System.out.println ();
			System.out.print ("Enter a sentence or phrase, type quit to quit: ");
			phrase = scan.nextLine();
			}
		while (!phrase.equalsIgnoreCase("quit"));
		scan.close();
	}
}