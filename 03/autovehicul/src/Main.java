import java.awt.Color;

public class Main {
    public static void main(String[] args) {
        Autovehicul mas = new Autovehicul("Rolls Royce", Color.CYAN, 200.0, 8);
        Sofer persoana = new Sofer("Doe", "John", "0x1y2z3", 55);
        mas.sofer = persoana;
        System.out.println(mas.toString());
        mas.sofer = persoana;
        mas.accelerare();
        System.out.println(mas.toString());
        for (int i = 0; i < 200; i++) {
            mas.accelerare();
        }
        System.out.println(mas.toString());
        for(int i=0;i<50;i++)
            mas.decelerare();
        System.out.println(mas.toString());
        mas.oprire();
        System.out.println(mas.toString());
    }
}