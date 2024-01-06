package com.skypro.homework.Homework25dec;



import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;

@RestController

public class Controller {
    private final BasketService basketService;

    public Controller(BasketService basketService) {
        this.basketService = basketService;
    }

    @GetMapping("/store/order/add")
    public void add (@RequestParam Integer... items){
        basketService.add(items);
    }
    @GetMapping("/store/order/get")
    public List<Integer> get(){
        return basketService.get();
    }
}