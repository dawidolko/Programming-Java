import java.util.Scanner;

class SearchFishBySpecies {
    private FishManager fishManager;
    private Scanner scanner;

    public SearchFishBySpecies(FishManager fishManager, Scanner scanner) {
        this.fishManager = fishManager;
        this.scanner = scanner;
    }

    public void searchFish() {
        System.out.println("=== Search Fish by Species ===");

        System.out.print("Enter species: ");
        String species = scanner.nextLine();

        fishManager.searchFishBySpecies(species);
        System.out.println();
    }
}