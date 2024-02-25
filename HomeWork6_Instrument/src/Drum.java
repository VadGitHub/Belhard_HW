public class Drum implements Instrument {

    private String size;

    public Drum() {}

    public Drum(String size) {
        this.size = size;
    }

    public String getSize() {
        return size;
    }

    @Override
    public void play() {
        System.out.println("Играет барабан. Размер: " + getSize());
    }
}
