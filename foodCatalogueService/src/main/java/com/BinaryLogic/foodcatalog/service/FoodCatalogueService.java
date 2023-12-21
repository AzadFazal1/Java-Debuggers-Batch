package com.BinaryLogic.foodcatalog.service;

import com.BinaryLogic.foodcatalog.dto.FoodCataloguePage;
import com.BinaryLogic.foodcatalog.dto.FoodItemDTO;


public interface FoodCatalogueService {

    public FoodItemDTO addFoodItem(FoodItemDTO foodItemDTO);
    public FoodCataloguePage fetchFoodCataloguePageDetails(Integer restaurantId);


}
