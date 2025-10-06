import java.util.*;
class Main{
    public static int karatsuba(int x,int y){
        if(x<10 || y<10){
            return x*y;
        }
        int m = Math.max(getn(x),getn(y));
            int half=m/2;
            int power = (int) Math.pow(10,half);
            int a =x/power;
            int b =x%power;
            int c =y/power;
            int d =y%power;
            int ac = karatsuba(a,c);
            int bd = karatsuba(b,d);
            int abcd = karatsuba(a+b,c+d);
            int result = ac * (int) Math.pow(10,2*half) + (abcd-ac-bd)*power + bd;
            return result;
        
    }
    public static int getn(int x){
        if(x==0){
            return 1;
        }
        int count =0;
        while(x>0){
            count++;
            x/=10;
        }
        return count;
    }
    public static void main(String args[]){
        Scanner s1=new Scanner(System.in);
        System.out.print("enter number1-");
        int x = s1.nextInt();
        System.out.print("enter number2-");
        int y = s1.nextInt();
        int product = karatsuba(x, y);
        System.out.println(x + " * " + y + " = " + product);

    }
}
