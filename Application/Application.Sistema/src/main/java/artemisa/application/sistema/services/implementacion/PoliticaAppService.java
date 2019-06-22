/**
 * 
 */
package artemisa.application.sistema.services.implementacion;

import java.util.ArrayList;
import java.util.List;

import artemisa.application.seedwork.funciones.Funciones;
import artemisa.application.sistema.services.contractos.IMensajeSistemaAppService;
import artemisa.application.sistema.services.contractos.IPoliticaAppService;
import artemisa.domain.sistema.entities.MensajeError;
import artemisa.domain.sistema.entities.MensajeSistema;
import artemisa.domain.sistema.entities.Politica;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import artemisa.domain.sistema.irepositories.PoliticaDAO;
import artemisa.infrastructure.crosscutting.constants.Constantes;


/**
 * @author Jossymar Cabanillas
 *
 */
@Service
public class PoliticaAppService implements IPoliticaAppService {

	@Autowired
	public PoliticaDAO politicaDAO;

	@Autowired
	public IMensajeSistemaAppService mensajeSistemaService;

	@Override
	public Politica obtenerPolitica(String codigo) {
		return politicaDAO.obtenerPolitica(codigo);
	}

	@Override
	public Politica obtenerPoliticaDisponible(String codigoBusqueda) {
		Politica politica = null;
		politica = this.obtenerPolitica(codigoBusqueda);
		if (politica != null) {
			if (politica.getIndicadorActivo() == Constantes.INDICADOR_INACTIVO) {
				politica = this.obtenerPolitica(Constantes.MENSAJE_SISTEMA_0021);
			} else
				politica = null;
		} else {
			politica = this.obtenerPolitica(Constantes.MENSAJE_SISTEMA_0021);
		}
		return politica;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see pe.com.artemisa.servicios.api.rs.service.PoliticaService#obtenerPoliticas(java.lang.String[])
	 */
	@Override
	public List<Politica> obtenerPoliticas(List<String> codigos) {
		return this.politicaDAO.obtenerPoliticas(codigos);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see pe.com.artemisa.servicios.api.rs.service.PoliticaService#validarPoliticaDisponible(java.util.List, java.lang.String)
	 */
	@Override
	public MensajeSistema validarPoliticaDisponible(List<Politica> listaPoliticas, List<MensajeSistema> listaMensajes, String codigo) {
		Politica politica = Funciones.obtenerPoliticas(listaPoliticas, codigo);
		MensajeSistema mensajeSistema = null;
		String cadenaMensaje = "";
		if (politica == null) {
			mensajeSistema = Funciones.obtenerMensajeSistema(listaMensajes, Constantes.MENSAJE_SISTEMA_0021);
			cadenaMensaje = mensajeSistema.getMensaje().replace(Constantes.CODIGO_MSG001, Constantes.ENTIDAD_POLITICA + " " + codigo);
			mensajeSistema.setMensaje(cadenaMensaje);
		} else {
			if (politica.getIndicadorActivo() == Constantes.INDICADOR_INACTIVO) {
				mensajeSistema = Funciones.obtenerMensajeSistema(listaMensajes, Constantes.MENSAJE_SISTEMA_0019);
				cadenaMensaje = mensajeSistema.getMensaje().replace(Constantes.CODIGO_MSG001, Constantes.ENTIDAD_POLITICA + " " + codigo);
				mensajeSistema.setMensaje(cadenaMensaje);
			} else {
				mensajeSistema = null;
			}
		}
		return mensajeSistema;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see pe.com.artemisa.servicios.api.rs.service.PoliticaService#validarPoliticaDisponible(java.util.List, java.util.List, java.util.List)
	 */
	@Override
	public List<MensajeError> validarPoliticasDisponibles(List<Politica> listaPoliticas, List<MensajeSistema> listaMensajesSistema, List<String> listaValidaciones) {
		List<MensajeError> listaErrores = new ArrayList<MensajeError>();
		MensajeSistema mensajeSistemaActivo = Funciones.obtenerMensajeSistema(listaMensajesSistema, Constantes.MENSAJE_SISTEMA_0019);
		MensajeSistema mensajeSistemaObligatorio = Funciones.obtenerMensajeSistema(listaMensajesSistema, Constantes.MENSAJE_SISTEMA_0038);

		for (String validacion : listaValidaciones) {
			Politica politica = Funciones.obtenerPoliticas(listaPoliticas, validacion);
			if (politica == null || politica.getIndicadorActivo() == Constantes.INDICADOR_INACTIVO) {
				listaErrores
						.add(new MensajeError(Constantes.MENSAJE_SISTEMA_0019, mensajeSistemaActivo.getMensaje().replace(Constantes.CODIGO_MSG001, Constantes.ENTIDAD_POLITICA + ": " + validacion)));
			} else {
				if (politica.getValor01().isEmpty()) {

					listaErrores.add(new MensajeError(Constantes.MENSAJE_SISTEMA_0038,
							mensajeSistemaObligatorio.getMensaje().replace(Constantes.CODIGO_MSG001, Constantes.ENTIDAD_POLITICA + ": " + validacion +".VALOR_01")));
				}
			}
		}
		return listaErrores;
	}

}
