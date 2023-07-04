import java.util.zip.DataFormatException;

public interface DataInterface {
    double getDouble() throws DataFormatException;
    int getInt() throws DataFormatException;
}
