package artemisa.domain.sistema.entities;

import java.io.Serializable;

/**
 * @author Jossymar Cabanillas
 *
 */
public class UnidadConversion extends Generica implements Serializable{

	private static final long serialVersionUID = 7853707395964803656L;
	public UnidadConversion() {
	}
	
	private int codigoUnidadOrigen;
	private int codigoUnidadDestino;
	private int equivalencia;
	private Pais pais;
	
	public int getCodigoUnidadOrigen() {
		return codigoUnidadOrigen;
	}
	public void setCodigoUnidadOrigen(int codigoUnidadOrigen) {
		this.codigoUnidadOrigen = codigoUnidadOrigen;
	}
	public int getCodigoUnidadDestino() {
		return codigoUnidadDestino;
	}
	public void setCodigoUnidadDestino(int codigoUnidadDestino) {
		this.codigoUnidadDestino = codigoUnidadDestino;
	}
	public int getEquivalencia() {
		return equivalencia;
	}
	public void setEquivalencia(int equivalencia) {
		this.equivalencia = equivalencia;
	}
	public Pais getPais() {
		return pais;
	}
	public void setPais(Pais pais) {
		this.pais = pais;
	}
	
	
}
