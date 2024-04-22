public abstract class AbstractWriter {
    protected WriterStrategy writerStrategy;

    public AbstractWriter(WriterStrategy writerStrategy) {
        this.writerStrategy = writerStrategy;
    }

    public void setWriterStrategy(WriterStrategy writerStrategy) {
        this.writerStrategy = writerStrategy;
    }

    public abstract void write(String fileName, String data);

}