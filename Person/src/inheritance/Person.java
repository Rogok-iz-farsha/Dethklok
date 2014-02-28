package inheritance;

/**
 *
 * @author AlexRoz
 */
public class Person {

    private String firstName, lastName;
    private int day, month, year;

    public Person() {
    }

    public Person(String firstName, String lastName, int day, int month, int year) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.day = day;
        this.month = month;
        this.year = year;

    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return (firstName == null ? "" : firstName + " ") + (lastName == null ? "" : lastName)
                + String.valueOf(". Date: " + day + "." + month + "." + year);
    }
}
