public class Animal {
    void makeVoic() //private to dostep ma pet ale classa main nie ma dostepu.
    {
        System.out.println("grrrr");
    }
    void eat()
    {
        System.out.println("Kot co je");
    }
    class Pet
    {
        String name;
        void getName()
            {
                //eat();
                makeVoic();
                System.out.println(name);
            }
    }
}
