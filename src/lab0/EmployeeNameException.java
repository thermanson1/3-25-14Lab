/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lab0;

/**
 *
 * @author Teraesa
 */
public class EmployeeNameException extends IllegalArgumentException{
    private static String message = "Sorry, invalid entry for first name";

    public EmployeeNameException() {
        super(message);
    }

    public EmployeeNameException(String s) {
        super(message);
    }

    public EmployeeNameException(String msg, Throwable cause) {
        super(message, cause);
    }

    public EmployeeNameException(Throwable cause) {
        super(cause);
    }
    
    
    
}
