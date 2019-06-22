package artemisa.domain.sistema.entities;

import java.io.Serializable;

/**
 * @author Jossymar Cabanillas
 *
 */
public class MenuEmpleado extends Generica implements Serializable {

	private static final long serialVersionUID = -6524133566267378378L;
	public MenuEmpleado() {
	}
	
	private Empleado empleado;
	private Menu menu;
	private Pais pais;
	private int indicadorDisponibilidadEmpleado;
	
	public Empleado getEmpleado() {
		return empleado;
	}
	public void setEmpleado(Empleado empleado) {
		this.empleado = empleado;
	}
	public Menu getMenu() {
		return menu;
	}
	public void setMenu(Menu menu) {
		this.menu = menu;
	}
	public Pais getPais() {
		return pais;
	}
	public void setPais(Pais pais) {
		this.pais = pais;
	}
	public int getIndicadorDisponibilidadEmpleado() {
		return indicadorDisponibilidadEmpleado;
	}
	public void setIndicadorDisponibilidadEmpleado(int indicadorDisponibilidadEmpleado) {
		this.indicadorDisponibilidadEmpleado = indicadorDisponibilidadEmpleado;
	}
	

}
