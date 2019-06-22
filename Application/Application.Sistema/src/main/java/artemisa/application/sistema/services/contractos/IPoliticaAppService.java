/**
 * 
 */
package artemisa.application.sistema.services.contractos;

import artemisa.domain.sistema.entities.MensajeError;
import artemisa.domain.sistema.entities.MensajeSistema;
import artemisa.domain.sistema.entities.Politica;

import java.util.List;

/**
 * @author Jossymar Cabanillas
 *
 */
public interface IPoliticaAppService {
	
	public Politica obtenerPolitica(String codigo);
	public List<Politica> obtenerPoliticas(List<String> codigo);
	public Politica obtenerPoliticaDisponible(String codigo);
	public MensajeSistema validarPoliticaDisponible(List<Politica> listaPoliticas, List<MensajeSistema> listaMensajes, String codigo);
	public List<MensajeError> validarPoliticasDisponibles(List<Politica> listaPoliticas, List<MensajeSistema> listaMensajes, List<String> listaValidaciones);
}
