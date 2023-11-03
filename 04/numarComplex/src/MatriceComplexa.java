public class MatriceComplexa {
    NumarComplex[][] a;
    private int n;
    private int m;

    public MatriceComplexa(int[][] img, int[][] re, int m, int n) {
        a = new NumarComplex[n][m];
        this.n = n;
        this.m = m;
        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; j++)
                a[i][j] = new NumarComplex(img[i][j], re[i][j]);
    }

    public MatriceComplexa(NumarComplex[][] a, int n, int m) {
        this.a = a;
        this.n = n;
        this.m = m;
    }

    public MatriceComplexa adunare(MatriceComplexa matrice) {
        MatriceComplexa ans = new MatriceComplexa(this.a, this.n, this.m);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++)
                ans.a[i][j]=ans.a[i][j].adunare(this.a[i][j]);
        }
        return ans;
    }
    public MatriceComplexa scadere(MatriceComplexa matrice) {
        MatriceComplexa ans = new MatriceComplexa(this.a, this.n, this.m);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++)
                ans.a[i][j]=ans.a[i][j].scadere(this.a[i][j]);
        }
        return ans;
    }

    public void afiseaza() {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++)
                System.out.print(this.a[i][j].toString() + " ");
            System.out.println();
        }
    }
}
