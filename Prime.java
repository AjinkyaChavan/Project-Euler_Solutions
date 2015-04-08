
public class Prime {

	public static void main(String[] args) {
	
		if(isPrime(5683))
			System.out.println("true");
		else 
			System.out.println("false");
		
	}
	
	public static boolean isPrime(int n){
	
	
	for(int i=2;i<n;i++)
		if(n%i==0)
			return false;
		
	
	return true;
}

}
