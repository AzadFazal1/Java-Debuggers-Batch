package com.BinaryLogic.restaurantlisting.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.BinaryLogic.restaurantlisting.dto.RestaurantDto;
import com.BinaryLogic.restaurantlisting.entity.Restaurant;

@Mapper
public interface RestaurantMapper {
	
	RestaurantMapper INSTANCE = Mappers.getMapper(RestaurantMapper.class);

	Restaurant mapRestaurantDtoToRestaurant(RestaurantDto restaurantDto);
	
	RestaurantDto mapRestaurantToRestaurantDto(Restaurant restaurant);
}
