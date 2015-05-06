
public class Euler1_MultipleOf3and5 {

	
	public static void main(String[] args) {

		int sum=0;
		
		for(int i=2;i<1000;i++)
			if(i%3==0 || i%5==0)
				sum+=i;
		
		System.out.println("The sum of multiples of 3 and 5 between 1000 is "+sum);
		
		
	}

}
