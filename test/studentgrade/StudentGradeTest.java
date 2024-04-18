package studentgrade;

import junit.framework.TestCase;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
/* JUnit 3.8.1 */
public class StudentGradeTest extends TestCase {
    
    public StudentGradeTest(String testName) {
        super(testName);
    }
    
        @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of GetGrade95 method, of class add.
     */
    @Test
    public void testGetGrade95() {
        System.out.println("getGrade 95");
        int mark = 95;
        String expResult = "A";
        String result = StudentGrade.getGrade(mark);
        assertEquals(expResult, result);
    }

    /**
     * Test of GetGrade85 method, of class add.
     */
    @Test
    public void testGetGrade85() {
        System.out.println("getGrade 85");
        int mark = 85;
        String expResult = "B";
        String result = StudentGrade.getGrade(mark);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of GetGrade75 method, of class add.
     */
    @Test
    public void testGetGrade75() {
        System.out.println("getGrade 85");
        int mark = 75;
        String expResult = "F";
        String result = StudentGrade.getGrade(mark);
        assertEquals(expResult, result);
    }
}
