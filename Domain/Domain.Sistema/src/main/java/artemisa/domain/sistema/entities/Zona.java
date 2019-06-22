package artemisa.domain.sistema.entities;

import java.io.Serializable;

/**
 * @author Jossymar Cabanillas
 *
 */
public class Zona extends Generica implements Serializable {

	private static final long serialVersionUID = 5777021207387826620L;
	public Zona() {
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
