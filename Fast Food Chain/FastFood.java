public class FastFood {
    public static void main(String[] args) {
        Customer customer = new Customer("Jane Smith");
        Order order = new Order(101, 12.50);
        customer.placeOrder(order);

        StringBuilder output = new StringBuilder();
        output.append("--- System Identity Report ---\n");
        output.append(customer.identify()).append("\n");
        output.append(order.identify()).append("\n");
        output.append(order.foodItem.identify()).append("\n\n");

        output.append("--- Transaction Details ---\n");
        output.append("Customer Name: ").append(customer.name).append("\n");
        output.append("Order ID: ").append(customer.order.orderId).append("\n");
        output.append("Total Price: $").append(String.format("%.2f", customer.order.calculateTotal()));

        System.out.println(output.toString());
    }
}
