/**
 * 
 */
package artemisa.distributedservice.sistema.api.filters;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author Jossymar Cabanillas
 *
 */
@Configuration
public class WebConfig implements WebMvcConfigurer{

/*
	@Bean
	public FilterRegistrationBean corsFilter() {
		System.out.println("hola");
		UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
		CorsConfiguration config = new CorsConfiguration();
		config.setAllowCredentials(true);
		config.addAllowedOrigin("*");
		config.addAllowedHeader("*");
		config.addAllowedMethod("*");
		source.registerCorsConfiguration("/**", config);
		FilterRegistrationBean bean = new FilterRegistrationBean(new CorsFilter(source));
		bean.setOrder(0);
		return bean;
	}*/

	@Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
        	.allowedOrigins("*")
        	.allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS")
        	.allowedHeaders("header1","header2","header3")
        	.exposedHeaders("header1","header2")
        	.allowCredentials(false).maxAge(3600);
    }

}
