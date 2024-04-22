public class DigitsAndSymbolsWriter extends AbstractWriter {

    public DigitsAndSymbolsWriter(WriterStrategy writerStrategy) {
        super(writerStrategy);
    }

    @Override
    public void write(String fileName, String data) {
        writerStrategy.writeToFile(fileName, data);
    }
}
