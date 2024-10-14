public class Person {
    protected String fullName;
    protected int age;

    // Constructor to set up a person's name and age
    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    // A method that will show basic details about a person
    public void showDetails() {
        System.out.println("Full Name: " + fullName);
        System.out.println("Age: " + age);
    }
}

// The Student class extends Person, meaning it inherits all its features
class Student extends Person {
    private String id;  
    private String program;  
    private int totalUnits;  
    private final int costPerUnit = 1000; 

    // Constructor that handles setting up everything specific to a student
    public Student(String fullName, int age, String id, String program, int totalUnits) {
        super(fullName, age);  
        this.id = id;
        this.program = program;
        this.totalUnits = totalUnits;
    }

    // This method calculates how much the student owes based on their units
    public double computeTotalFee() {
        return totalUnits * costPerUnit;
    }

    // Here, we override the showDetails method to add student-specific info
    @Override
    public void showDetails() {
        super.showDetails();  
        System.out.println("Student ID: " + id);
        System.out.println("Program: " + program);
        System.out.println("Units Enrolled: " + totalUnits);
        System.out.println("Total Fee: " + computeTotalFee());
    }
}

// The Instructor class also extends Person, but it focuses on teacher-related info
class Instructor extends Person {
    private String empId;  
    private String department;  
    private double monthlySalary;  

    // Constructor that sets up the instructor's details
    public Instructor(String fullName, int age, String empId, String department, double monthlySalary) {
        super(fullName, age);  
        this.empId = empId;
        this.department = department;
        this.monthlySalary = monthlySalary;
    }

    // This method overrides the original to show extra info about the instructor
    @Override
    public void showDetails() {
        super.showDetails();  
        System.out.println("Employee ID: " + empId);
        System.out.println("Department: " + department);
        System.out.println("Salary: $" + monthlySalary);
    }
}

// Main class that puts everything together in the university system
public class UniversitySystem {

    // This method can take any Person object (Student or Instructor) and display their details
    public static void displayPersonInfo(Person person) {
        person.showDetails();  
        System.out.println("================================");
    }

    public static void main(String[] args) {
        // Let's create two students with different details
        Student s1 = new Student("Marina C. Demanarig", 20, "231001891", "Computer Engineering", 21);
        Student s2 = new Student("Jungkook Jeon", 22, "231001997", "Software Engineering", 18);

        // Create two instructors with their specific info
        Instructor i1 = new Instructor("Engr. Tanya C. Jovillano", 27, "EMP2856", "Engineering", 75000);
        Instructor i2 = new Instructor("Dr. Namjoon Kim", 30, "EMP1294", "Mathematics", 85000);

        // We display the details of each person, whether they are a student or instructor
        displayPersonInfo(s1);
        displayPersonInfo(s2);
        displayPersonInfo(i1);
        displayPersonInfo(i2);
    }
}}