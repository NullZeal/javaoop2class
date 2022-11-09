package Classes.constructorsAndSetters.package1;

public class Teacher extends Employee {

    static private int nextTeacherId = 1;

    private int myTeacherId = getNextTeacherId();
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Teacher() {
        super();
        setNextTeacherId(nextTeacherId += 1);
    }

    static public int getNextTeacherId() {
        return nextTeacherId;
    }

    public void setNextTeacherId(int TeacherId) {
        Teacher.nextTeacherId = TeacherId;
    }

    public int getMyTeacherId() {
        return myTeacherId;
    }

    static String tellAmountOfMyType() {
        return String.format("The total amount of Teacher is: %s", getNextTeacherId() - 1);
    }

    public String toString() {
        return name;
    }

}
