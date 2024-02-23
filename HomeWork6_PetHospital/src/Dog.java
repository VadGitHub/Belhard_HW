public class Dog extends Animal {

    private final String animal = "Пёс";

    public Dog(String name, int age) {
        super(name, age);
        setAnimalType(animal);
    }

    @Override
    public void makeNoise() {

        System.out.println("Гав!");

    }
}
