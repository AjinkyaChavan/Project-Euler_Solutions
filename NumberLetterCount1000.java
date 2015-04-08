
import java.util.*;

public class NumberLetterCount1000 {
	
	public static void main(String args[]){
		
		Scanner obj=new Scanner(System.in);
		
		int i,j,k;
		String s1[]=new String[8];
		String s2[]=new String[9];
		
		String nlist1[][]=new String[100][100];		
	
			System.out.println("Enter the numbers 1 to 20");
		
			j=0;
			for(i=0;i<20;i++){
				
					nlist1[i][j]=obj.next();
				
			}
			
			//multiples of 10 i.e 30,40,50 ...
			
			System.out.println("Enter mutiples of ten starting from thirty");
			
		
			j=0;
				for(k=29;k<100;k=k+10){
					nlist1[j][k]=obj.next();
					s1[(k-28)%10-1]=nlist1[j][k];
				}
			
			
				// from one to ten
				
				j=0;
				for(k=0;k<9;k++){
					
					s2[k]=nlist1[j][k];
					
				}
				
			
				j=0;
				for(k=;k<10;k++){
				
					nlist1[i][k]=s1[k-2]+" "+s2[i];
					
				}
				
		
			
			
		
			
			
			for(i=0;i<10;i++){
				for(j=0;j<10;j++){
					System.out.print(nlist1[i][j]+"      ");
				}
				System.out.println();
			} 
			
			
			
			
	}
	
}
