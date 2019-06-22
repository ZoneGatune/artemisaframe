package artemisa.domain.sistema.entities;

import java.io.Serializable;

public class ConceptoContable extends Generica implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4733909008577578507L;

	public ConceptoContable() {
		// TODO Auto-generated constructor stub
	}

	private Pais pais;
	private SubSistema subSistema;
	private int concepto;
	private int descripcion;
	private String cuentaDebe;
	private String cuentaHaber;
	private TipoMovimiento tipoMovimiento;

	public Pais getPais() {
		return pais;
	}
	public void setPais(Pais pais) {
		this.pais = pais;
	}
	public SubSistema getSubSistema() {
		return subSistema;
	}
	public void setSubSistema(SubSistema subSistema) {
		this.subSistema = subSistema;
	}
	public int getConcepto() {
		return concepto;
	}
	public void setConcepto(int concepto) {
		this.concepto = concepto;
	}
	public int getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(int descripcion) {
		this.descripcion = descripcion;
	}
	public String getCuentaDebe() {
		return cuentaDebe;
	}
	public void setCuentaDebe(String cuentaDebe) {
		this.cuentaDebe = cuentaDebe;
	}
	public String getCuentaHaber() {
		return cuentaHaber;
	}
	public void setCuentaHaber(String cuentaHaber) {
		this.cuentaHaber = cuentaHaber;
	}
	public TipoMovimiento getTipoMovimiento() {
		return tipoMovimiento;
	}
	public void setTipoMovimiento(TipoMovimiento tipoMovimiento) {
		this.tipoMovimiento = tipoMovimiento;
	}
	
	
	
	
}
