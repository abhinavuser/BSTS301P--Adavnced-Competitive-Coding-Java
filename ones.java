import java.util.*;
class Main{
    public static int lol(int arr[], int k){
        int max=Integer.MIN_VALUE;
        int num =0;
        int start=0;
        for(int end =0;end<arr.length;end++){
            if(arr[end]==0){
            num++;
            }
            while(num>k){
                if(arr[start]==0){
                    num--;
                }
                start++;
            }
             max = Math.max(max, end - start + 1);
        }
        return max;
    }
    public static void main(String args[]){
        int[] a = new int[]{1, 1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 1, 0};
        int k = 1;
        int result = lol(a, k);
        System.out.println(result);

    }
}
