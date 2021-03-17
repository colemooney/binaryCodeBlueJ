import java.util.Scanner;
import javax.swing.JOptionPane; 

public class ExtraCreditBinaryCode
{
  public static void main(String[] arg)
  {
    
    //CONSTANTS
    
    //VARIABLES
    String binaryCode;
    String space = " ";

    //OBJECTS
    Scanner keyboardInput = new Scanner(System.in);
    
    //SOLUTION
    CS170.information("Cole Mooney", "Extra Credit", "Binary Code");
       
    //KEYBOARD INPUT
    //Input
    binaryCode = JOptionPane.showInputDialog("Input Binary Code: ");
        
    //Binary Code Size
    System.out.println("Size of Binary: " + binaryCode.length() );
     
    
    //Modifying Binary Code
    for( int a = 1; a < binaryCode.length(); a++ )
    {
        char ch = binaryCode.charAt(a);
        if(ch == ' ')
        {
            String before = binaryCode.substring(0,a);
            String after = binaryCode.substring(a + 1);
            binaryCode = before + after;
        }
    }
    
    //Modified Binary Code
    System.out.println("Modified code: " + binaryCode);
    System.out.println("Number of Characters in modified code: " + binaryCode.length());
     
    keyboardInput.close();
    
    }
}

