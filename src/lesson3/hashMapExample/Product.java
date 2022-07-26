package lesson3.hashMapExample;

public class Product {
    private String name; // �������� ������
    private String vendor_code; // �������

    /**
     * ����� Product
     * <a href="https://javarush.ru/groups/posts/1940-klass-hashmap-">...</a>
     * @param name �������� ������
     * @param vendor_code ������� ������
     */
    public Product(String name, String vendor_code) {
        this.name = name;
        this.vendor_code = vendor_code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVendor_code() {
        return vendor_code;
    }

    public void setVendor_code(String vendor_code) {
        this.vendor_code = vendor_code;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", vendor_code='" + vendor_code + '\'' +
                '}';
    }
}
