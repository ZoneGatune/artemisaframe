/**
 * 
 */
package artemisa.application.dto.sistema;

import java.io.Serializable;
import java.util.List;

/**
 * @author Jossymar Cabanillas
 *
 */
public class NotificacionSalidaDTO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -3483362876501645613L;

	private List<NotificacionDTO> notificaciones;
	
	public List<NotificacionDTO> getNotificaciones() {
		return notificaciones;
	}
	public void setNotificaciones(List<NotificacionDTO> notificaciones) {
		this.notificaciones = notificaciones;
	}
	/**
	 * 
	 */
	public NotificacionSalidaDTO() {
		// TODO Auto-generated constructor stub
	}

}
