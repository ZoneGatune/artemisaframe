/**
 * 
 */
package artemisa.application.sistema.services.contractos;

import artemisa.application.dto.generico.MensajeEntradaDTO;
import artemisa.application.dto.generico.RespuestaDTO;

/**
 * @author Jossymar Cabanillas
 *
 */
public interface IIdentificacionAppService {
	
	 
	public RespuestaDTO obtenerIdentificacion(MensajeEntradaDTO mensajeEntradaDTO);

	 
	public int obtenerMaxCodigo();
	
	public String obtenerMaxCodigoA();
	
}
