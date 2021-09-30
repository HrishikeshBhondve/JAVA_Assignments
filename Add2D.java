package day3;

public class Add2D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//creating two matrices    
		int a[][]={{21,3,4},{42,4,3},{3,74,5}};    
		int b[][]={{1,33,4},{2,74,3},{1,2,14}};    
		    
		//creating another matrix to store the sum of two matrices    
		int c[][]=new int[3][3];  //3 rows and 3 columns  
		    
		//adding and printing addition of 2 matrices    
		for(int i=0;i<3;i++){    
		for(int j=0;j<3;j++){    
		c[i][j]=a[i][j]+b[i][j];    //use - for subtraction  
		System.out.print(c[i][j]+" ");    
		}    
		System.out.println();//new line    
		}    
	}

}
