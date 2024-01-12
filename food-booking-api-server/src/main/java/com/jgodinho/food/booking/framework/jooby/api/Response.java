package com.jgodinho.food.booking.framework.jooby.api;

public class Response {
	private final Object response;

	Response(final Object response) {
		this.response = response;
	}

	public Object getResponse() {
		return response;
	}
}
