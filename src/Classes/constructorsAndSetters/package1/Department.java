package Classes.constructorsAndSetters.package1;

import java.util.ArrayList;
import java.util.List;

public class Department {

    public ArrayList<Teacher> listOfTeacher;

    public Department(ArrayList<Teacher> listOfTeacher) {
        this.listOfTeacher = listOfTeacher;
    }

    public void addTeacher(Teacher SomeTeacher) {
        listOfTeacher.add(SomeTeacher);
    }
}
