package artemisa.domain.sistema.entities;

import java.io.Serializable;

/**
 * @author Jossymar Cabanillas
 *
 */
public class UnidadMedida extends Generica implements Serializable {

	private static final long serialVersionUID = 2834088836978942622L;
	public UnidadMedida() {
	}

	private String descripcion;
	private String simbolo;
	private Pais pais;
	private String tipoUnidadMedida;
	
	public String getSimbolo() {
		return simbolo;
	}
	public void setSimbolo(String simbolo) {
		this.simbolo = simbolo;
	}
	public Pais getPais() {
		return pais;
	}
	public void setPais(Pais pais) {
		this.pais = pais;
	}
	public String getTipoUnidadMedida() {
		return tipoUnidadMedida;
	}
	public void setTipoUnidadMedida(String tipoUnidadMedida) {
		this.tipoUnidadMedida = tipoUnidadMedida;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	
}
