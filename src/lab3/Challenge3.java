package lab3;

/**
 * This challenge is identical to Lab2 except that in this program 
 * you must use one or more custom exception classes.
 * <p>
 * No input or output should be performed here.
 * 
 * @author  Jim Lombardo, jlombardo@wctc.edu
 * @version 1.00
 */
public class Challenge3 {

    public static void main(String[] args) {
        try{
        new InputOutputGui().startConversation();
        } catch (Exception exception){
            String msg = exception.getMessage();
            System.out.println(msg);
        } 
    }
    
}
