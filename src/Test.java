import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Test {

    public static int getRandomInt(int min, int max) {
        Random random = new Random();

        return random.nextInt((max - min) + 1) + min;
    }

    public static ArrayList<Integer> getRandomNonRepeatingIntegers(int size, int min,
                                                                   int max) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();

        while (numbers.size() < size) {
            int random = getRandomInt(min, max);

            if (!numbers.contains(random)) {
                numbers.add(random);
            }
        }

        return numbers;
    }


    public static void main(String[] args) {
        ArrayList<Integer> list = getRandomNonRepeatingIntegers(10, 1, 100);
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        for (int i = 0; i < list.size(); i++) {
            numbers.add(list.get(i));
        }
        Collections.sort(numbers, Collections.reverseOrder());

        //Not asked for, but ive outputted the list to console using the below code
        for(int str: numbers){
            System.out.println(str);
        }
    }
}