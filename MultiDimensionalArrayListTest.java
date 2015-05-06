
import java.util.*;

public class MultiDimensionalArrayListTest {
	public static void main(String args[]){
		
		ArrayList<ArrayList<Integer>> mycountdata = new ArrayList<ArrayList<Integer>>();
		
		for(int i=1;i<=10;i++){
		ArrayList cols =  new ArrayList<Integer>();
		
		for(int j=1;j<=10;j++)
			cols.add(j);

		mycountdata.add(cols);
		
		
		}
		
		System.out.println(mycountdata.get(1).get(2));
		
		
	}
}
