package Classes.constructorsAndSetters.package1;

public class Person {

    static private int nextPersonId = 1;

    private int myPersonId = getNextPersonId();

    public Person() {
        setNextPersonId(nextPersonId += 1);
    }

    public static int getNextPersonId() {
        return nextPersonId;
    }

    public static void setNextPersonId(int nextPersonId) {
        Person.nextPersonId = nextPersonId;
    }

    public int getMyPersonId() {
        return myPersonId;
    }

    static String tellAmountOfMyType() {
        return String.format("The total amount of person is: %s", getNextPersonId() - 1);
    }

}
