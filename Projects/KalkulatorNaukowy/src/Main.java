import java.util.Scanner;

public class Main {
    public static void main(String[] args) {



        Dodaj dodaj=new Dodaj(0,0);
        Odejmij odejmij =new Odejmij(0,0);
        Poteguj poteguj =new Poteguj(2,3);
        Multiply mnozenie=new Multiply(0,0);
        Delta delta=new Delta(1,3,8);
        Pierwiastek pierwiastek=new Pierwiastek(4,2);
        Pochodna pochodna=new Pochodna(4,4);
        Logarytmy logarytmy=new Logarytmy(2,2);
        Delete delete=new Delete();
        CreateFile createfile=new CreateFile();
        Trigonometricdegree trigonometric=new Trigonometricdegree(45,3);
        Arc arc=new Arc(3);
        ArcDegree arcdegree=new ArcDegree(0.707);
        Arc2 arc2=new Arc2(3);
        Dzielenie dzielenie=new Dzielenie(2,2);


        System.out.println("podaj liczbe 1-jesli dodac, 2- jesli odjac " );
        System.out.println("3-potęgowanie  4-mnozenie  5-delta 6-pierwiastek 7-pochodna 8-logarytmy 9- jeśli zochcesz zobaczyć ostatnio zapisane dane");
        System.out.println("10-jeśli chcesz wykonać działania na liczbach zespolonych");
        System.out.println("11-jeśli chcesz usunąć 12- jesli chcesz utworzyć plik do zapisu wyników 13 -jeśli chcesz wyznaczyć wartośc funkcji trygonometrycznej dla radianów ");
        System.out.println("14 - wartość kąta w radianch   15- wartośc kąta w stopniach 16-dzielenie 17-reszta z dzielenia ");
        Scanner in =new Scanner(System.in);
        int y=in.nextInt();
        switch(y)
        {
            case 1:
                dodaj.operation();
                dodaj.result();
                dodaj.printinfo();
                dodaj.zapiszDane();

               System.out.println(dodaj.getResultend());
               dodaj.odczytajDane();
                break;
            case 2:
                odejmij.operation();
                odejmij.result();
                odejmij.printinfo();

                break;
            case 3:
                poteguj.operation();
                poteguj.result();
                poteguj.printinfo();
                poteguj.odczytajDane();
                break;
            case 4:
                mnozenie.operation();;
                mnozenie.result();
                mnozenie.printinfo();
                break;
            case 5:
                delta.operation();
                delta.result();
                delta.printinfo();
                break;
            case 6:
                pierwiastek.operation();
                pierwiastek.result();
                pierwiastek.printinfo();

                break;
            case 7:
                pochodna.result();
                pochodna.printinfo();
                break;
            case 8:
                logarytmy.operation();
                logarytmy.result();
                logarytmy.printinfo();
                break;
            case 9:
                pierwiastek.odczytajDane();
                break;
            case 10:

                System.out.println("podaj część rzeczywista 1 liczby ");
                double real1=in.nextDouble();
                System.out.println("podaj cżesć urojoną 1 liczby ");
                double imaginary1=in.nextDouble();
                System.out.println("podaj część rzeczywista 2 liczby");
                double real2=in.nextDouble();
                System.out.println("podaj cżesć urojoną 2 liczbe ");
                double imaginary2=in.nextDouble();
                ComplexNumber a=new ComplexNumber(real1,imaginary1);
                ComplexNumber b=new ComplexNumber(real2,imaginary2);
                System.out.println("wybierz co chcesz zrobić");
                int wybor2=in.nextInt();


                switch(wybor2)
                {
                    case 1:
                        System.out.println(a.add(b));
                        break;
                    case 2:
                        System.out.println(a.divide(b));
                        break;
                    case 3:
                       System.out.println(a.getImaginary());
                        break;
                    case 4:
                        System.out.println(a.getReal());
                        break;
                    case 5:
                        System.out.println(a.multiply(b));
                        break;
                    case 6:

                        System.out.println(a.subtract(b));

                        break;
                }
                break;
            case 11:
                delete.delete();
                break;
            case 12:
                createfile.create();
                break;
            case 13:
                trigonometric.menu();
                trigonometric.wybor();
                trigonometric.result();
                break;
            case 14:


                arc2.menu();
                arc2.wybor();
                arc2.result();
                break;

            case 15:

                System.out.println("podaj wartość funkcji dla której kąt chcesz wyznaczyć ");
                Scanner scan=new Scanner(System.in);
                double beta=scan.nextDouble();

                arcdegree.wybor(beta);
                break;
            case 16:
                dzielenie.wylicz();
                dzielenie.zapiszinfo();
                break;
            case 17:
                dzielenie.wyliczmodulo();
                dzielenie.zapiszinfo();
            default:
                break;






        }


    }
}