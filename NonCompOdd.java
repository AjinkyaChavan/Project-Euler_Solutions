
public class NonCompOdd {

	
	public static void main(String[] args) {

		
		if(129!=129)
			System.out.println("true");
		else
			System.out.println("f");
	}
	
	int s=oddComp.size();
	
	for(i=0;i<s;i++){
		
		if(oddComp.get(i)==resultComp.get(i)){ 
			System.out.println(i+" "+oddComp.get(i)+" "+resultComp.get(i));
		}
			else{
				System.out.println(i+" "+oddComp.get(i)+" "+resultComp.get(i));
				System.exit(0);
			}
	
	}

}
