package artemisa.domain.sistema.entities;

import java.io.Serializable;

public class EmpleadoRol extends Generica implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5003914298198663721L;
	public EmpleadoRol() {
		// TODO Auto-generated constructor stub
	}
	private String nombre;
	private Pais pais;
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Pais getPais() {
		return pais;
	}
	public void setPais(Pais pais) {
		this.pais = pais;
	}
	
	

}
