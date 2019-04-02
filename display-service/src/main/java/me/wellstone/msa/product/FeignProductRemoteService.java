package me.wellstone.msa.product;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name = "product-service", fallbackFactory = FeignProductRemoteServiceFallbackFactory.class)
public interface FeignProductRemoteService {
    @RequestMapping("/products/{productId}")
    String getProductInfo(@PathVariable String productId);
}
