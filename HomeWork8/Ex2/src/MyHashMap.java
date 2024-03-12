import java.util.Collection;
import java.util.Map;
import java.util.Set;

public class MyHashMap {
        Map<Integer, Product> products;

    public MyHashMap(Map<Integer, Product> products) {
        this.products = products;
    }

    public void printPairs() {
            for (Map.Entry<Integer, Product> item: products.entrySet()) {
                System.out.printf("Key: %s Value: %s \n", item.getKey(), item.getValue().getProductName());
            }
        }
        public void printKeys() {
            Set<Integer> keys = products.keySet();
            System.out.println("Keys: ");
            for (int number: keys) {
                System.out.println(number);
            }
        }
        public void printValues() {
            Collection<Product> values = products.values();
            for (Product item: values) {
                System.out.printf("The product name: %s The price: %s The manufacturer: %s \n", item.getProductName(), item.getPrice(), item.getManufacturer());
            }

        }
}
