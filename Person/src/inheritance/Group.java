package inheritance;

/**
 *
 * @author AlexRoz
 */
public class Group {

    private final int year;
    private final int faculty;
    private final int number;

    public Group(int year, int faculty, int number) {
        this.year = year;
        this.faculty = faculty;
        this.number = number;
    }

    @Override
    public String toString() {
        return String.valueOf(year % 10) + faculty + number;
    }
}
