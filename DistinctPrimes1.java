
import java.util.*;

public class DistinctPrimes1{
	
	public static void main(String args[]){
		
		String[] factors=new String[2];
		
		int i,j,k,kcopy;
		
		k=14;
		kcopy=k;
		
	
		int l=0;
			
		
		while(kcopy<(k+2)){
			
			 findFactors(kcopy,factors,l++);
			kcopy++;
			
			
		}	
			
		
		for(int m=0;m<factors.length;m++){
		
			System.out.println(m+" ---> "+factors[m]);
		}
	
		String init=factors[0]+" "+factors[1];
		
		ArrayList<Integer> ans=new ArrayList();
		int p,f=0;
		for(p=0;p<init.length();p++){
			if((init.charAt(p)>=48)&&(init.charAt(p)<=57))
				ans.add(init.charAt(p)-48);
		}
		int len1=ans.size();
		
		System.out.println(ans);
	
		HashSet hs = new HashSet();
		hs.addAll(ans);
		ans.clear();
		ans.addAll(hs);
			
		
		System.out.println(ans);
		
		int len2=ans.size();
		
		System.out.println();
		System.out.println();
		
		if(len1==len2)
			System.out.print("answer is"+(kcopy-1)+" "+(kcopy-2));
		
	}
	
	public static int findFactors(int n,String[] factors,int l){
		
		
		System.out.println("init l="+l);
		
		for(int i=2;i<n;i++){
			
			if(n%i==0)
				factors[l]+=" "+i+" ";
			
			
			System.out.println("currently n="+n+" ,l="+l);
			System.out.println();
			
			

		}
		return n;
		
	}

	
}