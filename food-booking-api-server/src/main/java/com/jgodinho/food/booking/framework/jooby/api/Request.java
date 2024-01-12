package com.jgodinho.food.booking.framework.jooby.api;

import io.jooby.Body;
import io.jooby.Context;

public class Request {

	private final Context context;

	public Request(final Context context) {
		this.context = context;
	}

	public Body getBody() {
		return context.body();
	}
}
