
/**
 * Write a description of class PSU_Tester here.
 *
 * @author Luigi D'Alessio
 * @version 15/12/2018
 */
public class PSU_Tester
{
    // instance variables - replace the example below with your own
    private PSU psu;
    private boolean ON = true;
    private boolean OFF = false;

    /**
     * Constructor for objects of class PSU_Tester
     */
    public PSU_Tester()
    {
        psu = new PSU();
        psu.setPowerState(ON);
    }

    public void voltageTest()
    {
        double volt;
        volt = psu.getVoltage();
                
        if (volt >= 8.5 && volt <= 9.5){
            System.out.println("PSU " + psu.getSerialNumber() +  " PASS");
            System.out.println("Read voltage is = " + volt);
            System.out.println("Expacted voltage is from 8.5V to 9.5V");
            System.out.println("*************************************");
        }  else {
            System.out.println("PSU " + psu.getSerialNumber() +  " FAIL");
            System.out.println("Read voltage is = " + volt);
            System.out.println("Expacted voltage is from 8.5V to 9.5V");
            System.out.println("*************************************");
        }
    }    
}
