package PropertiesPackage;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesFiles {

	public static void main(String[] args) throws IOException {
		
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\ConfigPackage\\object.properties");
		prop.load(fis);
		
		System.out.println(prop.getProperty("name"));
		System.out.println(prop.getProperty("group"));
		System.out.println(System.getProperty("user.dir"));
	}

}
