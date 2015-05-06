
public class PrimeJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int n = 3;
		
		if(isPrime(n))
			System.out.println("yo");
		
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
