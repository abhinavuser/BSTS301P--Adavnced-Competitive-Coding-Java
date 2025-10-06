import java.util.*;
class Main{
    public static ArrayList<Integer> pro(int arr[],int n){
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i=0;i<n;i++){
            boolean leader = true;
            for(int j=i+1;j<n;j++)
                if(arr[j]>arr[i]){
                leader = false;
                break;
            }
            if(leader==true)
            ans.add(arr[i]);
        }
        return ans;
    }
    public static void main(String args[]){
        int n = 6;
        int arr[]=  {2,4,6,3,1,2};
        ArrayList<Integer> ans = pro(arr,n);
        for (int i = 0; i < ans.size(); i++) {
        System.out.print(ans.get(i)+" ");
        }
    }
}
