import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ShoppingCart {
    private List<Product> items;

    public ShoppingCart() {
        this.items = new ArrayList<>();
    }

    public void addItem(Product product) {
        items.add(product);
    }

    public void removeItem(Product product) {
        items.remove(product);
    }

    public double getTotalPrice() {
        return items.stream()
                .mapToDouble(Product::getPrice)
                .sum();
    }

    public List<String> getItemNames() {
        return items.stream()
                .map(Product::getName)
                .collect(Collectors.toList());
    }
}

