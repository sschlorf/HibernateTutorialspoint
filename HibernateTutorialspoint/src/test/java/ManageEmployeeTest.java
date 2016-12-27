
import java.util.List;

import org.junit.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import static org.hamcrest.CoreMatchers.allOf;
import static org.hamcrest.CoreMatchers.anyOf;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.CoreMatchers.sameInstance;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;
import org.hamcrest.core.CombinableMatcher;

public class ManageEmployeeTest {
	@Test
	public void testAddEmployee() {
		assertTrue("Check that an employee is added and those id is delivered", new ManageEmployee().addEmployee("TestEmployee", "TestEmployeeLongName", 10000) > 0);
	}

	@Test
	public void testAssertArrayEquals() {
		byte[] expected = "trial".getBytes();
		byte[] actual = "trial".getBytes();
		assertArrayEquals("failure - byte arrays not same", expected, actual);
	}

	@Test
	public void testListEmployees() {
		List<Employee> l = new ManageEmployee().listEmployees();
		assertTrue("Check that employees list size is greater than zero", l.size() > 0);
		assertTrue("Check that the first name of the employee last inserted has a length greater than zero", l.get(l.size() - 1).getFirstName().length() > 0);
		assertTrue("This test is created only to check the integration of the test branch back to the base branch", true);
		assertTrue("now I locally merged the testbranch with the master and discovered, that my repository in github didn't recognizes this", true);
	}
}
