/**
 * 
 */
package artemisa.application.dto.sistema;

import java.io.Serializable;

/**
 * @author Jossymar Cabanillas
 *
 */
public class IdentificacionSalidaDTO implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -3875301306990825805L;
	
	private IdentificacionDTO identificacionBO;

	
	
	public IdentificacionDTO getIdentificacionBO() {
		return identificacionBO;
	}

	public void setIdentificacionBO(IdentificacionDTO identificacionBO) {
		this.identificacionBO = identificacionBO;
	}
	
	
	

}
