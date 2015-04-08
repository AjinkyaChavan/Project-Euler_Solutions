import java.util.*;


public class CircularPrimes {

	
	public static void main(String[] args) {

		int i,len;
		
		char init;
		
		char[] reshift;
		
		List<Integer> cprimes = new ArrayList();
		
		String s="",conv;
		
		for(i=2;i<=100;i++){
			
			s+=i;
		
			
			if(s.length()==1 && isPrime(Integer.parseInt(s)))
				cprimes.add(i);
			else{
				
				CheckShiftBits cs=new CheckShiftBits(s);
					
				}
			
			
			}
			
		
		}
			
		
	
	
	
	
		
		
	
	
public static boolean isPrime(int n){
		
		for(int i=2;i<n;i++)
			if(n%i==0)
				return false;
			
		
		return true;
	}

}
