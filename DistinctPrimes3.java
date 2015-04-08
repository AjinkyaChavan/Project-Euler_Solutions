import java.util.*;

		public class DistinctPrimes3{
			
			public static void main(String args[]){
				
				String[] factors=new String[3];
				
				int i,j,k,kcopy;
				
				
				k=16;
				kcopy=k;
				
			
				int l=0;
					
				
				while(kcopy<(k+3)){
					
					 findFactors(kcopy,factors,l++);
					kcopy++;
					
					
				}	
				
				for(int m=0;m<factors.length;m++){
					System.out.println(m+" ---> "+factors[m]);
				}
			
				String init=" "+factors[0]+" "+factors[1]+" "+factors[2];
			System.out.println(init);
				
				ArrayList<Integer> ans=new ArrayList();
				 init.replaceAll("[^a-z]+", "");
					
				 String[] items = init.split(" ");
				int[] results = new int[items.length];

				for ( i = 0; i < items.length; i++) {
					try {
						ans.add(Integer.parseInt(items[i]));
						//System.out.print(ans.get(i)+" ");
						} catch (NumberFormatException nfe) {};
					}
				
				int len1=ans.size();
				
				System.out.println("first ans "+ans);
			
				HashSet hs = new HashSet();
				hs.addAll(ans);
				ans.clear();
				ans.addAll(hs);
					
				
				System.out.println("second ans "+ans);
				
				int len2=ans.size();
				
				System.out.println();
				System.out.println();
				
				if(len1==len2)
					System.out.print("answer is"+(kcopy-1)+" "+(kcopy-2)+" "+(kcopy-3));
				
			
			}
			
			public static void findFactors(int n,String[] factors,int l){
				
				
				System.out.println("init l="+l);
				
				for(int i=2;i<n;i++){
					
					if(n%i==0)
						factors[l]+="  n->"+n+"  i->"+i+" ";
					
					
					
					System.out.println("currently n="+n+" ,l="+l);
					System.out.println();
				}

			
			}

			
		}