
import java.util.*;

public class Euler4_Palindrome9digit {


	public static void main(String[] args) {

		Stack s = new Stack<Integer>();
		
		int i = 100;
		int j=	100;
		
		int prod = 1;
		
		for(i=100;i<1000;i++)
			for(j=100;j<1000;j++){
				
				prod = i*j;
				
				if(isPalindrome(prod)){
					s.push(prod);
					System.out.println(prod+" is a palindrome");
				}
			}
		
		System.out.println("The largest of them is "+s.peek());
		
	}
	
	public static boolean isPalindrome(int num){
		
		String s = "";
		s+=num;
		boolean flag = false;
		
		int i=0;
		int j = s.length()-1;
		
		while(i<=j){
			if(s.charAt(i)==s.charAt(j)){
				i++;
				j--;
				flag = true;
			}
			else{
				flag = false;
				break;
			}
		}
		
		return flag;
		
	}

}
