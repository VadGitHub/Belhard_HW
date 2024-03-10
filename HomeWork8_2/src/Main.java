/*
Exercise 8. Task 2
Создайте HashMap, содержащий пары значений – код товара и
объект товара (класс Product определите сами, но в нём должно быть,
как минимум название).
Перебрать и распечатать пары значений - entrySet().
Перебрать и распечатать набор из имен продуктов - keySet().
Перебрать и распечатать значения продуктов - values().
Для каждого перебора создать свой метод.
 */

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Map<Integer, Product> productMap = new HashMap<>();

        productMap.put(10, new Product("Молоко", 2.98));
        productMap.put(20, new Product("Хлеб", 1.56));
        productMap.put(30, new Product("Банан", 3.79));
        productMap.put(40, new Product("Колбаса", 23.55));
        productMap.put(50, new Product("Вода 1,5л", 1.16));

        printProductList(productMap);

        printProductCodes(productMap);

        printProductNames(productMap);

    }

    public static void printProductCodes(Map<Integer, Product> productMap) {

        String lineCodes = "";
        Set<Integer> codes = productMap.keySet();

        for (Integer i : codes) {
            if (lineCodes.isEmpty()) {
                lineCodes = i.toString();
            } else {
                lineCodes += ", " + i;
            }
            ;
        }
        System.out.println("Коды товаров: " + lineCodes);

    }

    public static void printProductList(Map<Integer, Product> productMap) {

        for (Map.Entry<Integer, Product> item : productMap.entrySet()) {
            System.out.printf("Код товара: %d \n Наименование: %s \n Цена: %.2f руб. \n\n",
                    item.getKey(), item.getValue().getProdName(), item.getValue().getPrice());
        }
    }

    public static void printProductNames(Map<Integer, Product> productMap) {

        String lineNames = "";
        Collection<Product> prodNames = productMap.values();

        for (Product item : prodNames) {
            if (lineNames.isEmpty()) {
                lineNames = item.getProdName();
            } else {
                lineNames += "; " + item.getProdName();
            }
            ;
        }
        System.out.println("Наименования товаров: " + lineNames);

    }
}