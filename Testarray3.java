package def;

public class Testarray3 {
	static int countOne = 0;
	static int countTwo = 0;
	public static void main(String args[]){   
		String arr3[][]={{"1","#","#"},{"1","3","#"},{"0","1","1"}};
	  
		//printing 2D array  
		for(int i=0;i<3;i++){  
			for(int j=0;j<3;j++){  
				System.out.print(arr3[i][j]+" ");

			}  
			System.out.println();  
		}  
	  
		
		for (int i = 0; i < 3; i++) {
		    for (int j = 0; j < 3; j++) {
				if (arr3[i][j].equals("#")){
		        	//System.out.print(arr3[i][j]+" ");
		        	//printArray(arr3, i);
		        	System.out.println("Found on index "+"i=" + i + " j=" + j);
		        	if(i==0){
		        		countOne+=1;	
		        	}
		        	if(i==1){
		        		countTwo+=1;	
		        	}
		        }
		    }
		}
		System.out.println("Первый ряд имеет "+countOne+" мины, "+"второй ряд имеет "+countTwo+" мину");
		System.out.println();
		System.out.println("end");
		}
}
