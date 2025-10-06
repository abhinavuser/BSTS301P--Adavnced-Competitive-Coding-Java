import java.util.*;
class Main{
    public static void major(int arr[], int n){
        int max = 0;
        int index = -1;
        for(int i = 0;i<n;i++){
            int count = 0;
            for(int j = 0;j<n;j++){
                if(arr[i]==arr[j]){
                    count++;
                }
            if(count>max){
            max=count;
            index =i;
            }

        }
        }
        if(max>n/2)
            System.out.println(arr[index]);
        else
            System.out.println((String)null);
        
    }
    public static void main(String args[]){
        int arr[] = { 1, 1, 2, 1, 3, 5, 1 };
        major(arr, arr.length);

    }
}
