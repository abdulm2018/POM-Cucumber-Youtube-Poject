package Utils;

import java.util.Properties;

public class PropertiesFileReader {
	
	public Properties getProperty() throws IOException
	{
		FileInputStream inputStream=null;
		Properties properties = new Properties();
		try {
			properties.load(new FileInputStream("resources/browser_config_properties"));
			
			} catch (Exception e) {
				System.out.println("Exception: " + e);
			}
		return properties; 
	
	


}
}
