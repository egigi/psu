import java.lang.Math; 
import java.util.Random;

/**
 * La classe PSU rappresenta il "Power Supply 9V"
 *
 * @author Luigi D'Alessio
 * @version 15/12/2018
 */
public class PSU
{
    // instance variables - replace the example below with your own
    private String PartNumber, Description, SerialNumber;
    private boolean PowerState;
    
    /**
     * Constructor for objects of class PSU
     */
    public PSU()
    { 
        PartNumber = "PSU9V";
        Description = "Power Supply 9 Volt";

        Random r = new Random();
        SerialNumber = "X" + r.nextInt((987 - 123) + 1) + 123;
    }

    /**
     * Ritona il Part Number del PSU 
     */    
    public String getPartNumber()
    {
        return PartNumber;
    }

    /**
     * Ritona la Descrizione del Power Supply 
     */    
    public String getDescription()
    {
        return Description;
    }
        
    /**
     * Ritona il Serial Number del PSU 
     */        
    public String getSerialNumber()
    {
        return SerialNumber;
    }

    
    /**
     * Indica lo stato ON|OFF del Power Supply
     */
    public boolean getPowerState(){
        return PowerState;
    }
    
    /**
     * Setlo stato ON|OFF del Power Supply
     */    
    public void setPowerState(boolean state){
        PowerState = state;
    }    
    
    /**
     * Power Supply self Test
     */    
    public String voltageSelfTest(double volt)
    {
        if (volt >= 8.5 && volt <= 9.5){
            return "Pass";
        } else return "Fail";
    }

    /**
     * Return a random Voltage to simulate a Fail during the "Automait Test"
     */    
    public double getVoltage(){
    
        double lowLimit = 3D;
        double upLimit = 12D;
        return lowLimit + Math.random() * (upLimit - lowLimit);
    }
}
