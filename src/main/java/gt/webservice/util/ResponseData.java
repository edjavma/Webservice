package gt.webservice.util;

public class ResponseData {
	
	private int code;
	private String message;
	private boolean valid;
	
	public ResponseData() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	public ResponseData(int code, String message, boolean valid) {
		super();
		this.code = code;
		this.message = message;
		this.valid = valid;
	}



	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public boolean isValid() {
		return valid;
	}
	public void setValid(boolean valid) {
		this.valid = valid;
	}
	
	

}
