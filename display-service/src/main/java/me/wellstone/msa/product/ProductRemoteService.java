package me.wellstone.msa.product;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@RequiredArgsConstructor
public class ProductRemoteService {
    private static final String url = "http://product-service/products/";
    private final RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "getProductInfoFallback")
    public String getProductInfo(String productId) {
        return this.restTemplate.getForObject(url + productId, String.class);
    }

    public String getProductInfoFallback(String ProductId, Throwable throwable){
        System.out.println("throwable=" + throwable);
        return "[This Product is sold out]";
    }
}
