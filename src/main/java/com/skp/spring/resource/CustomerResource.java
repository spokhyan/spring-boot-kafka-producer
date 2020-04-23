package com.skp.spring.resource;

import com.skp.spring.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/kafka")
public class CustomerResource {

    private final String TOPIC = "kafka-customer";

    @Autowired
    KafkaTemplate kafkaTemplate;

    @GetMapping("/publish/{name}")
    public String createCustomer(@PathVariable String name){
        kafkaTemplate.send(TOPIC, new Customer(name, "Taylorsville", 84123L));
        return "published successfully";
    }

    @PostMapping("/customers")
    public Res

}
