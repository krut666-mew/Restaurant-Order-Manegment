import java.util.*;
import java.util.stream.Collectors;

public class Restaurant {
    private String name;
    private List<MenuItem> menu = new ArrayList<>();

    public Restaurant(String name) {
        this.name = name;
    }

    public void addMenuItem(MenuItem item) {
        menu.add(item);
    }

    // FILTER
    public List<MenuItem> filterByPrice(double maxPrice) {
        return menu.stream()
                .filter(m -> m.getPrice() <= maxPrice)
                .collect(Collectors.toList());
    }

    // SEARCH
    public MenuItem findByName(String name) {
        for (MenuItem m : menu) {
            if (m.getName().equalsIgnoreCase(name)) {
                return m;
            }
        }
        return null;
    }

    // SORT
    public void sortByPrice() {
        menu.sort(Comparator.comparingDouble(MenuItem::getPrice));
    }

    @Override
    public String toString() {
        return "Restaurant: " + name;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Restaurant)) return false;
        Restaurant r = (Restaurant) o;
        return name.equalsIgnoreCase(r.name);
    }

    @Override
    public int hashCode() {
        return name.toLowerCase().hashCode();
    }
}
