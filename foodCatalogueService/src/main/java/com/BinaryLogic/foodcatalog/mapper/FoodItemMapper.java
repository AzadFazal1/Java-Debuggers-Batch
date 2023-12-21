package com.BinaryLogic.foodcatalog.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.BinaryLogic.foodcatalog.dto.FoodItemDTO;
import com.BinaryLogic.foodcatalog.entity.FoodItem;

@Mapper
public interface FoodItemMapper {

    FoodItemMapper INSTANCE = Mappers.getMapper(FoodItemMapper.class);

    FoodItem mapFoodItemDTOToFoodItem(FoodItemDTO foodItemDTO);

    FoodItemDTO mapFoodItemToFoodItemDto(FoodItem foodItem);


}