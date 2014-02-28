package inheritance;

/**
 *
 * @author AlexRoz
 */
public class Tutor extends Person {

    public Tutor() {
    }

    public Tutor(String firstName, String lastName, int day, int month, int year) {
        super(firstName, lastName, day, month, year);
    }

    @Override
    public String toString() {
        return super.toString() + " - Teacher";
    }
}
