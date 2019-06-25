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
import org.springframework.web.bind.annotation.ResponseBody;

import artemisa.application.dto.generico.MensajeEntradaDTO;
import artemisa.application.dto.generico.RespuestaDTO;
import artemisa.application.dto.sistema.IdentificacionSalidaDTO;
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

	
	@RequestMapping(value = "/obtenerIdentificacion", method = RequestMethod.POST,headers="Accept=application/json")
	@ResponseBody
	public RespuestaDTO obtenerIdentificacion(@RequestBody MensajeEntradaDTO mensajeEntrada) {
		//System.out.println("lucas");
		RespuestaDTO result = iIdentificacionAppService.obtenerIdentificacion(mensajeEntrada); 
		//System.out.println(result.toString());
		//System.out.println(result.getDatos().toString());
		//IdentificacionSalidaDTO result_n = (IdentificacionSalidaDTO) result.getDatos();
		//System.out.println(result_n.getIdentificacionBO().toString());
		//System.out.println(result.getRespuesta().toString());
		return result;
	}

}
