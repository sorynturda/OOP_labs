public class Main {
    public static void main(String[] args) {
        int n = 8;
        for (int i = 0; i < n; i++) {
            Thread obj2 = new Thread(new ClsThread());
            obj2.start();
        }
        System.out.println("gata");
    }
}