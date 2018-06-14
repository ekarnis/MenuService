package org.syntinel.service;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.syntinel.model.Food;


@Service
public class FoodService {
	@Resource(name="jdbcTemplate")
	private JdbcTemplate jdbcTemplate;
	
	
public List<Food> listMenu() {
	

		
		//prints the menu in array list form
		List<Food> menu = new ArrayList<Food>();
		
		//getting the connection and selecting all of the food items from the database
		 
		try {
			Connection con = jdbcTemplate.getDataSource().getConnection();
			
			 Statement st = con.createStatement();
             ResultSet resultSet =   st.executeQuery("select * from food");
			
			while(resultSet.next()) {
				Food item = new Food();
				
				item.setFoodId(resultSet.getInt(1));
				item.setName(resultSet.getString(2));
				item.setFoodGroup(resultSet.getString(3));
				item.setPrice(resultSet.getDouble(4));
				item.setDescription(resultSet.getString(5));
				item.setStock(resultSet.getInt(6));
				item.setImage(resultSet.getString(7));
				
				menu.add(item);
			}
				
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		return menu;
		
	}
	
	
}
