public class FoodItem {
    public double price;

    public FoodItem(double price) {
        this.price = price;
    }

    public double getPrice() {
        return this.price;
    }

    public String identify() {
        return "I am the FoodItem Class. I hold information about the price of the food item.";
    }
}
