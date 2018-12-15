import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class PSU_Test.
 *
 * @author  Luigi D'Alessio
 * @version 15/12/2018
 */
public class PSU_Test
{
    /**
     * Default constructor for test class psuTest
     */
    
    PSU psu;
    
    public PSU_Test()
    {
       
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
        System.out.println("Crea un nuovo psu");
        psu = new PSU();       
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
        System.out.println("Nullify the psu.");
        psu = null;
    }

    
    /**
     * Mi assicuro che il PartNumber
     * sia uguale a quanto desiderato
     */
    @Test
    public void assertPartNumberIsCorrect()
    {
        assertEquals("PSU9V", psu.getPartNumber());
    }

    /**
     * Mi assicuro che la Descrizione
     * sia uguale a quanto desiderato
     */
    @Test
    public void assertDescription()
    {
        assertEquals("Power Supply 9 Volt", psu.getDescription());
    }
    
    /**
     * Mi assicuro che il Serial Number
     * è farmato da una lettera e 6 cifre
     */
    @Test
    public void assertSerialNumber()
    {

        psu.getSerialNumber().matches("^[A-Z]{1}[0-9]{6,6}$");
        
    }
    

    /**
     * Mi assicuro che la funzione voltageSelfTest 
     * dia risultati Pass se nei limiti di specifica 
     * dia risultati Fail se fuori dai limiti
     */
    @Test
    public void assertVoltageSelfTestLimits()
    {
        // in specs
        assertEquals("Pass", psu.voltageSelfTest(8.5));
        assertEquals("Pass", psu.voltageSelfTest(9.0));
        assertEquals("Pass", psu.voltageSelfTest(9.5));
        
        // out of specs
        assertEquals("Fail", psu.voltageSelfTest(8.49));
        assertEquals("Fail", psu.voltageSelfTest(9.51));
    }
    
    /**
     * Accendo e spengo il PowerSupply per verificare lo stato
     */
    @Test
    public void checkPowerSupplyStatus(){
    
        boolean ON = true;
        boolean OFF = false;
        
        // Power ON
        psu.setPowerState(ON);
        assertEquals(ON, psu.getPowerState());
        
        // Power OFF
        psu.setPowerState(OFF);
        assertEquals(OFF, psu.getPowerState());
        
    }

    
}

