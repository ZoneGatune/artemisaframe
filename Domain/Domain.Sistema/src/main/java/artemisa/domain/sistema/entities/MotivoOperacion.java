package artemisa.domain.sistema.entities;

import java.io.Serializable;

/**
 * @author Jossymar Cabanillas
 *
 */
public class MotivoOperacion extends Generica implements Serializable {

	private static final long serialVersionUID = -1551433273928705786L;
	public MotivoOperacion() {
	}
	
	private String descripcion;
	private int conceptoContable;
	private TipoGuiaRemision tipoGuiaRemision;
	private Pais pais;
	private int documentoOperacion;
	private int requiereAutorizar;
	private int prioridad;
	
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public int getConceptoContable() {
		return conceptoContable;
	}
	public void setConceptoContable(int conceptoContable) {
		this.conceptoContable = conceptoContable;
	}
	public TipoGuiaRemision getTipoGuiaRemision() {
		return tipoGuiaRemision;
	}
	public void setTipoGuiaRemision(TipoGuiaRemision tipoGuiaRemision) {
		this.tipoGuiaRemision = tipoGuiaRemision;
	}
	public Pais getPais() {
		return pais;
	}
	public void setPais(Pais pais) {
		this.pais = pais;
	}
	public int getDocumentoOperacion() {
		return documentoOperacion;
	}
	public void setDocumentoOperacion(int documentoOperacion) {
		this.documentoOperacion = documentoOperacion;
	}
	public int getRequiereAutorizar() {
		return requiereAutorizar;
	}
	public void setRequiereAutorizar(int requiereAutorizar) {
		this.requiereAutorizar = requiereAutorizar;
	}
	public int getPrioridad() {
		return prioridad;
	}
	public void setPrioridad(int prioridad) {
		this.prioridad = prioridad;
	}
	

}
