package Grupo35.ES2;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import junit.framework.TestCase;
import junit.framework.TestSuite;

import Grupo35.ES2.App;
/**
 * Unit test for simple App.
 */
public class AppTest extends TestCase{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
/*    public AppTest( String testName )
    {
        super( testName );
    }
    *//**
     * @return the suite of tests being tested
     *//*
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }
    *//**
     * Rigourous Test :-)
     *//*
    public void testApp()
    {
        assertTrue( true );
    }*/
    
    @BeforeAll
	static void setUpBeforeClass() throws Exception {
		App testApp;
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@Test
	void testSquare() {
		App test=new App();
		int output=test.square(5);
		assertEquals(25, output);
	}

	@Test
	//@Disabled
	@DisplayName("Compare strings")
	void testCompString() {
		App test=new App();
		int output=test.compString("string","string");
		assertEquals(0, output);
	}

	@Test
	void testCountA() {
		App test=new App();
		int output=test.countA("até afuncionou.");
		assertEquals(2, output);
	}
    
}