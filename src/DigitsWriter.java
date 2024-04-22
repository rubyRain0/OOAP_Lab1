public class DigitsWriter extends AbstractWriter {

    public DigitsWriter(WriterStrategy writerStrategy) {
        super(writerStrategy);
    }

    @Override
    public void write(String fileName, String data) {
        writerStrategy.writeToFile(fileName, data);
    }

}