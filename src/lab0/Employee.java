package lab0;

import java.util.Calendar;
import java.util.Date;

/**
 * In this challenge you need to address the probability that at some
 * point the arguments to method parameters may not be valid. 
 * <p>
 * For example, String arguments may be null or empty; other objects may be 
 * null; or primitive numbers may be out of acceptable range.
 * <p>
 * You need to validate ALL method parameters to make sure any and all 
 * arguments are valid. The only exception is when any argument is acceptable 
 * based on requirements. Fix the code below using if logic to validate
 * method arguments and throw IllegalArgumentException or a custom
 * exception if the validation fails.
 * 
 * @author  Jim Lombardo, jlombardo@wctc.edu
 * @version 1.00
 */
public class Employee {
    public static final int MAX_VACATION_DAYS = 28;
    private String firstName;
    private String lastName;
    private String ssn;
    private Date hireDate;
    private int daysVacation;

    public Employee() {
        firstName = "Unknown";
        lastName = "Unknown";
        ssn = "Unknown";
        hireDate = new Date();
        daysVacation = 0;
    }

    public Employee(String firstName, String lastName, String ssn, Date hireDate, int daysVacation) throws IllegalArgumentException {
        setFirstName(firstName);
        setLastName(lastName);
        setSsn(ssn);
        this.hireDate = hireDate;
        this.daysVacation = daysVacation;
    }
    
    public int getDaysVacation() {
        return daysVacation;
    }
    //cannot be less than zero and cannot be greater than 15
    public void setDaysVacation(int daysVacation) throws IllegalArgumentException{
        if (daysVacation < 0 || daysVacation > 15){
            throw new EmployeeNumericRangeException();
        }
        this.daysVacation = daysVacation;
    }

    public String getFirstName() {
        return firstName;
    }
    //cannot be null, cannot be empty, cannot be less than 1 character or more than 25
    //any character or number is allowed
    public final void setFirstName(String firstName) throws IllegalArgumentException{
        if(firstName == null || firstName.length() < 1 || firstName.length() > 25){
            throw new EmployeeNameException();
        }
       
        this.firstName = firstName;
    }

    public Date getHireDate() {
        return hireDate;
    }
    //cannot be null, can't be earlier than 14 days or later than 5 days from today
    public void setHireDate(Date hireDate) throws HireDateException{
        if (hireDate == null ){
            throw new HireDateException("Hire date cannot be null");
        }
        Calendar calHireDate = Calendar.getInstance();
        calHireDate.setTime(hireDate);
        Calendar beforeDate = Calendar.getInstance();
        beforeDate.add(Calendar.DATE, -14);
        Calendar afterDate = Calendar.getInstance();
        afterDate.add(Calendar.DATE, 5);
        
        if (calHireDate.before(beforeDate) || calHireDate.after(afterDate)){
            throw new HireDateException("Hire date cannot be 14 days before the current"
                    + "date, or 5 days after the current date.");
        }
        
        this.hireDate = hireDate;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        
        this.lastName = lastName;
    }

    public final String getSsn() {
        return ssn;
    }

    // 333-33-3333
    // 333333333
    //
    public void setSsn(String ssn) {
        ssn = ssn.replaceAll("-", "");
         char[] chars = ssn.toCharArray();
         
         for (char c : chars){
             if (!Character.isDigit(c)){
                 throw new IllegalArgumentException("Sorry, ssn's.....");
             }
         }
        this.ssn = ssn;
    }
    
    
    
}
