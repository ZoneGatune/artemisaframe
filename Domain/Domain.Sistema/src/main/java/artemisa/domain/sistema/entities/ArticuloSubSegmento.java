package artemisa.domain.sistema.entities;

import java.io.Serializable;

/**
 * @author Jossymar Cabanillas
 *
 */
public class ArticuloSubSegmento extends Generica implements Serializable {

	private static final long serialVersionUID = 123727628363013436L;
	public ArticuloSubSegmento() {
	}

	private String descripcion;
	private int familia;
	private int gama;
	private int linea;
	private Pais pais;
	private int segmento;
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
	public int getGama() {
		return gama;
	}
	public void setGama(int gama) {
		this.gama = gama;
	}
	public int getLinea() {
		return linea;
	}
	public void setLinea(int linea) {
		this.linea = linea;
	}
	public Pais getPais() {
		return pais;
	}
	public void setPais(Pais pais) {
		this.pais = pais;
	}
	public int getSegmento() {
		return segmento;
	}
	public void setSegmento(int segmento) {
		this.segmento = segmento;
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