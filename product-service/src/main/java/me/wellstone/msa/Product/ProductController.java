package me.wellstone.msa.Product;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/products")
public class ProductController {
    @GetMapping(value = "/{productId}")
    public String getProductInfo(@PathVariable String productId){
        return "[product id = " + productId + " at " + System.currentTimeMillis() + "]";
    }
}
