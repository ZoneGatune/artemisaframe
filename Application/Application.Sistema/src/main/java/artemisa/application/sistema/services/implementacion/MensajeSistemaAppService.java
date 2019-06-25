/**
 * 
 */
package artemisa.application.sistema.services.implementacion;

import java.util.ArrayList;
import java.util.List;

import artemisa.application.seedwork.funciones.Funciones;
import artemisa.application.sistema.services.contractos.IMensajeSistemaAppService;
import artemisa.domain.sistema.entities.MensajeError;
import artemisa.domain.sistema.entities.MensajeSistema;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import artemisa.domain.sistema.irepositories.MensajeSistemaDAO;
import artemisa.infrastructure.crosscutting.constants.Constantes; 

/**
 * @author Jossymar Cabanillas
 *
 */
@Service
public class MensajeSistemaAppService implements IMensajeSistemaAppService {

	@Autowired
	private MensajeSistemaDAO mensajeSistemaDAO;

	@Override
	public MensajeSistema obtenerMensajeSistema(String codigoA) {
		return mensajeSistemaDAO.obtenerMensajeSistemaByCodigo(codigoA);
	}

	@Override 
	public MensajeSistema obtenerMensajeSistemaDisponible(String codigoBusqueda) {
		MensajeSistema mensajeSistema = null;
		String cadenaMensaje = "";
		mensajeSistema = this.obtenerMensajeSistema(codigoBusqueda);
		if (mensajeSistema != null) {
			if (mensajeSistema.getIndicadorActivo() == Constantes.INDICADOR_INACTIVO) {
				mensajeSistema = this.obtenerMensajeSistema(Constantes.MENSAJE_SISTEMA_0019);
				cadenaMensaje = mensajeSistema.getMensaje().replace(Constantes.CODIGO_MSG001, Constantes.ENTIDAD_MENSAJE_SISTEMA + ": " + codigoBusqueda);
				mensajeSistema.setMensaje(cadenaMensaje);
			} else
				mensajeSistema = null;
		} else {
			mensajeSistema = this.obtenerMensajeSistema(Constantes.MENSAJE_SISTEMA_0021);
		}
		return mensajeSistema;
	}

	@Override
	public MensajeSistema validarMensajeSistemaDisponible(List<MensajeSistema> listaMensajes, String codigoValidacion) {
		String cadenaMensaje = "";
		MensajeSistema mensajeSistema = Funciones.obtenerMensajeSistema(listaMensajes, codigoValidacion);
		if (mensajeSistema == null) {
			mensajeSistema = new MensajeSistema();
			mensajeSistema = Funciones.obtenerMensajeSistema(listaMensajes, Constantes.MENSAJE_SISTEMA_0019);
			cadenaMensaje = mensajeSistema.getMensaje().replace(Constantes.CODIGO_MSG001, Constantes.ENTIDAD_MENSAJE_SISTEMA + ": " + codigoValidacion);
			mensajeSistema.setMensaje(cadenaMensaje);
		} else {
			if (mensajeSistema.getIndicadorActivo() == Constantes.INDICADOR_INACTIVO) {
				mensajeSistema = Funciones.obtenerMensajeSistema(listaMensajes, Constantes.MENSAJE_SISTEMA_0019);
				cadenaMensaje = mensajeSistema.getMensaje().replace(Constantes.CODIGO_MSG001, Constantes.ENTIDAD_MENSAJE_SISTEMA + ": " + codigoValidacion);
				mensajeSistema.setMensaje(cadenaMensaje);
			} else
				mensajeSistema = null;
		}
		return mensajeSistema;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see pe.com.artemisa.servicios.api.rs.service.MensajeSistemaService#obtenerMensajeSistemas(java.lang.String[])
	 */
	@Override 
	public List<MensajeSistema> obtenerMensajeSistemas(List<String> codigosA) {
		// TODO Auto-generated method stub
		return this.mensajeSistemaDAO.obtenerMensajesSistemasByCodigos(codigosA);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see pe.com.artemisa.servicios.api.rs.service.MensajeSistemaService#validarMensajesSistemaDispobnibles(java.util.List)
	 */
	@Override 
	public List<MensajeError> validarMensajesSistemaDispobnibles(List<MensajeSistema> listaMensajesSistema, List<String> listaValidaciones) {
		List<MensajeError> listaErrores = new ArrayList<MensajeError>();
		MensajeError error = null;
		MensajeSistema mensajeSistema19 = Funciones.obtenerMensajeSistema(listaMensajesSistema, Constantes.MENSAJE_SISTEMA_0019);
		for (String validacion : listaValidaciones) {
			MensajeSistema mensajeSistema = Funciones.obtenerMensajeSistema(listaMensajesSistema, validacion);
			if (mensajeSistema == null || mensajeSistema.getIndicadorActivo() == Constantes.INDICADOR_INACTIVO) {
				error = new MensajeError();
				error.setCodigoError(mensajeSistema19.getCodigoMensaje());
				error.setMensajeError(mensajeSistema19.getMensaje().replace(Constantes.CODIGO_MSG001, Constantes.ENTIDAD_MENSAJE_SISTEMA + ": " + validacion));
				listaErrores.add(error);
			}

		}
		return listaErrores;
	}

}
