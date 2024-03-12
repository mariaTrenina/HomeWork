import java.util.HashMap;
import java.util.Map;

public class HashMapPractice {
    public static void main(String[] args) {
        Product purchase1 = new Product("Sea-Dweller Watch", 10000, "Rolex, Inc.");
        Product purchase2 = new Product("Pineapple refresh cleanser", 30, "Rhode skin");
        Product purchase3 = new Product("Hourglass 100mm bootie", 1800, "Balenciaga");
        Product purchase4 = new Product("Red Heart Earrings", 8500, "Pandora");

        Map<Integer, Product> order = new HashMap<>();
        order.put(1123, purchase1);
        order.put(1124, purchase2);
        order.put(1125, purchase3);
        order.put(1126, purchase4);

        MyHashMap myOrder = new MyHashMap(order);
        myOrder.printPairs();
        System.out.println();
        myOrder.printKeys();
        System.out.println();
        myOrder.printValues();
        System.out.println();
    }
}