import java.io.*;
import java.util.* ;
import java.util.Arrays;
public class pairSum{
    public static List<int[]> pairSum(int[] arr, int s) {
        // Write your code here.
        int n = arr.length;
        Arrays.sort(arr);
        List<int[]> pairs = new ArrayList<>();
        for(int i =0 ; i < n-1;i++){
            int req_val = s - arr[i];
            int[] pair = new int[2] ;
            
            for(int j =i+1 ;j<n;j++){
                if(arr[j]==req_val){
                    pair[0] =arr[i];
                    pair[1] =arr[j];
                    Arrays.sort(pair);
                    pairs.add(pair);
                }
            }
        }
        return pairs;
    }
}
