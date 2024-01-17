import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PiesaSah[][] a = new PiesaSah[9][9];
        a[2][1] = new Pion("Pion", 2, 1);
        a[2][2] = new Pion("Pion", 2, 2);
        a[1][1] = new Tura("Tura", 1, 1);
        while (true) {
            for (int i = 1; i < 9; i++) {
                for (int j = 1; j < 9; j++)
                    if (a[i][j] != null) {
                        if (a[i][j].numePiesa.equals("Pion"))
                            System.out.print("p ");
                        else if (a[i][j].numePiesa.equals("Nebun"))
                            System.out.print("n ");
                        else if (a[i][j].numePiesa.equals("Tura"))
                            System.out.print("t ");
                    } else
                        System.out.print("0 ");
                System.out.println();
            }
            int x1 = in.nextInt();
            int y1 = in.nextInt();
            int x2 = in.nextInt();
            int y2 = in.nextInt();
            if (a[x1][y1] != null && a[x1][y1].mutaPiesa(x2, y2)) {
                a[x2][y2] = a[x1][y1];
                a[x1][y1] = null;
            }
        }
    }
}