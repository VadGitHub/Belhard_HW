/*
Task
1.	Создайте класс Phone, который содержит переменные number, model и weight.
2.	Создайте три экземпляра этого класса.
3.	Выведите на консоль значения их переменных.
4.	Добавить в класс Phone методы: receiveCall,
    имеет один параметр – имя звонящего. Выводит на консоль
    сообщение “Звонит {name}”. Метод getNumber – возвращает номер телефона.
    Вызвать эти методы для каждого из объектов.
5.	Добавить конструктор в класс Phone, который принимает на вход три
    параметра для инициализации переменных класса - number, model и weight.
6.	Добавить конструктор, который принимает на вход два параметра для
    инициализации переменных класса - number, model.
7.	Добавить конструктор без параметров.
8.	Вызвать из конструктора с тремя параметрами конструктор с двумя.
9.	Добавьте перегруженный метод receiveCall, который принимает два
    параметра - имя звонящего и номер телефона звонящего. Вызвать этот метод.
10.	Создать метод sendMessage с аргументами переменной длины.
    Данный метод принимает на вход номера телефонов, которым будет
    отправлено сообщение. Метод выводит на консоль номера этих телефонов

 */

public class Main {
    public static void main(String[] args) {

        //пп.1-3
        Phone phoneTom = new Phone("+375291111111", "Samsung Galaxy", 225);
        Phone phoneSam = new Phone("+375292222222", "Nokia 3310", 347);
        Phone phoneKate = new Phone("+375293333333", "iPhone 5", 180);

        System.out.println(phoneTom.getAllData());
        System.out.println(phoneSam.getAllData());
        System.out.println(phoneKate.getAllData());

        //п.4
        phoneTom.receiveCall("Sam");
        System.out.println(phoneSam.getNumber());

        phoneSam.receiveCall("Kate");
        System.out.println(phoneKate.getNumber());

        phoneKate.receiveCall("Tom");
        System.out.println(phoneTom.getNumber());

        //п.9
        phoneKate.receiveCall("Mummy", "+375173000101");
        //п.10
        phoneKate.sendMessage("+375259998888", "+375447777777", "+375335555555");

    }
}