import java.nio.file.Path;

public class UppercaseFileReader extends BaseFileReader{
    protected UppercaseFileReader(Path filePath) {
        super(filePath);
    }

    /**
     * @param line
     * @return
     */
    @Override
    protected String mapFileLine(String line) {
        return line.toUpperCase();

    }
}
