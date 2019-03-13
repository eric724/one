package sizeyunsuan;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class yunsuanTest {
	yunsuan test=new yunsuan();//声明
	
	@Before
	public void setUp() throws Exception {
		System.out.println("测试开始");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("测试结束");
	}

	@Test
	public void testAdd() {
		int result=test.add(1, 3);//实际结果
		assertEquals(4,result);//4=预期结果
	}

	@Test
	public void testSub() {
		int result=test.sub(10, 2);
		assertEquals(8,result);
	}

	@Test
	public void testCheng() {
		int result=test.cheng(5, 2);
		assertEquals(10,result);
	}

	@Test
	public void testChu() {
		int result=test.chu(4, 1);
		assertEquals(4,result);
	}

}
