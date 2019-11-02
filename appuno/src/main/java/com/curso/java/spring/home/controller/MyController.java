package com.curso.java.spring.home.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.curso.java.spring.home.*;

@Controller
public class MyController{

    @GetMapping("/form")
    public String greetingForm(Model model) {
        model.addAttribute("otro", new User());
        return "form";
    }

    @PostMapping("/form")
    public String greetingSubmit(@ModelAttribute User dos) {
        return "result";
    }
    
    @GetMapping("/calculadora")
    public String cuentaForm(Model modelo) {
    	modelo.addAttribute("objeto", new ClaseCuenta());
    	return "calculadora";
    }
    
    @PostMapping("/calculadora")
    public String metodoImpuesto(@ModelAttribute ("objeto")ClaseCuenta algo) {
        return "calculadora";
    }

}

