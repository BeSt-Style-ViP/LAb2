import java.util.*;

class StudBrigada {

    static Scanner in = new Scanner(System.in);

    static HashSet<Student> brigadaH = new HashSet<>();
    static TreeSet<Student> brigadaT = new TreeSet<>();

    public static void main(String[] args) {

        brigadaH.add( new Student("Aleksey","Labunskiy","ESTMu", 3));
        brigadaH.add( new Student("Kostya","Dovgal","ESTMu", 3));
        brigadaH.add( new Student("Vladimir","Grinenko","ESTMu", 3));
        brigadaH.add( new Student("Anton","Parkhomov","ESTMu", 3));

        String name = in.nextLine();
        String lastName = in.nextLine();
        String groupName = in.nextLine();
        int brigadaNumber = in.nextInt();

        System.out.println(brigadaH.contains(new Student(name, lastName, groupName, brigadaNumber)));

        brigadaT.addAll(brigadaH);
        for (Student i: brigadaT) {
            System.out.println(i.lastName);
        }
    }


}
class Student implements Comparable<Student>{

    String name;
    String lastName;
    String groupName;
    int brigadaNumber;

    public Student(String name, String lastName, String groupName, int brigadaNumber) {
        this.name = name;
        this.lastName = lastName;
        this.groupName = groupName;
        this.brigadaNumber = brigadaNumber;

    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj){
            return true;}
        Student other = (Student) obj;
        if (name.equals(other.name)){
            return true;}
        if (lastName.equals(other.lastName)){
            return true;}
        if (groupName.equals(other.groupName)){
            return true;}
        if (brigadaNumber == other.brigadaNumber){
            return true;}
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + name.hashCode();
        result = prime * result + lastName.hashCode();
        result = prime * result + groupName.hashCode();
        result = prime * result + brigadaNumber;
        return result;
    }

    @Override
    public int compareTo(Student that) {
        return this.lastName.compareTo(that.lastName);
    }
}    