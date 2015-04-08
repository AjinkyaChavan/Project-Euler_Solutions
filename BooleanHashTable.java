
import java.util.*;


public class BooleanHashTable {

	
	public static void main(String[] args) {

		Hashtable<Integer,Boolean> ht=new Hashtable<Integer,Boolean>();
		
		ht.put(1, true);
		ht.put(2, false);
		ht.put(3, true);
		ht.put(4, false);
		ht.put(5, true);
		ht.put(6, true);
		
		for(int i=1;i<=ht.size();i++)
			System.out.print(ht.get(i)+" ");
		
		System.out.println();
		
		int k=2;
		
		if(ht.containsKey(k)){
			ht.put(k, true);
		}
		
		for(int i=1;i<=ht.size();i++)
			System.out.print(ht.get(i)+" ");
	}

}
