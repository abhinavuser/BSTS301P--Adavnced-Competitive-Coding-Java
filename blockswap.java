import java.util.*;
public class blockswap {
    public static void main(String[] args) {
        ArrayList<Integer> a= new ArrayList<>(List.of(10,20,30,40,50));
        Scanner x =new Scanner(System.in);
        int n= x.nextInt();
        for (int i=0;i<n;i++){
            int b=a.remove(0);
            a.add(b);
        }
        System.out.println(a);
    }
}
