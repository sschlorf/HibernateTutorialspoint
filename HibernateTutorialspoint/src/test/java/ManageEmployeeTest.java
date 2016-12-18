

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class ManageEmployeeTest extends TestCase {
	public ManageEmployeeTest(String testName) {
		super(testName);
	}

	public static Test suite() {
		return new TestSuite(ManageEmployeeTest.class);
	}

	public void addEmployeeTest() {
		assertTrue("Check that an employee is added and those id is delivered", new ManageEmployee().addEmployee("TestEmployee", "TestEmployeeLongName", 10000) > 0);
	}

}
