package artemisa.domain.sistema.entities;

import java.io.Serializable;

/**
 * @author Jossymar Cabanillas
 *
 */
public class MenuCatalogo extends Generica implements Serializable{

	private static final long serialVersionUID = 5556376267801959924L;
	public MenuCatalogo() {
	}
	
	private Menu menu; 
	private SubMenu subMenu;
	private String archivoIconoOn;
	private String archivoIconoOff;
	private int Componente;
	private String colorFondo;
	private String colorTexto;
	private String urlOpcionMenu;
	private Pais pais;
	private TipoMenu tipoMenu;
	private TipoComponente tipoComponente;
	
	public Menu getMenu() {
		return menu;
	}
	public void setMenu(Menu menu) {
		this.menu = menu;
	}
	public SubMenu getSubMenu() {
		return subMenu;
	}
	public void setSubMenu(SubMenu subMenu) {
		this.subMenu = subMenu;
	}
	public String getArchivoIconoOn() {
		return archivoIconoOn;
	}
	public void setArchivoIconoOn(String archivoIconoOn) {
		this.archivoIconoOn = archivoIconoOn;
	}
	public String getArchivoIconoOff() {
		return archivoIconoOff;
	}
	public void setArchivoIconoOff(String archivoIconoOff) {
		this.archivoIconoOff = archivoIconoOff;
	}
	public int getComponente() {
		return Componente;
	}
	public void setComponente(int componente) {
		Componente = componente;
	}
	public String getColorFondo() {
		return colorFondo;
	}
	public void setColorFondo(String colorFondo) {
		this.colorFondo = colorFondo;
	}
	public String getColorTexto() {
		return colorTexto;
	}
	public void setColorTexto(String colorTexto) {
		this.colorTexto = colorTexto;
	}
	public String getUrlOpcionMenu() {
		return urlOpcionMenu;
	}
	public void setUrlOpcionMenu(String urlOpcionMenu) {
		this.urlOpcionMenu = urlOpcionMenu;
	}
	public Pais getPais() {
		return pais;
	}
	public void setPais(Pais pais) {
		this.pais = pais;
	}
	public TipoMenu getTipoMenu() {
		return tipoMenu;
	}
	public void setTipoMenu(TipoMenu tipoMenu) {
		this.tipoMenu = tipoMenu;
	}
	public TipoComponente getTipoComponente() {
		return tipoComponente;
	}
	public void setTipoComponente(TipoComponente tipoComponente) {
		this.tipoComponente = tipoComponente;
	}
	

}
