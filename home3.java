/*Пусть дан произвольный список целых чисел.
1) Нужно удалить из него чётные числа
2) Найти минимальное значение
3) Найти максимальное значение
4) Найти среднее значение
*/

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Random;

public class ArrayListTry {
    public static void main(String[] args) {

        ArrayList<Integer> randomintegers = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            randomintegers.add(new Random().nextInt(100));
        }
        System.out.print("Созданный список: ");
        System.out.println(randomintegers);
        randomintegers.sort(Comparator.naturalOrder());
        System.out.println("=".repeat(95));
        System.out.print("Отсортированный список: ");
        System.out.println(randomintegers);

        Iterator<Integer> iterator = randomintegers.iterator();
        while (iterator.hasNext()) {
            int num = iterator.next();
            if (num % 2 == 0) {
                iterator.remove();
            }
        }
        System.out.println("=".repeat(95));
        System.out.print("Список c удаленными четными значениями: ");
        System.out.println(randomintegers);
        int minValue = randomintegers.get(0);
        System.out.println("=".repeat(95));
        System.out.println("Минимальное значение: " + minValue);
        int maxValue = randomintegers.get(randomintegers.size() - 1);
        System.out.println("=".repeat(95));
        System.out.println("Максимальное значение: " + maxValue);
        int average = randomintegers.get(randomintegers.size() / 2);
        System.out.println("=".repeat(95));
        System.out.println("Среднее значение: " + average);
    }
}