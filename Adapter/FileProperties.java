import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class FileProperties extends Properties implements FileIO{
    public void readFromFile(String filename) throws IOException{
        load(new FileInputStream(filename));
    }
    public void setValue(String key, String value){
        setProperty(key, value);
    }
    public String getValue(String key){
        return getProperty(key);
    }
    public void writeToFile(String filename) throws IOException{
        store(new FileOutputStream(filename), "Comments");
    }

}