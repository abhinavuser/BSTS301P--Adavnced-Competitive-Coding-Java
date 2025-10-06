import java.util.*;
public class GCD {
    public static int gcd(int a,int b){
        if (b==0){
            return a;
        }
        return gcd(b,a%b);
    }
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        int x = a.nextInt();
        int y = a.nextInt();
        System.out.println("The GCD is: "+ gcd(x,y));
    }
}
