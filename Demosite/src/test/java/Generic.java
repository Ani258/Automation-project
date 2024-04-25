import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Generic {

	public static String properties() throws IOException{
		// TODO Auto-generated method stub
		Properties prop = new Properties();
        FileInputStream fp = new FileInputStream("demo.properties");
        prop.load(fp);
        String chromepath = prop.getProperty("url");
        return chromepath;
	}

}
