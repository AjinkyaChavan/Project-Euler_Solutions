import java.util.*;

public class DistinctLimPractice {
	public static void main(String args[]){
		
		Scanner obj=new Scanner(System.in);
		
		int i,j,k,a,b;
		
		System.out.println("Enter a number");
		a=obj.nextInt();
		
		List<Integer> ans=findFactors(a);
		
		for(j=0;j<ans.size();j++)
			System.out.print(ans.get(j)+" ");
	}
	
	public static List<Integer> findFactors(int n){
		
		List<Integer> preans=new ArrayList();
		
		for(int i=2;i<n;i++)
			if(n%i==0){
			
				preans.add(i);
		
			}
		if(preans.isEmpty())
			System.out.println(n+" is a prime number");
		
		return preans;
		
	}
}
