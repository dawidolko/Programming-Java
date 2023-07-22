package Car;

public class Run
{
    public void Runs()
    {
        SamochodOsobowy s0 = new SamochodOsobowy("Honda", "Accord", "Sedan   ", "Zielony", 2005, 234000, 2.1, 1.9, 5);
        SamochodOsobowy s1 = new SamochodOsobowy("Toyota", "Yaris", "Lift-back", "Srebrny", 2012, 135985);
        SamochodOsobowy s2 = new SamochodOsobowy(3.2, 2.4, 8);
        SamochodOsobowy s3 = new SamochodOsobowy();
        Samochod s4 = new Samochod("Ford   ", "Focus", "Sedan   ", "Morski", 2007, 209678);
        Samochod s5 = new Samochod();
        s0.opis();
        s1.opis();
        s2.opis();
        s3.opis();
        s4.opis();
        s5.opis();
    }
}
