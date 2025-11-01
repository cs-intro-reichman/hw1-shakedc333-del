// Computes the future value of a saving investment.
public class FVCalc {
	public static void main(String[] args){
		double rate = Double.parseDouble(args[1]);
		rate/=100;
		int CV = Integer.parseInt(args[0]);
		int n = Integer.parseInt(args[2]);
		double FV = CV * (Math.pow(1+rate, n)); 
		
		System.out.println("After "+n+" years, $"+CV+" saved at "+(rate*100)+"% will yield $"+(int)FV);


	}
}