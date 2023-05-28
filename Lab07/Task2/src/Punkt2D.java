import java.util.Random;

public class Punkt2D {
    private int x;
    private int y;
    public Punkt2D() {
        this.x = 0;
        this.y = 0;
    }

    public Punkt2D(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void losowanie() {
        Random rand = new Random();
        this.x = rand.nextInt(21) - 10;
        this.y = rand.nextInt(21) - 10;
    }

    @Override
    public String toString() {
        return "Punkt2D {x = " + this.x + ", y = " + this.y + "}";
    }
}
