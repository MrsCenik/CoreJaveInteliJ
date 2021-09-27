package day18arraysmultidimensonalarrays;

public class MultidimensionalArrays02 {

	public static void main(String[] args) {
		/*
		 arr={{1,2},{3,4,5}.{6}}
		 
		 brr={{7,8,9},{10,11},{12}}
		 
		 Find the sum of elements whose indexes are same in arr1 and arr2
		 
		 
		 */
		
		int arr [][]= {{1,2},{3,4,5},{6}};
		
		int brr [][]= {{7,8,9},{10,11},{12}};
		
		int outerLen = arr.length<brr.length ? arr.length : brr.length;
		
		int sum= 0;
		
		for(int i=0; i<outerLen; i++) {
			
			int innerLen = arr[i].length<brr[i].length?arr[i].length : brr[i].length;
			
				for (int k = 0; k<innerLen; k++) {
				
				sum= sum+arr[i][k]+brr[i][k];
			}
			
		}
		
			System.out.println(sum);
	}

}
