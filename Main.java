public class Main {
    public static void main(String[] args) {
        StudentController controller = new StudentController();
        controller.create("Denis", "Krasnov", "Fedorovich", new Male());
        controller.create("Igor", "Zhdanov", "Gennadievich", new Male());
        controller.create("Evgeniya", "Makarova", "Alexandrovna", new Female());
        controller.create("Ekaterina", "Presnykova", "Semenovna", new Female());

        controller.printStudentList();

    //     Student student1 = new Student(5, "Denis", "Krasnov", "Fedorovich");
    //     Student student2 = new Student(2, "Igor", "Zhdanov", "Gennadievich");
    //     Student student3 = new Student(4, "Evgeny", "Makarov", "Alexandrovich");
    //     Student student4 = new Student(3, "Ekaterina", "Presnykova", "Semenovna");
    //     Student student5 = new Student(1, "Yulia", "Fedorova", "Olegovna");
    //     StudentGroup studentGroup = new StudentGroup(new ArrayList<>());
    //     studentGroup.addStudent(student1);
    //     studentGroup.addStudent(student2);
    //     studentGroup.addStudent(student3);
    //     studentGroup.addStudent(student4);
    //     studentGroup.addStudent(student5);
    //     StudentGroupService service = new StudentGroupService(studentGroup);
    //     printListStudent(service.getSortedStudentGroupByFIO());
    //     // System.out.println(student1.compareTo(student2));
    //     // StudentGroupIterator iterator = new StudentGroupIterator(studentGroup.getStudentList());
    //     // printListStudent(studentGroup);
    // }

    // static void printListStudent(List<Student> students){
    //     // while (iterator.hasNext()) {
    //     //     Student student = iterator.next();
    //     //     System.out.println(student);
    //     // }

    //     for (Student student : students) {
    //         System.out.println(student);
    //     }

    }
}