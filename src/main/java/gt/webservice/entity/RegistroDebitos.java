package gt.webservice.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "REGISTRO_DEBITOS")
public class RegistroDebitos {
	
	@Id
	@SequenceGenerator(name = "bSequence", allocationSize = 1, sequenceName = "SEQ_REGISTRO_DEBITOS")
	@GeneratedValue(generator = "bSequence", strategy = GenerationType.SEQUENCE)
	@Column(name = "CORRELATIVO")
	private Long correlativo;
	
	@Column(name = "DPI")
	private String dpi;
	
	@Column(name = "NUMERO_TARJETA")
	private String numeroTarjeta;
	
	
	@Column(name = "FECHA_REGISTRO")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fechaRegistro;
	
	@Column(name = "MONTO")
	private Double monto;
	
	public RegistroDebitos() {
		// TODO Auto-generated constructor stub
	}

	public Long getCorrelativo() {
		return correlativo;
	}

	public void setCorrelativo(Long correlativo) {
		this.correlativo = correlativo;
	}

	public String getDpi() {
		return dpi;
	}

	public void setDpi(String dpi) {
		this.dpi = dpi;
	}

	public String getNumeroTarjeta() {
		return numeroTarjeta;
	}

	public void setNumeroTarjeta(String numeroTarjeta) {
		this.numeroTarjeta = numeroTarjeta;
	}

	public Date getFechaRegistro() {
		return fechaRegistro;
	}

	public void setFechaRegistro(Date fechaRegistro) {
		this.fechaRegistro = fechaRegistro;
	}

	public Double getMonto() {
		return monto;
	}

	public void setMonto(Double monto) {
		this.monto = monto;
	}
	
	
	

}
