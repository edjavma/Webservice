package gt.webservice.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "AGUA")
public class Agua {
	
	@Id
	@Column(name = "CONTADOR")
	private String contador;
	@Column(name = "VECINO_ASOCIADO")
	private String vecinoAsociado;
	@Column(name = "DIRECCION")
	private String direccion;
	@Column(name = "ACTIVO")
	private boolean activo;
	@Column(name = "DPI")
	private String dpi;
	
	public Agua() {
		// TODO Auto-generated constructor stub
	}
	
	public String getContador() {
		return contador;
	}
	public void setContador(String contador) {
		this.contador = contador;
	}
	public String getVecinoAsociado() {
		return vecinoAsociado;
	}
	public void setVecinoAsociado(String vecinoAsociado) {
		this.vecinoAsociado = vecinoAsociado;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public boolean isActivo() {
		return activo;
	}
	public void setActivo(boolean activo) {
		this.activo = activo;
	}
	public String getDpi() {
		return dpi;
	}
	public void setDpi(String dpi) {
		this.dpi = dpi;
	}
	
	

}
