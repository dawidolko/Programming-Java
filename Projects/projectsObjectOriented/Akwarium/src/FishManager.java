import java.util.List;

public class FishManager {
    private FishDatabase database;

    public FishManager(FishDatabase database) {
        this.database = database;
    }

    public void addFish(String species, String name, int tankSize, int minPh, int maxPh) {
        Fish fish = new Fish(0, species, name, tankSize, minPh, maxPh);
        database.addFish(fish);
        System.out.println("Fish " + species + " " + name + " added successfully.");
    }

    public void deleteFish(int id) {
        boolean deleted = database.deleteFish(id);
        if (deleted) {
            System.out.println("Fish deleted successfully.");
        } else {
            System.out.println("Fish not found with ID: " + id);
        }
    }

    public void searchFishBySpecies(String species) {
        List<Fish> fishList = database.getFishBySpecies(species);
        if (fishList.isEmpty()) {
            System.out.println("No fish found for species: " + species);
        } else {
            System.out.println("Fish found for species: " + species);
            for (Fish fish : fishList) {
                System.out.println("ID: " + fish.getId() + ", Species: " + fish.getSpecies() + ", Name: " + fish.getName() + ", Tank Size: " + fish.getTankSize() + ", Minimum Ph: " + fish.getMinPh() + ", Maximum Ph: " + fish.getMaxPh());
            }
        }
    }

    public void listAllFish() {
        List<Fish> fishList = database.getAllFish();
        if (fishList.isEmpty()) {
            System.out.println("No fish found in the database.");
        } else {
            System.out.println("All Fish in the Database:");
            for (Fish fish : fishList) {
                System.out.println("ID: " + fish.getId() + ", Species: " + fish.getSpecies() + ", Name: " + fish.getName() + ", Tank Size: " + fish.getTankSize() + ", Minimum Ph: " + fish.getMinPh() + ", Maximum Ph: " + fish.getMaxPh());
            }
        }
    }

    public void findFishForTank(int tankSize, int pHValue) {
        List<Fish> fishList = database.getFishForTank(tankSize, pHValue);
        if (fishList.isEmpty()) {
            System.out.println("No fish found for your aquarium.");
        } else {
            System.out.println("Fish found for your aquarium:");
            for (Fish fish : fishList) {
                System.out.println("ID: " + fish.getId() + ", Species: " + fish.getSpecies() + ", Name: " + fish.getName() + ", Tank Size: " + fish.getTankSize());
            }
        }
    }
}
