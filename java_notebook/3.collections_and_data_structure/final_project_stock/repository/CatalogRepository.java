package repository;

import model.Product;

import java.util.Map;

public class CatalogRepository {
    private Map<String, Product> productCatalog;

    public Map<String, Product> getProductCatalog() {
        return productCatalog;
    }
    public void addProductCatalog(Product product) {
        String productKey = product.getId();
        productCatalog.putIfAbsent(productKey, product);
    }
}
