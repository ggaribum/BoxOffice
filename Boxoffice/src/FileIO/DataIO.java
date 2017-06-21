package FileIO;

import java.io.*;
import java.net.*;

public class DataIO {

public String dataLoad() throws Exception{
		
		URL url = new URL("http://ec2-52-26-144-160.us-west-2.compute.amazonaws.com:3000/jiminzzang");
		HttpURLConnection conn = (HttpURLConnection) url.openConnection();
		conn.setRequestMethod("GET");
		
		conn.setConnectTimeout(3000);
		conn.setReadTimeout(3000);
		
		try(InputStream in = conn.getInputStream();
				ByteArrayOutputStream out = new ByteArrayOutputStream()){
			
			byte[] buf = new byte[1024 * 8];
			int length = 0;
			while((length = in.read(buf)) != -1){
				out.write(buf, 0, length);
			}
			return new String(out.toByteArray(), "UTF-8");
			
		}
	}

}
