/**
 * 
 */
package artemisa.application.sistema.services.contractos;

import artemisa.domain.sistema.entities.MensajeError;
import artemisa.domain.sistema.entities.MensajeSistema;

import java.util.List;

/**
 * @author Jossymar Cabanillas
 *
 */


public interface IMensajeSistemaAppService {

	public MensajeSistema obtenerMensajeSistema(String codigoA);
	public List<MensajeSistema> obtenerMensajeSistemas(List<String> codigoA);
	public MensajeSistema obtenerMensajeSistemaDisponible(String codigoBusqueda);
	public MensajeSistema validarMensajeSistemaDisponible(List<MensajeSistema> listaMensajes,  String codigoValidacion);
	public List<MensajeError> validarMensajesSistemaDispobnibles(List<MensajeSistema> listaMensajes, List<String> listaValidaciones);
	
}
