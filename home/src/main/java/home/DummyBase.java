package home;

import java.util.HashMap;


public class DummyBase {

	private static HashMap<String, String> tabla;

	static {
		tabla = new HashMap<String,String>();
		tabla.put("leandro","123");
		tabla.put("pablo", "456");
		tabla.put("pedro", "789");
		tabla.put("ricardo", "147");
	}
	
	public static HashMap<String, String> getTabla() {
		return tabla;
	}

	public void setTabla(HashMap<String, String> tabla) {
		DummyBase.tabla = tabla;
	}

}
