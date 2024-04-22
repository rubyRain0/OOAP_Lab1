public interface WriterStrategy extends Info {
    void writeToFile(String fileName, String data);
}
