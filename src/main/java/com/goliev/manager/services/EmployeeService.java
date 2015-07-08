package com.goliev.manager.services;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import org.springframework.web.bind.annotation.PathVariable;

@Path("/employees")
public interface EmployeeService {

    @GET
    @Produces({"application/json"})
    public Response getEmployees();
    
    @GET
    @Path("/{id}")
    @Produces({"application/json"})
    public Response getEmployeeById(@PathParam("id") int id);
	
}
