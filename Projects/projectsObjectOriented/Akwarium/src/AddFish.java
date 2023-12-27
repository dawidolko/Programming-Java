import java.util.Scanner;

public class AddFish {
    private FishManager fishManager;
    private Scanner scanner;

    public AddFish(FishManager fishManager, Scanner scanner) {
        this.fishManager = fishManager;
        this.scanner = scanner;
    }

    public void addFish() {
        System.out.println("=== Add Fish ===");

        System.out.print("Enter species: ");
        String species = scanner.nextLine();

        System.out.print("Enter name: ");
        String name = scanner.nextLine();

        System.out.print("Enter minimum aquarium volume [l]: ");
        int tankSize = scanner.nextInt();

        System.out.print("Enter minimum Ph: ");
        int minPh = scanner.nextInt();

        System.out.print("Enter maximum Ph: ");
        int maxPh = scanner.nextInt();

        scanner.nextLine();

        fishManager.addFish(species, name, tankSize, minPh, maxPh);
        System.out.println();
    }
}
