package inheritance;

/**
 *
 * @author AlexRoz
 */
public class Student extends Person {

    private Group group;
    private double score;

    public Student() {
    }

    public Student(String firstName, String lastName, int day, int month, int year) {
        super(firstName, lastName, day, month, year);
    }

    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }

    public void setSrBal(double a) {
        this.score = a;
    }

    @Override
    public String toString() {
        return super.toString() + (group == null ? "" : " (group #" + group + "") + String.valueOf(score == 0 ? ")" : (";  Score = " + score + " )"));
    }
}
