package inheritance;

/**
 *
 * @author AlexRoz
 */
public class Tutor extends Person {

    public Tutor() {
    }

    public Tutor(String firstName, String lastName) {
        super(firstName, lastName);
    }

    @Override
    public String toString() {
        return super.toString() + "  Teacher";
    }
}
