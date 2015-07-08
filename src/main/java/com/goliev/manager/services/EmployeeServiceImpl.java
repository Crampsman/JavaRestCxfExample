package com.goliev.manager.services;

import java.util.List;

import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.goliev.manager.dao.EmployeeDao;
import com.goliev.manager.dto.Employee;

@Service("employeeRestService")
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeDao employeeDao;
    
    public Response getEmployees() {
	
	List<Employee> employees = employeeDao.getEmployees();
	
	if(employees != null){
	    return Response.ok(employees).build();
	}
	else{
	    return Response.status(Response.Status.NO_CONTENT).build();
	}
    }

    public Response getEmployeeById(int id) {
	
	Employee employee = employeeDao.getEmployeeById(id);
	
	if(employee != null){
	    return Response.ok(employee).build();
	}
	else{
	    return Response.status(Response.Status.NO_CONTENT).build();
	}
    }

}
