/**
 * 
 */
package artemisa.infrastructure.data.sistema.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import artemisa.domain.sistema.entities.*;
import org.springframework.jdbc.core.RowMapper;

/**
 * @author Jossymar Cabanillas
 *
 */
public class NotificacionRowMapper implements RowMapper<Notificacion> {

	public NotificacionRowMapper() {
	}
	
	@Override
	public Notificacion mapRow(ResultSet rs, int rowNum) throws SQLException {
		Notificacion notificacion = new Notificacion();
		Empleado empleado = new Empleado();
		Empresa empresa = new Empresa();
		PuntoVenta puntoVenta = new PuntoVenta();
		Almacen almacen = new Almacen();
		notificacion.setCodigo(rs.getInt("CODIGO"));
		notificacion.setCodigoA(rs.getString("CODIGO_A"));
		empleado.setCodigo(rs.getInt("EMPLEADO"));
		notificacion.setEmpleado(empleado);
		notificacion.setPuerto(rs.getString("PUERTO"));
		empresa.setCodigo(rs.getInt("EMPRESA"));
		notificacion.setEmpresa(empresa);
		puntoVenta.setCodigo(rs.getInt("PUNTO_VENTA"));
		notificacion.setPuntoVenta(puntoVenta);
		almacen.setCodigo(rs.getInt("ALMACEN"));
		notificacion.setAlmacen(almacen);
		notificacion.setPeriodoTrabajo(rs.getDate("PERIODO_TRABAJO"));
		
		return notificacion;
	}

}
