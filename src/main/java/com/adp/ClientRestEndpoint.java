package com.adp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.Resources;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClientRestEndpoint {

    DogServiceFeignClient client;

    @Autowired
    public ClientRestEndpoint(DogServiceFeignClient client) {
        this.client = client;
    }

    @GetMapping("/")
    public Resources<Dog> getHundeFromBackend() {
        return client.retrieveAllDogs();
    }
}
