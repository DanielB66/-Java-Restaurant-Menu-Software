import java.util.ArrayList;
import java.util.List;

public class Menu {
    private String menuName;
    private List<Food> menuItems;

    public Menu(String menuName) {
        this.menuName = menuName;
        this.menuItems = new ArrayList<>();
    }

    public void addMenuItem(Food item) {
        if (!menuItems.contains(item)) {
            menuItems.add(item);
        } else {
            System.out.println("The item is already in the menu.");
        }
    }

    public void removeMenuItem(String itemName) {
        for (Food item : menuItems) {
            if (item.getName().equals(itemName)) {
                menuItems.remove(item);
                return;
            }
        }
        System.out.println("The item is not in the menu.");
    }

    public void displayMenu() {
        System.out.println("Menu: " + menuName);
        for (Food item : menuItems) {
            System.out.println(item);
        }
    }

    public Food findMenuItem(String itemName) {
        for (Food item : menuItems) {
            if (item.getName().equals(itemName)) {
                return item;
            }
        }
        return null;
    }

    public List<Food> findItemsByPriceRange(double minPrice, double maxPrice) {
        List<Food> itemsInPriceRange = new ArrayList<>();
        for (Food item : menuItems) {
            if (item.getPrice() >= minPrice && item.getPrice() <= maxPrice) {
                itemsInPriceRange.add(item);
            }
        }
        return itemsInPriceRange;
    }

    public Food findMostExpensiveItem() {
        if (menuItems.isEmpty()) {
            return null;
        }

        Food mostExpensiveItem = menuItems.get(0);
        for (Food item : menuItems) {
            if (item.getPrice() > mostExpensiveItem.getPrice()) {
                mostExpensiveItem = item;
            }
        }
        return mostExpensiveItem;
    }

    public Food findOldestWine() {
        Food oldestWine = null;
        for (Food item : menuItems) {
            if (item instanceof Wine) {
                if (oldestWine == null || ((Wine) item).year_of_manufacture < ((Wine) oldestWine).year_of_manufacture) {
                    oldestWine = item;
                }
            }
        }
        return oldestWine;
    }

    public List<Food> findItemsByKitchen(String kitchen) {
        List<Food> itemsByKitchen = new ArrayList<>();
        for (Food item : menuItems) {
            if (item instanceof MainCourse && ((MainCourse) item).getKitchen().equals(kitchen)) {
                itemsByKitchen.add(item);
            }
        }
        return itemsByKitchen;
    }

    public List<Food> findAllSodas() {
        List<Food> sodas = new ArrayList<>();
        for (Food item : menuItems) {
            if (item instanceof Beverage && ((Beverage) item).getIsCarbonated()) {
                sodas.add(item);
            }
        }
        return sodas;
    }
}
