package home.cuentas;

public class ClaseCuenta {

	private float montoIva;
	private float montoRentenciones;


	public float getMontoIva() {
		return montoIva;
	}

	public void setMontoIva(float montoIva) {
		this.montoIva = montoIva;
	}

	public float getMontoRentenciones() {
		return montoRentenciones;
	}

	public void setMontoRentenciones(float montoRentenciones) {
		this.montoRentenciones = montoRentenciones;
	}

	public float calcularIva() {
		return (montoIva == 0) ? 0 : (float) (montoIva * 1.21);
	}

	public float calcularRentencion() {
		return (montoRentenciones == 0) ? 0 : (float) (montoRentenciones * 1.1);
	}
}
