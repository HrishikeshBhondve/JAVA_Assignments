package day3;
import java.util.*;
public class MergeArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// first array
        int[] a = { 103, 204, 305, 406 };
  
        // second array
        int[] b = { 501, 602, 703, 805 };
  
        // determines length of firstArray
        int a1 = a.length;
        
        // determines length of secondArray
        int b1 = b.length;
        
        // resultant array size
        int c1 = a1 + b1;
  
        // create the resultant array
        int[] c = new int[c1];
  
        // using the pre-defined function arraycopy
        System.arraycopy(a, 0, c, 0, a1);
        System.arraycopy(b, 0, c, a1, b1);
  
        // prints the resultant array
        System.out.println(Arrays.toString(c));
    }
}

