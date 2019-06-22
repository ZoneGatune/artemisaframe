package artemisa.domain.sistema.entities;

import java.io.Serializable;

/**
 * @author Jossymar Cabanillas
 *
 */
public class TipoImpuesto extends Generica implements Serializable {
	
	private static final long serialVersionUID = -2728522175324791772L;
	public TipoImpuesto() {
	}
	
	private String codigoInterno;
	private String descripcionInterno;
	private String descripcionFuncional;
	private Pais pais;
	
	public String getCodigoInterno() {
		return codigoInterno;
	}
	public void setCodigoInterno(String codigoInterno) {
		this.codigoInterno = codigoInterno;
	}
	public String getDescripcionInterno() {
		return descripcionInterno;
	}
	public void setDescripcionInterno(String descripcionInterno) {
		this.descripcionInterno = descripcionInterno;
	}
	public String getDescripcionFuncional() {
		return descripcionFuncional;
	}
	public void setDescripcionFuncional(String descripcionFuncional) {
		this.descripcionFuncional = descripcionFuncional;
	}
	public Pais getPais() {
		return pais;
	}
	public void setPais(Pais pais) {
		this.pais = pais;
	}
	
	
}
