public class Guitar implements Instrument {

    private int numStrings;

    public Guitar() {}

    public Guitar(int numStrings) {
        this.numStrings = numStrings;
    }

    @Override
    public void play() {
        System.out.println("Играет " + getNumStrings() + "-струнная гитара");
    }

    public int getNumStrings() {
        return numStrings;
    }

}
