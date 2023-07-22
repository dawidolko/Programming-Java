package Figures;

import java.util.Scanner;

public class Run
{
    public void Runs()
    {
        while (true)
        {
            Menu();
            int choice = InputInt();
            switch (choice)
            {
                case 1 -> CircleF();
                case 2 -> SquareF();
                case 3 -> RectangleF();
                case 4 -> CubeF();
                case 5 -> CuboidF();
                case 6 -> SphereF();
                case 7 -> ConeF();
                case 8 -> End();
                default -> Default();
            }
        }
    }

    public void Menu()
    {
        System.out.println("\n\t======================");
        System.out.println("\t===   MENU OPCJI   ===");
        System.out.println("\t======================");
        System.out.println("\t1. Koło");
        System.out.println("\t2. Kwadrat");
        System.out.println("\t3. Prostokąt");
        System.out.println("\t4. Sześcian");
        System.out.println("\t5. Prostopadłościan");
        System.out.println("\t6. Kula");
        System.out.println("\t7. Stożek");
        System.out.println("\t8. Wyjście");
        System.out.println("\t----------------------");
        System.out.print("\tWybierz odpowiednią operacje: ");
    }

    public void CircleF()
    {
        System.out.print("\tPodaj nazwę dla koła: ");
        String name = InputString();
        System.out.print("\tPodaj długość promienia: ");
        double r = InputDouble();
        Circle circle = new Circle(r, name);
        circle.print();
    }

    public void SquareF()
    {
        System.out.print("\tPodaj nazwę dla kwadratu: ");
        String name = InputString();
        System.out.print("\tPodaj długość boku: ");
        double a = InputDouble();
        Square square = new Square(a, name);
        square.print();
    }

    public void RectangleF()
    {
        System.out.print("\tPodaj nazwę dla prostokąta: ");
        String name = InputString();
        System.out.print("\tPodaj długość boku 1: ");
        double a = InputDouble();
        System.out.print("\tPodaj długość boku 2: ");
        double b = InputDouble();
        Rectangle rectangle = new Rectangle(a, b, name);
        rectangle.print();
    }

    public void CubeF()
    {
        System.out.print("\tPodaj nazwę dla sześcianu: ");
        String name = InputString();
        System.out.print("\tPodaj długość krawędzi: ");
        double a = InputDouble();
        Cube cube = new Cube(a, name);
        cube.print();
    }

    public void CuboidF()
    {
        System.out.print("\tPodaj nazwę dla prostopadłościanu: ");
        String name = InputString();
        System.out.print("\tPodaj długość krawędzi 1: ");
        double a = InputDouble();
        System.out.print("\tPodaj długość krawędzi 2: ");
        double b = InputDouble();
        System.out.print("\tPodaj długość krawędzi 3: ");
        double c = InputDouble();
        Cuboid cuboid = new Cuboid(a, b, c, name);
        cuboid.print();
    }

    public void SphereF()
    {
        System.out.print("\tPodaj nazwę dla kuli: ");
        String name = InputString();
        System.out.print("\tPodaj długość promienia: ");
        double r = InputDouble();
        Sphere sphere = new Sphere(r, name);
        sphere.print();
    }

    public void ConeF()
    {
        System.out.print("\tPodaj nazwę dla stożka: ");
        String name = InputString();
        System.out.print("\tPodaj długość promienia: ");
        double r = InputDouble();
        System.out.print("\tPodaj długość wysokości: ");
        double h = InputDouble();
        Cone cone = new Cone(r, h, name);
        cone.print();
    }

    public void End()
    {
        System.out.print("\tCzy na pewno chcesz wyjść z programu? ( t | T | tak | Tak | TAK ): ");
        String znak = InputString();
        if (znak.equals("t") || znak.equals("T") || znak.equals("tak") || znak.equals("Tak") || znak.equals("TAK"))
        {
            System.out.println("\tKoniec programu");
            System.exit(0);
        }
        else
        {
            System.out.println("\tAnulowano wyjście");
        }
    }

    public void Default()
    {
        System.out.println("\tBłędne dane, koniec programu");
        System.exit(0);
    }

    public int InputInt()
    {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        return number;
    }

    public double InputDouble()
    {
        Scanner input = new Scanner(System.in);
        double number = input.nextDouble();
        return number;
    }

    public String InputString()
    {
        Scanner input = new Scanner(System.in);
        String word = input.nextLine();
        return word;
    }
}
