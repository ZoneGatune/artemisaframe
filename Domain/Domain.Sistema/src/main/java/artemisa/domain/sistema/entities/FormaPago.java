package artemisa.domain.sistema.entities;

import java.io.Serializable;

public class FormaPago extends Generica implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8738170354349053541L;

	public FormaPago() {
		// TODO Auto-generated constructor stub
	}
	
	private String descripcion;
	private int numeroPago;
	private int diaVencimiento;
	private Pais pais;

	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public int getNumeroPago() {
		return numeroPago;
	}
	public void setNumeroPago(int numeroPago) {
		this.numeroPago = numeroPago;
	}
	public int getDiaVencimiento() {
		return diaVencimiento;
	}
	public void setDiaVencimiento(int diaVencimiento) {
		this.diaVencimiento = diaVencimiento;
	}
	public Pais getPais() {
		return pais;
	}
	public void setPais(Pais pais) {
		this.pais = pais;
	}
	

}
