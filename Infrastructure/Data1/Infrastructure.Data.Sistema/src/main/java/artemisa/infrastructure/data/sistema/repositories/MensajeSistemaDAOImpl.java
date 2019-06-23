/**
 * 
 */
package artemisa.infrastructure.data.sistema.repositories;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import artemisa.domain.sistema.entities.MensajeSistema;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import artemisa.domain.sistema.irepositories.MensajeSistemaDAO;
import artemisa.infrastructure.data.sistema.mapper.MensajeSistemaRowMapper;
  
/**
 * @author Jossymar Cabanillas
 *
 */
@Repository
public class MensajeSistemaDAOImpl implements MensajeSistemaDAO {

	@Autowired
	@Qualifier("jdbcAcceso")
	private JdbcTemplate jdbcTemplate;

	@Override
	public MensajeSistema obtenerMensajeSistemaByCodigo(String codigoA) {
		try {
			NamedParameterJdbcTemplate namedParameterJdbcTemplate = new NamedParameterJdbcTemplate(this.jdbcTemplate);
			Map<String, Object> params = new HashMap<String, Object>();
			params.put("codigo", codigoA);
			MensajeSistema mensajeSistema = (MensajeSistema) namedParameterJdbcTemplate.queryForObject("select * from acceso.UDF_GetMessageByID(:codigo)", params, new MensajeSistemaRowMapper());
			return mensajeSistema;
		} catch (EmptyResultDataAccessException e) {
			return null;
		}
		//return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see pe.com.artemisa.servicios.api.rs.dao.MensajeSistemaDAO#obtenerMensajesSistemasByCodigos(java.lang.String[])
	 */
	@Override
	public List<MensajeSistema> obtenerMensajesSistemasByCodigos(List<String> codigosA) {
		try {

			NamedParameterJdbcTemplate namedParameterJdbcTemplate = new NamedParameterJdbcTemplate(this.jdbcTemplate);
			Map<String, Object> params = new HashMap<String, Object>();
			params.put("codigos", codigosA);
			List<MensajeSistema> listaMensajes = (List<MensajeSistema>) namedParameterJdbcTemplate.query("select * from acceso.udf_getmessagebyids(array[:codigos ]::varchar[])", params,
					new MensajeSistemaRowMapper());
			return listaMensajes;
		} catch (EmptyResultDataAccessException e) {
			return null;
		}
		//return null;
	}

}
