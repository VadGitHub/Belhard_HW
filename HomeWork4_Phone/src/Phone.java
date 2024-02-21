public class Phone {
    private String number;
    private String model;
    private int weight;

    //п.7
    public Phone() {
    }
    //п.6
    public Phone(String number, String model) {
        this.number = number;
        this.model = model;
    }
    //п.5
    public Phone(String number, String model, int weight) {
        //п.8
        this(number, model);
        this.weight = weight;
    }

    public String getAllData() {
        return getNumber() + " " + getModel() + " " + getWeight();
    }

    public void receiveCall(String name){
        System.out.println("Звонит " + name);
    }

    public void receiveCall(String name, String number){
        receiveCall(name);
        System.out.println(number);
    }

    public void sendMessage(String ... strings){
        for (String i : strings){
            System.out.println("Сообщение отправлено на номер: " + i);
        }
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
