package com.curso.java.spring.myrest1;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.curso.java.spring.myrest1.bean.Usuario;

@Controller
@RequestMapping("lista")
public class listaController {

	
    @GetMapping(value = "/lista")
    public String listar(Model model) {
        model.addAttribute("usuario", new Usuario());
        return "lista";
    }
    
    @PostMapping("/lista")
    public String listaSubmit(@ModelAttribute Usuario user, String nombre, String apellido) {
        return "redirect:/lista";
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
