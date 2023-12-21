package com.BinaryLogic.restaurantlisting.dto;

import com.BinaryLogic.restaurantlisting.entity.Restaurant;

//import jakarta.persistence.Entity;
//import jakarta.persistence.GeneratedValue;
//import jakarta.persistence.GenerationType;
//import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class RestaurantDto {
	
	
	private String name;
	private String address;
	private String restaurantDescription;
	
}
