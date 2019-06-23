/**
 * 
 */
package artemisa.infrastructure.data.sistema.repositories;

import java.util.HashMap;
import java.util.Map;

import artemisa.domain.sistema.entities.Identificacion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.stereotype.Repository;

import artemisa.domain.sistema.irepositories.IdentificacionDAO;
import artemisa.infrastructure.data.sistema.mapper.IdentificacionRowMapper;
 
/**
 * @author Jossymar Cabanillas
 *
 */
@Repository
public class IdentificacionDAOImpl implements IdentificacionDAO {

	@Autowired
	@Qualifier("jdbcDayr")
	JdbcTemplate jdbcTemplate;

	@Override
	public void registrarIdentificacion(Identificacion identificacion) {
		jdbcTemplate.update("udf_insert_identification VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?) ", identificacion.getCodigo(), identificacion.getCodigoA(), identificacion.getEmpleado().getCodigo(),
				identificacion.getEmpresa().getCodigo(), identificacion.getPuntoVenta().getCodigo(), identificacion.getAlmacen().getCodigo(), identificacion.getPuerto(),
				identificacion.getPeriodoTrabajo(), identificacion.getPais().getCodigo(), identificacion.getFechaActualizacion(), identificacion.getHoraActualizacion(),
				identificacion.getUsuarioActualizacion(), identificacion.getIndicadorActivo(), identificacion.getSubSistema().getCodigo(), identificacion.getPeriodoContable());
		
	}

	@Override
	public Identificacion validarIdentificacion(int codigoEmpleado, int codigoEmpresa, int codigoAlmacen, int puntoVenta, String puerto) {
		try {
			Identificacion identificacion = jdbcTemplate.queryForObject(
					"SELECT CODIGO, CODIGO_A,EMPLEADO, EMPRESA, PUNTO_VENTA, ALMACEN, PUERTO, PERIODO_TRABAJO, PAIS, FECHA_ACTUALIZACION, HORA_ACTUALIZACION, USUARIO_ACTUALIZACION, "
							+ "IND_ACTIVO, SUB_SISTEMA, PERIODO_CONTABLE FROM artemisa.IDENTIFICACION  WHERE EMPLEADO=? AND EMPRESA=? AND ALMACEN=? AND PUNTO_VENTA=? AND PUERTO=?",
					new IdentificacionRowMapper(), codigoEmpleado, codigoEmpresa, codigoAlmacen, puntoVenta, puerto);
			return identificacion;

		} catch (EmptyResultDataAccessException e) {
			return null;
		}
		//return null;
	}

	@Override
	public int obtenerMaxCodigo() {
		int codigo = 1;
		SimpleJdbcCall jdbcCall = new SimpleJdbcCall(jdbcTemplate).withFunctionName("UDF_GetLastIdentificationId").withSchemaName("dayr");
		Map<String, Object> out = jdbcCall.execute();
		if (out.size() > 0) {
			codigo = (Integer) out.get("codigo");
		}
		return codigo;
		//return 0;
	}

	@Override
	public Identificacion obtenerIdentificacion(String puerto) {
		try {
			NamedParameterJdbcTemplate namedParameterJdbcTemplate = new NamedParameterJdbcTemplate(this.jdbcTemplate);
			Map<String, Object> params = new HashMap<String, Object>();
			params.put("puerto", puerto);
			Identificacion identificacion = (Identificacion) namedParameterJdbcTemplate.queryForObject("select * from dayr.UDF_GetIdentificactionByID(:puerto)", params, new IdentificacionRowMapper());
			return identificacion;
		} catch (EmptyResultDataAccessException e) {
			return null;
		}
		//return null;
	}
	

}
