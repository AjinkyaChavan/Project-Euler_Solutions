

import java.io.*;

public class MaxSumCount {

	public static void main(String[] args) {

		BufferedReader bf;
		String s = "";
		
		BSTDemo bd = new BSTDemo();
		
		try {
			bf=new BufferedReader(new FileReader("C:/Users/ajinkya/Documents/maxsumpath.txt"));
			
			
			while((s=bf.readLine()) != null){
				System.out.println(s.length());
			}
			
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
		
	}

}
