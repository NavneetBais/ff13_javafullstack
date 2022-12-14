package com.examples.empapp.controller;

import com.examples.empapp.exception.ApplicationException;
import com.examples.empapp.model.Employee;
import com.examples.empapp.model.ResponseMessage;
import com.examples.empapp.repository.EmployeeRepository;
import com.examples.empapp.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/employees")
public class EmployeeController {
	@Autowired
	EmployeeRepository empRepo ;
    @Autowired
    EmployeeService empService;

    // GET /employees
    // GET http://localhost:8080/employees
    @GetMapping
    public ResponseEntity<List<Employee>> getEmployees() {
        return ResponseEntity.ok().body(empService.getAll());
    }
    // GET /employees
    // GET http://localhost:8080/employees
    @GetMapping(params = {"id"})
    public ResponseEntity<Employee> getEmployee(@RequestParam int id) {
        return ResponseEntity.ok().body(empService.get(id));
    	//return ResponseEntity.ok().body(empRepo.findById(id));
    }
//
//    // POST /employees
//    // POST http://localhost:8080/employees
    @PostMapping(consumes=MediaType.APPLICATION_JSON_VALUE)
    public ResponseMessage createEmployee(@RequestBody @Valid Employee employee) throws ApplicationException {
        boolean res = empService.create(employee);
        ResponseMessage response = new ResponseMessage();
        response.setStatus("Success");
        response.setMessage("Employee created Successfully");
        return response;
    }
//
//    // PUT /employees/{id}
//    // PUT http://localhost:8080/employees/10
    @PutMapping("/{id}")
    public ResponseMessage updateEmployee(@RequestBody @Valid Employee employee, @PathVariable int id) throws ApplicationException {
        employee.setEmpId(id);
        boolean res = empService.update(employee);
        ResponseMessage response = new ResponseMessage();
        response.setStatus("Success");
        response.setMessage("Employee updated Successfully");
        return response;
    }
//
//    // DELETE /employees/{id}
//    // DELETE http://localhost:8080/employees/10
//    
//    
    @DeleteMapping("/{id}")
    public ResponseMessage deleteEmployee(@PathVariable int id) throws ApplicationException {
        boolean res = empService.delete(id);
        ResponseMessage response = new ResponseMessage();
        response.setStatus("Success");
        response.setMessage("Employee deleted Successfully");
        return response;
    }
//
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<ResponseMessage> handleValidationError(MethodArgumentNotValidException e) {
        ResponseMessage response = new ResponseMessage();
        response.setStatus("Failure");
        StringBuilder errorMsg = new StringBuilder();
        for(ObjectError error: e.getAllErrors()) {
            errorMsg.append(error.getDefaultMessage());
            errorMsg.append(" ");
        }
        response.setMessage("Validation Error: " + errorMsg);
        return ResponseEntity.badRequest().body(response);
    }

}
