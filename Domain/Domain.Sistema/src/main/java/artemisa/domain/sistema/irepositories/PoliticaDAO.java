/**
 * 
 */
package artemisa.domain.sistema.irepositories;

import artemisa.domain.sistema.entities.Politica;

import java.util.List;


/**
 * @author Jossymar Cabanillas
 *
 */
public interface PoliticaDAO {

	public Politica obtenerPolitica(String codigo);
	
	public List<Politica> obtenerPoliticas(List<String> codigo);
}
