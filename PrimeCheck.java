
public class PrimeCheck {

	public static void main(String[] args) {

		if(isPrime(4))
			System.out.println("yo");
		else
			System.out.println("no");
		
	}
	
	public static boolean isPrime(long num){
		
		boolean flag = false;
		
		for(int j=2;j<num;j++)
			if(num%j==0){
				flag = false;
				break;
			}
			else 
				flag = true;
		
		if(flag==true)
			return true;
		else return false;
		
	}
	

}
