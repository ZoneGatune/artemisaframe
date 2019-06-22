package artemisa.domain.sistema.entities;

import java.io.Serializable;

public class EmpleadoEmpresa extends Generica implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3359823479641329798L;

	public EmpleadoEmpresa() {
	}

	private Empresa empresa;
	private Empleado empleado;
	private Pais pais;

	public Empresa getEmpresa() {
		return empresa;
	}
	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}
	public Empleado getEmpleado() {
		return empleado;
	}
	public void setEmpleado(Empleado empleado) {
		this.empleado = empleado;
	}
	public Pais getPais() {
		return pais;
	}
	public void setPais(Pais pais) {
		this.pais = pais;
	}
	

	
	
}
