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
public class IdentificacionRowMapper implements RowMapper<Identificacion> {


	@Override
	public Identificacion mapRow(ResultSet rs, int rowNum) throws SQLException {
		Identificacion identificacion = new Identificacion();
		Empleado empleado = new Empleado();
		Empresa empresa = new Empresa();
		Almacen almacen = new Almacen();
		Pais pais = new Pais();
		PuntoVenta puntoVenta = new PuntoVenta();
		SubSistema subSistema = new SubSistema();
		identificacion.setCodigo(rs.getInt("codigo"));
		identificacion.setCodigoA(rs.getString("codigo_a"));
		empleado.setCodigo(rs.getInt("empleado"));
		identificacion.setEmpleado(empleado);
		empresa.setCodigo(rs.getInt("empresa"));
		identificacion.setEmpresa(empresa);
		puntoVenta.setCodigo(rs.getInt("punto_venta"));
		identificacion.setPuntoVenta(puntoVenta);
		almacen.setCodigo(rs.getInt("almacen"));
		identificacion.setAlmacen(almacen);
		identificacion.setPuerto(rs.getString("puerto"));
		identificacion.setPeriodoTrabajo(rs.getDate("periodo_trabajo"));
		pais.setCodigo(rs.getInt("pais"));
		identificacion.setPais(pais);
		identificacion.setFechaActualizacion(rs.getDate("fecha_actualizacion"));
		identificacion.setHoraActualizacion(rs.getString("hora_actualizacion"));
		identificacion.setUsuarioActualizacion(rs.getInt("usuario_actualizacion"));
		subSistema.setCodigo(rs.getInt("sub_sistema"));
		identificacion.setSubSistema(subSistema);
		identificacion.setPeriodoContable(rs.getDate("periodo_contable"));
		identificacion.setIndicadorActivo(rs.getInt("ind_activo"));
		return identificacion;
	}

}
