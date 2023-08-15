/**
 * 
 * @author Matthew Ovie Enamuotor
 * @since August 15th 2023
 * @version 1.1
 * This class implements a workers pay structure
 */

public class Worker extends Employee {
    
    /**
     * Instance variables
     */
    private int shift;
    private double rate;
    private double hours;


    /** 5-arg constructor
     * @param first
     * @param last
     * @param shift
     * @param rate
     * @param hours
     */
    public Worker(String first, String last, int shift, double rate, double hours){
        super("Worker", first, last);
        this.shift = shift;
        this.rate = rate;
        this.hours = hours;
    }


    /** Getter method for worker shift
     * @return integer
     */
    public int getShift() {
        return this.shift;
    }


    /** Setter method for worker shifts
     * @param shift
     */
    public void setShift(int shift) {
        this.shift = shift;
    }


    /** Getter method for worker hourly rates
     * @return a double
     */
    public double getRate() {
        return this.rate;
    }


    /** Setter method for employee hourly rates
     * @param rate
     */
    public void setRate(double rate) {
        this.rate = rate;
    }


    /** Getter method for employee hours
     * @return a double
     */
    public double getHours() {
        return this.hours;
    }
    

    /** Setter method for employee hours
     * @param hours
     */
    public void setHours(double hours) {
        this.hours = hours;
    }

    /**
     * Method to calculate employee gross pay
     * @return a double
     */
    public double calculateGrossPay(){
        double pay = 0;
        double payrate = hours * rate;

        if(shift == 1)
        {
            pay = hours * rate + 0;
            payrate += pay;
        }
        else if (shift == 2){
            pay = 0.03 * (payrate * rate);
            payrate += pay;
        }

        return pay;
    }


    /**
     * Purpose: Overrides Employees toString Method
     * @return a string
     */
    public String toString(){
        return super.toString() +
        String.format("\n%-20s %d\n", "Shift:", shift) +
        String.format("%-20s %.2f\n", "Hourly Pay Rate:", rate) +
        String.format("%-20s $%,.2f\n", "Hours Worked:", hours)+
        String.format("%-20s $%,.2f\n", "Gross Pay:", calculateGrossPay()) +
        String.format("%-20s $%,.2f\n", "Net Pay:", calculateNetPay());
    }

}
