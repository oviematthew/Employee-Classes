/**
 * 
 * @author Matthew Ovie Enamuotor
 * @since August 15th 2023
 * @version 1.1
 * This abstract class implements a employees pay structure
 */

public abstract class Employee {

    /**
     * Constants
     */
    public static final double EI_RATE = 0.0188;
    public static final double CPP_RATE = 0.0495;
    public static final double TAX_RATE = 0.2;
    public static final double RSP_RATE = 0.04;


    /**
     * Instance variables
     */
    private String level;
    private String first;
    private String last;
    private String empNum;


    /** 3-arg constructor
     * @param level
     * @param first
     * @param last
     */
    public Employee(String level, String first, String last)
    {
        this.level = level;
        this.first = first;
        this.last = last;
        setEmpNum();
    }


    
    /** Getter method to get the level from instance variables
     * @return a string
     */
    public String getLevel() {
        return this.level;
    }

    /** Setter method to set the employee level from instance variables
     * @param level
     */
    public void setLevel(String level) {
        this.level = level;
    }


    /** Getter method to get the first name from instance variables
     * @return a string
     */
    public String getFirst() {
        return this.first;
    }

    /** Setter method to set the first name of an employee
     * @param first
     */
    public void setFirst(String first) {
        this.first = first;
    }


    /**Getter method to get the last name from instance variables
     * @return a string
     */
    public String getLast() {
        return this.last;
    }


    /** Setter method to set the last name of an employee
     * @param last
     */
    public void setLast(String last) {
        this.last = last;
    }


    /**Method to get the employee number
     * @return a string
     */
    public String getEmpNum() {
        return this.empNum;
    }

    /**
     *  method to create the employee number
     */
    private void setEmpNum() {
        
        // First part based on employee level
        String levelPart = "";
        if(level.equals("Supervisor"))
        {
            levelPart = "SPR";
        }
        else if (level.equals("Worker"))
        {
            levelPart = "WKR";
        }

        // Second part based on first 2 digits of name and make it uppercase
        String namePart;
        namePart = (last.substring(0,2) + first.substring(0, 2)).toUpperCase();

        // Last part based on 5 random digits
        String numPart = "";

        for (int i = 0; i < 5; i++) {
            int randomDigit = (int) (Math.random() * 10);
            numPart += randomDigit;
        }

        empNum = levelPart + "-" + namePart + "-" + numPart;

    }


    public abstract double calculateGrossPay();


    /** calculates the Ei for an employee
     * @return a double
     */
    private double ei(){
       return EI_RATE * calculateGrossPay();
    }


    /** calculates the cpp for an employee
     * @return a double
     */
    private double cpp(){
        return CPP_RATE * calculateGrossPay();
    }

    /** calculates the tax for an employee
     * @return a double
     */
    private double tax(){
       return TAX_RATE * calculateGrossPay();
    }


    /** Calculates net pay for an employee
     * @return a double
     */
    public double calculateNetPay(){
       return calculateGrossPay() -ei() - cpp() - tax();
    }


    /**
     * Purpose: Overrides Object's toString Method
     * @return a string
     */
    public String toString(){
        return 
        String.format("\n%-20s %s\n", "Employee Level:", level) +
        String.format("%-20s %s\n", "First Name:", first) +
        String.format("%-20s %s\n", "Last Name:", last)+
        String.format("%-20s %s", "Employee Number:", empNum);
    }
    
}
