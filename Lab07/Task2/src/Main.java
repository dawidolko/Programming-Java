
public class Main {
    public static void main(String[] args) {
        Punkt2D punkt2D = new Punkt2D();
        Punkt3D punkt3D = new Punkt3D();
        punkt2D.losowanie();
        punkt3D.losowanie();
        System.out.println("Punkt 2D wynosi: " + punkt2D.toString());
        System.out.println("Punkt 3D wynosi: " + punkt3D.toString());
        Punkt2D[] array2D = new Punkt2D[100];
        Punkt3D[] array3D = new Punkt3D[100];
        for (int i = 0; i < array2D.length; i++) {
            array2D[i] = new Punkt2D();
            array2D[i].losowanie();
        }
        for (int i = 0; i < array3D.length; i++) {
            array3D[i] = new Punkt3D();
            array3D[i].losowanie();
        }
        for (int i = 0; i < array2D.length; i++) {
            for (int j = 0; j < array3D.length; j++) {
                if (array2D[i].getX() == array3D[j].getX() && array2D[i].getY() == array3D[j].getY()) {
                    System.out.println("Elementy tablic mające wspólne składowe to: " + array2D[i].toString() + " oraz " + array3D[j].toString());
                }
            }
        }
    }
}