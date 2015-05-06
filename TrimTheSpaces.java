import java.io.BufferedReader;
import java.io.FileReader;
import java.util.*;

public class TrimTheSpaces {
	public static void main(String args[]){
		
		
		Stack s = new Stack<Long>();
		
		String sCurrentLine="",finalLine="";
		
		try (BufferedReader br = new BufferedReader(new FileReader("C:/Users/ajinkya/Documents/1000digitnumber.txt")))
		{
 
			
 
			/*while ((sCurrentLine = br.readLine()) != null) {
				System.out.println(sCurrentLine);
			}*/
 
			sCurrentLine = br.readLine();
			
			System.out.println(sCurrentLine);
			
		} catch (Exception e) {
			e.printStackTrace();
		} 
		
		
		int len = 13;
		int count = 0;
		int i = 0;
		int prod = 1;
		
		while(count<=1000){
			finalLine = sCurrentLine.substring(i, i+len-1);
			System.out.println();
			//System.out.println(finalLine);
			System.out.println();
			
			for(int j = 0;j<12;j++){
		//	System.out.println(finalLine.charAt(j));
				long num = (long)(finalLine.charAt(j));
			//	System.out.println(num-48);
			//	System.out.println();
				prod*=(num-48);
			}
			
			s.push(prod);
			System.out.println(prod);
			prod = 1;
			i+=1;
			count+=len;
		}
		
		//System.out.println("stckTop "+s.peek());
		
		Object[] arr = new Object[s.size()];
		

		arr = s.toArray();
		
		System.out.println(s.size()+" "+arr.length);
		System.out.println();
		long max = 0;
		for(int i1=0;i1<s.size();i1++){
			max = getMax(arr[i1],max);
		}
		
		
		System.out.println(max);
	}
	
	public static long getMax(Object num,long max){
		
		int num2 = (int)num;
		
		
		if(num2>max)
			max = num2;
		
		
		
		return max;
	}
	
}