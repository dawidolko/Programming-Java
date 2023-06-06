public class uzytkownik {
    private int wiek;
    private String name; //ABY ZMIENIC CALA NAZWE JAKIEJS ZMIENNEJ TO KLIKAMY SHIFT + F6

    public uzytkownik(int wiek, String name) { // construktor można tworzyc za pomocą lewego przycisku myszki i generator
        this.wiek = wiek;
        this.name = name;
    }

    public int getWiek() { // getter, bierze i zwraca wiek.
        return wiek;
    }

    public boolean czyMozeLegalnieKupicAlkohol()
    {
        if(wiek >= 18)
        {
            return true;
        }else
        {
            return false;
        }
    }

    public String getName() {
        return name;
    }

    public void setWiek(int wiek) { // setter, bierze i ustawia wiek, który prowadzimy
        if(wiek>0)
        {
            this.wiek = wiek;
        }else
        {
            throw new RuntimeException("Wiek musi byc wiekszy od zera"); // wyjatek throw=rzucić
        }
    }

    public void setName(String name) {
        this.name = name;
    }
}
