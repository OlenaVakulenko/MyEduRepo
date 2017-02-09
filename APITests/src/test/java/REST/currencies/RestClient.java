package REST.currencies;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;

/**
 * Created by pixtart on 12/14/2016.
 */
public class RestClient {
    public static void main(String[] args) throws IOException {
        HttpClient client = HttpClientBuilder.create().build();
        //String url = "http://apilayer.net/api/live";
        //url += "?" + "access_key=f208413b43c382be2f83281665d23bc0&currencies=EUR,UAH,RUB,CAD&format=1";
        RequestBuilder request = new RequestBuilder("http://apilayer.net/api/live");
        request.addParameter("access_key","f208413b43c382be2f83281665d23bc0");
        String[] currencies =  {"EUR","UAH","RUB","CAD"};
        request.addParameterWithManyValues("currencies", currencies);
        String url = request.getUrl();
        HttpGet get = new HttpGet(url);
        HttpResponse response = client.execute(get);
        System.out.println(response.toString());
        if (response.getStatusLine().getStatusCode() == 200) {
            BufferedReader rd = new BufferedReader(
                    new InputStreamReader(response.getEntity().getContent()));
            String result = "", line = "";
            while ((line = rd.readLine()) != null) {
                result += line;
            }
            System.out.println(result);

            JSONObject jsonObj = new JSONObject(result);
            System.out.println("Basic currency: " + jsonObj.getString("source"));
            JSONObject jsonObjCouples = (JSONObject) jsonObj.get("quotes");
            Iterator rs = jsonObjCouples.keys();
            System.out.println("You could change 1 USD with:");
            while(rs.hasNext()) {
                String curCouple = rs.next().toString();
                System.out.println(curCouple + "  " + jsonObjCouples.get(curCouple));
            }

            System.out.println("---------------------------");
            System.out.println("Base currency: " + jsonObj.getString("source"));


        } else {
            System.out.println(String.valueOf(response.getStatusLine().getStatusCode()));
        }
    }

    /*private String sendHTTPRequest(String requestType, String apiURL, String content, String parameters, String additionalParameter) {

        HttpPost post;
        HttpPut put;
        HttpGet get;
        HttpDelete delete;
        HttpResponse response = null;
        StringEntity params;
        try {
            HttpClient client = HttpClientBuilder.create().build();
            String url = apiURL;
            if (parameters != null) {
                url += "?" + parameters;
            }
            switch (requestType.toUpperCase()) {
                case "GET":
                    get = new HttpGet(url);
                    get.setHeader("Content-Type", "application/json");
                    get.addHeader("Authorization", "bearer " + token);
                    if (additionalParameter != null) {
                        get.addHeader("X-ProjectKey", additionalParameter);
                    }
                    response = client.execute(get);
                    break;
                case "POST":

                    post = new HttpPost(apiURL);
                    post.setHeader("Content-Type", "application/json");
                    post.addHeader("Authorization", "bearer " + token);
                    if (additionalParameter != null) {
                        post.addHeader("X-ProjectKey", additionalParameter);
                    }
                    params = new StringEntity(content);
                    post.setEntity(params);
                    response = client.execute(post);
                    break;
                case "PUT":
                    put = new HttpPut(apiURL);
                    put.setHeader("Content-Type", "application/json");
                    put.addHeader("Authorization", "bearer " + token);
                    if (additionalParameter != null) {
                        put.addHeader("X-ProjectKey", additionalParameter);
                    }
                    params = new StringEntity(content);
                    put.setEntity(params);
                    response = client.execute(put);
                    break;
                case "DELETE":
                    delete = new HttpDelete(url);
                    delete.setHeader("Content-Type", "application/json");
                    delete.addHeader("Authorization", "bearer " + token);
                    if (additionalParameter != null) {
                        delete.addHeader("X-ProjectKey", additionalParameter);
                    }
                    response = client.execute(delete);
                    break;

            }
            if (response.getStatusLine().getStatusCode() == 200) {
                BufferedReader rd = new BufferedReader(
                        new InputStreamReader(response.getEntity().getContent()));
                StringBuffer result = new StringBuffer();
                String line = "";
                while ((line = rd.readLine()) != null) {
                    result.append(line);
                }
                return result.toString();
            } else {
                return String.valueOf(response.getStatusLine().getStatusCode());
            }
        } catch (Exception e) {
            return e.getMessage();
        }
    }*/
}
