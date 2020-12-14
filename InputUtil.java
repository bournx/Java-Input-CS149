import java.util.Scanner;

/**
 * CS 149 Exercise 4.2 Input Utility.
 *
 * @author Nico Bour 
 */
public class InputUtil {

    /**
     * Displays the given prompt, followed by ": ", and returns the next line of
     * user input. The input is entered on the same line as the prompt.
     *
     * @param in the Scanner to use
     * @param prompt the text to display
     * @return the user's input
     */
    public static String inputLine(Scanner in, String prompt) {
        
        System.out.print(prompt + ": ");
        
        
        
        return in.nextLine();
    }

    /**
     * Displays the given prompt, followed by ": ", and returns the next double
     * from the user. This method automatically consumes the newline character,
     * assuming that the double is the entire next line of input.
     *
     * @param in the Scanner to use
     * @param prompt the text to display
     * @return the user's input
     */
    public static double inputDouble(Scanner in, String prompt) {
    
        System.out.print(prompt + ": ");
        
        
        return in.nextDouble();
    }

    /**
     * Tests the inputLine and inputDouble utility methods.
     *
     * @param args command-line arguments
     */
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        inputDouble(in, "Give me a double");
        in.nextLine();
        System.out.print("You entered: " + in.nextDouble());
        inputLine(in, "Give me a line");
        System.out.println("You entered: " + in.nextLine());
        
    
    }

}
