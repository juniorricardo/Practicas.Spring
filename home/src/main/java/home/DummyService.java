package home;

import org.springframework.stereotype.Service;

@Service
public class DummyService {

	public boolean getAtributos(Login nuevo) {
		if (DummyBase.getTabla().get(nuevo.getNombre()).equals(nuevo.getPassword())) {
			return true;
		} else {
			return false;
		}
	}
}
