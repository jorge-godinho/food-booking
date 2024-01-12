package com.jgodinho.food.booking.restaurant.api;

import com.jgodinho.food.booking.framework.jooby.api.JoobyApi;

public class RestaurantRoutes extends JoobyApi {

	{
		jsonGet("/test", (registry, request, response) -> response.jsonOk(new Restaurant("test")));
	}

}
