
package filling;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author Ashad Nadeem
 */
public class Filling {
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
        
        Scanner inFile = new Scanner(new FileReader("employee.txt"));
        String firstName;
        String lastName;
        double hoursWorked;
        double payRate;
        double wages;
        
        firstName = inFile.next();
        lastName = inFile.next();
        hoursWorked = inFile.nextDouble();
        payRate = inFile.nextDouble();
        wages = hoursWorked * payRate;
        
        PrintWriter outFile = new PrintWriter("prog.txt");
        outFile.println("The Paycheck is: $"+ wages);
        outFile.close();
        inFile.close();
    }
    
}
