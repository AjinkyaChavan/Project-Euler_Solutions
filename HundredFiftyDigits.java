
import java.io.*;

public class HundredFiftyDigits {

	
	public static void main(String[] args) throws Exception{

		BufferedReader bf=new BufferedReader(new FileReader("/home/ajinkya/Downloads/numbers.txt"));
		
		String line=null;
		String s[]=new String[100];
		int i=0,j;
		
	
		
		while((line=bf.readLine())!=null){
			
			s[i]=line.toString();
			i++;
		}
		
		double d=0;
		
		for(i=0;i<s.length;i++)
			d+=Double.parseDouble(s[i]);

		        
		System.out.println(d);
	}

}
