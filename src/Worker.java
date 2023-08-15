public class Worker extends Employee {

    private int shift;
    private double rate;
    private double hours;

    public Worker(String first, String last, int shift, double rate, double hours){
        super("Worker", first, last);
        this.shift = shift;
        this.rate = rate;
        this.hours = hours;
    }

    public int getShift() {
        return this.shift;
    }

    public void setShift(int shift) {
        if (shift == 1) {
            this.shift = shift;
        } else if (shift == 2) {
            this.shift = shift;
        }
    }

    public double getRate() {
        return this.rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public double getHours() {
        return this.hours;
    }

    public void setHours(double hours) {
        this.hours = hours;
    }

    public double calculateGrossPay() {
        double pay;

        if (shift == 1) {
            pay = hours * rate;
        } else if (shift == 2) {
            pay = hours * rate + (0.03 * (hours * rate));
        } else {
            pay = 0; // Default pay when shift is not 1 or 2
        }

        return pay;
    }

    public String toString() {
        return super.toString() +
            String.format("\n%-20s %s\n", "Shift:", shift == 1 ? "Day Shift" : "Night Shift") +
            String.format("%-20s %.2f\n", "Hourly Pay Rate:", rate) +
            String.format("%-20s %.2f\n", "Hours Worked:", hours) +
            String.format("%-20s $%.2f\n", "Gross Pay:", calculateGrossPay()) +
            String.format("%-20s $%.2f\n", "Net Pay:", calculateNetPay());
    }
}
