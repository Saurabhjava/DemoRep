package com.lti.resource;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.lti.bean.Employee;
import com.lti.dao.EmployeeDao;
import com.lti.exception.EmployeeNotFoundException;

@Path("employee")
public class EmployeeResource {
	EmployeeDao eDao=new EmployeeDao();
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Employee> getEmployee() {
		return eDao.getEmployees();
	}
	@GET
	@Path("/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Employee getEmployee(@PathParam("id")String empid) {
		Employee e=eDao.getEmployee(empid);
		if(e==null)
			throw new EmployeeNotFoundException("Employee Not Found with Employee id ="+empid );
		return e;
	}
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public Response saveEmployee(Employee emp) {
		System.out.println("Method Called "+emp.getName());
		String message=eDao.createEmployee(emp);
		return Response.status(200).entity(message).build();
	}
	@PUT
	public String updateEmployee(Employee emp) {
		return eDao.updateEmployee(emp);
	}
	@DELETE
	@Path("/{eid}")
	public String removeEmployee(@PathParam("eid")String eid) {
		return eDao.deleteEmployee(eid);
	}
}
