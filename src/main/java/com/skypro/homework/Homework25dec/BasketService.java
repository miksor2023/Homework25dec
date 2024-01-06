package com.skypro.homework.Homework25dec;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@org.springframework.stereotype.Service
public class BasketService {

    private final Basket basket;
    public BasketService (Basket basket){
        this.basket = basket;
    }

    public void add(Integer[] items){
        basket.add(Arrays.asList(items));
    }
    public List<Integer> get(){
        return basket.get();
    }

}