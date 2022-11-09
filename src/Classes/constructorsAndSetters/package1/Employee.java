package Classes.constructorsAndSetters.package1;

public class Employee extends Person {

    static private int nextEmployeeId = 1;

    private int myEmployeeId = getNextEmployeeId();

    public Employee() {
        super();
        setNextEmployeeId(nextEmployeeId += 1);
    }

    static public int getNextEmployeeId() {
        return nextEmployeeId;
    }

    public void setNextEmployeeId(int employeeId) {
        Employee.nextEmployeeId = employeeId;
    }

    public int getMyEmployeeId() {
        return myEmployeeId;
    }

    static String tellAmountOfMyType() {
        return String.format("The total amount of employees is: %s", getNextEmployeeId() - 1);
    }

}
