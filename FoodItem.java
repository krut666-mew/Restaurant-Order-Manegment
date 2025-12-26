public class FoodItem extends MenuItem {
    public FoodItem(int id, String name, double price) {
        super(id, name, price);
    }

    @Override
    public String getType() {
        return "Food";
    }
}
