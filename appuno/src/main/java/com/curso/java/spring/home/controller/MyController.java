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
    
    @GetMapping("/inicio")
    public String cuentaForm() {
    	return "inicio";
    }
    
    @PostMapping("/inicio")
    public String metodoImpuesto(@ModelAttribute ClaseCuenta unParametro) {
        return "inicio";
    }
    
    @ModelAttribute("cuentaform")
	public ClaseCuenta cargarTabla() {
    	ClaseCuenta elemt = new ClaseCuenta();
		return elemt;
	}

}

