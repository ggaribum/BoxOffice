package Function;

import org.json.simple.*;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import FileIO.DataIO;

import java.io.*;
import java.net.*;

public class Function {
	
	DataIO fileManager = new DataIO();

	public Function() {
		try{
		JSONParser jsonparser = new JSONParser();
        JSONObject jsonobject = (JSONObject)jsonparser.parse(fileManager.dataLoad());
        JSONObject json =  (JSONObject) jsonobject.get("boxOfficeResult");
        JSONArray array = (JSONArray)json.get("dailyBoxOfficeList");
        for(int i = 0 ; i < array.size(); i++){
            
            JSONObject entity = (JSONObject)array.get(i);
            String movieNm = (String) entity.get("movieNm");
            System.out.print(i+1+"À§ ");
            System.out.println(movieNm);
        }
		}catch(Exception e)
		{
			
		}
	}
}
