/**
 * 
 */
package com.yash.controller;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.Resource;
import org.springframework.hateoas.ResourceSupport;
import org.springframework.hateoas.mvc.ControllerLinkBuilder;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.yash.exception.EmployeeNotFoundException;
import com.yash.model.Employee;
import com.yash.repository.EmployeeRepository;
import com.yash.service.EmployeeService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
//
@Api(value = "Swagger2DemoRestController", description = "REST Apis related to Employee Entity!!!!")
@RestController
@RequestMapping("/employees")
public class EmployeeController extends ResourceSupport {
	Employee emp1 = new Employee();
	@Autowired
	private EmployeeService employeeService;

	@PostMapping
	public Employee createEmployee(@Valid @RequestBody Employee emp) {
		return employeeService.save(emp);
	}

	@ApiOperation(value = "Get list of Employee in the System ", response = Iterable.class, tags = "getAllEmployees")
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Suceess|OK"),
			@ApiResponse(code = 401, message = "not authorized!"), @ApiResponse(code = 403, message = "forbidden!!!"),
			@ApiResponse(code = 404, message = "not found!!!") })
	@GetMapping
	public List<Employee> getAllEmployees() {

		return employeeService.findAll();
	}

	@ApiOperation(value = "Get specific Employee By id in the System ", response = Employee.class, tags = "getEmployeeById")

	@GetMapping(path = "/{id}", produces = { "application/xml", "application/json" })
	public Resource<Employee> getEmployeeById(@PathVariable(value = "id") Long empId) {

		Optional<Employee> emp = employeeService.findOne(empId);

		if (!emp.isPresent()) {
			throw new EmployeeNotFoundException("no employee found");
		}
		Resource<Employee> resource = new Resource<Employee>(emp.get());
		Link selfLink = ControllerLinkBuilder
				.linkTo(ControllerLinkBuilder.methodOn(EmployeeController.class).getAllEmployees()).withSelfRel();
		resource.add(selfLink);

		return resource;

	}


	@ApiOperation(value = "updated specific Employee By id in the System ", response = Employee.class, tags = "updateEmployee")

	@PutMapping(path = "/{id}", produces = { "application/xml", "application/json" }, consumes = { "application/xml",
			"application/json" })
	public ResponseEntity<Employee> updateEmployee(@PathVariable(value = "id") Long empId,
			@Valid @RequestBody Employee empDetails) {

		Optional<Employee> emp = employeeService.findOne(empId);
		if (!emp.isPresent()) {
			return ResponseEntity.notFound().build();
		}
		emp.get().setName(empDetails.getName());
		emp.get().setDesigntion(empDetails.getDesigntion());

		Employee updateEmployee = employeeService.save(emp.get());
		return ResponseEntity.ok().body(updateEmployee);
	}
	
	@ApiOperation(value = "delete specific Employee By id in the System ", response = Employee.class, tags = "deleteEmployee")

	@DeleteMapping("/{id}")
	public ResponseEntity<Employee> deleteEmployee(@PathVariable(value = "id") Long empid) {
		Optional<Employee> emp = employeeService.findOne(empid);
		if (emp == null) {
			return ResponseEntity.notFound().build();
		}
		employeeService.delete(emp.get());
		return ResponseEntity.ok().build();

	}

	@RequestMapping(method = RequestMethod.DELETE)
	public void DeleteAll() {
		employeeService.deleteAll();
	}

}
