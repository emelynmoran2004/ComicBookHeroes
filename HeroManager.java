import java.util.ArrayList;
import java.util.Arrays;

public class HeroManager {
    private ArrayList<Hero> heroes;

    public HeroManager() {
        heroes = new ArrayList<>();
    }

    public void addHero(Hero hero) {
        heroes.add(hero);
    }

    public void removeHero(String name) {
        heroes.removeIf(hero -> hero.getName().equalsIgnoreCase(name));
    }

    public void bubbleSortByPower() {
        for (int i = 0; i < heroes.size() - 1; i++) {
            for (int j = 0; j < heroes.size() - i - 1; j++) {
                if (heroes.get(j).getPowerLevel() > heroes.get(j + 1).getPowerLevel()) {
                    Hero temp = heroes.get(j);
                    heroes.set(j, heroes.get(j + 1));
                    heroes.set(j + 1, temp);
                }
            }
        }
    }

    public void insertionSortByPower() {
        for (int i = 1; i < heroes.size(); i++) {
            Hero key = heroes.get(i);
            int j = i - 1;
            while (j >= 0 && heroes.get(j).getPowerLevel() > key.getPowerLevel()) {
                heroes.set(j + 1, heroes.get(j));
                j--;
            }
            heroes.set(j + 1, key);
        }
    }

    public void displayHeroes() {
        for (Hero hero : heroes) {
            System.out.println(hero);
        }
    }

    public void displayAs2DArray() {
        String[][] table = new String[heroes.size()][3];
        for (int i = 0; i < heroes.size(); i++) {
            table[i][0] = heroes.get(i).getName();
            table[i][1] = String.valueOf(heroes.get(i).getPowerLevel());
            table[i][2] = heroes.get(i).getAffiliation().toString();
        }
        System.out.println(Arrays.deepToString(table));
    }
}