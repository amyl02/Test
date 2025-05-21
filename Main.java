
/**
 * Klasse Main.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */

public class Main
{
    public static void main(String args[])
    {
        int obereGrenze = 100;
        int mult = 1;
        
        for (int i = 1; i <= obereGrenze; i++)
        {
            mult *= i;
        }
        
        System.out.print("Mult = " + mult);
    }
}
