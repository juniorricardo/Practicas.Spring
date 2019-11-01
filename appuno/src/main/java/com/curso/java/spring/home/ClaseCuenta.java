package com.curso.java.spring.home;

public class ClaseCuenta {
	
	private float montoIva;
	private float montoRentenciones;
	
	private float ivaActual;
	private float retencionesActual;
	
	public ClaseCuenta() {
		this.ivaActual = (float) 1.21;
		this.retencionesActual = (float) 1.1;
	}
	
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

	public void setIvaActual(float ivaActual) {
		this.ivaActual = ivaActual;
	}

	public void setRetencionesActual(float retencionesActual) {
		this.retencionesActual = retencionesActual;
	}

	public float getIvaActual() {
		return ivaActual;
	}

	public float getRetencionesActual() {
		return retencionesActual;
	}

	public float calcularIva(){
		return (float) (montoIva*1.21);
	}
	
	public float calcularRentencion(){
		return (float) (montoRentenciones*1.1);
	}
}












 