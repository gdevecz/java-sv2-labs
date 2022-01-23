package collectionsequalshash;

import java.util.ArrayList;
import java.util.List;

public class WebShop {

    private List<Product> products = new ArrayList<>();

    public int findHowMany(Product product) {
        int result = 0;
        for (Product item : products) {
            if (product.equals(item)) {
                result++;
            }
        }
        return result;
    }

    public void addProduct(Product newProduct) {
        products.add(newProduct);
    }

    public static void main(String[] args) {
        WebShop webShop = new WebShop();
        webShop.addProduct(new Product("számítógép", "1234"));
        webShop.addProduct(new Product("telefon", "3456"));
        webShop.addProduct(new Product("laptop", "1234"));
        webShop.addProduct(new Product("monitor", "6789"));
        webShop.addProduct(new Product("pc", "1234"));

        System.out.println(webShop.findHowMany(new Product("computer", "1234")));

    }
}
