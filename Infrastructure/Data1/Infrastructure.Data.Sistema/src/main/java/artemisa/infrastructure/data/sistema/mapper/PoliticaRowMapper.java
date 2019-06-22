/**
 * 
 */
package artemisa.infrastructure.data.sistema.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import artemisa.domain.sistema.entities.Pais;
import artemisa.domain.sistema.entities.Politica;
import artemisa.domain.sistema.entities.TipoPolitica;
import org.springframework.jdbc.core.RowMapper;

/**
 * @author Jossymar Cabanillas
 *
 */
public class PoliticaRowMapper implements RowMapper<Politica>  {

	
	@Override
	public Politica mapRow(ResultSet row, int towNum) throws SQLException {
		Politica politica = new Politica();
		Pais pais = new Pais();
		TipoPolitica tipoPolitica = new TipoPolitica();
		politica.setCodigo(row.getInt("codigo"));
		politica.setCodigoA(row.getString("codigo_a"));
		tipoPolitica.setCodigo(row.getInt("tipo_politica"));
		politica.setTipoPolitica(tipoPolitica);
		politica.setDescripcion(row.getString("descripcion"));
		pais.setCodigo(row.getInt("pais"));
		politica.setPais(pais);
		politica.setDato01(row.getString("dato_01"));
		politica.setDato02(row.getString("dato_02"));
		politica.setDato03(row.getString("dato_03"));
		politica.setDato04(row.getString("dato_04"));
		politica.setIndicadorActivo(row.getInt("ind_activo"));
		politica.setCodigoGrupo(row.getInt("grupo"));
		politica.setTipoDato01(row.getInt("tipo_dato_01"));
		politica.setTipoDato02(row.getInt("tipo_dato_02"));
		politica.setTipoDato03(row.getInt("tipo_dato_03"));
		politica.setTipoDato04(row.getInt("tipo_dato_04"));
		politica.setValor01(row.getString("valor_01"));
		politica.setValor02(row.getString("valor_02"));
		politica.setValor03(row.getString("valor_03"));
		politica.setValor04(row.getString("valor_04"));
		politica.setValor05(row.getString("valor_05"));
		politica.setFechaActualizacion(row.getDate("fecha_actualizacion"));
		politica.setHoraActualizacion(row.getString("hora_actualizacion"));
		politica.setUsuarioActualizacion(row.getInt("usuario_actualizacion"));
		return politica;
	}
}
