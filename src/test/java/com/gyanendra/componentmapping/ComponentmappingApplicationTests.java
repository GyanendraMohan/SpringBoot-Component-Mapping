package com.gyanendra.componentmapping;

import com.gyanendra.componentmapping.entities.Address;
import com.gyanendra.componentmapping.entities.Employee;
import com.gyanendra.componentmapping.repos.EmployeeRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ComponentmappingApplicationTests {

    @Autowired
    EmployeeRepository repository;

    @Test
    void contextLoads() {
    }

    @Test
    public void testCreateEmployee(){
        Employee employee = new Employee();
        employee.setId(123);
        employee.setName("Gyanendra");

        Address address = new Address();
        address.setCity("Varanasi");
        address.setStreetaddress("Chitaipur");
        address.setState("UP");
        address.setZipcode("123456");
        address.setCountry("India");

        employee.setAddress(address);
        repository.save(employee);
    }
}
