import java.util.ArrayList;

public class Exercitiu {
    public static void main(String[] args) {
        Punct<Integer> p1 = new Punct<>(5, 12);
        Punct<Double> p2 = new Punct<>(5.2, 16.2);
        System.out.println(p2.calculeazaDistanta(p1));
    }
}
