package com.BinaryLogic.restaurantlisting.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.BinaryLogic.restaurantlisting.dto.RestaurantDto;
import com.BinaryLogic.restaurantlisting.entity.Restaurant;
import com.BinaryLogic.restaurantlisting.mapper.RestaurantMapper;
import com.BinaryLogic.restaurantlisting.repo.RestaurantRepo;

@Service
public class RestaurantServiceImpl implements RestaurantService {

	@Autowired
	RestaurantRepo restaurantRepo;

	@Override
	public List<RestaurantDto> findAllRestaurants() {
		List<Restaurant> restaurants = restaurantRepo.findAll();
		List<RestaurantDto> restaurantDtos = restaurants.stream()
				.map(restaurant -> RestaurantMapper.INSTANCE.
						mapRestaurantToRestaurantDto(restaurant))
							.collect(Collectors.toList());
		return restaurantDtos;
		
	}

	@Override
	public RestaurantDto addRestaurant(RestaurantDto restaurantDto) {
		Restaurant savedRestaurant = restaurantRepo.save(RestaurantMapper.INSTANCE.mapRestaurantDtoToRestaurant(restaurantDto));
		return RestaurantMapper.INSTANCE.mapRestaurantToRestaurantDto(savedRestaurant);
	}

	 public ResponseEntity<RestaurantDto> fetchRestaurantById(Integer id) {
	        Optional<Restaurant> restaurant =  restaurantRepo.findById(id);
	        if(restaurant.isPresent()){
	            return new ResponseEntity<>(RestaurantMapper.INSTANCE.mapRestaurantToRestaurantDto(restaurant.get()), HttpStatus.OK);
	        }
	        return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
	    }
	
}
