// Prints a given number using a hundreds, tens, and units notation.
public class NumWords {
	public static void main(String args[]) {
	    int value = Integer.parseInt(args[0]);
		//value%10 = unit number
		System.out.println(value/100 + " hundreds, "+ value/10%10 + " tens, and "+ value%10 + " ones." );
		

		}
		

	}

