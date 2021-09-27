package selfstudy;

import java.util.Arrays;

public class ArraySwap {
//	swap two array
//    a=[1,2,3,4]
//    b=[9,8,7,6,5]
	public static void swapArray(int [] a ,int [] b) {
		int [] temp = new int[5];
		
//		System.out.println("temp brore swap "+Arrays.toString(temp));
		System.out.println("a before swap "+Arrays.toString(a));
		System.out.println("b before swap "+Arrays.toString(b));	
		for(int i = 0; i<a.length; i++) {
			temp[i]=a[i];	
			a[i]=b[i];
			b[i]=temp[i];
		}
				
	}
	public static void main(String[] args) {
		int [] a = new int [5];
		a[0]=1;
		a[1]=2;
		a[2]=3;
		a[3]=4;
		int [] b = {9,8,7,6,5};
		swapArray(a,b);
		System.out.println("a after swap "+Arrays.toString(a));
		System.out.println("b after swap "+Arrays.toString(b));		
	}
}