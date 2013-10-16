package lab3;
import java.lang.ArrayIndexOutOfBoundsException;

/**
 * This class provides various services relating to name manipulation.
 * No output should be performed here.
 * 
 * @author  Jim Lombardo, jlombardo@wctc.edu
 * @version 1.00
 */
public class NameService{
    private static final int FIRST_NAME_IDX = 0;
    private static final int LAST_NAME_IDX = 1;
    
    /**
     * Finds and returns the last name from within a full name. Caution: 
     * No validation is performed.
     * 
     * @param fullName - a name containing a first name and a last name
     * @return the last name
     */
    public String extractLastName(String fullName) throws MyException{
        if (fullName == null || fullName.length() == 0){
            throw new IllegalArgumentException("Please enter First and Last Name with a space in between");
        }
        String[] nameParts = fullName.split(" ");
        return nameParts[nameParts.length - 1];
    }

    
    /**
     * Finds and returns the first name from within a full name. Caution: 
     * No validation is performed.
     * 
     * @param fullName - a name containing a first name and a last name
     * @return the first name
     */
    public String extractFirstName(String fullName) throws MyException{
        String[] nameParts = fullName.split(" ");
        if (nameParts.length != FIRST_NAME_IDX + 1){
            throw new MyException("Please Enter Your First and Last Name as Follows (FirstName LastName)");
        }
        return nameParts[FIRST_NAME_IDX];
    }

    /**
     * Gets the length of a name.
     * 
     * @param name - any full name or part of a name.
     * @return the length of the name or part.
     */
    public int getNameLength(String name) {
        return name.length();
    }
    
}
