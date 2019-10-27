package com.curso.weblogin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.curso.weblogin.pojo.Cuentas;
import com.curso.weblogin.pojo.Usuario;

@Controller
public class MyController {

	@GetMapping("/addUser")
	public String sendForm(Model modelo) {
		modelo.addAttribute("usuario", new Usuario());
		return "addUser";
	}

	@PostMapping("/addUser")
	public String processForm(@ModelAttribute Usuario nuevousuario, Model modelo) {
		if (nuevousuario.getNombreUsuario().equals("junior")) {
			modelo.addAttribute("estado", "Bienvenido ".concat(nuevousuario.getNombreUsuario()));
		} else {
			modelo.addAttribute("estado",
					"Hola ".concat(nuevousuario.getNombreUsuario() + ", registro no encontrado. (ERROR!)"));
		}
//		Usuario uno = new Usuario();
//		uno.setNombreUsuario("Mitsuha");
//		uno.setContrasenia("jaja123");
//		modelo.addAttribute("otro", uno);
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