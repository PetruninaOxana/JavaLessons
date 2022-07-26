package lesson3.hashMapExample;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Processor {
    private final HashMap<String, Product> productHashMap = new HashMap<>();

    /**
     * Помещаем новый продукт в список
     * @param product - Product
     * @return true - если продукт успешно помещен и false, если название неуникально
     */
    public boolean addProduct(Product product) {
        return productHashMap.put(product.getName(), product) == null;
    }

    public void entrySetExample() {
        for (Map.Entry entry: productHashMap.entrySet()) {
            System.out.println(entry);
        }
    }

    public void keySetExample() {
        Set<String> keys = productHashMap.keySet();
        System.out.println("Ключи: " + keys);
    }

    public void valuesExample() {
        ArrayList<Product> values = new ArrayList<>(productHashMap.values());
        for (Product product:values) {
            System.out.println(product);
        }
    }
}
