
public class SumOfPrimes {
	public static void main(String args[]){
		
		
		long sum = 2;
		int count = 1;
		int i = 3; 
		
		while(i<2000000){
			
			
			
			
			if(isPrime(i)){
				System.out.println(i);
				sum+=i;
				count++;
			}
			
			i++;
			
		}
		
		System.out.println("Sum of 2 mill primes is "+sum);
		
		
	}
	
	public static boolean isPrime(int n){
		
		boolean flag = false;
		
		for(int j=2;j<n;j++){
			if(n%j == 0){
				flag = false;
				break;
			}
			else
				flag = true;
				
		}
		
		return flag;
	}
	
}
