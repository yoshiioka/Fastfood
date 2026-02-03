public class Order {
    public int orderId;
    public FoodItem foodItem;

    public Order(int orderId, double itemPrice) {
        this.orderId = orderId;
        this.foodItem = new FoodItem(itemPrice);
    }

    public double calculateTotal() {
        return this.foodItem.getPrice();
    }

    public String identify() {
        return "I am the Order Class. I manage the food items and calculate the total bill.";
    }
}
