package inheritance;

/**
 *
 * @author AlexRoz
 */
public class Principal extends Tutor {

    public Principal() {
    }

    public Principal(String firstName, String lastName) {
        super(firstName, lastName);
    }

    @Override
    public String toString() {
        return super.toString() + ".(Principal)";
    }
}
