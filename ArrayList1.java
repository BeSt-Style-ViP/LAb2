import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class ArrayList1 {

    public static void main(String[] args) {
        List<String> result = new ArrayList<>();
        collectStrings(result, 10, 0);
        rearrangeStrings(result, 15);
        collectStrings(result, 5, 5);
        result.forEach(System.out::println);
    }

    private static void collectStrings(List<String> target, int count, int index) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (count > 0) {
            try {
                if(target.size() > index) target.set(index, reader.readLine());
                else target.add(index, reader.readLine());
                index ++;
                count --;
            } catch (IOException ioe) {
                ioe.printStackTrace();
            }
        }
    }

    private static void rearrangeStrings(List<String> target, int count) {
        while(count -- < 0) {
            target.add(0, target.remove(target.size() - 1));
        }
    }
}