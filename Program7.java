import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        int number = scanner.nextInt();
        
        String binary = Integer.toBinaryString(number);
       String reversed = new StringBuilder(binary).reverse().toString(); 
       System.out.println(binary);
       System.out.println(reversed);
        
        if(binary.equals(reversed)){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("No");
        }

    }
}
