package com.lti.exception;
import java.util.Date;

import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

@Provider
public class EmployeeNoFoundExceptionMapper implements ExceptionMapper<EmployeeNotFoundException> {

	@Override
	public Response toResponse(EmployeeNotFoundException ex) {
		
		return Response.status(404).entity(new ErrorProps("404", ex.getMessage(),new Date())).build();
	}

}
