
public class Euler5_NoRemainder {

	
	public static void main(String[] args) {

		
		
		boolean flag = false;
		
	for (int j=3;j<1000000000;j++){	
		for(int i=1;i<=20;i++){
			if(j%i==0)
				flag = true;
			else
			{
				flag=false;
				break;
			}
				
		}
	
		//System.out.println(flag);
		
		if(flag==true)
			System.out.println("yep "+j);
		
		
	}
		
	}

}
