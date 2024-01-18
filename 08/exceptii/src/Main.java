import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Lucrator l1 = new Lucrator("Gigel", new CalendarLucru());
        try {
            l1.lucreaza("Lun");
        }catch (Exception e){
            System.out.println(e);
        }
        try {
            l1.lucreaza("Marte");
        }catch (Exception e){
            System.out.println("exceptie prinsa");
        }
//        l1.getCal().setLucratoare(0); //facem ca duminica sa fie lucratoare
        try {
            l1.lucreaza("Dum");
        }catch (Exception e){
            System.out.println(e);
        }
        Zi zi = null;
        try {
            System.out.println(zi.getNume());
        }catch (NullPointerException e){
            System.out.println(e);
        }
        int []a = new int[]{1,2,3};
        for(int i=0;i<5;i++){
            try {
            System.out.println(a[i]);
            }catch (ArrayIndexOutOfBoundsException e){
                System.out.println(e);
            }
        }
    }
}