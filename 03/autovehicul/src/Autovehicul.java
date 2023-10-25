import java.awt.Color;

public class Autovehicul {
    public Sofer sofer;
    private String marca;
    private Color culoare;
    private double vitezaCurenta, vitezaMaxima;
    private int numarTrepte, treaptaCurenta;

    public Autovehicul(String marca, Color culoare, double vitezaMaxima, int numarTrepte) {
        this.marca = marca;
        this.culoare = culoare;
        this.vitezaMaxima = vitezaMaxima;
        this.numarTrepte = numarTrepte;
        this.vitezaCurenta = 0;
        this.treaptaCurenta = 0;
    }

    public void accelerare() {
        if (this.vitezaCurenta < this.vitezaMaxima)
            this.vitezaCurenta++;
        this.schimbaTreapta();
    }

    public void decelerare() {
        if (this.vitezaCurenta > 0)
            this.vitezaCurenta--;
        this.schimbaTreapta();
    }

    public void oprire() {
        this.vitezaCurenta = 0;
        this.treaptaCurenta = 0;
        System.out.println("Autovehiculul s-a oprit");
    }

    public double getVitezaCurenta() {
        return this.vitezaCurenta;
    }

    public void schimbaTreapta() {
        this.treaptaCurenta = (int) (this.vitezaCurenta / (this.vitezaMaxima / (this.numarTrepte - 1))) + 1;
    }

    public String getMarca() {
        return this.marca;
    }

    public double getVitezaMaxima() {
        return this.vitezaMaxima;
    }

    public Color getCuloare() {
        return this.culoare;
    }

    public String toString() {
        if (this.vitezaCurenta > 0)
            return this.marca + " de culoare " + this.culoare + "condus de " + this.sofer.toString()
                    + " este in treapta " + this.treaptaCurenta + " si se deplaseaza cu " + this.vitezaCurenta;
        else
            return this.marca + " condus de " + this.sofer.toString() + " este oprit";
    }

    public void setCuloare(Color culoare) {
        this.culoare = culoare;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
}

