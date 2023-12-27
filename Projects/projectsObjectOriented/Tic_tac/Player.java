public class Player {
    private static int counter = 0;
    private String name;
    private int id;

    public Player(String name) {
        this.name = name;
        this.id = ++counter;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }
}
