import java.util.Random;

public class IntArray {
    private int[] array;

    public IntArray(int[] array) {
        this.array = array;
    }

    public IntArray(int numEl) {
        if (numEl > 0){
            this.array = new int[numEl];
            //SetArrayRandomValues();
        }else {
            System.out.println("Некорректный размер массива!");
            return;
        }

    }

    public IntArray() {
        this(10);
    }

    //Метод сортировки
    public void sortArray(){
        sortArray(true);
    }

    public void sortArray(boolean ascend){
        int bufValue;
        //ascend == true - сортировка по возрастанию
        //Сортировка массива "Пузырьком"
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array.length - i - 1; j++){
                if (array[j] > array[j+1]){
                    bufValue = array[j+1];
                    array[j+1] = array[j];
                    array[j] = bufValue;
                }
            }
        }
        if (!ascend){
            ReversArray();
        }
    }

    private void ReversArray(){
        int bufValue;
        for (int i = 0; i <= array.length / 2; i++){
            bufValue = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = bufValue;
        }
    }

    public void PrintArray(){
        for (int i : array ){
            System.out.print(i + " ");
        }
        System.out.println();

    }

    public void SetArrayRandomValues(int min, int max){
        if (array == null || array.length == 0){
            System.out.println("Массива не существует! Сначала создайте массив!");
        }else {
            Random rnd = new Random();
            for (int i = 0; i < this.array.length; i++){
                this.array[i] = rnd.nextInt(max + 1 - min) - min;
            }
        }
    }

    public void SetArrayValue(int index, int value){
        if (IsArrayIndex(index)){
            array[index] = value;
            //System.out.println("В массиве под индексом " + index + " установлено значение " + value);
        }
    }

    public int GetArrayValue(int index){
        if (IsArrayIndex(index)){
            return array[index];
        }
        return -1;
    }

    private boolean IsArrayIndex(int index){
        if (index >= 0 && index < array.length){
            return true;
        } else { System.out.println("Индекса " + index + " в массиве не существует!");
            return false;}
    }

}
