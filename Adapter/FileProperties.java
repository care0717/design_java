import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class FileProperties extends Properties implements FileIO{
    private BufferedInputStream inStream;
    public FileProperties(){
        super();
    }
    public void readFromFile(String filename) throws IOException{
        inStream = new BufferedInputStream(
                new FileInputStream(filename));
        load(inStream);
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