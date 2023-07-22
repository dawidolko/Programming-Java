import java.util.List;
import java.util.Scanner;

class FindFishForTank {
    private FishManager fishManager;
    private Scanner scanner;

    public FindFishForTank(FishManager fishManager, Scanner scanner) {
        this.fishManager = fishManager;
        this.scanner = scanner;
    }

    public void findFish() {
        System.out.println("=== Find Fish for Your Aquarium ===");

        System.out.print("Enter tank size: ");
        int tankSize = scanner.nextInt();

        System.out.print("Enter pH value: ");
        int pHValue = scanner.nextInt();

        fishManager.findFishForTank(tankSize, pHValue);
        System.out.println();
    }
}