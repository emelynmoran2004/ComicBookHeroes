public class Main {
    public static void main(String[] args) {
        HeroManager manager = new HeroManager();

        // Add heroes
        manager.addHero(new Hero("Spider-Man", 85, Affiliation.AVENGERS));
        manager.addHero(new Hero("Batman", 90, Affiliation.JUSTICE_LEAGUE));
        manager.addHero(new Hero("Wolverine", 88, Affiliation.X_MEN));
        manager.addHero(new Hero("Mr. Fantastic", 82, Affiliation.FANTASTIC_FOUR));

        System.out.println("Original List:");
        manager.displayHeroes();

        System.out.println("\nAfter Bubble Sort:");
        manager.bubbleSortByPower();
        manager.displayHeroes();

        System.out.println("\nAfter Insertion Sort:");
        manager.insertionSortByPower();
        manager.displayHeroes();

        System.out.println("\nRemoving Batman and adding Wonder Woman...");
        manager.removeHero("Batman");
        manager.addHero(new Hero("Wonder Woman", 95, Affiliation.JUSTICE_LEAGUE));

        System.out.println("\nUpdated List:");
        manager.displayHeroes();

        System.out.println("\nDisplay in 2D Array Format:");
        manager.displayAs2DArray();
    }
}