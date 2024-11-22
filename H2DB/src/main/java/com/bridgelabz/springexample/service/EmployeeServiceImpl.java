package com.bridgelabz.springexample.service;

import com.bridgelabz.springexample.entity.Employee;
import com.bridgelabz.springexample.repository.EmployeeRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService{


    private EmployeeRepository employeeRepository;

    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public Employee addEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    @Override
    public List<Employee> getAllEmployee() {
        return employeeRepository.findAll();
    }

    @Override
    public Employee getEmployeeById(long id) {
        return employeeRepository.findById(id).orElseThrow(()->new RuntimeException("ID not found"));
    }

    @Override
    public Employee updateEmployee(long id, Employee employee) {
        Optional<Employee> byId = employeeRepository.findById(id);
        if(byId.isPresent()){
            Employee emp = byId.get();
            emp.setfName(employee.getfName());
            emp.setlName(employee.getlName());
            emp.setAddress(employee.getAddress());
            emp.setAge(employee.getAge());

            return employeeRepository.save(emp);
        }
        else
           return employeeRepository.findById(id).orElseThrow(()->new RuntimeException("ID not found"));
    }

    @Override
    public void deleteEmployee(long id){
        employeeRepository.deleteById(id);
    }
}
