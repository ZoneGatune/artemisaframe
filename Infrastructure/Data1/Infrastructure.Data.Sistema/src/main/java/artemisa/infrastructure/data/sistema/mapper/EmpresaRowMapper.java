/**
 * 
 */
package artemisa.infrastructure.data.sistema.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import artemisa.domain.sistema.entities.Empresa;
import org.springframework.jdbc.core.RowMapper;

/**
 * @author Jossymar Cabanillas
 *
 */
public class EmpresaRowMapper implements RowMapper<Empresa> {


	@Override
	public Empresa mapRow(ResultSet rs, int rowNum) throws SQLException {
		Empresa empresa = new Empresa();
		empresa.setCodigo(rs.getInt("CODIGO"));
		empresa.setIndicadorActivo(rs.getInt("IND_ACTIVO"));
		empresa.setNombreBD(rs.getString("NOMBRE_BD"));
		empresa.setImagenLogo(rs.getString("IMAGEN_LOGO"));
		empresa.setImagenPais(rs.getString("IMAGEN_PAIS"));
		
		return empresa;
	}
	
	
	

}
