package sizeyunsuan;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class yunsuanTest {
	yunsuan test=new yunsuan();//����
	
	@Before
	public void setUp() throws Exception {
		System.out.println("���Կ�ʼ");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("���Խ���");
	}

	@Test
	public void testAdd() {
		int result=test.add(1, 3);//ʵ�ʽ��
		assertEquals(4,result);//4=Ԥ�ڽ��
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
