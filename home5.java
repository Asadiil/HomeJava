/*Реализуйте структуру телефонной книги с помощью HashMap.
Программа также должна учитывать, что во входной структуре будут повторяющиеся имена с разными телефонами,
их необходимо считать, как одного человека с разными телефонами.
Вывод должен быть отсортирован по убыванию числа телефонов. */

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class HashMapStudy {
    public static void main(String[] args) {
        String[] namessarr = new String[]{"Куй Пока Горячо", "Ешь Еще Неостыл",
                "Мой Ведь Грязно", "Сиди Кури Молча", "Съел Возьми Еще"};
        Integer[] numbers = new Integer[]{1234, 3214, 4568, 9564, 4568};
        Map<Integer, String> phonehash = new HashMap<>();
        for (int i = 0; i < namessarr.length; i++) {
            phonehash.put(numbers[i], namessarr[i]);
        }
        System.out.println(phonehash);
        System.out.println("=".repeat(300));
        phonehash.entrySet().stream().sorted(Map.Entry.comparingByKey((Comparator<Integer>) (o1, o2) -> o2 - o1)).forEach(System.out::println);
    }
}