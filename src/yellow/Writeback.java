package yellow;

import java.net.HttpURLConnection;
import java.net.URL;

public class Writeback {
	
	public void Writevalue(String para1, double para2){
        try {

            URL url = new URL("http://172.17.0.1:3000/co2/AddResponse?id="+para1+"&val="+para2);
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.getContent();

        } catch (Exception e) {
        	e.printStackTrace();
        	System.out.println("oh!!");
        }
    }

    
}
