package com.example.demo.BootStrapData;

import com.example.demo.dao.CustomerRepository;
import com.example.demo.dao.DivisionRepository;
import com.example.demo.entities.Customer;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class BootStrapData implements CommandLineRunner {

    private final CustomerRepository customerRepository;
    private final DivisionRepository divisionRepository;

    public BootStrapData(CustomerRepository customerRepository, DivisionRepository divisionRepository) {
        this.customerRepository = customerRepository;
        this.divisionRepository = divisionRepository;
    }
    @Override
    public void run(String... args) throws Exception {


        if(customerRepository.count() == 1) {



            Customer customer1 = new Customer();
            customer1.setFirstName("Martha");
            customer1.setLastName("Lohan");
            customer1.setPostal_code("49032");
            customer1.setAddress("237 Street");
            customer1.setPhone("(203)902-1990");
            customer1.setDivision(divisionRepository.findAll().get(7));
            customer1.setCreate_date(new Date());
            customer1.setLast_update(new Date());

            Customer customer2 = new Customer();
            customer2.setFirstName("Jax");
            customer2.setLastName("Millie");
            customer2.setPostal_code("10295");
            customer2.setAddress("20 Street");
            customer2.setPhone("(309)234-5008");
            customer2.setDivision(divisionRepository.findAll().get(7));
            customer2.setCreate_date(new Date());
            customer2.setLast_update(new Date());

            Customer customer3 = new Customer();
            customer3.setFirstName("Lola");
            customer3.setLastName("Vincent");
            customer3.setPostal_code("34845");
            customer3.setAddress("409 Street");
            customer3.setPhone("(303)225-1101");
            customer3.setDivision(divisionRepository.findAll().get(5));
            customer3.setCreate_date(new Date());
            customer3.setLast_update(new Date());

            Customer customer4 = new Customer();
            customer4.setFirstName("Jimmie");
            customer4.setLastName("Kenter");
            customer4.setPostal_code("13345");
            customer4.setPhone("(269)505-1221");
            customer4.setAddress("1201 Street");
            customer4.setDivision(divisionRepository.findAll().get(2));
            customer4.setCreate_date(new Date());
            customer4.setLast_update(new Date());

            Customer customer5 = new Customer();
            customer5.setFirstName("Caleb");
            customer5.setLastName("Helson");
            customer5.setPostal_code("12366");
            customer5.setAddress("1092 Street");
            customer5.setPhone("(125)505-0021");
            customer5.setDivision(divisionRepository.findAll().get(3));
            customer5.setCreate_date(new Date());
            customer5.setLast_update(new Date());

            customerRepository.save(customer1);
            customerRepository.save(customer2);
            customerRepository.save(customer3);
            customerRepository.save(customer4);
            customerRepository.save(customer5);

            System.out.println("Sample customers added!");
        } else {
            System.out.println("Sample customers already exist!");
        }
    }


}

