package artemisa.domain.sistema.entities;

import java.io.Serializable;

/**
 * @author Jossymar Cabanillas
 *
 */
public class Politica extends Generica implements Serializable {

	private static final long serialVersionUID = -6131793827440156432L;
	public Politica() {
	}
	
	private TipoPolitica tipoPolitica; 
	private String descripcion; 
	private Pais pais; 
	private String dato01; 
	private String dato02; 
	private String dato03; 
	private String dato04; 
	private String dato05; 
	private int codigoGrupo; 
	private int tipoDato01; 
	private int tipoDato02; 
	private int tipoDato03; 
	private int tipoDato04; 
	private int tipoDato05; 
	private String valor01; 
	private String valor02; 
	private String valor03; 
	private String valor04; 
	private String valor05; 
	
	public TipoPolitica getTipoPolitica() {
		return tipoPolitica;
	}
	public void setTipoPolitica(TipoPolitica tipoPolitica) {
		this.tipoPolitica = tipoPolitica;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public Pais getPais() {
		return pais;
	}
	public void setPais(Pais pais) {
		this.pais = pais;
	}
	public String getDato01() {
		return dato01;
	}
	public void setDato01(String dato01) {
		this.dato01 = dato01;
	}
	public String getDato02() {
		return dato02;
	}
	public void setDato02(String dato02) {
		this.dato02 = dato02;
	}
	public String getDato03() {
		return dato03;
	}
	public void setDato03(String dato03) {
		this.dato03 = dato03;
	}
	public String getDato04() {
		return dato04;
	}
	public void setDato04(String dato04) {
		this.dato04 = dato04;
	}
	public String getDato05() {
		return dato05;
	}
	public void setDato05(String dato05) {
		this.dato05 = dato05;
	}
	public int getCodigoGrupo() {
		return codigoGrupo;
	}
	public void setCodigoGrupo(int codigoGrupo) {
		this.codigoGrupo = codigoGrupo;
	}
	public int getTipoDato01() {
		return tipoDato01;
	}
	public void setTipoDato01(int tipoDato01) {
		this.tipoDato01 = tipoDato01;
	}
	public int getTipoDato02() {
		return tipoDato02;
	}
	public void setTipoDato02(int tipoDato02) {
		this.tipoDato02 = tipoDato02;
	}
	public int getTipoDato03() {
		return tipoDato03;
	}
	public void setTipoDato03(int tipoDato03) {
		this.tipoDato03 = tipoDato03;
	}
	public int getTipoDato04() {
		return tipoDato04;
	}
	public void setTipoDato04(int tipoDato04) {
		this.tipoDato04 = tipoDato04;
	}
	public int getTipoDato05() {
		return tipoDato05;
	}
	public void setTipoDato05(int tipoDato05) {
		this.tipoDato05 = tipoDato05;
	}
	public String getValor01() {
		return valor01;
	}
	public void setValor01(String valor01) {
		this.valor01 = valor01;
	}
	public String getValor02() {
		return valor02;
	}
	public void setValor02(String valor02) {
		this.valor02 = valor02;
	}
	public String getValor03() {
		return valor03;
	}
	public void setValor03(String valor03) {
		this.valor03 = valor03;
	}
	public String getValor04() {
		return valor04;
	}
	public void setValor04(String valor04) {
		this.valor04 = valor04;
	}
	public String getValor05() {
		return valor05;
	}
	public void setValor05(String valor05) {
		this.valor05 = valor05;
	}
	

}
