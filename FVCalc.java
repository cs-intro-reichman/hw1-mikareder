// Computes the future value of a saving investment.
public class FVCalc {
	public static void main(String[] args){
		int currentValue = Integer.parseInt(args[0]);
		double rate=Double.parseDouble(args[1]);
		double decimal = rate/100; //precentege
		int n=Integer.parseInt(args[2]);		
		double featureValue= currentValue*(Math.pow(1+decimal,n));
	    System.out.print("After "+ n+ " years, $"+ currentValue + " saved at "+ rate+ "% will yield $"+ ((int) featureValue));
	}
}