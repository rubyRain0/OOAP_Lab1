import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String fileName = "example.txt";
        String data = "Hello world, 123!";

        WriterStrategy writerStrategy;
        AbstractWriter writer;

        System.out.println("Выберите стратегию записи в файл:");
        System.out.println("1. Только цифры");
        System.out.println("2. Только буквы");
        System.out.println("3. Цифры и буквы");

        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                writerStrategy = new WriterOfDigits();
                writer = new DigitsWriter(writerStrategy);
                break;
            case 2:
                writerStrategy = new WriterOfSymbols();
                writer = new SymbolsWriter(writerStrategy);
                break;
            case 3:
                writerStrategy = new WriterOfDigitsAndSymbols();
                writer = new DigitsAndSymbolsWriter(writerStrategy);
                break;
            default:
                System.out.println("Неверный выбор. Запись не будет выполнена.");
                return;
        }

        writer.write(fileName, data);
    }
}