/*
 *  @(#)Test_ShannonsTheorem.java	Feb 17, 2005
 *
 *
 *  This software contains confidential and proprietary information
 *  of Dyer Consulting ("Confidential Information").  You shall not disclose
 *  such Confidential Information and shall use it only in accordance with the
 *  terms of the license agreement you entered into with Dyer Consulting.
 *
 *  This software is provided "AS IS,".  No warrantee of any kind, express
 *  or implied, is included with this software; use at your own risk, responsibility
 *  for damages (if any) to anyone resulting from the use of this software rests
 *  entirely with the user even if Dyer Consulting has been advised of the
 *  possibility of such damages.
 *
 *  This software is not designed or intended for use in on-line control of
 *  aircraft, air traffic, aircraft navigation or aircraft communications; or in
 *  the design, construction, operation or maintenance of any nuclear
 *  facility. Licensee represents and warrants that it will not use or
 *  redistribute the Software for such purposes.
 *
 *  Distribute freely, except: don't remove my name from the source or
 *  documentation, mark your changes (don't blame me for your possible bugs),
 *  don't alter or remove any of this notice.
 *
 */

package networktest;

import org.junit.Test;

import junit.framework.*;
import network.ShannonsTheorem;


/**
 *	JUnit tests for the ShannonsTheorem class from the "network" project.
 * @author Jean Ko
 * @version 1.0.0
 */
public class Test_ShannonsTheorem extends TestCase {


	/**
	 * @param name 
	 */
	public Test_ShannonsTheorem(String name) { super(name);	}

	/**
	 * @return object it self.
	 */
	public static TestSuite suite() { return new TestSuite(Test_ShannonsTheorem.class);		}

	@Override
	protected void setUp() throws Exception { System.out.println("Test_ShannonsTheorem Begin");	}

	@Override
	protected void tearDown() throws Exception { System.out.println("Test_ShannonsTheorem End");	}

	/**
	 * Test the constructors.
	 */
    @Test
	public void testConstructors() {
		System.out.println("\tExecuting Test_ShannonsTheorem.testConstructors");
		shannonsTheorem = new ShannonsTheorem();
		assertNotNull("\t\tTest_ShannonsTheorem.testConstructors: ShannonsTheorem is null", shannonsTheorem);

		shannonsTheorem = new ShannonsTheorem(34000000, 0.2);
		assertNotNull("\t\tTest_ShannonsTheorem.testConstructors1: ShannonsTheorem is null", shannonsTheorem);

		shannonsTheorem = new ShannonsTheorem(340.0000000, -0.2);
		assertNotNull("\t\tTest_ShannonsTheorem.testConstructors2: ShannonsTheorem is null", shannonsTheorem);

		shannonsTheorem = new ShannonsTheorem(34000000.3452123, 0.2);
		assertNotNull("\t\tTest_ShannonsTheorem.testConstructors3: ShannonsTheorem is null", shannonsTheorem);

		shannonsTheorem = new ShannonsTheorem(-4938.29839, 0.2);
		assertNotNull("\t\tTest_ShannonsTheorem.testConstructors4: ShannonsTheorem is null", shannonsTheorem);

        shannonsTheorem = new ShannonsTheorem(12345, 3745);
		assertNotNull("\t\tTest_ShannonsTheorem.testConstructors5: ShannonsTheorem is not null", shannonsTheorem);

        shannonsTheorem = new ShannonsTheorem(0, 3745);
		assertNotNull("\t\tTest_ShannonsTheorem.testConstructors6: ShannonsTheorem is not null", shannonsTheorem);

        shannonsTheorem = new ShannonsTheorem(34000000, 0);
		assertNotNull("\t\tTest_ShannonsTheorem.testConstructors7: ShannonsTheorem is not null", shannonsTheorem);

        shannonsTheorem = new ShannonsTheorem(34000000, -0.2);
		assertNotNull("\t\tTest_ShannonsTheorem.testConstructors8: ShannonsTheorem is not null", shannonsTheorem);

        shannonsTheorem = new ShannonsTheorem(0.723, -0.2);
		assertNotNull("\t\tTest_ShannonsTheorem.testConstructors9: ShannonsTheorem is not null", shannonsTheorem);



        System.out.println(shannonsTheorem);
	}


