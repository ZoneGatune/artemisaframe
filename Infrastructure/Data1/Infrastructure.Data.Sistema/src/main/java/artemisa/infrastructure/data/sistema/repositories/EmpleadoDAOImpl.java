/**
 * 
 */
package artemisa.infrastructure.data.sistema.repositories;

import java.util.Map;

import artemisa.domain.sistema.entities.Empleado;
import artemisa.domain.sistema.entities.EmpleadoGrupo;
import artemisa.domain.sistema.entities.Pais;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.stereotype.Repository;

import artemisa.domain.sistema.irepositories.EmpleadoDAO;

/**
 * @author Jossymar Cabanillas
 *
 */
@Repository
public class EmpleadoDAOImpl implements EmpleadoDAO {

	@Qualifier("jdbcAcceso")
	@Autowired
	JdbcTemplate jdbcTemplate;

	@Override
	public Empleado obtenerEmpleadoPorNombreRed(String nombre_trabajador) {
		SimpleJdbcCall jdbcCall = new SimpleJdbcCall(jdbcTemplate).withFunctionName("udf_getworkerbyname").withSchemaName("dayr");
		MapSqlParameterSource in = new MapSqlParameterSource();
		in.addValue("nombre_trabajador", nombre_trabajador);
		Map<String, Object> out = jdbcCall.execute(in);
		Empleado empleado = null;
		Pais pais = null;
		EmpleadoGrupo empleadoGrupo =  null;
		if (out.size() > 0) {
			empleado = new Empleado();
			pais = new Pais();
			empleadoGrupo = new EmpleadoGrupo();
			empleado.setCodigo((Integer) out.get("codigo"));
			empleado.setIndicadorActivo((Integer) out.get("ind_activo"));
			empleado.setClaveRed( (String) out.get("clave_red"));
			empleado.setNumeroIntentoIngreso((Integer) out.get("numero_intento_ingreso"));
			empleado.setNumeroSesionPermitido((Integer) out.get("numero_sesion_permitido"));
			pais.setCodigo((Integer) out.get("pais"));
			empleadoGrupo.setCodigo((Integer) out.get("grupo_empleado"));
			empleado.setEmpleadoGrupo(empleadoGrupo);
			empleado.setPais(pais);
		}
		return empleado;
	}

	@Override
	public void actualizarIntento(int codigoEmpleado, int numeroReintento) {
		jdbcTemplate.update("UPDATE  dayr.EMPLEADO SET NUMERO_INTENTO_INGRESO=? WHERE CODIGO=?", numeroReintento, codigoEmpleado);

	}

}
