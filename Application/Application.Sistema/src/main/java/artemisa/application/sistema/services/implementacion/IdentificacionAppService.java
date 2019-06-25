/**
 * 
 */
package artemisa.application.sistema.services.implementacion;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import artemisa.application.dto.generico.CabeceraSalidaDTO;
import artemisa.application.dto.generico.MensajeEntradaDTO;
import artemisa.application.dto.generico.RespuestaDTO;
import artemisa.application.seedwork.funciones.Funciones;
import artemisa.application.sistema.services.contractos.IMensajeSistemaAppService;
import artemisa.application.sistema.services.contractos.IPoliticaAppService;
import artemisa.domain.sistema.entities.Empresa;
import artemisa.domain.sistema.entities.Identificacion;
import artemisa.domain.sistema.entities.MensajeError;
import artemisa.domain.sistema.entities.MensajeSistema;
import artemisa.domain.sistema.entities.Politica;
import artemisa.domain.sistema.irepositories.EmpresaDAO;
import artemisa.domain.sistema.irepositories.IdentificacionDAO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import artemisa.application.dto.sistema.IdentificacionDTO;
import artemisa.application.dto.sistema.IdentificacionSalidaDTO;
import artemisa.application.sistema.services.contractos.IIdentificacionAppService;
import artemisa.infrastructure.crosscutting.constants.Constantes; 

 
/**
 * @author Jossymar Cabanillas
 *
 */
@Service(value="iIdentificacionAppService")
public class IdentificacionAppService implements IIdentificacionAppService {

	@Autowired
	private IMensajeSistemaAppService mensajeSistemaService;

  
	@Autowired
	private IdentificacionDAO identificacionDAO;

	@Autowired
	private IPoliticaAppService politicaService;

	@Autowired
	private EmpresaDAO empresaDAO;

	 
	@Override
	public int obtenerMaxCodigo() {
		return identificacionDAO.obtenerMaxCodigo();
	}

	@Override
	public String obtenerMaxCodigoA() {
		return Funciones.formatearCampo(this.obtenerMaxCodigo(), Constantes.RELLENO_CERO, Constantes.TAMANHO_IDENTIFICACION);
	}

