package com.Cian.CapStoneMS.controller;

import com.Cian.CapStoneMS.model.CardPaymentForm;
import com.Cian.CapStoneMS.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Controller
public class ProductController implements WebMvcConfigurer {


    @Autowired
    private ProductRepository productRepository;

    @GetMapping("/HomePage")
    public String showHomePage(){return "HomePage";}

    @GetMapping("/CheckOut")
    public String showCheckout(CardPaymentForm paymentForm) {
        return "PaymentForm";
    }

}
