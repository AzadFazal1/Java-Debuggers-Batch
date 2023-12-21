package com.BinaryLogic.restaurantlisting.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.BinaryLogic.restaurantlisting.dto.RestaurantDto;
import com.BinaryLogic.restaurantlisting.service.RestaurantService;

@RestController
@RequestMapping("/restaurant")
public class RestaurantController {
	
	@Autowired
	RestaurantService restaurantService;
	
	@GetMapping("/fetchAllRestaurants")
	public ResponseEntity<List<RestaurantDto>> fetchAllRestaurants() {
		List<RestaurantDto> restaurants =restaurantService.findAllRestaurants();
		return new ResponseEntity<>(restaurants, HttpStatus.OK);
	}
	
	@PostMapping
	public RestaurantDto addRestaurant(@RequestBody RestaurantDto restaurantDto){
		//try {
			return restaurantService.addRestaurant(restaurantDto);
			//return new ResponseEntity<>(restaurantDto, HttpStatus.CREATED);
//		}
//		catch(Exception e){
//			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
//		}
	}
	
	 @GetMapping("fetchById/{id}")
	    public ResponseEntity<RestaurantDto> findRestaurantById(@PathVariable Integer id) {
	       return restaurantService.fetchRestaurantById(id);
	    }
}
