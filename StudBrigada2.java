import java.util.*;

class StudBrigada2 {
    static Comparator<Mate> mComp = new CompareMateName().thenComparing(new CompareMateLastName());
    static TreeSet<Mate> brigadaT = new TreeSet<>(mComp);

    public static void main(String[] args) {
        brigadaT.add( new Mate("Aleksey","Labunskiy","ESTMu", 3));
        brigadaT.add( new Mate("Kostya","Dovgal","ESTMu", 3));
        brigadaT.add( new Mate("Vladimir","Grinenko","ESTMu", 3));
        brigadaT.add( new Mate("Anton","Parkhomov","ESTMu", 3));
        for (Mate i: brigadaT) {
            System.out.println(i.name + " " + i.lastName);
        }
    }
}

class Mate {

    String name;
    String lastName;
    String groupName;
    int brigadaNumber;

    public Mate(String name, String lastName, String groupName, int brigadaNumber) {
        this.name = name;
        this.lastName = lastName;
        this.groupName = groupName;
        this.brigadaNumber = brigadaNumber;
    }

}

class CompareMateName implements Comparator<Mate>{

    @Override
    public int compare(Mate o1, Mate o2) {
        return o1.name.compareTo(o2.name);
    }
}

class CompareMateLastName implements Comparator<Mate>{

    @Override
    public int compare(Mate o1, Mate o2) {
        int count1 = 0;
        int count2 = 0;
        char[] lastNameArr1 = o1.lastName.toCharArray();
        char[] lastNameArr2 = o2.lastName.toCharArray();
        for (char i: lastNameArr1) {
            count1++;
        }
        for (char i: lastNameArr2) {
            count2++;
        }
        if(count1 > count2)
            return -1;
        else if (count1 < count2)
            return 1;
        else
            return 0;
    }
}