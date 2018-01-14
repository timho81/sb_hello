package business;


import java.lang.Iterable;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import repository.ProductRepository;
import entity.Product;

@Service
public class ProductServiceImpl implements ProductService{

    final ProductRepository productRepository;

    public ProductServiceImpl(final ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<Product> findAll()
    {
        List<Product> products = new ArrayList<Product>();

//        Iterable<Product> iterableProducts = productRepository.findAll();

        for(Product product : productRepository.findAll()){
//            result += cust.toString() + "<br>";
            System.out.println("########## product name = " + product.getName());
        }

//        System.out.println("########## products size = " + iterableProducts.size());

        return products;
    }
}
