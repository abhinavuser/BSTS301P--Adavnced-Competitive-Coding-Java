import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number");
        String num = sc.nextLine();
        if(num.length() == 8) {
            String swapped = num.substring(4) + num.substring(0, 4);
            System.out.println("Swapped nibbles: " + swapped);
        } else {
            System.out.println("Invalid input. Enter 8-bit binary number.");
        }
    }
}
