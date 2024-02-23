public class Cat extends Animal {

    private final String animal = "Кот";

    public Cat(String name, int age) {
        super(name, age);
        setAnimalType(animal);

    }

    @Override
    public void makeNoise() {

        System.out.println("Мяу!");

    }
}
