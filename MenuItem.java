public abstract class MenuItem {
    protected int id;
    protected String name;
    protected double price;

    public MenuItem(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public double getPrice() { return price; }

    public abstract String getType();   // POLYMORPHISM

    @Override
    public String toString() {
        return getType() + ": " + name + " ($" + price + ")";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MenuItem)) return false;
        MenuItem m = (MenuItem) o;
        return id == m.id;
    }

    @Override
    public int hashCode() {
        return Integer.hashCode(id);
    }
}
