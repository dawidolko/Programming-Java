class ListAllFishSpecies {
    private FishManager fishManager;

    public ListAllFishSpecies(FishManager fishManager) {
        this.fishManager = fishManager;
    }

    public void listAllSpecies() {
        System.out.println("=== List All Fish Species ===");
        fishManager.listAllFish();
        System.out.println();
    }
}