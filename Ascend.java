// Generates three integer random numbers in a given range,
// and prints them in increasing order.
public class Ascend {
	public static void main(String[] args) {
		int lim = Integer.parseInt(args[0]);
		//Math.random : 1.0 -0.0 so casting to int : 10-0 //
		int a =1+ (int)(Math.random()*(lim-1)); // add 1: bigger then 0. lim-1:smaller then lim
		int b = 1+ (int)(Math.random()*(lim-1)); 
		int c = 1+ (int)(Math.random()*(lim-1));
		System.out.println(a+ " "+ b + " "+ c);
		int min = Math.min(Math.min(a, b), c);
		int max = Math.max(Math.max(a, b), c);
		int mid = a+b+c -min - max;
	/*	a = Math.min(Math.min(a, b), c);
		b = Math.max(Math.min(a, b) , c);
		int min = a; int max=b; int mid =c;
*/
		System.out.println(min+ " "+ mid + " "+ max);

	}
}
