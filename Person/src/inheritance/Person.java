package inheritance;

/**
 *
 * @author AlexRoz
 */
public class Person {

    private String firstName, lastName;
    private Date date;

    public Person() {
    }

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;

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

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return (firstName == null ? "" : firstName + " ") + (lastName == null ? "" : lastName);
    }
}
