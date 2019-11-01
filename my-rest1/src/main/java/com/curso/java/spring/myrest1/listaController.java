package com.curso.java.spring.myrest1;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class listaController {

	
    @GetMapping("/lista")
    public String listar(Model model) {
        model.addAttribute("usuario", new Usuario());
        return "lista";
    }
    
    @PostMapping("/lista")
    public String listaSubmit(@ModelAttribute Usuario user) {
//        return "redirect:/lista";
    	return "login";
    }
    
//    @PutMapping("/lista")
//    void replaceEmployee() {
//    	System.out.println("entramos en PutMapping");
//    	
//    }
//    
//    @DeleteMapping("/lista")
//    void deleteEmployee() {
//    	System.out.println("entramos en DeleteMapping");
//    }
    

}
