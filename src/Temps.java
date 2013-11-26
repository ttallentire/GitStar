import java.util.Scanner;
public class Temps {
// --------------------------------------------------
// Reads in a sequence of temperatures and finds the
// maximum and minimum read in.
// --------------------------------------------------
public static void main (String[] args) {
	final int HOURS_PER_DAY = 24;
	int temp; // a temperature reading
	int maxTemp = -1000;
	int minTemp = 1000;
	int timeOfMax = 0;
	int timeOfMin = 0;
	Scanner scan = new Scanner(System.in);
	// print program heading
	System.out.println ();
	System.out.println ("Temperature Readings for 24 Hour Period");
	System.out.println ();
	for (int hour = 0; hour < HOURS_PER_DAY; hour++)
	{
		System.out.print ("Enter the temperature reading at " + hour +
		" hours: ");
		temp = scan.nextInt();
		if (temp > maxTemp) {
			maxTemp = temp;
			timeOfMax = hour;
		}
		if (temp < minTemp) {
			minTemp = temp;
			timeOfMin = hour;
		}
	}
	System.out.println("The Maximum temperature was: " + maxTemp);
	System.out.println("The time of the  Maximum"
			+ " temperature was: " + timeOfMax);
	System.out.println("The Minimum temperature was: " + minTemp);
	System.out.println("The time of the  Minimum"
			+ " temperature was: " + timeOfMin);
	
	scan.close();
	}
}