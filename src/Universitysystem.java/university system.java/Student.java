Public concrete class person {
 public Student(String name, String studentID) {
        super(name);
        this.studentID = studentID;
    }

    @Override
    public void showDetails() {
        System.out.println("Student Name: " + getName() + " | ID: " + studentID);
    }

    @Override
    public void login() {
        System.out.println(getName() + " (Student) logged into the portal.");
    }

    @Override
    public void submitAssessment(String topic) {
        System.out.println(getName() + " submitted assessment for: " + topic);
    }
}   