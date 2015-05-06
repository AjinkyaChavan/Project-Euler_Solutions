
import java.util.*;

public class Euler3_LargestPrimeFactor {

	
	public static void main(String[] args) {

		Stack s = new Stack<Integer>();
		
		long n = 600851475143L;

		//long n = 13195;
		
		long i = 3;
		
		while(i<n/2){
			if(n%i==0 && isPrime(i)){
				s.push(i);
				System.out.println(i);
			}
			i++;
		}
		
		System.out.println("The largest prime factor is "+s.peek());
		
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
