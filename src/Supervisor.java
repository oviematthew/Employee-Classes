/**
 * 
 * @author Matthew Ovie Enamuotor
 * @since August 15th 2023
 * @version 1.1
 * This class implements a supervisor's pay structure
 */

public class Supervisor extends Employee{
    
    /**
     *Instance variables
     */
    private double salary;
    private int productionRate;

    
    /** 4-arg contructor
     * @param first
     * @param last
     * @param salary
     * @param productionRate
     */
    public Supervisor (String first, String last, double salary, int productionRate)
    {
        super("Supervisor", first, last);
        this.salary = salary;
        this.productionRate = productionRate;
    }


    /** getter method for production rate
     * @return a double
     */
    public double getSalary() {
        return this.salary;
    }

    
    /** setter method for salary
     * @param salary
     */
    public void setSalary(double salary) {
        this.salary = salary;
    }

    /** getter method for production rate
     * @return
     */
    public int getProductionRate() {
        return this.productionRate;
    }


    /** setter method for production rate
     * @param productionRate
     */
    public void setProductionRate(int productionRate) {
        this.productionRate = productionRate;
    }


    /** Calculate bonus for a supervisor
     * @return a double
     */
    private double calculateBonus(){
        

        if(productionRate < 75)
        {
            return 0.00;
        }
        else if (productionRate >= 75 && productionRate<= 100){
            return (salary/50) * 0.05;
        }
        else if (productionRate >= 101 && productionRate <= 120){
            return (salary/50) * 0.15;
        }
        return productionRate;
    }

    public double calculateGrossPay(){
        double finalSalary;
        finalSalary = (salary / 50) + calculateBonus();
        return  finalSalary;
    }

    /**
     * Purpose: Overrides Employees toString Method
     * @return a string
     */
    public String toString(){
        return super.toString() + 
        String.format("\n%-20s $%,.2f\n", "Salary:", salary) +
        String.format("%-20s %d%%\n", "Production Rate:", productionRate) +
        String.format("%-20s $%,.2f\n", "Gross Pay:", calculateGrossPay())+
        String.format("%-20s $%,.2f\n", "Net Pay:", calculateNetPay());
    }
}
