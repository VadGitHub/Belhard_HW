public class IncorrectInfoException extends Exception{

    private int age;
    private String FIO;

    public IncorrectInfoException(String message, String FIO) {
        super(message);
        this.FIO = FIO;
    }
    public IncorrectInfoException(String message, int age) {
        super(message);
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String getFIO() {
        return FIO;
    }

}
