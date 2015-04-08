import java.util.Iterator;
import java.util.TreeMap;


public class TreeMapDemo {

	
	public static void main(String[] args) {

		TreeMap tm=new TreeMap();
		
		tm.put(20, 145);
		tm.put(30, 642);
		tm.put(45, 4653);
		tm.put(44, 4644);
		tm.put(89, 52);
		tm.put(326, 646);
		
		Iterator i= (Iterator) tm.entrySet();
		
		
		while(i.hasNext())
		System.out.print(i.next()+" ");
		
	}

}
