/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lab1;

/**
 *
 * @author Teraesa
 */
public class LastNameException extends IllegalArgumentException{
    private static String message = "Sorry, the name you entered is not in the correct format";

    public LastNameException() {
        super(message);
    }

    public LastNameException(String s) {
        super(message);
    }

    public LastNameException(String msg, Throwable cause) {
        super(message, cause);
    }

    public LastNameException(Throwable cause) {
        super(cause);
    }
    
    
}
