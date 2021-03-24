package chapterFive;

public class PythagoreanTriples {

    private int i;
    private int j;
    private int k;

    public void setAdjacent(int i) {
        if (i >= 1 && i <= 500)
            this.i = i;
    }

    public int getAdjacent() {
        return i;
    }

    public void setOpposite(int j) {
        if(j >= 1 && j <= 500)
            this.j =j;
    }

    public int getOpposite() {
        return j;
    }

    public void setHypotenuse(int k) {
        if (k >= 1 && k <= 500)
            this.k = k;
    }

    public int getHypotenuse() {
        return 0;
    }

    public boolean calculateHypotenuse(int i, int j, int k) {
        if(k*k == i*i + j*j){
            return true;
        }
        return false;
    }



}
