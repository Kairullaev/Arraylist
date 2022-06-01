import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> array = new ArrayList<>();
        ArrayList<Integer>array2 = new ArrayList<>();
        ArrayList<Integer> array3 = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 51; i++) {
            int a = random.nextInt(100);
            array.add(a);
            if (a % 2 == 0) {
                array2.add(a);
            } else {
                array3.add(a);
            }
        }
            System.out.println(array);
            System.out.println(array2);
            System.out.println(array3);
        }
    }

