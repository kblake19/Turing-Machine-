import java.io.*;
import java.util.*;

/** This class does all I/O (either to standard input/output or specified
 *  files depending on what is sent the constructor).  It is designed to aid
 *  in the use of command line arguements to specify input/output files.
 *  @author     Cathy Bareiss and Kellen Lake added 
 *  @id         cbareiss
 *  @course     CSIS 252:  Programming II
 *  @assignment Demostration
 *  @related    CountingProblem
 */
public class IOSystem {
    /** used to specify the output location */
    PrintStream out;
    /** used to specify the input location */
    Scanner in;

    /** creates the input and output locations based on parameter
      * @param args - an array of file names - first is input, second is output
      *             - if no elements, use System.in and System.out
      *             - if only one, use System.out for output
      */
    public IOSystem(String[] args) throws IOException {
        if (args.length == 0) { // using standard in and out
            in = new Scanner(System.in);
            out = System.out;
        } else if (args.length == 1) { // using standard out
            in = new Scanner(new FileReader(args[0]));
            out = System.out;
        } else { // using specified files
            in = new Scanner(new FileReader(args[0]));
            out = new PrintStream(args[1]);
        }
    
    }
 
    /** tells if at the end of the input
      * @returns if at the end of the input (^D for standard in)
      */
    public boolean endOfInput() {
        return !in.hasNext();
    }

    /** gets the next number (assumed on line by itself)
      * @returns next integer in the input
      */
    public int getIntLn() throws IOException {
        String dataLine;
        
        dataLine = in.nextLine();
        return Integer.parseInt(dataLine);
    }
 
    /** outputs the string as a separate line
      * @param arg - the string to be outputted
      */
    public void printTape(String arg) {
        out.println(arg);
    }
 
    /** closes both the input and output */
    public void closeAll() {
        out.close();
        in.close();
    }
 
}