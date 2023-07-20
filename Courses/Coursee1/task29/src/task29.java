/*#29. Kurs Java dla początkujących - Klasy anonimowe i wewnętrzne https://www.youtube.com/watch?v=CemXLFn298Q&list=PL6aekdNhY7DCM1wGLQCE9eP3kPzu-P7E7&index=30*/
public class task29 {
    public static void main(String[] args)
    {
        Animal cat = new Animal() // klasy anonimowe
        {
            @Override
            void makeVoic() {
                System.out.println("MIAL MIAL"); //napisanie z grrr zmienia sie na mial mial <---
            }
        };
        cat.makeVoic(); //<-- to juz nie wypisuje bo zmienilo sie

        Animal cat2 = new Animal();
        cat2.makeVoic(); // wypisuje grrr bo jest 2 obiekt "cat2"
        cat2.eat();
        cat.eat();
        System.out.println("--------------");

        Animal.Pet pet = cat.new Pet(); // <-- Tak sie tworzy w funkcji main pet classy w classie.
        pet.name = "Bear";
        pet.getName();
    }
}
