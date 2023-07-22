import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        FishDatabase database = new FishDatabase();
        FishManager fishManager = new FishManager(database);

        System.out.println("=== Aquarium Fish Database ===");
        System.out.println("Lukasz Solecki===1 rok Informatyka===Lab 04");
        System.out.println();

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Add fish");
            System.out.println("2. Delete fish");
            System.out.println("3. Search all fish");
            System.out.println("4. Search fish by species");
            System.out.println("5. Find fish for your tank");
            System.out.println("6. Exit");
            System.out.println();

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    AddFish addFish = new AddFish(fishManager, scanner);
                    addFish.addFish();
                    break;
                case 2:
                    DeleteFish deleteFish = new DeleteFish(fishManager, scanner);
                    deleteFish.deleteFish();
                    break;
                case 3:
                    ListAllFishSpecies listAllFishSpecies = new ListAllFishSpecies(fishManager);
                    listAllFishSpecies.listAllSpecies();
                    break;
                case 4:
                    SearchFishBySpecies searchFishBySpecies = new SearchFishBySpecies(fishManager, scanner);
                    searchFishBySpecies.searchFish();
                    break;
                case 5:
                    FindFishForTank findFishForTank = new FindFishForTank(fishManager, scanner);
                    findFishForTank.findFish();
                    break;
                case 6:
                    database.closeConnection();
                    System.out.println("Goodbye!");
                    return;
                default:
                    System.out.println("Wrong choice. Please try again.");
                    System.out.println();
            }
        }
    }
}
