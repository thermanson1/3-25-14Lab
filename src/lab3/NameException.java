/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lab3;

/**
 *
 * @author Teraesa
 */
public class NameException extends IllegalArgumentException{
    private static String message = "Sorry, the name you entered was not in the correct format";

    public NameException() {
        super(message);
    }

    public NameException(String s) {
        super(message);
    }

    public NameException(String msg, Throwable cause) {
        super(message, cause);
    }

    public NameException(Throwable cause) {
        super(cause);
    }
    

}
