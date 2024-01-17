public class ClsThread implements Runnable {
    @Override
    public void run() {
        try {
            for (int i = 0; i < 100; i++)
                System.out.println(i + " Thread " + Thread.currentThread().getId() + " ruleaza!");
//                System.out.println(" Thread " + Thread.currentThread().getId() + " ruleaza!");
        } catch (Exception e) {
            System.out.println("Exceptie prinsa!");
        }
    }
}