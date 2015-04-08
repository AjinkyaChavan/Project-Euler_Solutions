
import java.util.*;

public class DistinctPrimes{
	
	public static void main(String args[]){
		
		Stack s=new Stack();
		
		int i,j,k;
		
		for(i=3;i<100;i++)
			if(isPrime(i))
				s.push(i);
		
		for(i=0;i<s.size();i++)
			System.out.print(s.elementAt(i)+" ");
		
	}
	
	public static boolean isPrime(int n){
		
		int i,j;
		
		for(i=2;i<n;i++)
			if(n%i==0)
				return false;
		
		return true;
		
	}
	
}