package artemisa.domain.sistema.entities;

import java.io.Serializable;

public class EstadoCivil implements Serializable {

	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 6467353287703267682L;
	public EstadoCivil() {
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
