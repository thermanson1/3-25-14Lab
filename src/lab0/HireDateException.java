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
public class HireDateException extends RuntimeException{
    private static String msg;
    public HireDateException() {
        super(msg);
        
    }

    public HireDateException(String message) {
        super(message);
        this.msg = message;
    }

    public HireDateException(String message, Throwable cause) {
        super(message, cause);
        this.msg = message;
    }

    public HireDateException(Throwable cause) {
        super(cause);
    }

   
}
