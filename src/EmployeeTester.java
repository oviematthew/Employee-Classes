/**
 * 
 * @author Matthew Ovie Enamuotor
 * @since August 15th 2023
 * @version 1.1
 * To test employees pay structure 
 */

public class EmployeeTester {
    public static void main(String[] args) throws Exception {
       
        // Write a brief message to the screen for the current week
        System.out.println();
        System.out.println("Employee Tester for Week 1");
        System.out.println("-----------------------------------------------");


        // Create 6 employees by instantiating Supervisor and worker
        Supervisor employee1 = new Supervisor("Darcy", "French", 176000, 105);

        Supervisor employee2 = new Supervisor("Janelle", "Birch", 96000, 70);

        Worker employee3 = new Worker("Daniel", "Van Patter", 2, 25.50, 41);

        Worker employee4 = new Worker("Thomas", "Neil", 1, 45.50, 40);

        Worker employee5 = new Worker("Judy", "Campbell", 1, 65.50, 41);

        Worker employee6 = new Worker("John", "Greene", 2, 45.50, 45);


        // Print each object, using its toString() method
        System.out.println(employee1.toString());
        System.out.println();

        System.out.println(employee2.toString());
        System.out.println();

        System.out.println(employee3.toString());
        System.out.println();

        System.out.println(employee4.toString());
        System.out.println();

        System.out.println(employee5.toString());
        System.out.println();

        System.out.println(employee6.toString());
        System.out.println();

        //update the employee objects with the following
        employee1.setProductionRate(115);

        employee2.setProductionRate(110);

        employee3.setHours(44.0);
        employee3.setRate(27.00);

        employee4.setHours(37);

        employee5.setHours(42.75);

        employee6.setHours(44);
        employee6.setShift(1);


        // Write a brief message to the screen for the next week
        System.out.println("Employee Tester for Week 2");
        System.out.println("-----------------------------------------------");

        // Print each object again, using its toString() method
        System.out.println(employee1.toString());
        System.out.println();

        System.out.println(employee2.toString());
        System.out.println();

        System.out.println(employee3.toString());
        System.out.println();

        System.out.println(employee4.toString());
        System.out.println();

        System.out.println(employee5.toString());
        System.out.println();

        System.out.println(employee6.toString());
        System.out.println();
    }
}
