import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class WriterOfDigits implements WriterStrategy {
    @Override
    public void writeToFile(String fileName, String data) {
        // Write only digits to the file
        StringBuilder outputData = new StringBuilder();
        for (char symbol : data.toCharArray()) {
            if (Character.isDigit(symbol)) {
                outputData.append(symbol);
            }
        }
        Path filePath = Paths.get(fileName);
        try {
            Files.write(filePath, outputData.toString().getBytes());
            System.out.println("Данные успешно записаны в файл!");
        } catch (IOException e) {
            System.err.println("Ошибка записи данных в файл: " + e.getMessage());
        }
    }

    @Override
    public void printAlgorithmName() {
        System.out.println("Запись цифр");
    }

    @Override
    public void printAlgorithmDescription() {
        System.out.println("Стратегия записи в этом режиме записывает только цифры в приведенный файл.");
    }
}
