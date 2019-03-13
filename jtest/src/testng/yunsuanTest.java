package testng;

import org.testng.annotations.Test;

import junit.framework.Assert;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.AfterTest;

public class yunsuanTest {
	yunsuan y=new yunsuan();
  @BeforeClass
  public void beforeClass() {
	  System.out.println("我是beforeclass");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("我是afterclass");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("我是beforetest");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("我是aftertest");
  }


  @Test
  public void add() {
    int result=y.add(5,5);
    Assert.assertEquals(10, result);
  }
  
  @DataProvider(name="test3")
  public Object[][] dataprovider(){
	  return new Object[][] {{2,3},{4,5} ,{6,7}};
  }
  //@Test(dependsOnMethods= {"add"})//add成功后运行cheng
  @Test(dataProvider="test3")
  public void cheng(int a,int b) {
    int result=y.cheng(a,b);
    System.out.println("cheng的结果："+result);
    //Assert.assertEquals(8, result);
  }

  @Test(enabled=false)//忽略测试
  public void chu() {
    int result=y.chu(8, 2);
   // System.out.println(result);
    Assert.assertEquals(4, result);
  }

  @Test
  @Parameters({"test1","test2"})
  public void sub(int test1,int test2) {
    int result=y.sub(test1,test2);
    System.out.println("sub的结果："+result);
    Assert.assertEquals(4, result);
  }
}
