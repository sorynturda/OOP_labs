public class Pion extends PiesaSah {
    public Pion(String numePiesa, int x, int y) {
        this.numePiesa = numePiesa;
        this.coordX = x;
        this.coordY = y;
    }

    @Override
    protected boolean mutaPiesa(int new_coordX, int new_coordY) {
        if (new_coordY == coordY && new_coordX - coordX == 1) {
            coordX = new_coordX;
            return true;
        }
        return false;
    }
}
