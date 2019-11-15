package home;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import home.cuentas.ClaseCuenta;
import home.login.DummyService;
import home.login.Login;

@Controller
public class MiController {

	@Autowired
	DummyService miTabla;

	// <'/login'> ruta de escucha, para que atienda peticiones 'Get' en el directorio raiz
	@GetMapping("/login")
	public String login(Model modelo) {
		//se instancia un objeto 'Login' con el nombre 'nuevo' a login.html
		modelo.addAttribute("nuevo", new Login());
		return "login";	// hace referencia a 'login.html' una vista
	}

	@GetMapping("/loguear")
	public String getLogin(@ModelAttribute Login nuevo, Model modelo) {
		if(miTabla.getAtributos(nuevo)) {
			modelo.addAttribute("objeto", new ClaseCuenta());
			return "calculadora";
		}
		return "resultadoerror";
	}
	
	@GetMapping("/calculadora")
    public String cuentaForm(@ModelAttribute Login objeto, Model modelo) {
		if(objeto == null) {
			modelo.addAttribute("objeto", new ClaseCuenta());
		}
		else {
			modelo.addAttribute("objeto", objeto);
		}
    	return "calculadora";
    }
    
    @GetMapping("/calcular")
    public String metodoImpuesto(@ModelAttribute ("objeto") ClaseCuenta algo) {
        return "calculadora";
    }
}
