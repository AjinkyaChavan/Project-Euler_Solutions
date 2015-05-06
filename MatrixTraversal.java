import java.io.BufferedReader;
import java.io.FileReader;


public class MatrixTraversal {

	
	public static void main(String[] args) {
	
		
		
		
		
		
		
		int m[][]={{1,2,3,4,5,6,7,8,9,10},
				 {11,12,13,14,15,16,17,18,19,20},
				 {21,22,23,24,25,26,27,28,29,30},
				 {31,32,33,34,35,36,37,38,39,40},
				 {41,42,43,44,45,46,47,48,49,50},
				 {51,52,53,54,55,56,57,58,59,60},
				 {61,62,63,64,65,66,67,68,69,70},
				 {71,72,73,74,75,76,77,78,79,80},
				 {81,82,83,84,85,86,87,88,89,90},
				 {91,92,93,94,95,96,97,98,99,100}};
		int i,j,k;
		int count=0;
		
		
	/*	for(k=0;k<7;k++){
			for(i=9;i>=0;i--){
				for(j=9;j>=0;j--,count++){
					if(count<4){
						System.out.print(m[i][j-k]+" ");
						}
				}
				System.out.println();
				count = 0;
			}
		}
		*/
		
	/*	
		for(k=0;k<4;k++){
		for(i=6;i>=0;i--){
			for(j=6;j>=0;j--,count++){
				if(count<4){
					System.out.print(m[j-k][i]+" ");
					}
			}
			System.out.println();
			count = 0;
		}
	}
	*/
		/*
		for(k=0;k<7;k++){
		for( i=0;i<7;i++){
			
			//System.out.println(i+" i");
			
			for( j=0;j<7;j++,count++){
			//	System.out.print(m[j][i]+" ");
			//	System.out.print(m[j][i]+" ");
				if(count<4){
				System.out.print(m[j+k][i+j]+" ");
				}
			}
			count=0;
			j-=3;
			
			System.out.println();
		}
		}
	*/
		System.out.println();
		System.out.println();
		
		for(k=0;k<7;k++){
			for( i=6;i>2;i--){
				
				//System.out.println(i+" i");
				
				for( j=0;j<7;j++,count++){
				//	System.out.print(m[j][i]+" ");
				//	System.out.print(m[j][i]+" ");
					if(count<4){
					System.out.print(m[j+k][i-j]+" ");
					}
				}
				count=0;
				j-=3;
				
				System.out.println();
			}
			}
	
	
	
	}

}
