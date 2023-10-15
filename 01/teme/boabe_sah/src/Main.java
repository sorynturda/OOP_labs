import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {
        BigInteger x = new BigInteger("1");
        BigInteger sum = new BigInteger("0");
        for(int i=0; i<8;i++){
            for(int j=0;j<8;j++) {
                System.out.print(x + " ");
                sum = sum.add(x);
                x = x.shiftLeft(1);
            }
            System.out.println();
        }
        System.out.println("\nsuma este: " + sum);
    }
}