	@Override
	public RespuestaDTO obtenerIdentificacion(MensajeEntradaDTO mensajeEntradaDTO) {
		RespuestaDTO respuestaDTO = new RespuestaDTO();
		CabeceraSalidaDTO cabeceraSalidaBO = new CabeceraSalidaDTO();
		IdentificacionSalidaDTO identificacionSalidaBO = new IdentificacionSalidaDTO();
		IdentificacionDTO identificacionBO = new IdentificacionDTO();
		MensajeSistema mensajeRepuesta = null;
		MensajeSistema mensajeSistemaError = null;
		Identificacion identificacion = null;
		Empresa empresa = null;
		//Politica politica10 = null;
		Politica politica26 = null;
		Politica politica22 = null;
		Politica politica23 = null;
		String cadenaMensaje = "";
		SimpleDateFormat formatoFecha = null;
		List<MensajeError> listaErrores = new ArrayList<MensajeError>();
		MensajeError mensajeError = null;
		List<String> listaConstantesMensajes = Arrays.asList(Constantes.MENSAJE_SISTEMA_0019, Constantes.MENSAJE_SISTEMA_0021, Constantes.MENSAJE_SISTEMA_0038, Constantes.MENSAJE_SISTEMA_0040,
				Constantes.MENSAJE_SISTEMA_0064, Constantes.MENSAJE_SISTEMA_0083, Constantes.MENSAJE_SISTEMA_0084);
		List<String> listaConstantesPoliticas = Arrays.asList(Constantes.POLITICA_0022,Constantes.POLITICA_0023,Constantes.POLITICA_0026, Constantes.POLITICA_0245);
		List<MensajeSistema> listaMensajes = mensajeSistemaService.obtenerMensajeSistemas(listaConstantesMensajes);
		List<Politica> listaPoliticas = politicaService.obtenerPoliticas(listaConstantesPoliticas);

		if (mensajeEntradaDTO.getPuerto().equals(Constantes.VALOR_VACIO)) {
			mensajeRepuesta = Funciones.obtenerMensajeSistema(listaMensajes, Constantes.MENSAJE_SISTEMA_0064);
			mensajeSistemaError = Funciones.obtenerMensajeSistema(listaMensajes, Constantes.MENSAJE_SISTEMA_0038);
			listaErrores.add(new MensajeError(mensajeSistemaError.getCodigoMensaje(), mensajeSistemaError.getMensaje().replace(Constantes.CODIGO_MSG001, Constantes.ENTIDAD_PARAMETRO + ": Puerto")));

		} else {
			listaErrores = mensajeSistemaService.validarMensajesSistemaDispobnibles(listaMensajes, listaConstantesMensajes);
			if (listaErrores.size() == 0) {
				listaErrores = politicaService.validarPoliticasDisponibles(listaPoliticas, listaMensajes, listaConstantesPoliticas);
				if (listaErrores.size() == 0) {
					identificacion = identificacionDAO.obtenerIdentificacion(mensajeEntradaDTO.getPuerto());
					if (identificacion != null) {
						
						empresa = empresaDAO.obtenerEmpresa(identificacion.getEmpresa().getCodigo());
						
						if(identificacion.getIndicadorActivo() == Constantes.INDICADOR_INACTIVO) {
							mensajeError = new MensajeError();
							mensajeSistemaError = Funciones.obtenerMensajeSistema(listaMensajes, Constantes.MENSAJE_SISTEMA_0019);
							mensajeError.setCodigoError(mensajeSistemaError.getCodigoMensaje());
							mensajeError.setMensajeError(mensajeSistemaError.getMensaje().replace(Constantes.CODIGO_MSG001, Constantes.ENTIDAD_IDENTIFICACION + ". Codigo: " + identificacion.getCodigo()));
							listaErrores.add(mensajeError);
						}
						if(empresa.getIndicadorActivo() == Constantes.INDICADOR_INACTIVO) {
							mensajeError = new MensajeError();
							mensajeSistemaError = Funciones.obtenerMensajeSistema(listaMensajes, Constantes.MENSAJE_SISTEMA_0019);
							mensajeError.setCodigoError(mensajeSistemaError.getCodigoMensaje());
							mensajeError.setMensajeError(mensajeSistemaError.getMensaje().replace(Constantes.CODIGO_MSG001, Constantes.ENTIDAD_EMPRESA + ". Codigo: " + identificacion.getEmpresa().getCodigo()));
							listaErrores.add(mensajeError);
						}
						
						if (listaErrores.size() == 0) {
							mensajeRepuesta = Funciones.obtenerMensajeSistema(listaMensajes, Constantes.MENSAJE_SISTEMA_0040);
							//politica10 = Funciones.obtenerPoliticas(listaPoliticas, Constantes.POLITICA_0010);
							politica26 = Funciones.obtenerPoliticas(listaPoliticas, Constantes.POLITICA_0026);
							politica22 = Funciones.obtenerPoliticas(listaPoliticas, Constantes.POLITICA_0022);
							politica23 = Funciones.obtenerPoliticas(listaPoliticas, Constantes.POLITICA_0023);
							cadenaMensaje = mensajeRepuesta.getMensaje().replace(Constantes.CODIGO_MSG001, Constantes.ENTIDAD_IDENTIFICACION + ". Puerto: " + mensajeEntradaDTO.getPuerto());
							mensajeRepuesta.setMensaje(cadenaMensaje);
							formatoFecha = new SimpleDateFormat(Constantes.FORMATO_FECHA);
							identificacionBO = new IdentificacionDTO();
							identificacionBO.setCodigo(identificacion.getCodigo());
							identificacionBO.setCodigoA(identificacion.getCodigoA());
							identificacionBO.setPais(identificacion.getPais().getCodigo());
							identificacionBO.setEmpresa(identificacion.getEmpresa().getCodigo());
							identificacionBO.setAlmacen(identificacion.getAlmacen().getCodigo());
							identificacionBO.setPuntoVenta(identificacion.getPuntoVenta().getCodigo());
							identificacionBO.setEmpleado(identificacion.getEmpleado().getCodigo());
							identificacionBO.setPuerto(identificacion.getPuerto());
							identificacionBO.setSubSistema(identificacion.getSubSistema().getCodigo());
							identificacionBO.setPeriodoContable(formatoFecha.format(identificacion.getPeriodoContable()));
							identificacionBO.setPeriodoTrabajo(formatoFecha.format(identificacion.getPeriodoTrabajo()));
							identificacionBO.setNombreBd(empresa.getNombreBD());
							
							String strImagenLogoEmpresa = politica26.getValor02().concat(empresa.getImagenLogo());
							String finalImagenLogoEmpresa = strImagenLogoEmpresa.replace(Constantes.CODIGO_MSG002, politica23.getValor01()).replace(Constantes.CODIGO_MSG003, empresa.getCodigoA());
							identificacionBO.setImagenLogoEmpresa(/*identificacion.getEmpresa().getImagenLogo()*/finalImagenLogoEmpresa);
							
							String strImagenPais = politica26.getValor02().concat(empresa.getImagenPais());
							String finalImagenPais = strImagenPais.replace(Constantes.CODIGO_MSG002, politica23.getValor01()).replace(Constantes.CODIGO_MSG003, empresa.getCodigoA());
							identificacionBO.setImagenPais(/*identificacion.getEmpresa().getImagenPais()*/finalImagenPais);
							
							String strLogoArtemisa = politica22.getValor01().concat(politica22.getValor02());
							String finalLogoArtemisa = strLogoArtemisa.replace(Constantes.CODIGO_MSG002, politica23.getValor01());
							identificacionBO.setImagenLogoArtemisa(/*politica10.getValor01()*/finalLogoArtemisa);
							
							identificacionSalidaBO.setIdentificacionBO(identificacionBO);
							respuestaDTO.setDatos(identificacionSalidaBO);
						}else {
							mensajeRepuesta = Funciones.obtenerMensajeSistema(listaMensajes, Constantes.MENSAJE_SISTEMA_0064);
						}
						
					} else {
						mensajeRepuesta = Funciones.obtenerMensajeSistema(listaMensajes, Constantes.MENSAJE_SISTEMA_0064);
						mensajeSistemaError = Funciones.obtenerMensajeSistema(listaMensajes, Constantes.MENSAJE_SISTEMA_0021);
						listaErrores.add(new MensajeError(mensajeSistemaError.getCodigoMensaje(),
								mensajeSistemaError.getMensaje().replace(Constantes.CODIGO_MSG001, Constantes.ENTIDAD_IDENTIFICACION + ". Puerto: " + mensajeEntradaDTO.getPuerto())));

					}
				} else {
					mensajeRepuesta = Funciones.obtenerMensajeSistema(listaMensajes, Constantes.MENSAJE_SISTEMA_0064);
				}
			} else {
				mensajeRepuesta = Funciones.obtenerMensajeSistema(listaMensajes, Constantes.MENSAJE_SISTEMA_0064);
			}
		}

		cabeceraSalidaBO.setCodigoRespuesta(mensajeRepuesta.getCodigoMensaje());
		cabeceraSalidaBO.setMensajeRespuesta(mensajeRepuesta.getMensaje());
		cabeceraSalidaBO.setListaErrores(listaErrores);
		respuestaDTO.setRespuesta(cabeceraSalidaBO);
		return respuestaDTO;
	}

}
