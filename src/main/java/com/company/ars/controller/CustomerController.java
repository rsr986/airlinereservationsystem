package com.company.ars.controller;

import com.company.ars.model.customer.Customer;
import com.company.ars.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @GetMapping(value = "/login")
    public ModelAndView login(String email) {
        ModelAndView modelAndView = new ModelAndView();
        Customer customer = customerService.findByEmail(email);
        modelAndView.addObject("customerObject",
                "welcome" );//+ customer.getFirstName() + customer.getLastName());
        modelAndView.setViewName("login");
        return modelAndView;
    }
}
