package com.example.booking_ms;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class train {
    @GetMapping("/train")
    public String getData() {return  "Please book your train from IRCTC kindly book ticket from New Delhi to anywhere at 30% discount" ; }
}
