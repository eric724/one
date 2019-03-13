package testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class demo1Test {
	demo1 d=new demo1();
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


  @Test(dependsOnMethods= {"ten"})
  public void seven() {
    String result=d.seven(14);
    //System.out.println(result);
    Assert.assertEquals("a可以被7整除", result);
  }

  @Test
  public void ten() {
    String result=d.ten(20);
   // System.out.println(result);
    Assert.assertEquals("a可以被10整除", result);
    //Assert.assertNull(result);
  }
}
