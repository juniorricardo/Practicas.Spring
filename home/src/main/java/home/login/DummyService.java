package home.login;

import org.springframework.stereotype.Service;

@Service
public class DummyService {

	public boolean getAtributos(Login nuevo) {
		return DummyBase.getTabla().getOrDefault(nuevo.getNombre(), "---").equals(nuevo.getPassword());
	}
}
