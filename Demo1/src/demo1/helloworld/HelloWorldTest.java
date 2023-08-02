package demo1.helloworld;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;




public class HelloWorldTest {

	@Test
	public void test() {
		HelloWorld hw = new HelloWorld("Hello Wolrd");
		Assert.assertEquals(hw.getMessage(), "Hello Wolrd");
	}

}
