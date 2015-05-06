import java.util.*;

public class AbundantNumber {
	public static void main(String args[]){
		
		ArrayList<ArrayList<Integer>> countdata = new ArrayList<ArrayList<Integer>>();
		
		for(int i=1;i<=25;i++){
			 countdata = findDivisors(i);
		}
		
		
	}
	
	
	public static ArrayList<ArrayList<Integer>> findDivisors(int num){
		
		int count = 0;
		ArrayList<ArrayList<Integer>> mycountdata = new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> arraydata;
		
		for(int j=1;j<num;j++){
		
			System.out.print(j+" ");
			arraydata = new ArrayList<Integer>();
			
			if(num%j == 0){
				System.out.print("true"+" ");
				arraydata.add(j);
				//BS
			}
			
		}
		
		mycountdata.add(arraydata);
		
		
		for(int k=0;k<mycountdata.size();k++)
			System.out.print(mycountdata.get(k)+" ");
		
		System.out.println();
		
		
		return mycountdata;
		
	}
	
	
}