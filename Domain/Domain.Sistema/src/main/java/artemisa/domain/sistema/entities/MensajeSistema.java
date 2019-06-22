package artemisa.domain.sistema.entities;

import java.io.Serializable;

/**
 * @author Jossymar Cabanillas
 *
 */
public class MensajeSistema extends Generica  implements Serializable {

	private static final long serialVersionUID = -7488027902632229920L;
	public MensajeSistema() {
	}

	private String codigoMensaje; 
	private String mensaje;
	private String descripcionMensaje;
	private String procedimientoMensaje;
	private int Archivo; 
	private String teclaFuncion;
	private String opcionMensaje;
	private String variableMensaje;
	private int indicadorEmiteSonido;
	private int tipoMensajeValidacion;
	private int tipoMensajeDialogo;
	private Pais pais;
	private int indicadorMensajeGenerico;
	private Empresa empresa;
	private String tiempoVisualizacion;
	private String colorFondo;
	private String colorTexto;
	private String codigoTipoMensajeValidacion;
	
	public String getCodigoMensaje() {
		return codigoMensaje;
	}
	public void setCodigoMensaje(String codigoMensaje) {
		this.codigoMensaje = codigoMensaje;
	}
	public String getMensaje() {
		return mensaje;
	}
	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}
	public String getDescripcionMensaje() {
		return descripcionMensaje;
	}
	public void setDescripcionMensaje(String descripcionMensaje) {
		this.descripcionMensaje = descripcionMensaje;
	}
	public String getProcedimientoMensaje() {
		return procedimientoMensaje;
	}
	public void setProcedimientoMensaje(String procedimientoMensaje) {
		this.procedimientoMensaje = procedimientoMensaje;
	}
	public int getArchivo() {
		return Archivo;
	}
	public void setArchivo(int archivo) {
		Archivo = archivo;
	}
	public String getTeclaFuncion() {
		return teclaFuncion;
	}
	public void setTeclaFuncion(String teclaFuncion) {
		this.teclaFuncion = teclaFuncion;
	}
	public String getOpcionMensaje() {
		return opcionMensaje;
	}
	public void setOpcionMensaje(String opcionMensaje) {
		this.opcionMensaje = opcionMensaje;
	}
	public String getVariableMensaje() {
		return variableMensaje;
	}
	public void setVariableMensaje(String variableMensaje) {
		this.variableMensaje = variableMensaje;
	}
	public int getIndicadorEmiteSonido() {
		return indicadorEmiteSonido;
	}
	public void setIndicadorEmiteSonido(int indicadorEmiteSonido) {
		this.indicadorEmiteSonido = indicadorEmiteSonido;
	}
	public int getTipoMensajeValidacion() {
		return tipoMensajeValidacion;
	}
	public void setTipoMensajeValidacion(int tipoMensajeValidacion) {
		this.tipoMensajeValidacion = tipoMensajeValidacion;
	}
	public int getTipoMensajeDialogo() {
		return tipoMensajeDialogo;
	}
	public void setTipoMensajeDialogo(int tipoMensajeDialogo) {
		this.tipoMensajeDialogo = tipoMensajeDialogo;
	}
	public Pais getPais() {
		return pais;
	}
	public void setPais(Pais pais) {
		this.pais = pais;
	}
	public int getIndicadorMensajeGenerico() {
		return indicadorMensajeGenerico;
	}
	public void setIndicadorMensajeGenerico(int indicadorMensajeGenerico) {
		this.indicadorMensajeGenerico = indicadorMensajeGenerico;
	}
	public Empresa getEmpresa() {
		return empresa;
	}
	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}
	public String getTiempoVisualizacion() {
		return tiempoVisualizacion;
	}
	public void setTiempoVisualizacion(String tiempoVisualizacion) {
		this.tiempoVisualizacion = tiempoVisualizacion;
	}
	public String getColorFondo() {
		return colorFondo;
	}
	public void setColorFondo(String colorFondo) {
		this.colorFondo = colorFondo;
	}
	public String getColorTexto() {
		return colorTexto;
	}
	public void setColorTexto(String colorTexto) {
		this.colorTexto = colorTexto;
	}
	public String getCodigoTipoMensajeValidacion() {
		return codigoTipoMensajeValidacion;
	}
	public void setCodigoTipoMensajeValidacion(String codigoTipoMensajeValidacion) {
		this.codigoTipoMensajeValidacion = codigoTipoMensajeValidacion;
	}
	
		
}
