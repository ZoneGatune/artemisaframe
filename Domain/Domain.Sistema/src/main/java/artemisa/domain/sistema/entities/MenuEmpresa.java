package artemisa.domain.sistema.entities;

import java.io.Serializable;

/**
 * @author Jossymar Cabanillas
 *
 */
public class MenuEmpresa extends Generica implements Serializable{

	private static final long serialVersionUID = -6076674707133999669L;
	public MenuEmpresa() {
	}
	
	private Empresa empresa;
	private Menu menu;
	private Pais pais;
	private int indicadorDisponibleEmpresa;
	
	public Empresa getEmpresa() {
		return empresa;
	}
	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
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
	public int getIndicadorDisponibleEmpresa() {
		return indicadorDisponibleEmpresa;
	}
	public void setIndicadorDisponibleEmpresa(int indicadorDisponibleEmpresa) {
		this.indicadorDisponibleEmpresa = indicadorDisponibleEmpresa;
	}


}
