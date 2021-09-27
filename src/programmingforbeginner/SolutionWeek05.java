package programmingforbeginner;

import java.util.Arrays;

public class SolutionWeek05 {
    public static void reverseArray(int arr[]) {
        if (arr.length <= 1) {
            return;
        }else{


//        int[] arr = {12, 5, 6, 7, 8, 9,2,1};
            int start = 0;
            int middle=arr.length/2;
            int end = arr.length - 1;
            while (start <middle) {
                arr[start] = arr[start] + arr[end];
                arr[end] = arr[start] - arr[end];
                arr[start] = arr[start] - arr[end];
                start++;
                end--;
        }
        System.out.println(Arrays.toString(arr));
        }
    }
}
