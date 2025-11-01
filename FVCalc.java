// Computes the future value of a saving investment.
public class FVCalc {
	public static void main(String[] args){
		double rate = Double.parseDouble(args[1]);
		int CV = Integer.parseInt(args[0]);
		int n = Integer.parseInt(args[2]);
		double FV = CV * (Math.pow(1+rate, n)) /100;
		
		System.out.println("afer "+n+" years, $"+CV+" saved at "+rate+"% will yield $"+(int)FV);




	}
}