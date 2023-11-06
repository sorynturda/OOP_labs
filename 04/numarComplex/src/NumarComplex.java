public class NumarComplex {
    private int img, re;

    public NumarComplex(int img, int re) {
        this.img = img;
        this.re = re;
    }

    public NumarComplex(NumarComplex c) {
        this.img = c.img;
        this.re = c.re;
    }

    public NumarComplex adunare(NumarComplex c) {
        NumarComplex rezultat = new NumarComplex(this.img, this.re);
        rezultat.img += c.img;
        rezultat.re += c.re;
        return rezultat;
    }

    public NumarComplex scadere(NumarComplex c) {
        return new NumarComplex(this.img - c.img, this.re - c.re);
    }

    public NumarComplex inmultireScalar(int x) {
        return new NumarComplex(this.img * x, this.re * x);
    }

    public NumarComplex inmultire(NumarComplex c) {
        return new NumarComplex((this.re * c.img + this.img * c.re), (this.re * c.re - this.img * c.img));
    }

    public String toString() {
        if (this.img == 0)
            return Integer.toString(this.re);
        if (this.re == 0)
            return this.img + "i";
        return this.re + " + " + this.img + "i";
    }
}