
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.*;

public class NumberLetterCount {
	
	public static void main(String args[]) throws Exception{
		
		Scanner obj=new Scanner(System.in);
		
		int i=0,j,k,inew,jnew,knew;
		String s1[]=new String[8];
		String s2[]=new String[9];
		
		String nlist1[][]=new String[10][10];	
		String nlist2[][]=new String[100][1];
	    String nlist3[][]=new String[100][10];
		
		String parts1[]=new String[20];
		String parts2[]=new String[8];
		String parts3[]=new String[9];

		
		BufferedReader bf=new BufferedReader(new FileReader("/home/ajinkya/Downloads/initial.txt"));
		BufferedReader bf2=new BufferedReader(new FileReader("/home/ajinkya/Downloads/initial2.txt"));
		BufferedReader bf3=new BufferedReader(new FileReader("/home/ajinkya/Downloads/initial3.txt"));


		String line=null;
		String line1=null;
		String line2=null;
		
		while((line=bf.readLine())!=null){
				
			parts1[i]=line;
				 i++;
				 if(i>=20)
					 break;
				 
		
		}
		System.out.println();
		i=0;
		while((line1=bf2.readLine())!=null){
			
			parts2[i]=line1;
		
				 i++;
		if(i>=8)
			break;
		
		}
		System.out.println();
	
		i=0;
		while((line2=bf3.readLine())!=null){
			
			parts3[i]=line2;
				 i++;
				
		}
	
	    
		k=0;
		
			for(i=0;i<2;i++){
				for(j=0;j<10;j++){
					nlist1[j][i]=parts1[k];
					k++;
				}
			}
			
		
			
		
			i=9;j=0;
				for(k=2;k<10;k++){
					nlist1[i][k]=parts2[j];
					j++;
					s1[k-2]=nlist1[9][k-1];
				}
			
			
				
				// from one to ten
				
				for(k=0;k<9;k++){
					
					s2[k]=nlist1[k][0];
					
				}
				
			
			for(i=0;i<9;i++){
				for(k=2;k<10;k++){
				
					nlist1[i][k]=s1[k-2]+" "+s2[i];
					
				}
				
			}
			
			
			
			jnew=0;
			
			for(i=0;i<10;i++){
				for(j=0;j<10;j++){
					
					
					nlist2[jnew][0]=nlist1[j][i];
					nlist3[jnew][0]=nlist1[j][i];
					jnew++;
				}
				System.out.println();
			} 
			
			System.out.println();
			System.out.println("New list");
			
			
			
			
		for(i=1;i<10;i++)	
			for(j=0;j<100;j++){
				
			//System.out.println(nlist2[j][i]);
				
				if(j==99)
					nlist3[j][i]=parts3[i-1];
				else
				nlist3[j][i]=s2[i-1]+" hundred and "+nlist2[j][0];
			
			
			}
			
	
				String s="";
	
			for(i=0;i<10;i++){
				for(j=0;j<100;j++){
					
				//	System.out.println(nlist3[j][i]+" ");
					s+=(nlist3[j][i]).replaceAll("[^A-Za-z]+","");
				}
				System.out.println();
			}

			System.out.println(s.length());
}
}