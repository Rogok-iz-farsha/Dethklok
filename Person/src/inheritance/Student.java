package inheritance;

import java.util.Date;

/**
 *
 * @author AlexRoz
 */
public class Student extends Person {

    private Group group;
    private double score;

    public Student() {
    }

    public Student(String firstName, String lastName) {
        super(firstName, lastName);
    }

    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }

    public void setScore(double a) {
        this.score = a;
    }

    @Override
    public String toString() {
        return super.toString() + (group == null ? "" : " group #" + group + "") + (score == 0 ? "" : (";  Score = " + score + " "));
    }
}
