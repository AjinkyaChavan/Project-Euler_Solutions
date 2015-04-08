
import java.util.*;


public class MorganStanleyString {

	public static void main(String[] args) {

	Scanner obj = new Scanner(System.in);
	
	System.out.println("Enter a string:");
	
	String s;
	
	s=obj.nextLine();
	
	String temp;
	
	String s1[] = s.split(" ");
	
	for(int i=0;i<s1.length-1;i=i+2){
		
		if(i%2==0){
			temp = s1[i];
			s1[i]=s1[i+1];
			s1[i+1]=temp;
		}
		
			
		
	}
	
	for(int j=0;j<s1.length;j++)
		System.out.print(s1[j]+" ");
		
	}

}
