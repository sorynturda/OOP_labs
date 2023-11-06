import javax.management.MBeanAttributeInfo;

public class Main {
    public static void main(String[] args) {
        int [][]a = new int[][]{{1,2},{3,4}};
        int [][]b = new int[][]{{2,3},{5,6}};

        MatriceComplexa m = new MatriceComplexa(a,b,2,2);
//        System.out.println();
        MatriceComplexa n = new MatriceComplexa(b,a,2,2);
//        n.afiseaza();
//        System.out.println();
//        m = m.scadere(n);
//        m.afiseaza();
        m=m.inmultire(n);
        m.afiseaza();
    }
}