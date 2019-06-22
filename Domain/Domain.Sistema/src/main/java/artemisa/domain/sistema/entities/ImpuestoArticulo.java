package artemisa.domain.sistema.entities;

import java.io.Serializable;

/**
 * @author Jossymar Cabanillas
 *
 */
public class ImpuestoArticulo extends Generica implements Serializable {

	private static final long serialVersionUID = 5562490480371089806L;
	public ImpuestoArticulo() {
	}

	private int codigoAcceso;
	private EstadoSiNo indicadorImpuestoAdicional;
	private Pais pais;
	private double porcentaje;
	private TipoImpuesto tipoImpuesto;
	
	public int getCodigoAcceso() {
		return codigoAcceso;
	}
	public void setCodigoAcceso(int codigoAcceso) {
		this.codigoAcceso = codigoAcceso;
	}
	public EstadoSiNo getIndicadorImpuestoAdicional() {
		return indicadorImpuestoAdicional;
	}
	public void setIndicadorImpuestoAdicional(EstadoSiNo indicadorImpuestoAdicional) {
		this.indicadorImpuestoAdicional = indicadorImpuestoAdicional;
	}
	public Pais getPais() {
		return pais;
	}
	public void setPais(Pais pais) {
		this.pais = pais;
	}
	public double getPorcentaje() {
		return porcentaje;
	}
	public void setPorcentaje(double porcentaje) {
		this.porcentaje = porcentaje;
	}
	public TipoImpuesto getTipoImpuesto() {
		return tipoImpuesto;
	}
	public void setTipoImpuesto(TipoImpuesto tipoImpuesto) {
		this.tipoImpuesto = tipoImpuesto;
	}
	
	
}
