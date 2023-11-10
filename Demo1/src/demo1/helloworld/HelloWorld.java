package demo1.helloworld;

import java.util.Arrays;
import java.util.List;

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
		 
		 final List<Integer> prices = Arrays.asList(10, 30, 17, 20, 18, 45, 12);
		 final double totalDiscounts = 
				 prices.stream()
				 	   .filter(price -> price > 20)
				 	   .mapToDouble(price -> price * 0.9)
				 	   .sum();
		 System.out.println("Discount total: " +totalDiscounts);
	}

}
