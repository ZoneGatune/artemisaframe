package artemisa.domain.sistema.entities;

import java.io.Serializable;

/**
 * @author Jossymar Cabanillas
 *
 */
public class ObjetoEmpleadoAcceso extends Generica implements Serializable {

	private static final long serialVersionUID = -2277371865782833828L;
	public ObjetoEmpleadoAcceso() {
	}
	
	private Empleado empleado;
	private int objeto;
	private int indicadorVisualizacion;
	private int indicadorEscritura;
	private Pais pais;
	
	public Empleado getEmpleado() {
		return empleado;
	}
	public void setEmpleado(Empleado empleado) {
		this.empleado = empleado;
	}
	public int getObjeto() {
		return objeto;
	}
	public void setObjeto(int objeto) {
		this.objeto = objeto;
	}
	public int getIndicadorVisualizacion() {
		return indicadorVisualizacion;
	}
	public void setIndicadorVisualizacion(int indicadorVisualizacion) {
		this.indicadorVisualizacion = indicadorVisualizacion;
	}
	public int getIndicadorEscritura() {
		return indicadorEscritura;
	}
	public void setIndicadorEscritura(int indicadorEscritura) {
		this.indicadorEscritura = indicadorEscritura;
	}
	public Pais getPais() {
		return pais;
	}
	public void setPais(Pais pais) {
		this.pais = pais;
	}

	
}
