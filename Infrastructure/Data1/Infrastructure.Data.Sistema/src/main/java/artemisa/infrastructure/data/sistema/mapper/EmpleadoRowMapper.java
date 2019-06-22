/**
 * 
 */
package artemisa.infrastructure.data.sistema.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import artemisa.domain.sistema.entities.Empleado;
import artemisa.domain.sistema.entities.EmpleadoGrupo;
import artemisa.domain.sistema.entities.Pais;
import org.springframework.jdbc.core.RowMapper;

/**
 * @author Jossymar Cabanillas
 *
 */
public class EmpleadoRowMapper implements RowMapper<Empleado> {


	@Override
	public Empleado mapRow(ResultSet rs, int rowNum) throws SQLException {
		Empleado empleado = new Empleado();
		Pais pais = new Pais();
		EmpleadoGrupo empleadoGrupo = new EmpleadoGrupo();
		empleado.setCodigo(rs.getInt("CODIGO"));
		empleado.setIndicadorActivo(rs.getInt("IND_ACTIVO"));
		empleado.setClaveRed(rs.getString("CLAVE_RED"));
		empleado.setNumeroIntentoIngreso(rs.getInt("NUMERO_INTENTO_INGRESO"));
		empleado.setNumeroSesionPermitido(rs.getInt("NUMERO_SESION_PERMITIDO"));
		pais.setCodigo(rs.getInt("PAIS"));
		empleadoGrupo.setCodigo(rs.getInt("GRUPO_EMPLEADO"));
		empleado.setEmpleadoGrupo(empleadoGrupo);
		empleado.setPais(pais);
		return empleado;
	}

}
