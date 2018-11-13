public class Pair extends Object {
    private int i;
    private int j;

    public Pair(int i, int j) {
        this.i = i;
        this.j = j;
    }

    public int getI() {
        return this.i;
    }

    public int getJ() {
        return this.j;
    }

    public void setI(int i) {
        this.i = i;
    }

    public void setJ(int j) {
        this.j = j;
    }

    @Override
    public boolean equals(Object obj) {
        return this.getI() == ((Pair) obj).getI() && this.getJ() == ((Pair) obj).getJ();
    }
}