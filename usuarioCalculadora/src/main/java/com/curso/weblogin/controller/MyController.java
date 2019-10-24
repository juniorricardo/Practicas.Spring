package com.curso.weblogin.controller;

import com.curso.weblogin.bean.Cuentas;
import com.curso.weblogin.bean.User;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MyController {

	@GetMapping("/addUser")
	public String sendForm(User user) {
		return "addUser";
	}

	@PostMapping("/addUser")
	public String processForm(User user) {
		return "addUser";
	}

	@GetMapping("/calculadora")
	public String capturarValores(Model modelo){
		modelo.addAttribute("miObjeto", new Cuentas());
		return "calculadora";
	}

	@PostMapping("/calculadora")
	public String capturarAccion(@ModelAttribute Cuentas miObjeto, float sum1, float sum2,float resta1,float resta2,float mult1,float mult2,float div1,float div2){
		return "calculadora";

	}



}