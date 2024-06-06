public class Student extends User implements Comparable<Student> {
    private int studentId;

    public Student(int studentId, String firstName, String secondName, String lastName, Gender gender) {
        super(firstName, secondName, lastName, gender);
        this.studentId = studentId;
    }

    public int getStudentId() {
        return studentId;
    }

    @Override
    public String toString() {
        return "Student [studentId=" + studentId + " " + super.toString() + "]";
    }

    // @Override
    // public int compareTo(Student o) {
    // if (studentId > o.getStudentId()) {
    // return 1;
    // }
    // if (studentId < o.getStudentId()) {
    // return -1;
    // }
    // return 0;
    // }
    @Override
    public int compareTo(Student o) {
        return Integer.compare(studentId, o.getStudentId());
    }

}
