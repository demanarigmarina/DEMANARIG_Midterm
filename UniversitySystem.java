import java.util.ArrayList;
import java.util.List;

// Person class (Base Class)
class Person {
    private String name;
    private int age;

    public Person(String fullName, int personAge) {
        this.name = fullName;
        this.age = personAge;
    }

    public void showInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

// Student class (inherits from Person)
class Student extends Person {
    private String studentID;
    private String course;
    private int unitsTaken;
    private static final int COST_PER_UNIT = 1000;

    public Student(String name, int age, String id, String courseEnrolled, int units) {
        super(name, age);
        this.studentID = id;
        this.course = courseEnrolled;
        this.unitsTaken = units;
    }

    public double computeTotalFees() {
        return unitsTaken * COST_PER_UNIT;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Student ID: " + studentID);
        System.out.println("Course: " + course);
        System.out.println("Units: " + unitsTaken);
        System.out.println("Total Fees: $" + computeTotalFees());
    }
}

// Instructor class (inherits from Person)
class Instructor extends Person {
    private String employeeID;
    private String department;
    private double salary;

    public Instructor(String name, int age, String empID, String dept, double empSalary) {
        super(name, age);
        this.employeeID = empID;
        this.department = dept;
        this.salary = empSalary;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Department: " + department);
        System.out.println("Salary: $" + salary);
    }
}

// UniversityManagement class to manage students and instructors
class UniversityManagement {
    private List<Student> students;
    private List<Instructor> instructors;

    public UniversityManagement() {
        students = new ArrayList<>();
        instructors = new ArrayList<>();
    }

    // Add a student to the system
    public void addStudent(Student student) {
        students.add(student);
        System.out.println("Student " + student.getName() + " added.");
    }

    // Add an instructor to the system
    public void addInstructor(Instructor instructor) {
        instructors.add(instructor);
        System.out.println("Instructor " + instructor.getName() + " added.");
    }

    // Show all students' information
    public void showAllStudents() {
        System.out.println("\n--- Students Information ---");
        for (Student student : students) {
            student.showInfo();
            System.out.println(); // Line break for readability
        }
    }

    // Show all instructors' information
    public void showAllInstructors() {
        System.out.println("\n--- Instructors Information ---");
        for (Instructor instructor : instructors) {
            instructor.showInfo();
            System.out.println(); // Line break for readability
        }
    }
}

// Main class to demonstrate the system functionality
public class UniversitySystem {
    public static void main(String[] args) {
        // Creating a UniversityManagement object to manage students and instructors
        UniversityManagement university = new UniversityManagement();

        // Creating and adding Student objects
        Student student1 = new Student("Yomi Rose Galve", 19, "231005392", "Computer Engineering", 4);
        Student student2 = new Student("Marina Demanarig", 20, "231001891", "Software Engineering", 6);
        
        university.addStudent(student1);
        university.addStudent(student2);

        // Creating and adding Instructor objects
        Instructor instructor1 = new Instructor("Engr. Tanya C. Jovillano", 28, "EMP211", "Computer Science", 85000);
        Instructor instructor2 = new Instructor("Engr. Gela Caning", 28, "EMP213", "Computer Science", 85000);
        
        university.addInstructor(instructor1);
        university.addInstructor(instructor2);

        // Displaying all students' and instructors' information
        university.showAllStudents();
        university.showAllInstructors();
    }
}
