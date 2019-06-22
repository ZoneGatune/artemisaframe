/**
 * 
 */
package artemisa.distributedservice.sistema.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;	
import artemisa.application.dto.generico.MensajeEntradaDTO;
import artemisa.application.dto.generico.RespuestaDTO;
import artemisa.application.sistema.services.contractos.IIdentificacionAppService;

/**
 * @author Jossymar Cabanillas
 *
 */
@SpringBootApplication
@RequestMapping(path = "/Identificacion")
public class IdentificacionController {
 
	@Autowired(required=true)	
	private IIdentificacionAppService iIdentificacionAppService;

	
	@RequestMapping(value = "/obtenerIdentificacion", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
	public RespuestaDTO obtenerIdentificacion(@RequestBody MensajeEntradaDTO mensajeEntrada) {
		return iIdentificacionAppService.obtenerIdentificacion(mensajeEntrada);
	}

}
