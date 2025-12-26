public class DrinkItem extends MenuItem {
    public DrinkItem(int id, String name, double price) {
        super(id, name, price);
    }

    @Override
    public String getType() {
        return "Drink";
    }
}
