package com.curso.weblogin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.curso.weblogin.pojo.Cuentas;
import com.curso.weblogin.pojo.User;

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
	public String capturarValores(Model modelo) {
		modelo.addAttribute("mensaje", "este es un mensaje");
		return "calculadora";
	}

	@PostMapping("/calculadora")
	public String capturarAccion(@ModelAttribute Cuentas miObjeto) {
		return "calculadora";
	}

	@ModelAttribute("cuentas")
	public Cuentas cargarTabla() {
		Cuentas elemt = new Cuentas();
		return elemt;
	}

}