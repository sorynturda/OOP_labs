import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        String s = in.nextLine();
//        String t = "sorin";
//        String name = "sorin";
//        System.out.println(name == s);
        int virsta=25, sex=1, inaltime=180;
        short info_impachetata;
        info_impachetata = (short) ((((virsta << 1) | sex) << 8) | inaltime);
        inaltime = info_impachetata & 0xff;
        sex = (info_impachetata >>> 8) & 1;
        virsta = (info_impachetata >>> 9) & 0x7f;
        System.out.println(info_impachetata);
        System.out.println(inaltime);
        System.out.println(sex);
        System.out.println(virsta);
    }
}