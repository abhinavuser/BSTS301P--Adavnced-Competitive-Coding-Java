import java.util.Scanner;

class Main {
    static int minApples(int M, int K, int N, int S, int W, int E) {
        if (M <= S * K) {
            return M;
        } else if (M <= S * K + E + W) {
            return M;
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter no of apples to be collected");
        int M = scanner.nextInt();
        System.out.println("Enter no of apples in each tree");
        int K = scanner.nextInt();
        System.out.println("Enter no of trees in north");
        int N = scanner.nextInt(); 
        System.out.println("Enter no of trees in south");
        int S = scanner.nextInt();
        System.out.println("Enter no of trees in west");
        int W = scanner.nextInt();
        System.out.println("Enter no of trees in east");
        int E = scanner.nextInt();
        int ans = minApples(M, K, N, S, W, E);
        System.out.println(ans);
    }
}
