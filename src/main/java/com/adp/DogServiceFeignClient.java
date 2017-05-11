package com.adp;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.hateoas.Resources;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name = "dog-service")
@RequestMapping(consumes = "application/hal+json")
public interface DogServiceFeignClient {
    @GetMapping(path = "/dogs")
    Resources<Dog> retrieveAllDogs();
}
