package testng;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class NewTest {
	@BeforeGroups(groups="selenium-test")
	public void setup() {
		System.out.println("steup");
	}
	@AfterGroups(groups="selenium-test")
	public void cleandb() {
		System.out.println("cleandb");
	}
  @Test(groups="selenium-test")
  public void runselenium() {
	  System.out.println("runselenium");
  }
  @Test(groups="selenium-test")
  public void runselenium1() {
	  System.out.println("runselenium1");
  }
  @Test(groups = "database")
  public void testconnectoracle() {
	  System.out.println("testconnectoracle");
  }
  @Test(groups = "database")
  public void testconnectmysql() {
	  System.out.println("testconnectmysql");
  }
}
