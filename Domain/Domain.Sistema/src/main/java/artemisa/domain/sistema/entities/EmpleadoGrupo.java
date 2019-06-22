package artemisa.domain.sistema.entities;

import java.io.Serializable;

public class EmpleadoGrupo extends Generica implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6222477685534648418L;
	public EmpleadoGrupo() {
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
