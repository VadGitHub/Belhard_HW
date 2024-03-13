/*
Exercise 9. Task 1
У вас есть каталог, в котором находится произвольное
количество текстовых файлов. Нужно написать программу,
которая имея путь к этому каталогу по очереди проходится и
считывает информацию из каждого файла, при этом дозаписывая
её в новый файл (result.txt).
Таким образом в файле result.txt в результате работы программы
должен быть собран текст из всех файлов в каталоге.
Например, в файле «some file 1.txt» записано «hello »,
а в файле «some file 2.txt» записано «world!», таким образом
в файле result.txt будет записано «hello world!»
 */

import java.io.*;

public class Main {
    public static void main(String[] args) {
        final String txtFolder = "txt";
        final String resultFile = "result.txt";
        String txtDir;
        String currentDir;
        String resultPath;
        String lineText = "";

        //получение текущего каталога
        currentDir = System.getProperty("user.dir");

        //построение рабочего каталога
        txtDir = currentDir + File.separator + txtFolder;

        //построение абсолютного пути к файлу с результатом
        resultPath = txtDir + File.separator + resultFile;

        File dir = new File(txtDir);
        if (dir.exists()) {
            //сканирование каталога
            File[] files = dir.listFiles();
            for (File i : files) {
                String fileName = i.getName();
                //фильтр файлов (file*.txt)
                if (fileName.startsWith("file") && fileName.endsWith(".txt") && i.isFile() ){

                    //Чтение файлов
                    String buf = "";
                    try(BufferedReader br = new BufferedReader(new FileReader(i))) {
                        while ((buf=br.readLine()) != null){
                            lineText += buf + " ";
                        }

                    }catch (IOException ex){
                        System.out.println("Ошибка при чтении файла " + fileName);
                        ex.printStackTrace();
                    }

                }
            }

            //Запись в файл
            try(BufferedWriter bw = new BufferedWriter(new FileWriter(resultPath))) {
                bw.write(lineText);
            } catch (IOException ex){
                System.out.println("Ошибка при записи файла " + resultFile);
                ex.printStackTrace();
            }

        } else {
            System.out.println("Рабочий каталог не найден!");
        }

    }
}