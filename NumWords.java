// Prints a given number using a hundreds, tens, and units notation.
public class NumWords {
	public static void main(String args[]) {
		//System.out.println("give a num \n ");
	   int num = Integer.parseInt(args[0]);
	   int hundred =(num/100);
	   int tens = (num/10)%10;
	   int ones = num%10 ; 
	   System.out.println(hundred +" hundreds, "+ tens + " tens, and "+ ones + " ones.");
	}
}
