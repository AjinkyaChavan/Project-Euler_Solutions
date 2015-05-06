
public class Euler6_SumOfSquares {

	public static void main(String[] args) {

		long indsquare=0,sumsquare=0;
		
		
		for(int i=1;i<101;i++){
			indsquare+=(Math.pow(i, 2));
		}
		
		for(int i=1;i<101;i++){
			sumsquare+=i;
		}
		
		long ans = (long) Math.pow(sumsquare, 2);
		
		long result = ans - indsquare; 
		
		System.out.println(result);
	}

}

