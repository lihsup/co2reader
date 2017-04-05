package yellow;

import org.json.JSONArray;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * Created by lihsup on 2017/3/13.
 */

public class Readback {

	
    public double getamount(String Target,String date, String time, String loc){
        try {
            
            JSONArray co2json;

            URL url = new URL("http://172.17.0.1:3000/co2/density/"+date+"/"+
            		time+"/"+loc);
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            
            co2json=readStream(con.getInputStream());
            return co2json.getJSONObject(0).getDouble(Target);

        } catch (Exception e) {
            return -1;
        }
    }
    
    public double idgetdensity(Double id){
        try {
            
            JSONArray co2json;

            URL url = new URL("http://172.17.0.1:3000/co2/idco2/"+id);
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            
            co2json=readStream(con.getInputStream());
            return co2json.getJSONObject(0).getDouble("density");

        } catch (Exception e) {
            return -1;
        }
    }

    private JSONArray readStream(InputStream in) {
        BufferedReader reader = null;
        StringBuilder buffer = new StringBuilder();
        String jsonS = null;
        try {
            reader = new BufferedReader(new InputStreamReader(in));
            String line = "";
            while ((line = reader.readLine()) != null) {
                buffer.append(line);
                //System.out.println("10888888f0"+buffer.toString());
            }
            //jsonS = buffer.toString().substring(1,buffer.toString().length());
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        try{
            return new JSONArray(buffer.toString());}
        catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }//readStream
}
