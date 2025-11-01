// Splits a restaurant bill evenly among three diners.
public class Bill3 {
	public static void main(String[] args) {
		//System.out.println("please enter \n");
	    String name1 = args[0];
		String name2 = args[1];
		String name3 = args[2];
		double num = Double.parseDouble(args[3]);
		num = num/3;
		num = Math.ceil(num);
		System.out.println("Dear "+name3 +", "+name2 +", and "+ name1 +": pay " + num+ " Shekels each.");

	}
}
