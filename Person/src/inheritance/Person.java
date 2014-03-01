package inheritance;

import java.util.Date;
import java.text.SimpleDateFormat;

/**
 *
 * @author AlexRoz
 */
public class Person {

    private String firstName, lastName;
    private Date date;
    SimpleDateFormat dt = new SimpleDateFormat("yyyy-MM-dd");

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
        return (firstName == null ? "" : firstName + " ") + (lastName == null ? "" : lastName)
                + (date == null ? "" : ". Date: "+dt.format(date)+".");
    }
}
