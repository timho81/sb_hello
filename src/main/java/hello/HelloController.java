package hello;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

import business.ProductService;
import entity.Product;

@RestController
public class HelloController {

    private ProductService productService;

//    @Autowired
    public HelloController(ProductService productService) {
        this.productService = productService;
    }
    
    @RequestMapping("/")
    public String index() {
        List<Product> products = productService.findAll();

        System.out.println("########## products size in controller = " + products.size());

        return "Greetings from Spring Boot 2!";
    }
    
}
