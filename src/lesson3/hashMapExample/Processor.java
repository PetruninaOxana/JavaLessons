package lesson3.hashMapExample;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Processor {
    private final HashMap<String, Product> productHashMap = new HashMap<>();

    /**
     * �������� ����� ������� � ������
     * @param product - Product
     * @return true - ���� ������� ������� ������� � false, ���� �������� �����������
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
        System.out.println("�����: " + keys);
    }

    public void valuesExample() {
        ArrayList<Product> values = new ArrayList<>(productHashMap.values());
        for (Product product:values) {
            System.out.println(product);
        }
    }
}
