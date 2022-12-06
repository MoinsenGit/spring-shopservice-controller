package de.neuefische.springshopservicecontroller.controller;


import de.neuefische.springshopservicecontroller.service.ShopService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/shop")
@AllArgsConstructor

public class ShopServiceController {

    private final ShopService shopService;
/*
    @GetMapping ("/products")
    public

    @GetMapping ("/orders")
    public

    @PostMapping ("/orders")
    public;
*/
}
