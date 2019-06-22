/**
 * 
 */
package artemisa.infrastructure.data.sistema.repositories;

import java.util.Map;

import artemisa.domain.sistema.entities.Empresa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.stereotype.Repository;

import artemisa.domain.sistema.irepositories.EmpresaDAO;
 
/**
 * @author Jossymar Cabanillas
 *
 */
@Repository
public class EmpresaDAOImpl implements EmpresaDAO {

	@Qualifier("jdbcAcceso")
	@Autowired
	JdbcTemplate jdbcTemplate;

	public Empresa obtenerEmpresa(int codigo) {
		SimpleJdbcCall jdbcCall = new SimpleJdbcCall(jdbcTemplate).withFunctionName("UDF_GetOrganizationByID").withSchemaName("acceso");
		MapSqlParameterSource in = new MapSqlParameterSource();
		in.addValue("codigo", codigo);
		Map<String, Object> out = jdbcCall.execute(in);
		Empresa empresa = null;
		if (out.size() > 0) {
			empresa = new Empresa();
			empresa.setCodigo((Integer) out.get("codigo"));
			empresa.setIndicadorActivo( (Integer)  out.get("ind_activo"));
			empresa.setNombreBD((String) out.get("nombre_bd"));
			empresa.setImagenLogo((String) out.get("imagen_logo"));
			empresa.setImagenPais((String) out.get("imagen_pais"));
			
		}
		return empresa;
	}

}
