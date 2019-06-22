package artemisa.domain.sistema.entities;

import java.io.Serializable;

/**
 * @author Jossymar Cabanillas
 *
 */
public class ClaseCliente extends Generica implements Serializable {

	private static final long serialVersionUID = -7536704317224858088L;
	public ClaseCliente() {
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
