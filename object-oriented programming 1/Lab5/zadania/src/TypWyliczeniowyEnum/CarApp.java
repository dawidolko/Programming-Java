package TypWyliczeniowyEnum;

public class CarApp
{
    public static void main(String[] args)
    {
        refuel(CarType.GASOLINE);
        refuel(CarType.DIESEL);
        refuel(CarType.GASOLINE);
        refuel(CarType.GASOLINE_LPG);
        refuel(CarType.EV);
    }

    public static void refuel(CarType carType)
    {
        switch (carType)
        {
            case DIESEL -> System.out.println("Tankuję olej napędowy");
            case GASOLINE -> System.out.println("Tankuję benzynę");
            case GASOLINE_LPG -> System.out.println("Tankuję benzynę z gazem");
            default -> System.out.println("Nie rozpoznano paliwa :(");
        }
    }
}
