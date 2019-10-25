package home;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class LoginController {

	@Autowired
	DummyService miTabla;

	// <'/login'> ruta de escucha, para que atienda peticiones 'Get' en el directorio raiz
	@GetMapping("/login")
	public String login(Model modelo) {
		//se instancia un objeto 'Login' con el nombre 'nuevo' a login.html
		modelo.addAttribute("nuevo", new Login());
		return "login";	// hace referencia a 'login.html' una vista
	}

	@PostMapping("/login")
	public String getLogin(@ModelAttribute Login nuevo) {
		if(miTabla.getAtributos(nuevo)) {
			return "resultado";
		}
		return "resultadoerror";
	}
}
