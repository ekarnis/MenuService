package org.syntinel.controller;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.syntinel.model.Food;
import org.syntinel.service.FoodService;


@RestController
public class FoodController {

	@Autowired
	FoodService foodService;
	
    @RequestMapping("/menu")
    public List<Food> food() {
    	
    	
    	List<Food> menu = new ArrayList<Food>();
    	menu = foodService.listMenu();
    	return menu;
    	
    	

    }
}
