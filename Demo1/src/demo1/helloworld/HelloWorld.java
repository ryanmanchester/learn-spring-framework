package demo1.helloworld;

public class HelloWorld {
	private String message;
	
	public HelloWorld(String message) {
		this.message = message;
	}
	
	public String getMessage() {
		return message;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 HelloWorld hw = new HelloWorld("Hello World");
		 String msg = hw.getMessage();
		 System.out.println(msg);
	}

}
