
    public class Main {
    public static void main(String[] args) {
        System.out.println("=== UNIVERSITY SYSTEM TEST ===\n");


        Lecturer myLecturer = new Lecturer("L101", "Dr. Smith", "Java Programming", "IT Dept");

        
        Course myCourse = new Course("CS202", "OOP with Java", myLecturer, 3);

        
        Student myStudent = new Student("S789", "Alice Maina");

    
        Registration myReg = new Registration("REG-001", myStudent, myCourse);

        Payment myPayment = new Payment("PAY-555", 1000.0);

    
        myLecturer.showDetails();
        System.out.println();
        myCourse.showDetails();
        System.out.println();


        myStudent.showDetails();
        myStudent.login();
        myStudent.submitAssessment("Inheritance Lab");
        System.out.println();

        myReg.showDetails();
        System.out.println();
        myPayment.showDetails();

        System.out.println("\n=== TEST COMPLETE ===");
    }
    




}
