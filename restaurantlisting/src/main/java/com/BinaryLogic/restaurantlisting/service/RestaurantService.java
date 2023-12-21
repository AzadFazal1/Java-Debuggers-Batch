package com.BinaryLogic.restaurantlisting.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.BinaryLogic.restaurantlisting.dto.RestaurantDto;

public interface RestaurantService {

    List<RestaurantDto> findAllRestaurants();

	RestaurantDto addRestaurant(RestaurantDto restaurantDto);

	ResponseEntity<RestaurantDto> fetchRestaurantById(Integer id);

}
