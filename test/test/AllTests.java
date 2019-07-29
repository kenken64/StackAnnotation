package test;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;


public class AllTests extends TestCase {

	public static Test suite() {
		TestSuite suite = new TestSuite("Test for default package");
		System.out.println ("Test for default package");
		//$JUnit-BEGIN$
		suite.addTestSuite(MyStringStackTest.class);
		//$JUnit-END$
		return suite;
	}

}
