import java.util.Scanner;
public class SwapNibble {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int swapnum;
        swapnum = ((num & 0x0F) << 4 | (num & 0xF0) >> 4);
        System.out.println(swapnum);
    }
}
