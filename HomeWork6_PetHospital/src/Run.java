public class Run {
    public static void main(String[] args) {
        Animal[] animals = new Animal[3];

        animals[0] = new Cat("Том", 3);
        animals[1] = new Dog("Бобик", 2);
        animals[2] = new Rat("Шушара", 10);

        for (Animal i : animals) {
            System.out.print(i.getAnimalType() + " " + i.getName() + " в возрасте " + i.getAge() + " лет делает: ");
            i.makeNoise();
        }

    }
}
