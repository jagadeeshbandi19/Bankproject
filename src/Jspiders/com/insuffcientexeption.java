package Jspiders.com;

public class insuffcientexeption extends RuntimeException {
	private String message;

	public insuffcientexeption(String message) {
		super();
	
		this.message = message;
	}
	
public String getmessage() {
	return message;
}
}

