import java.util.LinkedList;
import java.util.Random;

class PerfomanceLinked {
    public static void main(String[] args) {
        LinkedList<Random> stringsLink = new LinkedList<>();

        long start = System.nanoTime();
        for (int i = 0; i < 100000; i++) {
            stringsLink.addFirst(random);
        }
        long stop = System.nanoTime();
        long result = stop - start;
        System.out.println("Добавление нового элемента в начало списка: " + result);

        start = System.nanoTime();
        for (int i = 0; i < 100000; i++) {
            stringsLink.get(i);
        }
        stop = System.nanoTime();
        result = stop - start;
        System.out.println("Чтение каждого элемента в списке: " + result);

        start = System.nanoTime();
        for (int i = 0; i < 100000; i++) {
            stringsLink.set(i,random);
        }
        stop = System.nanoTime();
        result = stop - start;
        System.out.println("Перезапись каждого элемента в списке: " + result);

        start = System.nanoTime();
        for (int i = 0; i < 100000; i++) {
            stringsLink.removeFirst();
        }
        stop = System.nanoTime();
        result = stop - start;
        System.out.println("Удаление первого элемента в списке: " + result);
    }

    private static Random random = new Random();
    static int generateRandom ( int n){
        return Math.abs(random.nextInt()) % n;
    }
}