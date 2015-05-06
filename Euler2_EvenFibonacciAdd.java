
public class Euler2_EvenFibonacciAdd {

	
	public static void main(String[] args) {

		int sum=0,ans=0,i=1;
	/*	
		for(int i=1;i<40;i++){
			ans = fibo(i);
		
			if(ans%2==0)
				if(ans<4000000){
					System.out.println(ans);
					sum+=ans;
				}
		}
		*/
		do{
		
			ans = fibo(i);
			
			if(ans%2==0)
				if(ans<4000000){
					System.out.println(ans);
					sum+=ans;
				}
			i++;
			
		}while(ans<4000000);
		
		System.out.println("The sum of even fibonacci numbers upto 20 is "+sum);
		
	}
	
	
	public static int fibo(int num){
		
		if(num==1 || num==2)
			return num;
		else 
			return (fibo(num-1)+fibo(num-2));
	}

}
