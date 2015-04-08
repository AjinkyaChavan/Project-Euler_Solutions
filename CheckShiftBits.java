
import java.util.*;

public class CheckShiftBits {

		public static void main(String args[]){
	
			List<Integer> cprimes = new ArrayList();
			
			String s="";
			
			for(int i=2;i<1000000;i++){
				
				
				
				s+=i;
				
				
				
				if(s.length()==1 && isPrime(i))
				   cprimes.add(Integer.parseInt(s));
				else checkBits(s,cprimes);
				
				s="";
				
			}
				
			
		}
		
		public static void checkBits(String s,List<Integer> cprimes){
		
			String conv="";
			
		
			
			
			List<Integer> cprimes1=new ArrayList();
		
		char alpha[]=s.toCharArray();
		
		int len=s.length();
		
		int init=alpha[0];
		int count=0;
		char init1=s.charAt(0);
		for(int i=0;i<len;i++)
			if(s.charAt(i)==init1)
				count++;
		
		if(count==len&& isPrime(Integer.parseInt(s)))
			cprimes.add(Integer.parseInt(s));
		
		count=0;
		
		if(isPrime(Integer.parseInt(s)))
			cprimes1.add(Integer.parseInt(s));
	
		while(init!=alpha[len-1]){
		
		int j=1,k=0;
		
		

		char temp=alpha[len-1];
		
		while(k!=len-1){
			alpha[len-j]=alpha[len-(j+1)];
			j++; k++;
		}
		alpha[0]=temp;

		
		int ans;
	
		for(int i=0;i<alpha.length;i++)
			conv+=alpha[i];
			
	
			ans=Integer.parseInt(conv);
			
			conv="";
			
			if(isPrime(ans))
				cprimes1.add(ans);
		
		}
	
		
		if(cprimes1.size()==s.length()){
			
			cprimes.addAll(cprimes1);
			
			HashSet hs = new HashSet();
			hs.addAll(cprimes);
			cprimes.clear();
			cprimes.addAll(hs);
			
			//for(int i=0;i<cprimes.size();i++)
			//	System.out.print(cprimes.get(i)+" ");
			
			System.out.println();
		System.out.println();
		
		System.out.println(cprimes.size());
			
		}
			
		
		
		
		System.out.println("Done");
	
		}
		
	
		
		public static boolean isPrime(int n){
			
			for(int i=2;i<n;i++)
				if(n%i==0)
					return false;
				
			
			return true;
		}

}
