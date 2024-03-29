public class Thinker {

    //public static int[][] hands = {{1, 1}, {2, 2}, {3, 3}, {4, 4}, {5, 5}};
    //public static int[][] hands;

    private int id;
    private String name;

    public Thinker() {
    }

    public Thinker(int id) {
        this.id = id;
    }

    public Thinker(int id, String name) {
        this.id = id;
        this.name = name;
    }

    private int getLeft() {
        int index;
        if (id == 0) {
            index = Resources.hands.length - 1;
        } else {
            index = id - 1;
        }
        return Resources.hands[index][1];
    }

    private int getRight() {
        int index;
        index = (id + 1) % Resources.hands.length;
        return Resources.hands[index][0];
    }

    public int[] getMyHands() {
        return Resources.hands[id];
    }

    public void setMyHands(boolean eat) {
        if (eat) {
            Resources.hands[id][0] = 1;
            Resources.hands[id][1] = 1;
            return;
        }
        Resources.hands[id][0] = 0;
        Resources.hands[id][1] = 0;
    }

    public String getName() {
        return name;
    }

    public boolean isPlaceFree() {
        return this.getLeft() == 0 && this.getRight() == 0; //это то же самое, что ниже, но короче
//        if (this.getLeft() == 0 && this.getRight() == 0) {
//            return true;
//        } else { return false;}
    }

    public void sayEating() {
        System.out.println(this.getName() + ": кушаю");
    }

    public void sayThinking() {
        System.out.println(this.getName() + ": думаю");
    }

}
