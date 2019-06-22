package artemisa.domain.sistema.entities;

import java.io.Serializable;

/**
 * @author Jossymar Cabanillas
 *
 */
public class MenuGrupo extends Generica implements Serializable{

	private static final long serialVersionUID = 3750293789758237688L;
	public MenuGrupo() {
	}
	
	private Empresa empresa;
	private int grupoEmpleado;
	private Menu menu;
	private Pais pais;
	private int indicadorDisponibleEmpresaGrupoEmpleado;
	
	public Empresa getEmpresa() {
		return empresa;
	}
	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}
	public int getGrupoEmpleado() {
		return grupoEmpleado;
	}
	public void setGrupoEmpleado(int grupoEmpleado) {
		this.grupoEmpleado = grupoEmpleado;
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
	public int getindicadorDisponibleEmpresaGrupoEmpleado() {
		return indicadorDisponibleEmpresaGrupoEmpleado;
	}
	public void setindicadorDisponibleEmpresaGrupoEmpleado(int indicadorDisponibleEmpresaGrupoEmpleado) {
		this.indicadorDisponibleEmpresaGrupoEmpleado = indicadorDisponibleEmpresaGrupoEmpleado;
	}
	
	
}
