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

public class CallbackCo2 {
    public double FindAverage(String para1, String para2, String para3){
        try {
            double ccavr = 0;
            int i = 0;
            JSONArray co2avr;

            URL url = new URL("http://172.17.0.1:3000/co2/Checkdate?" +
                    "d1=2017-03-"+para1+"&d2=2017-03-"+para2+"&l="+para3);
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            co2avr = readStream(con.getInputStream());
            while(!co2avr.isNull(i)){
                ccavr = ccavr + co2avr.getJSONObject(i).getDouble("density");
                i++;
            }
            ccavr = ccavr/i;
            return ccavr;

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
