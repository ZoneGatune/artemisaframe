/**
 * 
 */
package artemisa.domain.sistema.entities;

import java.io.Serializable;

/**
 * @author Jossymar Cabanillas
 *
 */
public class DocumentoReferencia extends Generica implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8671067092056126308L;

	private Documento documentoOperacion;
	private Documento documentoOperacionReferencia;
	private SubSistema subSistema;
	private Pais pais;
	public Documento getDocumentoOperacion() {
		return documentoOperacion;
	}
	public void setDocumentoOperacion(Documento documentoOperacion) {
		this.documentoOperacion = documentoOperacion;
	}
	public Documento getDocumentoOperacionReferencia() {
		return documentoOperacionReferencia;
	}
	public void setDocumentoOperacionReferencia(Documento documentoOperacionReferencia) {
		this.documentoOperacionReferencia = documentoOperacionReferencia;
	}
	public SubSistema getSubSistema() {
		return subSistema;
	}
	public void setSubSistema(SubSistema subSistema) {
		this.subSistema = subSistema;
	}
	public Pais getPais() {
		return pais;
	}
	public void setPais(Pais pais) {
		this.pais = pais;
	}
	
	
	
	
}
