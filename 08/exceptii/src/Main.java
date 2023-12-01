import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        try {
            int x = in.nextInt();
            System.out.println(x);
        }
        catch(InputMismatchException e ){
            System.out.println("nu e un numar intreg");
        }
        finally{
            System.out.println("se executa tot timpul");
        }
    }
}