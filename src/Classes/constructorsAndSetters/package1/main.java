
package Classes.constructorsAndSetters.package1;

import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) throws Exception {

        // var student1 = new Student();
        // var employee1 = new Employee();
        // var employee2 = new Employee();
        // var teacher1 = new Teacher();
        // var teacher2 = new Teacher();

        // System.out.println(String.format("\nTeacher 1 person id = %s",
        // teacher1.getMyPersonId()));
        // System.out.println(String.format("Teacher 2 person id = %s",
        // teacher2.getMyPersonId()));
        // System.out.println(String.format("Student 1 person id = %s",
        // student1.getMyPersonId()));

        // System.out.println(String.format("\nTeacher 1 employee id = %s",
        // teacher1.getMyEmployeeId()));
        // System.out.println(String.format("Teacher 2 employee id = %s",
        // teacher2.getMyEmployeeId()));

        // System.out.println(String.format("\nTeacher 1 teacher id = %s",
        // teacher1.getMyTeacherId()));
        // System.out.println(String.format("Teacher 2 teacher id = %s",
        // teacher2.getMyTeacherId()));

        // System.out.println(String.format("\nStudent 1 student id = %s",
        // student1.getMyStudentId()));

        // System.out.println("\n" + Teacher.tellAmountOfMyType());
        // System.out.println(Student.tellAmountOfMyType());
        // System.out.println(Person.tellAmountOfMyType() + "\n");

        var listOfTeacher = new ArrayList<Teacher>();

        var teacher1 = new Teacher();
        teacher1.setName("Julien");
        listOfTeacher.add(teacher1);

        var listOfTeacher2 = (ArrayList<Teacher>) listOfTeacher.clone();

        var d1 = new Department(listOfTeacher2);

        var teacher2 = new Teacher();
        teacher2.setName("Jessy");

        d1.addTeacher(teacher2);

        System.out.println("\nPrinting the department's list\n====================");

        for (Teacher teacher : d1.listOfTeacher) {
            teacher.setName("Yallah");
            System.out.println(teacher);
        }

        System.out.println("\nPrinting the main's list\n=========================");
        for (Teacher teacher : listOfTeacher) {
            System.out.println(teacher);
        }
    }
}