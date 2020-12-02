package com.lti.resource;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("myresource")
public class MyResource {
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String getMessage() {
		return "Welcome to Rest Services World";
	}
}
