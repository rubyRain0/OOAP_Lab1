import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import static org.junit.jupiter.api.Assertions.*;

public class WriterTests {
    @TempDir
    public Path tempDir;

    @Test
    public void digitsWriterTest() throws IOException {
        WriterStrategy writer = new WriterOfDigits();

        File file = tempDir.resolve("digits.txt").toFile();
        writer.writeToFile(file.getAbsolutePath(), "Hello, World! 123");

        assertTrue(Files.exists(file.toPath()));
        assertEquals("123", Files.readString(file.toPath()));
    }

    @Test
    public void symbolsWriterTest() throws IOException {
        WriterStrategy writer = new WriterOfSymbols();

        File file = tempDir.resolve("symbols.txt").toFile();
        writer.writeToFile(file.getAbsolutePath(), "Hello, World! 123");

        assertTrue(Files.exists(file.toPath()));
        assertEquals("HelloWorld", Files.readString(file.toPath()));
    }

    @Test
    public void digitsAndSymbolsWriterTest() throws IOException {
        WriterStrategy writer = new WriterOfDigitsAndSymbols();

        File file = tempDir.resolve("digitsAndSymbols.txt").toFile();
        writer.writeToFile(file.getAbsolutePath(), "Hello, World! 123");

        assertTrue(Files.exists(file.toPath()));
        assertEquals("HelloWorld123", Files.readString(file.toPath()));
    }
}