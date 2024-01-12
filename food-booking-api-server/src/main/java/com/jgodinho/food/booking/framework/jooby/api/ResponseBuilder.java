package com.jgodinho.food.booking.framework.jooby.api;

import io.jooby.Context;
import io.jooby.MediaType;
import io.jooby.StatusCode;

public class ResponseBuilder {

	private final Context context;

	public ResponseBuilder(final Context context) {
		this.context = context;
	}

	public <T> Response jsonOk(final T response) {
		context.setResponseCode(StatusCode.OK).setResponseType(MediaType.json);
		return new Response(response);
	}
}
