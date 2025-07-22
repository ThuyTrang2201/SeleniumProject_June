package Homework_day4;

public class Developer {
    public static void main(String[] args) {
        Employee dev1 = new Employee("D001", "Nguyen Thi Xuan", 1200.0);
        Employee dev2 = new Employee("D002", "Hoang Van Thu", 1500.0);

        System.out.println("Developer 1:");
        System.out.println("ID: " + dev1.getEmployee_id());
        System.out.println("Name: " + dev1.getEmployee_name());
        System.out.println("Salary: " + dev1.getEmployee_salary());


        System.out.println("\nDeveloper 2:");
        System.out.println("ID: " + dev2.getEmployee_id());
        System.out.println("Name: " + dev2.getEmployee_name());
        System.out.println("Salary: " + dev2.getEmployee_salary());
    }
}
