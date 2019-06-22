package artemisa.domain.sistema.entities;

import java.io.Serializable;

public class EstadoPedido extends Generica implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5545564609461758334L;

	public EstadoPedido() {
		// TODO Auto-generated constructor stub
	}
	
	private String codigoInterno;
	private String descripcionFuncional;
	private String descripcionInterno;
	private Pais pais;

	public String getCodigoInterno() {
		return codigoInterno;
	}
	public void setCodigoInterno(String codigoInterno) {
		this.codigoInterno = codigoInterno;
	}
	public String getDescripcionFuncional() {
		return descripcionFuncional;
	}
	public void setDescripcionFuncional(String descripcionFuncional) {
		this.descripcionFuncional = descripcionFuncional;
	}
	public String getDescripcionInterno() {
		return descripcionInterno;
	}
	public void setDescripcionInterno(String descripcionInterno) {
		this.descripcionInterno = descripcionInterno;
	}
	public Pais getPais() {
		return pais;
	}
	public void setPais(Pais pais) {
		this.pais = pais;
	}
	
	

}
