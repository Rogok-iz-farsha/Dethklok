package inheritance;

/**
 *
 * @author AlexRoz
 */
public class Headman extends Student {

    public Headman() {
    }

    public Headman(String firstName, String lastName, int day, int month, int year) {
        super(firstName, lastName, day, month, year);
    }

    @Override
    public String toString() {
        return super.toString() + " - Headman";
    }
}
