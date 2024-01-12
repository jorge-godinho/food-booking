package com.jgodinho.food.booking.status.api;

import com.jgodinho.food.booking.framework.jooby.api.JoobyApi;
import com.jgodinho.food.booking.framework.jooby.api.ResponseBuilder;
import io.jooby.StatusCode;

public class StatusRoutes extends JoobyApi {

	{
		route(GET, "/status", ctx -> ctx.send("OK").setResponseCode(StatusCode.OK));
	}

}
