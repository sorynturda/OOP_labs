import java.sql.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

class Persoana implements Comparable<Persoana> {
    private int varsta;
    private String nume;

    Persoana(int v, String s) {
        varsta = v;
        nume = s;
    }

    @Override
    public String toString() {
        return "Persoana{" +
                "varsta=" + varsta +
                ", nume='" + nume + '\'' +
                '}';
    }

    @Override
    public int compareTo(Persoana p) {
        return nume.compareTo(p.nume);
    }
}

public class Main {
    public static void main(String[] args) {
        ArrayList<Persoana> a = new ArrayList<>();
        a.add(new Persoana(12, "Sorin"));
        a.add(new Persoana(11, "Adfht"));
        a.add(new Persoana(66, "Gsfht"));
        a.add(new Persoana(23, "Xios"));
//        for (Persoana persoana : a) {
//            System.out.println(persoana);
//        }
        print(a);
        ArrayList <Integer> b = new ArrayList<>();
        b.add(12);
        b.add(3);
        print(b);
    }
    private static void print(ArrayList<?> a){
        System.out.println(a);
    }
}