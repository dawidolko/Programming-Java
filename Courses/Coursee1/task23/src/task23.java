/*#23. Kurs Java dla początkujących - Dziedziczenie cz. 1 https://www.youtube.com/watch?v=9xdzH5GE4bw&list=PL6aekdNhY7DCM1wGLQCE9eP3kPzu-P7E7&index=24*/
public class task23 { //dziedziczenie zachodzi tylko w jedną strone ! ! !
    public static void main(String[] args)
    {
        Samochod audi = new Samochod();
        audi.iloscKol =  4;
        audi.marka = "Audi";
        System.out.println(audi.iloscKol + " " + audi.marka);
        audi.odpal();

        audi.zamknijOtworz();

        SamochodSportowy subaru = new SamochodSportowy();
        subaru.odpal();

        Motocykl suzuki = new Motocykl();
        suzuki.marka = "Suzuki";
        System.out.println(suzuki.iloscKol);
    }
}
