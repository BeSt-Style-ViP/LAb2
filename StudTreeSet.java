import java.util.ConcurrentModificationException;
import java.util.TreeSet;

class StudTreeSet {

    public static void main(String[] args) {
        int n = 0;
        TreeSet<String> students = new TreeSet<>();
        students.add("Andreev");
        students.add("Vinogradova");
        students.add("Gamilov");
        students.add("Grinenko");
        students.add("Dovgal");
        students.add("Drevalskiy");
        students.add("Juravskiy");
        students.add("Klimova");
        students.add("Kozlov");
        students.add("Kornienko");
        students.add("Labunskiy");
        students.add("Logvinov");
        students.add("Lisichenko");
        students.add("Marchukov");
        students.add("Momot");
        students.add("Parkhomov");
        students.add("Rimar");

        System.out.println("Всего студентов: " + students.size());
        for (String i: students) {
            n++;
            if(n == students.size()){
                System.out.print(i + ".");
                break;}
            System.out.print(i + ", ");
        }
        System.out.println("\n");

        for (int i = 0; i < 5; i++) {

            try {
                for (String a : students) {
                    students.remove(a);
                }
            } catch (ConcurrentModificationException e) { }

        }
        System.out.println("Всего студентов: " + students.size());
        System.out.println(students);
    }
}