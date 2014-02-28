package inheritance;

/**
 *
 * @author AlexRoz
 */
public class Demo {

    public static void main(String[] args) {
        Student studentA = new Student("Petr", "Ivanov", 9, 8, 94);
        Student studentB = new Student("Ivan", "Popov", 15, 6, 93);
        Headman studentC = new Headman("Pavlic", "Morozov", 15, 10, 94);
        Principal tutor1 = new Principal("Vasily", "Sidorov", 21, 12, 85);

        Student studentD = new Student("Irina", "Grishko", 5, 2, 96);
        Student studentG = new Student("Alex", "Limoskin", 4, 7, 95);
        Headman studentF = new Headman("Don", "Khiton", 30, 1, 95);
        Tutor tutor2 = new Tutor("Sergey", "Ignatovich", 28, 8, 84);

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
        studentA.setSrBal(4.8);
        studentB.setSrBal(5.0);

        Person[] persons = new Person[]{tutor1, studentA, studentB, studentC, tutor2, studentD, studentF, studentG};
        System.out.println("Persons:");
        for (Person person : persons) {
            System.out.println("\t" + person);
        }
    }
}
