public  class concrete Course {
   //encapsulate the private variables to protect the data
    private String courseName;
    private Lecturer instructor; 
    private int creditHours;

    public Course(String id, String courseName, Lecturer instructor, int creditHours) {
        super(id); 
        this.courseName = courseName;
        this.instructor = instructor;
        this.creditHours = creditHours;
    }
    public String getCourseName() { return courseName; }
    public void setCourseName(String courseName) { this.courseName = courseName; }

    public Lecturer getInstructor() { return instructor; }
    public void setInstructor(Lecturer instructor) { this.instructor = instructor; }

    @Override
    public void showDetails() {
        System.out.println("--- Course Information ---");
        System.out.println("ID: " + getEntityId());
        System.out.println("Course: " + courseName);
        System.out.println("Credits: " + creditHours);
        
        System.out.println("Taught by: " + instructor.getName());
    } 
}
