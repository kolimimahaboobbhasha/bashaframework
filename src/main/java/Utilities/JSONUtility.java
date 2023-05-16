package Utilities;

import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JSONUtility {
	 
	public String getDataFromJsoNfile(Object key) throws IOException, ParseException
	{
		FileReader rr=new FileReader(ConstantUtility.JSONfile1);
		JSONParser js=new JSONParser();
		Object obj=js.parse(rr);
		HashMap<?, ?> hp=(HashMap<?, ?>)obj;
		return (String) hp.get(key);
	}
}


	
	


 