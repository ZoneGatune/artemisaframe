/**
 * 
 */
package artemisa.infrastructure.data.seedwork.context;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.boot.autoconfigure.jdbc.DataSourceTransactionManagerAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.core.JdbcTemplate; 

/**
 * @author Jossymar Cabanillas
 *
 */

@Configuration
public class ConfigDBFactory {

	
	@Primary
	@Bean(name="dsAcceso")
	@ConfigurationProperties(prefix="spring.datasource.acceso")
	public DataSource dsAcceso() {
		
		return DataSourceBuilder.create().build();
	}
	
	
	@Bean(name="dsAcceso")
	@Primary
	@ConfigurationProperties("spring.datasource.acceso")
	public DataSourceProperties dataSourceProperties() {
	    return new DataSourceProperties();
	}
	
	@Bean(name="dsDayr")
    @ConfigurationProperties(prefix="spring.datasource.dayr")
    public DataSource dsDayr() {
        return DataSourceBuilder.create().build();
    }

	@Bean(name="jdbcAcceso")
	@Autowired
	public JdbcTemplate createJdbcTemplateArtemisa(@Qualifier("dsAcceso") DataSource dsAcceso) {
		return new JdbcTemplate(dsAcceso);
	}
	
	@Bean(name="jdbcDayr")
	@Autowired
	public JdbcTemplate createJdbcTemplateDayr(@Qualifier("dsDayr") DataSource dsDayr) {
		return new JdbcTemplate(dsDayr);
	}
	
	
	
}
