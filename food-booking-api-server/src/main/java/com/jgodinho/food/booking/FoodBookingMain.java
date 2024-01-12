package com.jgodinho.food.booking;

import com.jgodinho.food.booking.restaurant.api.RestaurantRoutes;
import com.jgodinho.food.booking.status.api.StatusRoutes;
import io.jooby.Jooby;

public class FoodBookingMain extends Jooby {
    public static void main(String[] args) {
        runApp(args, FoodBookingMain::new);
    }

    {
        mount("", new StatusRoutes());
        mount("", new RestaurantRoutes());
    }
}
