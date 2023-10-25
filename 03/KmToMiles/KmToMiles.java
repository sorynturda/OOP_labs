import java.util.Scanner;

public class KmToMiles {
    private static double convertKmToMi(double kilometri) {
        return kilometri * 0.621;
    }
    public static void main(String []args) {
        Scanner in = new Scanner(System.in);
        String kmStr;
        double km;
        double mi;
        kmStr = in.nextLine();
        km = Double.parseDouble(kmStr);
        mi = convertKmToMi(km);
        System.out.println(km + " kilometri sunt " + mi + " mile.");
    }
}
