public class SymbolsWriter extends AbstractWriter {

    public SymbolsWriter(WriterStrategy writerStrategy) {
        super(writerStrategy);
    }

    @Override
    public void write(String fileName, String data) {
        writerStrategy.writeToFile(fileName, data);
    }
}
