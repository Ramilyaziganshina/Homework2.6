import java.util.*;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static void task1() {
        System.out.println("Задача 1");
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));

        for (Integer num : nums) {
            if (num % 2 != 0) {
                System.out.print(num);
            }
        }
        System.out.println();
    }

    public static void task2() {
        System.out.println("Задача 2");
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        Set<Integer> numsSet = new TreeSet<>(nums);

        for (Integer num : numsSet) {
            if (num % 2 == 0) {
                System.out.print(num);
            }
        }
        System.out.println();
    }

    public static void task3() {
        System.out.println("Задача 3");
        String text = "на дворе трава на траве дрова раз дрова два дрова три дрова дрова вдоль двора " +
                "дрова вширь двора не вместит двор дров надо дрова выдворить со двора обратно";

        List<String> strings = new ArrayList<>(List.of(text.split(" ")));
        System.out.println(new HashSet<>(strings));
    }

    public static void task4() {
        System.out.println("Задача 4");
        String text = "на дворе трава на траве дрова раз дрова два дрова три дрова дрова вдоль двора " +
                "дрова вширь двора не вместит двор дров надо дрова выдворить со двора обратно";
        List<String> strings = new ArrayList<>(List.of(text.split(" ")));

        Map<String, Integer> countStringByString = new HashMap<>();

        for (String str : strings) {
            if (countStringByString.get(str) == null) {
                countStringByString.put(str, 1);
            } else {
                countStringByString.put(str, countStringByString.get(str) + 1);
            }
        }
        System.out.println(countStringByString);
    }
}