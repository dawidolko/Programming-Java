package Task4and5;

public class Main{
    public static void main(String[] args){
//           4 ZADANIE
//        Kwadrat k2 = new Kwadrat(2);
//        Prostokat p2 = new Prostokat(2,4);
//        Trojkat t1 = new Trojkat(2,4,5);
//        Trapez t2 = new Trapez(3,4,5);
//        Rownoleglobok r1 = new Rownoleglobok(2,3,3);
//        Romb r2 = new Romb(2,3);
//        Kolo k3 = new Kolo(2);
//        Szescian s2 = new Szescian(2);
//
//        Prostopadloscian p1 = new Prostopadloscian(2,3,4);
//        Kula k1 = new Kula(5);
//        Walec w1 = new Walec(3,4);
//        Stozek s1 = new Stozek(5,6,7);
//
//        System.out.println("Pole kwardratu = " + k2.obliczPole());
//        System.out.println("Pole prostokata = " + p2.obliczPole());
//        System.out.println("Pole trojkata = " + t1.obliczPole());
//        System.out.println("Pole traprazu = " + t2.obliczPole());
//        System.out.println("Pole rownolegloboku = " + r1.obliczPole());
//        System.out.println("Pole rombu = " + r2.obliczPole());
//        System.out.println("Pole kola = " + k3.obliczPole());
//
//        System.out.println("Pole szescianu = " + s2.obliczPole());
//        System.out.println("Pole prostopadloscianu = " + p1.obliczPole());
//        System.out.println("Pole kuli = " + k1.obliczPole());
//        System.out.println("Pole walca = " + w1.obliczPole());
//        System.out.println("Pole stozka = " + s1.obliczPole());
//
//        System.out.println();
//        System.out.println();
//
//        System.out.println("Obwod kwadratu = " + k2.obliczObwod());
//        System.out.println("Obwod prostokata = " + p2.obliczObwod());
//        System.out.println("Obwod trojata = " + t1.obliczObwod());
//        System.out.println("Obwod trapezu = " + t2.obliczObwod());
//        System.out.println("Obwod rownolegloboku = " + r1.obliczObwod());
//        System.out.println("Obwod rombu = " + r2.obliczObwod());
//        System.out.println("Obwod kola = " + k3.obliczObwod());
//
//        System.out.println("Obwod szescianu = " + s2.obliczObjetosc());
//        System.out.println("Objetosc prostopadloscianu = " + p1.obliczObjetosc());
//        System.out.println("Objetosc kuli = " + k1.obliczObjetosc());
//        System.out.println("Objetosc walca = " + w1.obliczObjetosc());
//        System.out.println("Objetosc stozka = " + s1.obliczObjetosc());
//
//        System.out.println();
//        System.out.println();
//
//        System.out.println(k2.toString());
//        System.out.println(p2.toString());
//        System.out.println(t1.toString());
//        System.out.println(t2.toString());
//        System.out.println(r1.toString());
//        System.out.println(r2.toString());
//        System.out.println(k3.toString());
//
//        System.out.println(s2.toString());
//        System.out.println(p1.toString());
//        System.out.println(k1.toString());
//        System.out.println(w1.toString());
//        System.out.println(s1.toString());

        //5 ZADANIE
        FiguraGeometryczna[] figures = new FiguraGeometryczna[15];
        figures[0] = new Kolo(5);
        figures[1] = new Prostokat(4, 6);
        figures[2] = new Kwadrat(3);
        figures[3] = new Trojkat(3, 4, 5);
        figures[4] = new Kolo(3);
        figures[5] = new Rownoleglobok(2, 8,6);
        figures[6] = new Kwadrat(5);
        figures[7] = new Trojkat(6, 8, 10);
        figures[8] = new Kolo(7);
        figures[9] = new Prostokat(3, 5);
        figures[10] = new Kwadrat(2);
        figures[11] = new Trojkat(5, 12, 13);
        figures[12] = new Kolo(4);
        figures[13] = new Prostokat(6, 7);
        figures[14] = new Kwadrat(4);

        int i = 0;
        while (i < figures.length) {
            System.out.println(figures[i].toString());
            i++;
        }
    }
}
