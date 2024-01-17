class Numere {
    public void negative(int k) {
        for (int i = -k, cnt = 0; i < 0; i++, cnt++) {
            System.out.println("Nr negativ: " + i);
            if (cnt == 2) {
                try {
                    Thread.sleep(10000);
                } catch (InterruptedException e) {
                    System.out.println("Tratata");
                }
            }
        }
    }

    public void pozitive(int k) {
        for (int i = 0; i < k; i++)
            System.out.println("nr pozotiv: " + i);
    }
}

public class Main {
    public static void main(String[] args) {
        int p = 10;
        Numere obj = new Numere();
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                obj.negative(p);
            }
        });
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                obj.pozitive(p);
            }
        });
        t1.start();
        t1.interrupt();
        t2.start();
        System.out.println("Gata");
    }
}