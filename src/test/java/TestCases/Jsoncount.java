package TestCases;

import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import Utilities.ConstantUtility;

public class Jsoncount {

	public static void main(String[] args) throws IOException, ParseException {

		FileReader file1=new FileReader(ConstantUtility.JSONfile1);
		JSONParser  Json=new JSONParser();
		Object obj=Json.parse(file1);
		JSONObject jobj=(JSONObject)obj;
		JSONArray user=(JSONArray)jobj.get("userlogins") 	;	


		//System.out.println(user.size());
		          String arr[]=new String[user.size()];
		        for(int i=0;i<user.size();i++)
		        {
		        	// To print data in Json File
		      	System.out.println(user);	
			}  
		        //To count the size of Array
		        System.out.println(user.size());
	}

}
