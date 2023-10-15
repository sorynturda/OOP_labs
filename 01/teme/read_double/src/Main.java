import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] s = input.nextLine().split(" ");
        for (String t : s){
            int x;
            double y;
            try{
                x = Integer.parseInt(t);
                System.out.println(x);
            }
            catch (NumberFormatException error){
                y = Double.parseDouble(t);
                System.out.println(y);
//                System.out.println(error);
            }
        }
    }
}