package org.syntinel.controller;


import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import javax.annotation.Resource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.syntinel.model.Food;

@RestController
public class FoodController {

	

    @RequestMapping("/menu")
    public List<Food> food() {
    	
    	List<Food> menu = new ArrayList<Food>();
    	Food item1 = new Food();
    	Food item2 = new Food();
    	
    	item1.setFoodId(1);
    	item1.setName("Rice");
    	
    	item2.setFoodId(2);
    	item2.setName("Beans");
    	
    	menu.add(item1);
    	menu.add(item2);
    	return menu;
    	
        //return new Food(counter.incrementAndGet(), "World");
    }
}
