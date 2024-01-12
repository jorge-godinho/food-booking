package com.jgodinho.food.booking.framework.jooby.api;

import io.jooby.Jooby;
import io.jooby.MediaType;
import io.jooby.Registry;
import io.jooby.Route;
import java.io.Serializable;

public class JoobyApi extends Jooby {

	public interface RequestHandler extends Serializable {
		Response apply(Registry registry, Request request, ResponseBuilder response);
	}

	public Route jsonGet(final String pattern, final RequestHandler requestHandler) {
		return route(GET, pattern, requestHandler).produces(MediaType.json);
	}

	public Route jsonPost(final String pattern, final RequestHandler requestHandler) {
		return route(POST, pattern, requestHandler).produces(MediaType.json);
	}

	public Route jsonPut(final String pattern, final RequestHandler requestHandler) {
		return route(PUT, pattern, requestHandler).produces(MediaType.json);
	}

	public Route jsonDelete(final String pattern, final RequestHandler requestHandler) {
		return route(DELETE, pattern, requestHandler).produces(MediaType.json);
	}

	private Route route(final String method, final String pattern, final RequestHandler handler) {
		return route(
			method,
			pattern,
			ctx ->  {
				final ResponseBuilder responseBuilder = new ResponseBuilder(ctx);
				return handler.apply(ctx, new Request(ctx), responseBuilder).getResponse();
			});
	}

}
