/**
 * 
 */
package artemisa.domain.sistema.irepositories;

import artemisa.domain.sistema.entities.MensajeSistema;

import java.util.List;

/**
 * @author Jossymar Cabanillas
 *
 */

public interface MensajeSistemaDAO {
	
	public MensajeSistema obtenerMensajeSistemaByCodigo(String codigoA);
	
	public List<MensajeSistema> obtenerMensajesSistemasByCodigos(List<String> codigosA);

}
