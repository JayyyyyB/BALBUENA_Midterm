    // Base class: Person
class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method: displayInfo()
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age + " years old");
    }
}

class Student extends Person {
    // Fields: studentID, course, units, feePerUnit
    String studentID;
    String course;
    int units;

    // fee per unit
    final int feePerUnit = 1000;

    // Constructor: Initializes name, age, studentID, course, and units
    public Student(String name, int age, String studentID, String course, int units) {
        super(name, age);  
    // Call the constructor of the superclass (Person)
        this.studentID = studentID;
        this.course = course;
        this.units = units;
    }

    // Method: calculateFees() - calculates the total fee
    public double calculateFees() {
        return units * feePerUnit;
    }

    // Override displayInfo() to show student details
    
    @Override
    public void displayInfo() {
        super.displayInfo();  
    
    // Call the displayInfo() from Person
        System.out.println("Student ID: " + studentID);
        System.out.println("Course: " + course);
        System.out.println("Units: " + units);
        System.out.println("Total Fee: " + calculateFees());
    }
}

    // Subclass: Instructor (inherits from Person)
class Instructor extends Person {
    // Fields: employeeID, department, salary
    String employeeID;
    String department;
    double salary;

    // Constructor
    public Instructor(String name, int age, String employeeID, String department, double salary) {
        super(name, age);  
        
    // Call the constructor of the superclass (Person)
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }

    // Override displayInfo() to show instructor details
    @Override
    public void displayInfo() {
        super.displayInfo();  
    // Call the displayInfo() from Person
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Department: " + department);
        System.out.println("Salary: " + salary);
    }
}

    // Main class to test the program
public class CSPCEnrollmentSystem {

    public static void printDetails(Person p) {
        p.displayInfo();
        System.out.println(); 
    // Print a blank line for separation
    }

    public static void main(String[] args) {
    // Create two Student objects
        Student student1 = new Student("Jay", 20, "231000317", "BSCPE", 21);
        Student student2 = new Student("James", 20, "231000332", "BSCPE", 21);

    // Create two Instructor objects
        Instructor instructor1 = new Instructor("Engr.Eric", 35, "12345", "Engineering", 40000);
        Instructor instructor2 = new Instructor("Mrs.Sarahlyn", 50, "67891", "Engineering", 85000);

    // Use the printDetails() method
        printDetails(student1);
        printDetails(student2);
        printDetails(instructor1);
        printDetails(instructor2);
    }
}

