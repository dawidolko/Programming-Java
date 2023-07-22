public class Fish {
    private int id;
    private String species;
    private String name;
    private int tankSize;
    private int minPh;
    private int maxPh;

    public Fish(int id, String species, String name, int tankSize, int minPh, int maxPh) {
        this.id = id;
        this.species = species;
        this.name = name;
        this.tankSize = tankSize;
        this.minPh = minPh;
        this.maxPh = maxPh;
    }

    public int getId() {
        return id;
    }

    public String getSpecies() {
        return species;
    }

    public String getName() {
        return name;
    }

    public int getTankSize() {
        return tankSize;
    }

    public int getMinPh() {
        return minPh;
    }

    public int getMaxPh() {
        return maxPh;
    }
}
