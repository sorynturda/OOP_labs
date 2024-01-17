public class Tura extends PiesaSah {
    public Tura(String numePiesa, int x, int y) {
        this.numePiesa = numePiesa;
        this.coordX = x;
        this.coordY = y;
    }

    @Override
    protected boolean mutaPiesa(int new_coordX, int new_coordY) {
        if (new_coordX == coordX || new_coordY == coordY) {
            coordX = new_coordX;
            coordY = new_coordY;
            return true;
        }
        return false;
    }
}
