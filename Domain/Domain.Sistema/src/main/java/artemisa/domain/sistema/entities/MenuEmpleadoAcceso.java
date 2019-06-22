package artemisa.domain.sistema.entities;

import java.io.Serializable;

/**
 * @author Jossymar Cabanillas
 *
 */
public class MenuEmpleadoAcceso extends Generica implements Serializable{

	private static final long serialVersionUID = 2970607386971490600L;
	public MenuEmpleadoAcceso() {
	}
	
	private Menu menu;
	private Empleado empleado;
	private Pais pais;
	
	public Menu getMenu() {
		return menu;
	}
	public void setMenu(Menu menu) {
		this.menu = menu;
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
