package inheritance;

/**
 *
 * @author AlexRoz
 */
public class Principal extends Tutor {

    public Principal() {
    }

    public Principal(String firstName, String lastName, int day, int month, int year) {
        super(firstName, lastName, day, month, year);
    }

    @Override
    public String toString() {
        return super.toString() + ".(Principal)";
    }
}
