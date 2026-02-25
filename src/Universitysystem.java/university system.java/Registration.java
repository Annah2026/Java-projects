
  public class Registration extends BaseEntity {
    private Student student;
    private Course course;

    public Registration(String regId, Student student, Course course) {
        super(regId);
        this.student = student;
        this.course = course;
    }

    @Override
    public void showDetails() {
        System.out.println("Registration ID: " + getEntityId());
        System.out.println("Student: " + student.getName());
        System.out.println("Enrolled in: " + course.getCourseName());
    }
}
 

