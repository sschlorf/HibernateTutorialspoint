
import java.util.Arrays;
import java.util.List;

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

	public void testAddEmployee() {
		assertTrue("Check that an employee is added and those id is delivered", new ManageEmployee().addEmployee("TestEmployee", "TestEmployeeLongName", 10000) > 0);
	}

	public void testListEmployees() {
		assertTrue("Check that employees listed",new ManageEmployee().listEmployees().get(20).getFirstName().startsWith("TestEmployee"));	}

}
