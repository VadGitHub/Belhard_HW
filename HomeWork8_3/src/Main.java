/*
Exercise 8. Task 3
Напишите метод, который получает на вход массив элементов типа К (Generic) и
возвращает Map<K, Integer>, где
K — значение из массива, а
Integer — количество вхождений в массив.
То есть сигнатура метода выглядит так:
<K> Map<K, Integer> arrayToMap(K[] ks);
То есть, если массив похож на {1,2,4,4},
то map будет выглядеть как {1:1, 2:1, 4:2}

 */

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Integer[] array1 = {1, 2, 4, 4};
        System.out.println(arrayToMap(array1).toString().replace('=', ':'));

        String[] array2 = {"Дуб", "Береза", "Дуб", "Клен", "Клен", "Тополь", "Осина"};
        System.out.println(arrayToMap(array2).toString().replace('=', ':'));
    }

    public static <K> Map<K, Integer> arrayToMap(K[] ks) {
        Map<K, Integer> map = new HashMap<>();
        int counter = 0;
        for (K i : ks) {
            if (map.containsKey(i)) {
                counter = map.get(i) + 1;
            } else {
                counter = 1;
            }
            map.put(i, counter);
        }
        return map;

    }
}