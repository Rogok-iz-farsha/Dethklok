package inheritance;

/**
 *
 * @author AlexRoz
 */
public class Headman extends Student {

    public Headman() {
    }

    public Headman(String firstName, String lastName) {
        super(firstName, lastName);
    }

    @Override
    public String toString() {
        return super.toString() + " - Headman";
    }
}
