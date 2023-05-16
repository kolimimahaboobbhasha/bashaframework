package Utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyUtility {
  public String getDataFromPropertyUtility(String key) throws IOException
  {
	FileInputStream File=new FileInputStream(ConstantUtility.Propertyfile);
	Properties pro=new Properties();
	pro.load(File);
	String Value=pro.getProperty(key);
	return Value;
	
}
}