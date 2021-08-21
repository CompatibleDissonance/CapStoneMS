package com.Cian.CapStoneMS.ProductServices;

import com.Cian.CapStoneMS.model.Product;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
@Service
public class ProductServiceImpl implements ProductService {
    private static Map<String, Product> productRepo = new HashMap<>();
    static{
        Product Glitches = new Product();
        Glitches.setId("1");
        Glitches.setSongName("Glitches(Instrumental)");
        Glitches.setPrice(45);
        productRepo.put(Glitches.getId(), Glitches);
    }

    @Override
    public void createProduct(Product product) {
        productRepo.put(product.getId(), product);
    }

    @Override
    public void updateProduct(String id, Product product) {
            productRepo.remove(id);
            product.setId(id);
            productRepo.put(id, product);
    }

    @Override
    public void deleteProduct(String id) {
        productRepo.remove(id);
    }

    @Override
    public Collection<Product> getProducts() {
        return productRepo.values();
    }
}
