import java.util.List;

public class ExecutorClass {
    public static void main(String[] args) {
        Product laptop = new Product("Laptop", 999.99);
        Product phone = new Product("Phone", 699.99);
        Product headphones = new Product("Headphones", 149.99);

        ShoppingCart cart = new ShoppingCart();

        cart.addItem(laptop);
        cart.addItem(phone);
        cart.addItem(headphones);

        List<String> itemNames = cart.getItemNames();
        System.out.println("Items in the cart:");
        for (String itemName : itemNames) {
            System.out.println(itemName);
        }

        double totalPrice = cart.getTotalPrice();
        System.out.println("Total price: $" + totalPrice);
    }
}