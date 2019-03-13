package sizeyunsuan;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class demo1Test {
	demo1 de=new demo1();
	@Before
	public void setUp() throws Exception {
		System.out.println("开始");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("结束");
	}

	@Test
	public void testSeven() {
		String result=de.seven(14);
		assertEquals("a可以被7整除",result);
	}

	@Test
	public void testTen() {
		String result=de.seven(25);
		assertEquals("a不可以被10整除",result);
	}

}
