package artemisa.domain.sistema.entities;

import java.io.Serializable;

/**
 * @author Jossymar Cabanillas
 *
 */
public class ArticuloLinea extends Generica implements Serializable{

	private static final long serialVersionUID = 4573141093876506082L;
	public ArticuloLinea() {
	}

	private String descripcion;
	private int familia;
	private Pais pais;
	private int subCategoria;
	private int categoria;
	
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
	public int getSubCategoria() {
		return subCategoria;
	}
	public void setSubCategoria(int subCategoria) {
		this.subCategoria = subCategoria;
	}
	public int getCategoria() {
		return categoria;
	}
	public void setCategoria(int categoria) {
		this.categoria = categoria;
	}
	

}
