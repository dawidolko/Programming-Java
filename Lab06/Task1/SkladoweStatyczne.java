package Task1;

public class SkladoweStatyczne {
    public static void main(String[] args)
    {
        System.out.println(Figury.PoleKola(0.5));
        System.out.println(Figury.ObwodKola(0.5));
        System.out.println(Figury.PoleKwadratu(0.5));
        System.out.println(Figury.ObwodKwadratu(0.5));
        System.out.println(Figury.PoleProstokata(1,2));
        System.out.println(Figury.ObwodProstokata(1,2));
        System.out.println(Figury.PoleStozka(1,2));
        System.out.println(Figury.ObwodStozka(1,2));
        System.out.println(Figury.PoleWalca(1,2));
        System.out.println(Figury.ObwodWalca(1,2));
    }
}