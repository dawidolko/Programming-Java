public class Home{

    public static void main(String[] args)
    {
        TV tv = new TV(32, "Samsung");
        System.out.println(tv.getName());
        System.out.println(tv.getSize());

        tv.getOnOff();
        tv.setOnOff(true);
        tv.getOnOff();

        Dog rex = new Dog();
        rex.speak();
        rex.setSize(15);
        System.out.println(rex.getSize());
    }
}
