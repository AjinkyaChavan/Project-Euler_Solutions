
public class TenThousandPrime {
	public static void main(String args[]){
		
		
		int count = 0;
		long i=2;
		
		while(count!=10001){
			
			if(i == 2)
				count++;
			
			if(isPrime(i)){
				count++;
			}
		
			i++;
		}
		
		System.out.println("The ten thousandth prime is "+(i-1));
		
	}
	
	
	public static boolean isPrime(long num){
		
		boolean flag = false;
		
		for(int j=2;j<num;j++){
			if(num%j==0){
				flag = false;
				break;
				}
			else{
				flag = true;
			}
		}
		
		
		return flag;
		
	}
	

}
