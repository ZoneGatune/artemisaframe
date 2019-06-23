/**
 * 
 */
package artemisa.application.dto.generico;

import java.io.Serializable;

/**
 * @author Jossymar Cabanillas
 *
 */
public class RespuestaDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6845101819396548964L;
	private CabeceraSalidaDTO respuesta;
	private Object datos;
	public RespuestaDTO() {
	}

	public CabeceraSalidaDTO getRespuesta() {
		return respuesta;
	}

	public void setRespuesta(CabeceraSalidaDTO respuesta) {
		this.respuesta = respuesta;
	}

	public Object getDatos() {
		return datos;
	}

	public void setDatos(Object datos) {
		this.datos = datos;
	}

	@Override
	public String toString() {
		return "RespuestaDTO [respuesta=" + respuesta + ", datos=" + datos + "]";
	}

	
	
	
	
	

}
