import java.io.*;
class main{
    public static int jospeh(int n , int k){
        if(n==1)
        return 1;
        else
        return (jospeh(n-1,k)+k-1)%n+1;
    }
    public static void main(String [] args){
        int n = 14;
        int k = 2;
        System.out.println(jospeh(n,k));
    }
}