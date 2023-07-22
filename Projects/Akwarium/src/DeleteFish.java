import java.util.Scanner;

class DeleteFish {
    private FishManager fishManager;
    private Scanner scanner;

    public DeleteFish(FishManager fishManager, Scanner scanner) {
        this.fishManager = fishManager;
        this.scanner = scanner;
    }

    public void deleteFish() {
        System.out.println("=== Delete Fish ===");

        System.out.print("Enter fish ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        fishManager.deleteFish(id);
        System.out.println();
    }
}