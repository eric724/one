package sizeyunsuan;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class demo1Test {
	demo1 de=new demo1();
	@Before
	public void setUp() throws Exception {
		System.out.println("��ʼ");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("����");
	}

	@Test
	public void testSeven() {
		String result=de.seven(14);
		assertEquals("a���Ա�7����",result);
	}

	@Test
	public void testTen() {
		String result=de.seven(25);
		assertEquals("a�����Ա�10����",result);
	}

}
