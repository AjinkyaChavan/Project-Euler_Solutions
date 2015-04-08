
import java.util.*;

public class StringBuildPalindrome {

	
	public static void main(String[] args) {

		StringBuilder sb=new StringBuilder();
		Scanner obj=new Scanner(System.in);
		
		
		System.out.println("Enter a string");
		sb.append(obj.nextLine());
		
		for(int i=0;i<sb.length();i++){
		
		if(sb.charAt(i)==sb.reverse().charAt(i)){
			System.out.println("The string is a palindrome "+sb+" "+sb.reverse());
			break;
		}
		else{
			System.out.println("The string is not a palindrome "+sb+" "+sb.reverse());
			break;	
			}
		}
	}

}
