package org.example;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterFun {
    public static void writeToFile(String content, String filePath){
        try(FileWriter writer = new FileWriter(filePath, true)) {
            writer.write(content + "\n");
            System.out.println("Заметка успешно добавлена в файл.");
        } catch (IOException e) {
            System.out.println("Ошибка при записи в файл: " + e.getMessage());
        }
    }
}
