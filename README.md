public class Main {
    public static void main(String[] args) {
        HeroManager manager = new HeroManager();

        // 
        manager.addHero(new Hero("Spider-Man", 85, Affiliation.AVENGERS));
        manager.addHero(new Hero("Batman", 80, Affiliation.JUSTICE_LEAGUE));
        manager.addHero(new Hero("Wolverine", 90, Affiliation.X_MEN));
        manager.addHero(new Hero("Wonder Woman", 95, Affiliation.JUSTICE_LEAGUE));

        System.out.println(" Original List of Heroes:");
        manager.displayHeroes();

        System.out.println("\n Bubble Sort by Power Level:");
        manager.bubbleSortByPowerLevel();
        manager.displayHeroes();

        System.out.println("\n Insertion Sort by Power Level:");
        manager.insertionSortByPowerLevel();
        manager.displayHeroes();

        System.out.println("\n Removing Batman...");
        manager.removeHero("Batman");
        manager.displayHeroes();

        System.out.println("\n Adding Iron Man...");
        manager.addHero(new Hero("Iron Man", 92, Affiliation.AVENGERS));
        manager.displayHeroes();

        System.out.println("\n Heroes in 2D Array Format:");
        manager.displayHeroes2DArray();
    }
}
