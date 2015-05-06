import java.util.*;

public class TriangleNumber {

	public static void main(String[] args) {
		
		
		List<Integer> mylist ;
		long triangle;
		long i,factors;
		
		
		for(i=1;i<20000000;i++){
			triangle = findTriangleNumber(i);
			//System.out.println(i+" ->tri "+triangle);
			 findDivisors(triangle);
			 System.out.println(triangle+" ->fact");
		}
		
	}
	
	
	public static long findTriangleNumber(long num){
		
		long sum = 0;
		
		for(long i=1;i<num;i++){
			sum+=i;
		}
	
		return sum;
	
	}
	
	
	public static void findDivisors(long num){
		
		//System.out.println(num+" num");
		
		int count=0;
	//	boolean flag = false;
		
		for(long k=1;k<num;k++)
			if(num%k==0){
				
				
				++count;
				
				
				if(count==500){
					System.out.println(num+" -> "+count);
					System.exit(0);
				}
		}
	}
}

//9920445382 jai