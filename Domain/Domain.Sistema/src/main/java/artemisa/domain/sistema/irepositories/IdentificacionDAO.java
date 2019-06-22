/**
 * 
 */
package artemisa.domain.sistema.irepositories;


import artemisa.domain.sistema.entities.Identificacion;

public interface IdentificacionDAO {
	
	public void registrarIdentificacion(Identificacion identificacion);

	public Identificacion validarIdentificacion(int codigoEmpleado, int codigoEmpresa, int codigoAlmacen, int puntoVenta, String puerto);
	
	public int obtenerMaxCodigo();
	
	public Identificacion obtenerIdentificacion(String puerto);
}
