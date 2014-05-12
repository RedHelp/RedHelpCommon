package org.redhelp.common.exceptions;

import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.Response;

import com.sun.jersey.api.Responses;

public class DependencyException extends WebApplicationException{

	/**
	 * Create a HTTP 404 (Not Found) exception.
	 */
	public DependencyException() {
		super(Responses.notFound().build());
	}

	/**
	 * Create a HTTP 404 (Not Found) exception.
	 * 
	 * @param message
	 *            the String that is the entity of the 404 response.
	 */
	public DependencyException(String message) {
		super(Response.status(Responses.NOT_FOUND).entity(message)
				.type("text/plain").build());
	}

}