	/**
	 * Test the accessors.
	 */
    @Test
	public void testAccessors() {
		System.out.println("\tExecuting Test_ShannonsTheorem.testAccessors");
		shannonsTheorem = new ShannonsTheorem(34000000, 0.2);
		assertNotNull("\t\tTest_ShannonsTheorem.testAccessors: ShannonsTheorem is null", shannonsTheorem);

        assertEquals(34000000.0,shannonsTheorem.getBandwidth());
        assertEquals(0.2,shannonsTheorem.getSignalToNoise());

        assertTrue(34000000 == shannonsTheorem.getBandwidth());
        assertTrue(0.2000000 == shannonsTheorem.getSignalToNoise());

        assertTrue(-34000000.0 != shannonsTheorem.getBandwidth());
        assertTrue(0.2 == shannonsTheorem.getSignalToNoise());

        assertTrue(0.2 != shannonsTheorem.getBandwidth());
        assertTrue(34000000.0 != shannonsTheorem.getSignalToNoise());
	}


	/**
	 * Test the mutators/modifiers.
	 */
    @Test
	public void testMutators() {
		System.out.println("\tExecuting Test_ShannonsTheorem.testAccessors");
		shannonsTheorem = new ShannonsTheorem(34000000, 0.2);
		assertNotNull("\t\tTest_ShannonsTheorem.testAccessors: ShannonsTheorem is null", shannonsTheorem);

        shannonsTheorem.setBandwidth(233363);
        shannonsTheorem.setSignalToNoise(0.7);
        assertEquals(233363.0,shannonsTheorem.getBandwidth());
        assertEquals(0.7,shannonsTheorem.getSignalToNoise());
        System.out.println(shannonsTheorem);

        shannonsTheorem.setBandwidth(-2345555);
        shannonsTheorem.setSignalToNoise(-0.7);
        assertTrue(-233363.0 != shannonsTheorem.getBandwidth());
        System.out.println(shannonsTheorem.getSignalToNoise());
        assertTrue(0.0 == shannonsTheorem.getSignalToNoise());

        System.out.println(shannonsTheorem);
	}

	/**
	 * Test behaviors
	 * If the getMaximumDataRate calculate and return correct answer.
	 */
    @Test
	public void testBehaviors() {
		System.out.println("\tExecuting Test_ShannonsTheorem.testBehaviors");
		shannonsTheorem = new ShannonsTheorem();
		assertNotNull("\t\tTest_ShannonsTheorem.testBehaviors: ShannonsTheorem is null", shannonsTheorem);

        shannonsTheorem.setBandwidth(233363);
        shannonsTheorem.setSignalToNoise(0.7);
        double myMax = 178647.48501550342;
        System.out.println("!!!____________");
        System.out.println(shannonsTheorem.getMaximumDataRate());
        System.out.println(myMax == shannonsTheorem.getMaximumDataRate());
        assertEquals(myMax, shannonsTheorem.getMaximumDataRate());
        assertTrue(178647.4850 < shannonsTheorem.getMaximumDataRate());
        assertTrue(178647.4851 > shannonsTheorem.getMaximumDataRate());

        /* or */
        assertEquals(178647.48501550342, shannonsTheorem.getMaximumDataRate());
        
	}



//	/*	STAND-ALONE ENTRY POINT -----------------------------------------	*/
//	/**
//	 *	Main line for standalone operation.
//	 *	@param	args	Standard string command line parameters.
//	 */
//	public static void main(String[] args) {
//		System.out.println("Executing Test_ShannonsTheorem suite");
//		junit.textui.TestRunner.run(suite());
//	}
//
//

	/* ATTRIBUTES	-----------------------------------------------	*/
	private ShannonsTheorem shannonsTheorem = null;


}	/*	End of CLASS:	Test_ShannonsTheorem.java				*/
