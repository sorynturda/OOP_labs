public class Nebun extends PiesaSah {
    public Nebun(String numePiesa, int x, int y) {
        this.numePiesa = numePiesa;
        this.coordX = x;
        this.coordY = y;
    }

    @Override
    protected boolean mutaPiesa(int new_coordX, int new_coordY) {
        if (Math.abs(new_coordX - coordX) == Math.abs(new_coordY - coordY)) {
            coordX = new_coordX;
            coordY = new_coordY;
            return true;
        }
        return false;
    }
}
