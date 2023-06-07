import java.util.Objects;

/*#26. Kurs Java dla początkujących - Wyjątki (try, catch), instanceof https://www.youtube.com/watch?v=mJD_zGajuJo&list=PL6aekdNhY7DCM1wGLQCE9eP3kPzu-P7E7&index=27*/
public class task26 {
    public static void main(String[] args) {
        Animal kot = new Cat();
        kot.dajGlos();

        Animal pies = null;
        System.out.println(pies instanceof Cat); // false poniewaz pies nie jest instacja Cat
        if (pies instanceof Cat) {
            ((Cat) pies).idz();
        }
        if (pies instanceof Dog) {
            ((Dog) pies).idz();
        }
        System.out.println(pies instanceof Object); // mimo ze jawnie tego nie widzimy, to instancja Object zawsze jest true.
        System.out.println(pies instanceof Animal);
        //System.out.println("Cos potem ... "); // tego nie widac

        try { //sprobuj (ale nie musi to sie udac jesli sie nie da)
            pies = new Dog("");
            pies.dajGlos();
            ((Cat) pies).idz();
            int a = 5 / 0; //Dog jakbym dał za Cat to sie zrobi Try
        } catch (ClassCastException ex) // jesli bedzie blad to program idzie od catch
        {
            System.out.println(ex.getMessage()); // pokaze co zrobilem nie tak jesli bedzie blad | moze byc te getStackTrack <--
        } catch (ArithmeticException ex) {
            System.out.println("blad arytmetyczny");
        } catch (Exception ex) {
            System.out.println("Inny blad");
            System.out.println(ex.getMessage());
        } finally { //zawsze sie wygeneruje nie wazne czy sie cos powiedzie czy nie
            System.out.println("Wykonuje sie i tak");
        }
    }
}
