package me.wellstone.msa.product;

import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

@Component
public class FeignProductRemoteServiceFallbackFactory implements FallbackFactory<FeignProductRemoteService> {
    @Override
    public FeignProductRemoteService create(Throwable throwable) {
        System.out.println("Throwable = " + throwable);
        return productId -> "[ this product is sold out ]";
    }
}
