import java.io.*;

public class AppendableObjectOutputStream extends ObjectOutputStream {
    public AppendableObjectOutputStream(OutputStream out) throws IOException {
        super(out);
    }

    @Override
    protected void writeStreamHeader() throws IOException {
        // Không ghi tiêu đề để không ghi đè lên dữ liệu hiện có
        reset();
    }
}