import java.util.List;

public class MenuProgram {
	
    public static void main(String[] args) {
        Menu menu = new Menu("Main Menu");
        menu.addMenuItem(new MainCourse("Steak", "Grilled steak", 30.0, "American"));
        menu.addMenuItem(new MainCourse("Salmon", "Grilled salmon", 25.0, "Seafood"));
        menu.addMenuItem(new Beverage("Cola", "Carbonated drink", 5.0, 0, true));
        menu.addMenuItem(new Beverage("Water", "Still water", 3.0, 0, false));
        menu.addMenuItem(new MainCourse("Pizza", "Margherita pizza", 20.0, "Italian"));
        menu.addMenuItem(new Beverage("Beer", "Pale Lager", 8.0, 0, false));
        menu.addMenuItem(new MainCourse("Sushi", "Assorted sushi", 35.0, "Japanese"));
        menu.addMenuItem(new Beverage("Orange Juice", "Freshly squeezed orange juice", 6.0, 0, false));
        menu.addMenuItem(new MainCourse("Pasta", "Spaghetti carbonara", 18.0, "Italian"));
        menu.addMenuItem(new Beverage("Lemonade", "Fresh lemonade", 4.0, 0, false));
        menu.addMenuItem(new Wine("Red Wine", "Cabernet Sauvignon", 40.0, 1, false, 6, 2005));

        menu.displayMenu();

        Food foundItem = menu.findMenuItem("Steak");
        if (foundItem != null) {
            System.out.println("Found: " + foundItem);
        } else {
            System.out.println("Item not found");
        }

        System.out.println("Most expensive item: " + menu.findMostExpensiveItem());

        System.out.println("Oldest wine: " + menu.findOldestWine());

        List<Food> itemsByKitchen = menu.findItemsByKitchen("Italian");
        System.out.println("Items from Italian kitchen: " + itemsByKitchen);

        System.out.println("All sodas: " + menu.findAllSodas());
    }
}
