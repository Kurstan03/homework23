import java.util.*;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int[] numbers = new int[10];
        ArrayList<Integer> numbersArrayList = new ArrayList<>();
        LinkedList<Integer> numbersLinkedList = new LinkedList<>();
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(2);

        }for (int i = 0; i < numbers.length; i++) {
            numbersArrayList.add(random.nextInt(2));

        }for (int i = 0; i < numbers.length; i++) {
            numbersLinkedList.add(random.nextInt(2));
        }
        System.out.println("Array ->      " + Arrays.toString(sort(numbers)));
        System.out.println("ArrayList ->  " + sort(numbersArrayList));
        System.out.println("LinkedList -> " + sort(numbersLinkedList));
    }
    public static int[] sort(int[] numbers){
        Arrays.sort(numbers);
        return numbers;
    }
    public static ArrayList<Integer> sort(ArrayList<Integer> numbers){
        Collections.sort(numbers);
        return numbers;
    }
    public static LinkedList< Integer> sort(LinkedList<Integer> numbers){
        Collections.sort(numbers);
        return numbers;
    }
}