import java.util.ArrayList;

public class Restaurant {
    private String name;
    private ArrayList<MenuItem> menu;

    // Constructor
    public Restaurant(String name) {
        this.name = name;
        this.menu = new ArrayList<>();
    }

    // Getters & setters
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public ArrayList<MenuItem> getMenu() { return menu; }

    // Methods
    public void addMenuItem(MenuItem item) {
        menu.add(item);
    }

    public void showMenu() {
        System.out.println("Menu of " + name + ":");
        for (MenuItem m : menu) {
            m.printInfo();
        }
    }

    // Compare restaurants
    public boolean equals(Restaurant other) {
        return this.name.equalsIgnoreCase(other.name);
    }
}
