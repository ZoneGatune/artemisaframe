/**
 * 
 */
package artemisa.infrastructure.data.sistema.repositories;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import artemisa.domain.sistema.entities.Politica;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import artemisa.domain.sistema.irepositories.PoliticaDAO;
import artemisa.infrastructure.data.sistema.mapper.PoliticaRowMapper;

/**
 * @author Jossymar Cabanillas
 *
 */
@Repository
public class PoliticaDAOImpl implements PoliticaDAO {

	@Autowired
	@Qualifier("jdbcDayr")
	private JdbcTemplate jdbcTemplate;

	@Override
	public Politica obtenerPolitica(String codigoA) {
		try {
			NamedParameterJdbcTemplate namedParameterJdbcTemplate = new NamedParameterJdbcTemplate(this.jdbcTemplate);
			Map<String, Object> params = new HashMap<String, Object>();
			params.put("codigo", codigoA);
			Politica politica = (Politica) namedParameterJdbcTemplate.queryForObject("select * from dayr.UDF_GetPoliticByID(:codigo)", params, new PoliticaRowMapper());
			return politica;
		} catch (EmptyResultDataAccessException e) {
			return null;
		}
		//return null;
	}

	@Override
	public List<Politica> obtenerPoliticas(List<String> codigoA) {
		try {
			NamedParameterJdbcTemplate namedParameterJdbcTemplate = new NamedParameterJdbcTemplate(this.jdbcTemplate);
			Map<String, Object> params = new HashMap<String, Object>();
			params.put("codigos", codigoA);
			List<Politica> listaPoliticas = (List<Politica>) namedParameterJdbcTemplate.query("select * from dayr.udf_getpoliticbyids(array[:codigos ]::varchar[])", params, new PoliticaRowMapper());
			return listaPoliticas;
		} catch (EmptyResultDataAccessException e) {
			return null;
		}
		//return null;
	}

}
