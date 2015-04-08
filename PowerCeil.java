
import java.util.*;

public class PowerCeil {

	
	public static void main(String[] args) {

		Scanner obj=new Scanner(System.in);
		
		int a,b,n=0,i=1,count=0;
		
		System.out.println("Enter a number");
		a=obj.nextInt();
		
		System.out.println("Enter the ceil limit");
		b=obj.nextInt();
	
		while(i<=a){
			
			i=power(b,count);
			count++;
			
		}
		
		if(i>a)
			i/=b;
		
		System.out.println();
		
		System.out.println(i);
		
	}
	
	public static int power(int a , int b){
		
		int ans=1;
		
		for(int i=0;i<b;i++)
			ans*=a;
		
		
		return ans;
		
	}

}
