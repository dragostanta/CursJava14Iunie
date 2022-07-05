package curs7;

import java.io.IOException;
import java.util.Properties;

public class TestPropertiesFile {

	public static void main(String[] args) throws IOException {

		PropertiesFileProcessor obj =  new PropertiesFileProcessor();
		obj.writePropertiesFile();
		
		obj.readPropertiesFile("email");
	}

}
