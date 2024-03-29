public class Main {
    public static void main(String[] args) {
        PerecheInt p1 = new PerecheInt(10, 5);
//        System.out.println(p1);
        PerecheString p2 = new PerecheString("ABC", "D");
//        System.out.println(p2);
        Pereche<Integer> p3 = new Pereche<>(1, 2);
//        System.out.println(p3);
        Pereche<String> p4 = new Pereche<>("ABC", "DEF");
//        System.out.println(p4);
//        p4.afisareDuala("OOP");
//        p3.afisareDuala(10);
        p3.afisareCuPereche(p4, new Pereche<>("123", 5));
        PerecheExtends<Integer> p5 = new PerecheExtends<>(1, 2);
        m2(p5);
    }

    static void m1(PerecheExtends<Number> num) {
        System.out.println(num);
    }

    static <T extends Number> void m2(PerecheExtends<T> num) {
        System.out.println(num);
    }
}