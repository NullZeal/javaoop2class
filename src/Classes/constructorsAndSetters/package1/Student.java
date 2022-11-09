package Classes.constructorsAndSetters.package1;

public class Student extends Person {

    static private int nextStudentId = 1;

    private int myStudentId = getNextStudentId();

    public Student() {
        super();
        setNextStudentId(nextStudentId += 1);
    }

    static public int getNextStudentId() {
        return nextStudentId;
    }

    public void setNextStudentId(int StudentId) {
        Student.nextStudentId = StudentId;
    }

    public int getMyStudentId() {
        return myStudentId;
    }

    static String tellAmountOfMyType() {
        return String.format("The total amount of Students is: %s", getNextStudentId() - 1);
    }
}
