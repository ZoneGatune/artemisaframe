/**
 * 
 */
package artemisa.domain.sistema.irepositories;

import artemisa.domain.sistema.entities.Empleado;

/**
 * @author Jossymar Cabanillas
 *
 */

public interface EmpleadoDAO {

	
	public Empleado obtenerEmpleadoPorNombreRed(String nombreRed);
	
	public void actualizarIntento(int codigoEmpleado, int numeroReintento);
}
