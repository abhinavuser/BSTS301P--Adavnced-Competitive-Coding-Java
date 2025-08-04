class Main {
    static int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }

    static int totient(int n) {
        int count = 0;
        for (int i = 1; i < n; i++) {
            if (gcd(i, n) == 1) count++;
        }
        return count;
    }

    public static void main(String[] args) {
        int n = 17;
        int result = totient(n);
        System.out.println(result);
    }
}
