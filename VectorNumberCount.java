import java.io.*;

public class VectorNumberCount {
	
	public static void main(String[] args) throws Exception {

		int i=0,j=0,k;
		String parts[]=new String[9];
		
		BufferedReader bf=new BufferedReader(new FileReader("/home/ajinkya/Downloads/initial3.txt"));
	
		String line=null;
		
		while((line=bf.readLine())!=null){
				
			parts[i]=line;
				 i++;
		}
				
		for(i=0;i<parts.length;i++)
		System.out.print(parts[i]+" ");

		}
		
	}


