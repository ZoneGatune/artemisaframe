/**
 * 
 */
package artemisa.application.dto.generico;

import java.io.Serializable;
import java.util.List;

import artemisa.domain.sistema.entities.MensajeError;

/**
 * @author Jossymar Cabanillas
 *
 */
public class CabeceraSalidaDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6478043726636623922L;
	

	private String codigoRespuesta;
	private String mensajeRespuesta;
	private int idTransaccion;
	private List<MensajeError> listaErrores;
	public String getCodigoRespuesta() {
		return codigoRespuesta;
	}
	public void setCodigoRespuesta(String codigoRespuesta) {
		this.codigoRespuesta = codigoRespuesta;
	}
	public String getMensajeRespuesta() {
		return mensajeRespuesta;
	}
	public void setMensajeRespuesta(String mensajeRespuesta) {
		this.mensajeRespuesta = mensajeRespuesta;
	}
	public int getIdTransaccion() {
		return idTransaccion;
	}
	public void setIdTransaccion(int idTransaccion) {
		this.idTransaccion = idTransaccion;
	}
	public List<MensajeError> getListaErrores() {
		return listaErrores;
	}
	public void setListaErrores(List<MensajeError> listaErrores) {
		this.listaErrores = listaErrores;
	}
	@Override
	public String toString() {
		return "CabeceraSalidaDTO [codigoRespuesta=" + codigoRespuesta + ", mensajeRespuesta=" + mensajeRespuesta
				+ ", idTransaccion=" + idTransaccion + ", listaErrores=" + listaErrores + "]";
	}
	
	
	

}
