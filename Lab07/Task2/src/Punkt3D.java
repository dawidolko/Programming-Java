import java.util.Random;

public class Punkt3D extends Punkt2D {
    private int z;

    public Punkt3D() {
        super();
        this.z = 0;
    }

    public Punkt3D(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }

    public int getZ() {
        return z;
    }

    public void losowanie() {
        super.losowanie();
        Random rand = new Random();
        this.z = rand.nextInt(21) - 10;
    }

    @Override
    public String toString() {
        return "Punkt3D {x = " + this.getX() + ", y = " + this.getY() + ", z = " + this.z + "}";
    }
}