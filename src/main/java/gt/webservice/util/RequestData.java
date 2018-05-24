package gt.webservice.util;

public class RequestData {
	
	private String numeroTarjeta;
	private String fechaExp;
	private String codigoSeguridad;
	private String monto;
	private String dpi;
	
	public RequestData() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	public RequestData(String numeroTarjeta, String fechaExp, String codigoSeguridad, String monto, String dpi) {
		super();
		this.numeroTarjeta = numeroTarjeta;
		this.fechaExp = fechaExp;
		this.codigoSeguridad = codigoSeguridad;
		this.monto = monto;
		this.dpi = dpi;
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
	public String getFechaExp() {
		return fechaExp;
	}
	public void setFechaExp(String fechaExp) {
		this.fechaExp = fechaExp;
	}
	public String getCodigoSeguridad() {
		return codigoSeguridad;
	}
	public void setCodigoSeguridad(String codigoSeguridad) {
		this.codigoSeguridad = codigoSeguridad;
	}
	public String getMonto() {
		return monto;
	}
	public void setMonto(String monto) {
		this.monto = monto;
	}
	
	

}
