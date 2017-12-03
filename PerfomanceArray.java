import java.util.ArrayList;
import java.util.Random;

class PerfomanceArray {
    public static void main(String[] args) {
        ArrayList<Random> stringsArr = new ArrayList<>();

        long start = System.nanoTime();
        for (int i = 0; i < 100000; i++) {
            stringsArr.add(0, random);
        }
        long stop = System.nanoTime();
        long result = stop - start;
        System.out.println("Добавление нового элемента в начало списка: " + result);

        start = System.nanoTime();
        for (int i = 0; i < 100000; i++) {
            stringsArr.get(i);
        }
        stop = System.nanoTime();
        result = stop - start;
        System.out.println("Чтение каждого элемента в списке: " + result);

        start = System.nanoTime();
        for (int i = 0; i < 100000; i++) {
            stringsArr.set(i, random);
        }
        stop = System.nanoTime();
        result = stop - start;
        System.out.println("Перезапись каждого элемента в списке: " + result);

        start = System.nanoTime();
        for (int i = 0; i < 100000; i++) {
            stringsArr.remove(0);
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