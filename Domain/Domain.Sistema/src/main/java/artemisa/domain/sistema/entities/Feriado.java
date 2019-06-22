package artemisa.domain.sistema.entities;

import java.io.Serializable;
import java.util.Date;

public class Feriado extends Generica implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6332413227580424600L;

	public Feriado() {
		// TODO Auto-generated constructor stub
	}
	
	private Pais pais;
	private Date fecha;
	private String descripcion;

	public Pais getPais() {
		return pais;
	}
	public void setPais(Pais pais) {
		this.pais = pais;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	

}
