package com.BankApp.spring_docker_demo;

import com.BankApp.spring_docker_demo.Models.Customer;
import com.BankApp.spring_docker_demo.Repository.CustomerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/Api")
public class MainController {
    @Autowired
    CustomerRepo crepo;
    @GetMapping("/greeting")
    private static String Greeting(){
        return "hello Negasi";
    }
    @PostMapping("/AddCustomer")
    private  Object creatCustomer(@RequestBody Customer cu){
    return crepo.save(cu);
    }
    @GetMapping("/getallCustomers")
    private Object getCustomers(){
        return  crepo.findAll();
    }

}
