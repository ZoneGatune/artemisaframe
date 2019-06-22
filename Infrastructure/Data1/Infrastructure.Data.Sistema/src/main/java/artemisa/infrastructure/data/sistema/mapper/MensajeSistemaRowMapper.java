/**
 * 
 */
package artemisa.infrastructure.data.sistema.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import artemisa.domain.sistema.entities.MensajeSistema;
import org.springframework.jdbc.core.RowMapper;

/**
 * @author Jossymar Cabanillas
 *
 */
public class MensajeSistemaRowMapper implements RowMapper<MensajeSistema> {


	@Override
	public MensajeSistema mapRow(ResultSet row, int towNum) throws SQLException {
		MensajeSistema mensajeSistema = new MensajeSistema();
		mensajeSistema.setCodigo(row.getInt("codigo"));
		mensajeSistema.setCodigoA(row.getString("codigo_a"));
		mensajeSistema.setCodigoMensaje(row.getString("codigo_mensaje"));
		mensajeSistema.setMensaje(row.getString("mensaje"));
		mensajeSistema.setIndicadorActivo(row.getInt("ind_activo"));
		
		return mensajeSistema;
	}

}
