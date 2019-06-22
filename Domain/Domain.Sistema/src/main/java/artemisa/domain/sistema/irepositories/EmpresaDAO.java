/**
 * 
 */
package artemisa.domain.sistema.irepositories;

import artemisa.domain.sistema.entities.Empresa;

/**
 * @author Jossymar Cabanillas
 *
 */
public interface EmpresaDAO {

	public Empresa obtenerEmpresa(int codigo);
}
