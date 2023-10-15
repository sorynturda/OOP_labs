public class Main {
    public static void main(String[] args) {
        double a = -12, b = 12;
        System.out.println(a / 0);
        System.out.println(b / 0);
        System.out.println(b / 0 - a / 0);
        a /= 0;
        b /= 0;
        System.out.println(a + " " + b);
        System.out.println(a*b);
//        int x = 1.2;
        boolean f = false;
        System.out.println(f);
    }
}