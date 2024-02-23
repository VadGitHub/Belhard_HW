public class Rat extends Animal {

    private final String animal = "Крыса";

    public Rat(String name, int age) {
        super(name, age);
        setAnimalType(animal);
    }

    @Override
    public void makeNoise() {

        System.out.println("Пи!");

    }
}
