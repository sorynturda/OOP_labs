import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        if (n % 2 == 1)
            n++;
        if (m > 2 || n > 2)
            for (int i = n; i <= m; i += 2) {
                int prim = cauta(i);
                System.out.println(i + ":" + prim + " " + (i - prim));
            }
    }

    public static int cauta(int x) {
        if (verificaPrim(x - 2))
            return 2;
        for (int i = 2; i <= x - 2; i++)
            if (verificaPrim(i) && verificaPrim(x - i))
                return i;
        return 0;
    }

    public static boolean verificaPrim(int n) {
        if (n < 2)
            return false;
        for (int d = 2; d <= n / d; d++)
            if (n % d == 0)
                return false;
        return true;
    }
}