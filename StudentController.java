import java.util.ArrayList;

public class StudentController implements UserController <Student> {
    StudentGroup students = new StudentGroup(new ArrayList<>());
    UserView<Student> userview = new UserView<Student>();
    @Override
    public void create(String firstName, String secondName, String lastName, Gender gender) {
        int maxId = 1;
        if (!students.getStudentList().isEmpty()) {
            maxId = students.getStudentList().size() + 1;
        }
        Student student = new Student(maxId, firstName, secondName, lastName, gender);
        students.addStudent(student);
    }

    void printStudentList(){
        userview.sendOnConsole(students.getStudentList());
    }
    
}
