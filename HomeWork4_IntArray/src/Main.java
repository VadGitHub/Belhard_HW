/*
Task. Класс-оболочка для массива чисел
Определить класс IntArray, который будет в себе содержать
в качестве поля массив чисел.
Создать для такого класса конструкторы, в которые можно
передавать количество элементов массива, уже готовый массив.
Создать конструктор без параметров, который будет создавать
массив из 10 элементов. Добавить в класс метод
сортировки sort (любой на выбор), который в себя принимает
в качестве параметра boolean значение, если оно
положительное (true), то массив внутри объекта сортируется 
по возрастанию, если отрицательное (false), то по убыванию.
Добавить методы, с помощью которых можно будет работать с
внутренним массивом без прямого обращения к нему (геттеры, сеттеры и тд)
 */

public class Main {
    public static void main(String[] args) {
        int[] readyArray = {4, 5, 7, 52, 10, 14};

        System.out.println("TESTCASE");
        //Уже готовый массив
        System.out.println("1. Уже готовый массив");
        IntArray array1 = new IntArray(readyArray);
        array1.PrintArray();
        System.out.println("Сортировка по возрастанию:");
        array1.sortArray();
        array1.PrintArray();
        System.out.println("Сортировка по убыванию:");
        array1.sortArray(false);
        array1.PrintArray();

        //Массив созданный по умолчанию (10 элементов)
        System.out.println("2. Массив по умолчанию (из 10 элементов)");
        System.out.println("Создание пустого массива");
        IntArray array2 = new IntArray();
        array2.PrintArray();
        System.out.println("Установка значения '100' под индексом 0:");
        array2.SetArrayValue(0,100);
        array2.PrintArray();

        //Массив заданного размера
        System.out.println("3. Массив заданного размера (например, 25 элементов)");
        System.out.println("Создание массива из 25 элементов");
        IntArray array3 = new IntArray(25);
        array3.PrintArray();
        System.out.println("Заполнение массива случайными значениями от 0 до 1000");
        array3.SetArrayRandomValues(0,1000);
        array3.PrintArray();
        System.out.println("Получение значения под индексом 4:");
        System.out.println(array3.GetArrayValue(4));
        System.out.println("Сортировка по убыванию:");
        array3.sortArray(false);
        array3.PrintArray();
    }
}