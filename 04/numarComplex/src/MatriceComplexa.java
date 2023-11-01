public class MatriceComplexa {
    NumarComplex[][] a;

    public MatriceComplexa(int[][] img, int[][] re, int m, int n) {
        a = new NumarComplex [n][m];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; j++)
                a[i][j] = new NumarComplex(img[i][j], re[i][j]);
    }
    public MatriceComplexa(NumarComplex [][]a){
        this.a = a;
    }
    public MatriceComplexa adunare(MatriceComplexa matrice, int n, int m){
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++)
                this.a[i][j].adunare(matrice.a[i][j]);
        }
        MatriceComplexa ans = new MatriceComplexa(this.a);
        return ans;
    }
    public void afiseaza(int n, int m){
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++)
                System.out.print(this.a[i][j].toString() + " ");
            System.out.println();
        }
    }
}
