package assertionStudy;

import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Demo {
 
  public void f() {
	  
	  String actual="test";
	  String expected="test1";
	  
//	  if(actual.equals(expected))
//	  {
//		  System.out.println("Tc passed");
//	  }
//	  else
//	  {
//		  System.out.println("TC failed");
//	  }
	  
	  
	  AssertJUnit.assertEquals(actual, expected,"TC failed");
  }
  
  @Test
  public void ac()
  {
	  System.out.println("Hi");
  }
  @Test
  public void as()
  {
	  System.out.println("Hello");
  }
  @Test
  public void ad()
  {
	  System.out.println("welcome ");
	  
  }
  @Test
  public void  a()
  {
	  String actual="test";
	  String expected="test1";
	  
	  Assert.assertNotEquals(actual, expected);
	  Assert.assertNotNull(expected);
	  Assert.assertNull(actual);
	  
  }
  @Test
  public void test()
  {
	  	  boolean result=true;
	  	  AssertJUnit.assertTrue(result);
	  	  AssertJUnit.assertFalse(result);
	  	  Assert.fail();
  }
  
  
  
}
