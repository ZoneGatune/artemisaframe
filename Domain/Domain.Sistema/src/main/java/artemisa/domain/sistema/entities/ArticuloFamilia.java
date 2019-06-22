package artemisa.domain.sistema.entities;

import java.io.Serializable;

/**
 * @author Jossymar Cabanillas
 *
 */
public class ArticuloFamilia extends Generica implements Serializable {

	private static final long serialVersionUID = -4851796824608788776L;
	public ArticuloFamilia() {
	}
	
	private String descripcion; 
	private Pais pais;
	
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public Pais getPais() {
		return pais;
	}
	public void setPais(Pais pais) {
		this.pais = pais;
	}
		
	
}
