package artemisa.domain.sistema.entities;

import java.io.Serializable;

/**
 * @author Jossymar Cabanillas
 *
 */
public class ArticuloCategoria extends Generica implements Serializable {

	private static final long serialVersionUID = -91380319222028613L;
	public ArticuloCategoria() {
	}
	
	private String descripcion; 
	private int familia; 
	private Pais pais;
	
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public int getFamilia() {
		return familia;
	}
	public void setFamilia(int familia) {
		this.familia = familia;
	}
	public Pais getPais() {
		return pais;
	}
	public void setPais(Pais pais) {
		this.pais = pais;
	}
	
	
}
