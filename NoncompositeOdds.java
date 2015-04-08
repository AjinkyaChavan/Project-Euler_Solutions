
import java.util.*;

public class NoncompositeOdds {

	
	
	
	public static void main(String[] args) {

		int i,j,k,a,b,result;
		
		List<Integer> primes=new ArrayList();
		List<Integer> oddComp=new ArrayList();
		List<Integer> resultComp=new ArrayList();

		
		
		
		
		for(i=3;i<10000;i++){
		
			if(isPrime(i)){
				primes.add(i);
				continue;
			}
			else if(i%2==0)
				continue;
			else{
				
				oddComp.add(i);
				
				A:for(j=0;j<primes.size();j++){
					
					for(k=1;k<60;k++){
						
						
						
					result = primes.get(j)+(2*k*k);	
						
						if(result==i){
							resultComp.add(result);
							//System.out.print(i+" result");
							break A;
						} 
				
					
						
					}
					
				}
			
			}
		}
		
	String ans1=oddComp.toString();
	String ans2=resultComp.toString();
	
	for(i=0;i<ans1.length();i++)
		if(ans1.charAt(i)!=ans2.charAt(i)){
			System.out.print(ans1.charAt(i-1)+ans1.charAt(i-2)+ans1.charAt(i-3)+ans1.charAt(i)+ans1.charAt(i+1)+ans1.charAt(i+2)+ans1.charAt(i+3));
			System.exit(0);
		}
	
	}
				
		
					
			
				
		
	
		
	public static boolean isPrime(int n){
		
		for(int i=2;i<n;i++)
			if(n%i==0)
				return false;
			
		
		return true;
	}
	
}
