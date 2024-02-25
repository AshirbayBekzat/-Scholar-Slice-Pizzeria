package OperationsString;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    static String pathFrom = "C:\\Users\\user\\Dropbox\\Java_11_2023_Tasks\\На ООП\\Задание на ведомость\\students.txt";
    static String pathTo = "C:\\Users\\user\\Desktop\\Result.txt";

    public static void main(String[] args) {
        try {
            File file = new File(pathFrom);
            Scanner scanner = new Scanner(file);
            FileWriter fileWriter = new FileWriter(pathTo);

            while (scanner.hasNextLine()) {
                String data = scanner.nextLine();

                fileWriter.write(data + "\n");
            }

            fileWriter.close();
            scanner.close();
            System.out.println("Данные успешно скопированы в файл " + pathTo);
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден: " + pathFrom);
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("Ошибка при записи в файл: " + pathTo);
            e.printStackTrace();
        }
    }
}
