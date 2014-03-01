package inheritance;

import java.util.Date;
import java.text.SimpleDateFormat;

/**
 *
 * @author AlexRoz
 */
public class Demo {

    public static void main(String[] args) {
        Student studentA = new Student("Petr", "Ivanov");
        Student studentB = new Student("Ivan", "Popov");
        Headman studentC = new Headman("Pavlic", "Morozov");
        Principal tutor1 = new Principal("Vasily", "Sidorov");

      

        Student studentD = new Student("Irina", "Grishko");
        Student studentG = new Student("Alex", "Limoskin");
        Headman studentF = new Headman("Don", "Khiton");
        Tutor tutor2 = new Tutor("Sergey", "Ignatovich");

        studentA.setDate(new Date(96, 1, 8));
        studentB.setDate(new Date(96, 2, 9));
        studentC.setDate(new Date(95, 3, 10));
        studentD.setDate(new Date(94, 4, 11));
        studentF.setDate(new Date(96, 5, 12));
        studentG.setDate(new Date(95, 6, 13));
        tutor1.setDate(new Date(85, 7, 15));

        System.out.println("Students:\n" + studentA + "\n" + studentB + "\n" + studentC);
        System.out.println("Tutor: " + tutor1 + "\n");

        System.out.println("Students:\n" + studentD + "\n" + studentG + "\n" + studentF);
        System.out.println("Tutor: " + tutor2 + "\n");

        Group group1 = new Group(2013, 7, 4);
        Group group2 = new Group(2012, 5, 1);
        studentA.setGroup(group1);
        studentB.setGroup(group1);
        studentC.setGroup(group1);
        studentD.setGroup(group2);
        studentG.setGroup(group2);
        studentF.setGroup(group2);
        studentA.setScore(4.8);
        studentB.setScore(5.0);

        Person[] persons = new Person[]{tutor1, studentA, studentB, studentC, tutor2, studentD, studentF, studentG};
        System.out.println("Persons:");
        for (Person person : persons) {
            System.out.println("\t" + person);
        }
    }
}
