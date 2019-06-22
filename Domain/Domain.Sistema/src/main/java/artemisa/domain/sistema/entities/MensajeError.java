/**
 * 
 */
package artemisa.domain.sistema.entities;

import java.io.Serializable;

/**
 * @author Jossymar Cabanillas
 *
 */
public class MensajeError implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -8633587396358856305L;
	/**
	 * 
	 */
	public MensajeError() {
	}
	public MensajeError(String codigoError, String mensajeError) {
		this.codigoError = codigoError;
		this.mensajeError = mensajeError;
	}
	
	private String codigoError;
	private String mensajeError;
	public String getCodigoError() {
		return codigoError;
	}
	public void setCodigoError(String codigoError) {
		this.codigoError = codigoError;
	}
	public String getMensajeError() {
		return mensajeError;
	}
	public void setMensajeError(String mensajeError) {
		this.mensajeError = mensajeError;
	}
	

	
}
