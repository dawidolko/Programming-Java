public class Vector3D {
    private int id;
    private double x,y,z;
    public Vector3D(int id, double x, double y, double z){
        this.id=id;
        this.x=x;
        this.y=y;
        this.z=z;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setZ(double z) {
        this.z = z;
    }
    public int getId() {
        return id;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getZ() {
        return z;
    }

    public String toString(){
        return "Vector [ID: " + id + ", X: " + x + ", Y: " + y + ", Z: " + z + "]";
    }
}
